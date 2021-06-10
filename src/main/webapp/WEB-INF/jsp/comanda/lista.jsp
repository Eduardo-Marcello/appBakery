<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP-AT-PB</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<c:if test="${not empty comandas}">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Codigo</th>
						<th>Valor</th>
						<th>Data</th>
						<th>Hora</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="com" items="${comandas}">
						<tr>
							<td>${com.id}</td>
							<td>${com.codigoComanda}</td>
							<td>${com.valor}</td>
							<td>${com.data}</td>
							<td>${com.hora}</td>
							<td><a href="/comanda/${com.id}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>

</body>
</html>