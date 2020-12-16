<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="path/to/font-awesome/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Shopping Cart</title>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-light"
			style="background-color: #20c997">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Book Stall</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="viewcart.jsp">Cart</a></li>
					</ul>
				</div>
				<div class="collapse navbar-collapse col-3" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#"><i class="fa fa-user-circle-o"
								aria-hidden="true"></i> ${param.name}</a></li>
						<li class="nav-item"><a class="nav-link" href="index.html">Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<div class="my-3">
			<form action="AddToCarts" method="POST">
				<div class="row justify-content-center">
					<table width=700>
						<tr class="my-3">
							<th>Book</th>
							<th>Author</th>
							<th>Price</th>
							<th><i class="fa fa-shopping-cart fa-2x ml-4"></i></th>
						</tr>
						<c:forEach var="books" items="${mobile}">
							<tr>
								<td><c:out value="${books.title}" /></td>
								<td><c:out value="${books.author}" /></td>
								<td><c:out value="${books.price}" /></td>
								<td><button name="mobile" value="${books.title}"
										class="btn btn-link" type="submit">Add to cart</button></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
</body>

</html>