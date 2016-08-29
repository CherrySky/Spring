<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Receipt Registration Form</title>
	<link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css" />
<style>
	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Receipt Registration Form</h2>
 
	<form:form method="POST" modelAttribute="receipt">
		<form:input type="hidden" path="id" id="id"/>
		<table>
			<tr>
				<td><label for="productName">Product Name: </label> </td>
				<td><form:input path="productName" id="productName"/></td>
				<td><form:errors path="productName" cssClass="error"/></td>
		    </tr>
			<tr>
				<td><label for="price">Price: </label> </td>
				<td><form:input path="price" id="price"/></td>
				<td><form:errors path="price" cssClass="error"/></td>
		    </tr>
			<tr>
				<td><label for="purchaseDate">Purchase Date (dd/MM/YYYY): </label> </td>
				<td><form:input path="purchaseDate" id="purchaseDate"/></td>
				<td><form:errors path="purchaseDate" cssClass="error"/></td>
		    </tr>
			<tr>
				<td><label for="warrantyEndDate">Warranty Date (dd/MM/YYYY): </label> </td>
				<td><form:input path="warrantyEndDate" id="warrantyEndDate"/></td>
				<td><form:errors path="warrantyEndDate" cssClass="error"/></td>
		    </tr>
			<tr>
				<td><label for="invoiceNumber">Invoice Number: </label> </td>
				<td><form:input path="invoiceNumber" id="invoiceNumber"/></td>
				<td><form:errors path="invoiceNumber" cssClass="error"/></td>
		    </tr>
		    <tr>
				<td><label for="shopName">Shop Name: </label> </td>
				<td><form:input path="shopName" id="shopName"/></td>
				<td><form:errors path="shopName" cssClass="error"/></td>
			</tr>
		    <tr>
				<td><label for="shopAddress">Shop Address: </label> </td>
				<td><form:input path="shopAddress" id="shopAddress"/></td>
				<td><form:errors path="shopAddress" cssClass="error"/></td>
			</tr>
		    <tr>
				<td><label for="shopTelephone">Shop Telephone: </label> </td>
				<td><form:input path="shopTelephone" id="shopTelephone"/></td>
				<td><form:errors path="shopTelephone" cssClass="error"/></td>
			</tr>
		    <tr>
				<td><label for="tag">Tag: </label> </td>
				<td><form:input path="tag" id="tag"/></td>
				<td><form:errors path="tag" cssClass="error"/></td>
			</tr>
		    <tr>
				<td><label for="receiptFiling">Receipt Failing: </label> </td>
				<td><form:input path="receiptFiling" id="receiptFiling"/></td>
				<td><form:errors path="receiptFiling" cssClass="error"/></td>
			</tr>
		    <tr>
				<td><label for="remarks">Remarks: </label> </td>
				<td><form:input path="remarks" id="remarks"/></td>
				<td><form:errors path="remarks" cssClass="error"/></td>
			</tr>
			<tr>
				<td colspan="3">
					<c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Update"/>
						</c:when>
						<c:otherwise>
							<input type="submit" value="Register"/>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/receipt' />">List of All Employees</a>
</body>
</html>