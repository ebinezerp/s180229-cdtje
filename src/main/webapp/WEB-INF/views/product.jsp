<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="header.jsp"%>
</head>
<body>
<%@include file="homenavbar.jsp" %>
<div align="center" class="row">
<sf:form  action="${path}/admin/addproduct" method="post" enctype="multipart/form-data" modelAttribute="product" commandName="product" class="form col-sm-6 col-sm-offset-3">

<div class="form-group">
    <label for="productname">Product Name</label>
    <sf:input path="productname" class="form-control" />
  </div>
  <div class="form-group">
    <label for="productprice">Product Price</label>
    <sf:input path="productprice" class="form-control" />
  </div>
  <div class="form-group">
    <label for="productstock">Product Stock</label>
    <sf:input path="stock" class="form-control" />
  </div>
  <div class="form-group">
    <label for="productimage">Product Image</label>
    <sf:input type="file" path="file" class="form-control" />
  </div>
  <input type="submit" value="Add product"/>
</sf:form>
</div>


<div class="row">

<table class="table-responsive table-bordered" align="center">
<thead>
<td>Product Name</td>
<td>Product Price</td>
<td>Product Stock</td>
<td>Product Image</td>
</thead>

<c:forEach items="${products}" var="prod">

<tr>
<td>${prod.productname}</td>
<td>${prod.productprice}</td>
<td>${prod.stock}</td>
<td><img src='${productsimg}/${prod.product_id}.jpg' width="30px" height="30px"/></td>
<td><a href="${path}/admin/editproduct/${prod.product_id}"><button class="btn btn-primary">Edit</button></a></td>
</tr>


</c:forEach>

</table>


</div>

</body>
</html>