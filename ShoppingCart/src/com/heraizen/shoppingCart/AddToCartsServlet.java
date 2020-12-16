package com.heraizen.shoppingCart;

import static com.mongodb.client.model.Aggregates.project;
import static com.mongodb.client.model.Projections.excludeId;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.io.IOException;
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
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@WebServlet("/AddToCarts")
public class AddToCartsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
			fromProviders(PojoCodecProvider.builder().automatic(true).build()));

	MongoClientSettings settings = MongoClientSettings.builder().codecRegistry(pojoCodecRegistry)
			.applyConnectionString(new ConnectionString(
					"mongodb+srv://ranjithkumar:mongoatlas@cluster0.g7v5g.mongodb.net/bookStore?retryWrites=true&w=majority"))
			.build();
	com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);

	MongoDatabase database = mongoClient.getDatabase("bookStore");
	MongoCollection<Books> productCollection = database.getCollection("books", Books.class);
	AggregateIterable<Books> productList = productCollection.aggregate(Arrays.asList(project(excludeId())));

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String namemobile = request.getParameter("mobile");
		System.out.println(namemobile);
		Books productItems = null;
		for (Books product : productList) {
			if (product.getTitle().equalsIgnoreCase(namemobile)) {

				productItems = product;
			}
		}
		HttpSession session = request.getSession(true);
		Object obj = session.getAttribute("cartItems");
		if (obj == null) {
			List<Books> cartProducts = new ArrayList<Books>();
			cartProducts.add(productItems);
			session.setAttribute("cartItems", cartProducts);
		} else {

			List<Books> cartProducts = (List<Books>) obj;
			cartProducts.add(productItems);
			session.setAttribute("cartItems", cartProducts);
		}

		response.sendRedirect("viewcart.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
