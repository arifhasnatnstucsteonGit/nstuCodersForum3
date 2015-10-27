<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<center>
	<h1>${user.name}</h1>
</center>


<c:forEach items="${user.blogEntity}" var="blog">

	<h3>${blog.url}</h3>
	<h3>${blog.id}</h3>
	<h3>${blog.name}</h3>
	<h3>${blog.body}</h3>




	<table
		class="table table-bordered  table-striped table-hover table-responsive table-condensed ">
		<thead>
			<tr>
				<th>Title</th>
				<th>Link</th>

			</tr>

		</thead>

		<tbody>
			<c:forEach items="${blogEntity.itemEntity}" var="item">

				<tr>



					<td><c:out value="${item.title}" /></td>
					<td><c:out value="${item.link}" /></td>
				</tr>

			</c:forEach>

		</tbody>

	</table>


</c:forEach>

