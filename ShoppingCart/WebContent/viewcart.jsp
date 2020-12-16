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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>cart List</title>
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
						<li class="nav-item"><a class="nav-link" aria-current="page"
							href="success.jsp">Home</a></li>
						<li class="nav-item"><a class="nav-link active" href="#">Cart</a></li>
					</ul>
				</div>
				<div class="collapse navbar-collapse col-3" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link" href="index.html">Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<div class="text-center my-3">My Orders</div>
		<div class="row col-12 ml-0 px-0">
			<c:forEach var="book" items="${cartItems}">
				<div class="col-md-6">
					<div class="card">
						<div class="card-body ">
							<div class="card-title font-weight-bold">
								<c:out value="${book.title}" />
								<i class="fa fa-trash text-danger float-right pointer"></i>
							</div>
							<div class="card-text ">
								<span>by : </span>
								<c:out value="${book.author}" />
							</div>
							<div class="card-text ">
								<span>rs : </span>
								<c:out value="${book.price}" />
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>