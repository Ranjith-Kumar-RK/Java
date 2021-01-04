<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"></script>

<!-- Font Awesome Icons -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="path/to/font-awesome/css/font-awesome.min.css">

<title>Shopping mvc</title>
</head>

<body>
	<div class="w-75 mx-auto">
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<div class="container-fluid">
				<a class="navbar-brand" href="index">Demo Kart</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarText"
					aria-controls="navbarText" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarText">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link" href="viewproducts">Products</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Cart</a></li>
					</ul>
					<span class="text-white"><a href="#" class="text-white">LogOut</a></span>
				</div>
			</div>
		</nav>
		<div class="container my-3">
			<p class="text-center">Welcome to cart</p>

			<table class="table my-3">
				<thead>
					<tr>
						<th>Product id</th>
						<th>Product</th>
						<th>Price (in Rs.)</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${cartItems}" var="prod">
						<tr>
							<td>${ prod.pid }</td>
							<td>${ prod.pname }</td>
							<td>${ prod.price }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a class="btn btn-primary" href="checkout">Check out</a> <a
				class="btn btn-primary" href="viewproducts">Add more..</a>
		</div>
	</div>
</body>
</html>




























