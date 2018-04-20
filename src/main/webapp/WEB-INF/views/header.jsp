<head>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
  <c:set var="path" value="${pageContext.request.contextPath}" />
  
  <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
  <spring:url value="/resources/images" var="images"></spring:url>
  <spring:url value="/resources/products" var="productsimg"></spring:url>
  
</head>