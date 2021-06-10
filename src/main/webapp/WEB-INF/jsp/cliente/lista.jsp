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
		<c:if test="${not empty clientes}">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nome</th>
						<th>CPF</th>
						<th>Idade</th>
						<th>Email</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="clientes" items="${clientes}">
						<tr>
							<td>${clientes.id}</td>
							<td>${clientes.nome}</td>
							<td>${clientes.cpf}</td>
							<td>${clientes.idade}</td>
							<td>${clientes.email}</td>
							<td><a href="/cliente/${clientes.id}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>

</body>
</html>