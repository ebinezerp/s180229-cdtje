<!DOCTYPE html>
<html lang="en">

<%@include file="header.jsp" %>
<body>

<%@include file="homenavbar.jsp" %>
  
<div class="container">
  
  <div id="carousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#carousel" data-slide-to="0" class="active"></li>
      <li data-target="#carousel" data-slide-to="1"></li>
      <li data-target="#carousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="${images}/banner1.jpg" alt="Los Angeles" style="width:100%;height:250px">
      </div>

      <div class="item">
        <img src="${images}/banner2.jpg" alt="Chicago" style="width:100%;height:250px">
      </div>
    
      <div class="item">
        <img src="${images}/banner3.jpg" alt="New york" style="width:100%s;height:250px">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#carousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>
