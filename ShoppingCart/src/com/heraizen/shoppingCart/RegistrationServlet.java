package com.heraizen.shoppingCart;

import static com.mongodb.client.model.Aggregates.project;
import static com.mongodb.client.model.Projections.excludeId;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.heraizen.shoppingCart.domain.Books;
import com.heraizen.shoppingCart.domain.Users;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@WebServlet("/register")

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
			fromProviders(PojoCodecProvider.builder().automatic(true).build()));

	MongoClientSettings settings = MongoClientSettings.builder().codecRegistry(pojoCodecRegistry)
			.applyConnectionString(new ConnectionString(
					"mongodb+srv://ranjithkumar:mongoatlas@cluster0.g7v5g.mongodb.net/bookStore?retryWrites=true&w=majority"))
			.build();
	com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);

	MongoDatabase database = mongoClient.getDatabase("bookStore");

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("password");

		MongoCollection<Users> collection = database.getCollection("users", Users.class);
		MongoCollection<Books> productCollection = database.getCollection("books", Books.class);

		AggregateIterable<Users> userlist = collection.aggregate(Arrays.asList(project(excludeId())));
		AggregateIterable<Books> productlist = productCollection.aggregate(Arrays.asList(project(excludeId())));
		int counter = 0;
//		System.out.println(name+"--------------------"+password);
//		for(Users pro:userlist)
//		{
//			System.out.println("SAAAAAAAA"+pro.getPassword()+"   "+pro.getUsername());
//		}
		PrintWriter out = response.getWriter();
		List<Books> listProduct = new ArrayList<Books>();

		for (Books books : productlist) {
			listProduct.add(new Books(books.getTitle(), books.getAuthor(), books.getPrice()));
		}

		for (Users users : userlist) {
			HttpSession session = request.getSession(true);

			session.setAttribute("user", name);
			session.setAttribute("mobile", listProduct);

			if (name.equals(users.getUsername()) && password.equals(users.getPassword())) {
				out.println(name + "" + " Welcome to shopping");
				response.sendRedirect("success.jsp?name=" + name);
				counter = 1;
			}
		}

		if (counter == 0) {

			out.print("Your username and password Incorect");
			response.sendRedirect("invalidUser.jsp");
		}

	}

}
