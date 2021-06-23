<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>BakeryProject-AT-PB</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
	color: white;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

/* Set gray background color and 100% height */
.sidenav {
	padding-top: 20px;
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>

	<c:import url="/WEB-INF/jsp/header.jsp"></c:import>

	<div class="container">
		<c:if test="${not empty funcionarios}">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nome</th>
						<th>CPF</th>
						<th>Idade</th>
						<th>Email</th>
						<th>Cargo</th>
						<th>Salario</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="funcionarios" items="${funcionarios}">
						<tr>
							<td>${funcionarios.id}</td>
							<td>${funcionarios.nome}</td>
							<td>${funcionarios.cpf}</td>
							<td>${funcionarios.idade}</td>
							<td>${funcionarios.email}</td>
							<td>${funcionarios.cargo}</td>
							<td>${funcionarios.salario}</td>
							<td><a href="/funcionario/${funcionarios.id}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty funcionarios}">
			<h3>Nenhum funcionario foi cadastrado!</h3>
		</c:if>
	</div>

</body>
</html>