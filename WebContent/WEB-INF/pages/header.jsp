<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>

<div>
	<h1>Payroll Management System</h1>
	<ul>
		<li><a href="${contextPath }/persons">View All Persons</a></li>
		<li><a href="${contextPath }/persons/edit">Add New Person</a></li>
	</ul>
	<hr/>
</div>