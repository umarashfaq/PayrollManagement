<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	label {
		display: inline-block;
		width: 150px;
	}
	
	.red {
		color: red;
	}
	
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/pages/header.jsp"></jsp:include>
	<h1>Add New Person</h1>
	<form:form>
		<form:hidden path="id"/>
		<label>First Name</label><form:input path="firstName"/><form:errors path="firstName" cssClass="red"/><br/>
		<label>Last Name</label><form:input path="lastName"/><form:errors path="lastName" cssClass="red"/><br/>
		<label>Date of birth</label><form:input path="dob"/><form:errors path="dob" cssClass="red"/><br/>
		<label>Email</label><form:input path="email"/><form:errors path="email" cssClass="red"/><br/>
		<label>Phone</label><form:input path="phone"/><form:errors path="phone" cssClass="red"/><br/>
		<label>Address</label><form:input path="address"/><form:errors path="address" cssClass="red"/><br/>
		<input type="submit"/>
	</form:form>
</body>
</html>