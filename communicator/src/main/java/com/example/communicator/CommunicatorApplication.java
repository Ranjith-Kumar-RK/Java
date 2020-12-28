package com.example.communicator;

import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.example.communicator.domain.Products;

import freemarker.template.Configuration;
import freemarker.template.Template;

@SpringBootApplication
public class CommunicatorApplication implements CommandLineRunner {

	@Autowired
	private Configuration cfg;

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private ProductController productController;
	

	public static void main(String[] args) {
		SpringApplication.run(CommunicatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// OTP
		Map<String, String> mapOTP = new HashMap<String, String>();
		mapOTP.put("name", "Ranjith");
		mapOTP.put("app", "gmail");
		mapOTP.put("otp", "873645");
		mapOTP.put("second", "60");
		Template template = cfg.getTemplate("otp.ftl");
		Writer out = new OutputStreamWriter(System.out);
		template.process(mapOTP, out);

		System.out.println("\n----------------------------------------------------------------");

		// products/orders
		Map<String, Object> products = new HashMap<>();
		Products p1 = new Products("Mobile", "http://flip.com/mobile");
		Products p2 = new Products("Laptop", "http://flip.com/laptop");
		Products p3 = new Products("Headphone", "http://flip.com/headphone");
		List<Products> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		Map<String, String> userMap = new HashMap<>();
		userMap.put("Ranjith", "rnjtkmrrk@gmail.com");
		userMap.put("Shankar", "shankar15nov98@gmail.com");
		userMap.put("Nithya", "nithyavenkat1999@gmail.com");

		userMap.entrySet().forEach(user -> {
			products.put("user", user);
			products.put("products", list);
			try {
				Template productsTemp = cfg.getTemplate("orders.ftl");
				StringWriter stringWriter = new StringWriter();
				productsTemp.process(products, stringWriter);
				String body = stringWriter.toString();
				MimeMessage message = javaMailSender.createMimeMessage();
				MimeMessageHelper helper;
				try {
					helper = new MimeMessageHelper(message, true);
					helper.setFrom("noreply@heraizen.com");
					helper.setTo(user.getValue());
					helper.setSubject("Welcome to spring email");
					helper.setText(body, true);
					javaMailSender.send(message);

				} catch (MessagingException e) {
					e.printStackTrace();
				}
				System.out.println(body);

			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		System.out.println("\n----------------------------------------------------------------");

		// new products
//		productController.productList();
	}

}
