<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Receipts Dashboard</title>
	<link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<h2>List of Receipts</h2>
	<table class="table">
		<thead class="thead-default">
		<tr>
			<th>Id</th>
			<th>Product Name</th>
			<th>Price</th>
			<th>Purchase Date</th>
			<th>Warranty End Date</th>
			<th>Invoice Number</th>
			<th>Shop Name</th>
			<th>Shop Address</th>
			<th>Shop Telephone</th>
			<th>Tag</th>
			<th>Receipt Filing</th>
			<th>Remarks</th>
			<th/>
			<th/>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${receipts}" var="receipt">
		<tr>
			<th>${receipt.id}</th>
			<td>${receipt.productName}</td>
			<td>${receipt.price}</td>
			<td>${receipt.purchaseDate}</td>
			<td>${receipt.warrantyEndDate}</td>
			<td>${receipt.invoiceNumber}</td>
			<td>${receipt.shopName}</td>
			<td>${receipt.shopAddress}</td>
			<td>${receipt.shopTelephone}</td>
			<td>${receipt.tag}</td>
			<td>${receipt.receiptFiling}</td>
			<td>${receipt.remarks}</td>
			<td><a href="<c:url value='/receipt/edit-${receipt.id}-receipt' />">edit</a></td>
			<td><a href="<c:url value='/receipt/delete-${receipt.id}-receipt' />">delete</a></td>
		</tr>
		</tbody>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/receipt/new' />">Add New Receipt</a>
</body>
</html>