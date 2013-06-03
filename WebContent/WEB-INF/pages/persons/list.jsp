<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:set var="contextPath" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="${contextPath}/js/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		// alert('hello');
		$('a[rel=delete]').click(function(){
			return confirm('Sure to delete?');
		});
	});
</script>
</head>
<body>
	<jsp:include page="/WEB-INF/pages/header.jsp"></jsp:include>
	<h1>Persons</h1>
	<a href="persons/edit">+ Add New Person</a>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Address</th>
			<th>DOB</th>
			<th></th>
		</tr>
		
		<c:forEach var="p" items="${persons }">
			<tr>
				<td>${p.firstName }</td>
				<td>${p.lastName }</td>
				<td>${p.phone }</td>
				<td>${p.email }</td>
				<td>${p.address }</td>
				<td><fmt:formatDate value="${p.dob }" pattern="dd-MM-yyyy"/></td>
				<td><a href="persons/edit?id=${p.id }">Edit</a> | <a href="persons/delete?id=${p.id }" rel="delete">Delete</a></td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>