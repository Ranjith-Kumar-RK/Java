<html>
<head>
	<title>Welcome!</title>
</head>
<body>
	<h2>Hello ${user}</h2>
	<p>Don't miss our new exciting deals</p>
	
	<ul>
	<#list products as product>
		<li>
			<a href="${product.url}">${product.pname}</a>
		</li>
	</#list>
	</ul>
</body>
</html>