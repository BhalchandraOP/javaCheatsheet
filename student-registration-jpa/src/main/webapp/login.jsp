<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<form action="${pageContext.request.contextPath}/login"
	      method="post">

	    <input type="text" name="username">

	    <input type="password" name="password">

	    <input type="hidden"
	           name="${_csrf.parameterName}"
	           value="${_csrf.token}">

	    <button type="submit">
	        Login
	    </button>

	</form>