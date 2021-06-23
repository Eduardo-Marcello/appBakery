<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
	<div class="jumbotron text-center">
		<h1>Cadastro Funcionario</h1>
	</div>

	<div class="container">
		<form action="/funcionario/incluir" method="post">

			<div class="form-group">
				<label>Nome:</label> <input type="text" class="form-control"
					name="nome">
			</div>

			<div class="form-group">
				<label>Email:</label> <input type="email" class="form-control"
					name="email">
			</div>

			<div class="form-group">
				<label>CPF:</label> <input type="text" class="form-control"
					name="cpf">
			</div>

			<div class="form-group">
				<label>Idade:</label> <input type="text" class="form-control"
					name="idade">
			</div>

			<div class="form-group">
				<label>Cargo:</label> <input type="text" class="form-control"
					name="cargo">
			</div>

			<div class="form-group">
				<label>Salario:</label> <input type="number" step="0.01"
					class="form-control" name="salario">
			</div>

			<div class="form-group">
				<label>Password:</label> <input type="password" class="form-control"
					name="password" id="password">
			</div>


			<button type="submit">Cadastrar</button>

		</form>
	</div>
</body>
</html>