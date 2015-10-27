<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<table
	class="table table-bordered  table-striped table-hover table-responsive table-condensed ">
	<thead>
		<tr>
		    <th>User id</th> 
			<th>User Name</th>
			<th>Email</th>
		</tr>

	</thead>
	<tbody>
		<c:forEach items="${users}" var="user">
			<tr>
				<td><a href="<spring:url value="/users/${user.id}.html "/>">
				</a> ${user.name}
				</td>
				<td>
				  <a href="/users/${user.id}.html"> ${user.name} </a>
				</td>
				
				<td>${user.email}</td>

			</tr>

		</c:forEach>
	</tbody>
</table>

