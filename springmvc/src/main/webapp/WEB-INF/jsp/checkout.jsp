<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
	<div class="container">
		<div class="col-md-6 offset-md-3 my-3">

			<form action="/paynow" method="post">
				<div class="form-group">
					<label for="CUST_ID">Mobile Number</label> <input type="text"
						class="form-control" id="custId" name="CUST_ID"> <small
						class="form-text text-muted">Customer Mobile number</small>
				</div>
				<div class="form-group">
					<label for="TXN_AMOUNT">Transaction Amount</label> <input
						type="text" class="form-control" id="TXN_AMOUNT" name="TXN_AMOUNT"
						readonly value=${totalAmount}
 							> <small
						class="form-text text-muted">Transaction Amount</small>
				</div>
				<div>
					<button type="submit" class="btn btn-primary">Paynow</button>
					<span class="float-right"><a href="viewcart">&lt;&nbsp;Back</a></span>
				</div>
			</form>

		</div>
	</div>
</body>
</html>