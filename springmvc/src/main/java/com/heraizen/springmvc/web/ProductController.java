package com.heraizen.springmvc.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.heraizen.springmvc.domain.Product;
import com.heraizen.springmvc.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = { "/index", "/" })
	public String index(Model model) {
		String user = SecurityContextHolder.getContext().getAuthentication().getName();
		model.addAttribute("username", user);
		model.addAttribute("message", "Welcome to JSP world...");
		return "welcome";
	}

	@RequestMapping("/viewproducts")
	public ModelAndView viewProducts() {
		ModelAndView obj = new ModelAndView();
		List<Product> list = productService.getAllProducts();
		obj.addObject("products", list);
		obj.setViewName("viewproducts");
		return obj;
	}

	@RequestMapping("/addtocart")
	public String addToCart(@RequestParam(name = "pid") String pid, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("cartItems");
		if (obj == null) {
			session.setAttribute("cartItems", new ArrayList<>());
		}
		List<Product> items = (List<Product>) session.getAttribute("cartItems");
		items.add(productService.getProductById(pid));
		session.setAttribute("cartItems", items);
		return "redirect:/viewcart";
	}

	@RequestMapping("/viewcart")
	public String addviewCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("cartItems");
		if (obj == null) {
			return "redirect:/viewproducts";
		}
		List<Product> items = (List<Product>) session.getAttribute("cartItems");
		session.setAttribute("cartItems", items);
		return "viewcart";
	}

	@RequestMapping("/checkout")
	public String requestOrder(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		List<Product> items = (List<Product>) session.getAttribute("cartItems");
		double total = items.stream().mapToDouble(Product::getPrice).sum();
		model.addAttribute("totalAmount", total);
		return "checkout";
	}

}
