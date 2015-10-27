<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">

<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>

<script type="text/javascript" 
		src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>

<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>



<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- //------------------------------------------------ -->


<title><tiles:getAsString name="title" /></title>
</head>
<body>

<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<tilesx:useAttribute name="current"/>

 <div class="container">
 <a href='<spring:url value="/"/>'>
 <img  src="/css/photo/implemented.png"  alt="img_ban" height="100%" width="100%">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation" class="${active=='index' ? 'active ' : ''}"><a href='<spring:url value="/"/>'>Home</a></li>
            <li role="presentation" class="${active=='home' ? 'active ' : ''}"><a href='<spring:url value="home.html"/>'>Forum</a></li>
            <li role="presentation"><a href="/WEB-INF/jsp/Home.jsp">Contact</a></li>
            <li role="presentation"  class="${active=='users' ? 'active ' : ''}"><a href='<spring:url value="users.html"/>'>Users</a></li>
          </ul>
        </nav>
        
        <h3 class="text-muted">NSTU Coders Forum</h3>
        
      </div>

      <div class="jumbotron">
        <h1>NSTU Coders Forum</h1>
        <p class="lead">NSTU coders Frum is a forum based site . where nstu's professinal coders are in to solve your coding problems . Please login to join us.</p>
        <p><a class="btn btn-lg btn-success" href='<spring:url value="/WEB-INF/jsp/Home.jsp"/>' role="button">Sign up today</a></p>
      </div>

 </div>     


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
















 
   
   <center>
       <tiles:insertAttribute name="footer"/>
   </center>
  
</body>

</html>