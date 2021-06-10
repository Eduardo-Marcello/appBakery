<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Projeto de Bloco - AT </title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="jumbotron text-center">
  				<h1>Cadastro Funcionario</h1>
			</div>
		
			<div class="container">
			<form action="/funcionario/incluir" method="post">
			
			<div class="form-group">
  				<label>Nome:</label>
 				 <input type="text" class="form-control" name="nome">
			</div>
			
			<div class="form-group">
  				<label>Email:</label>
 				 <input type="email" class="form-control" name="email">
			</div>
			
			<div class="form-group">
				<label>CPF:</label>
			 	<input type="text" class="form-control" name="cpf">
			</div>
			
			<div class="form-group">
				<label>Idade:</label>
			 	<input type="text" class="form-control" name="idade">
			</div>
			
			<div class="form-group">
				<label>Cargo:</label>
			 	<input type="text" class="form-control" name="cargo">
			</div>
			
			<div class="form-group">
				<label>Salario:</label>
			 	<input type="number" step="0.01" class="form-control" name="salario">
			</div>
			
			<div class="form-group">
				<label>Password:</label>
			 	<input type="password" class="form-control" name="password" id="password">
			</div>
			
			
			<button type="submit">Cadastrar</button>
			
		</form>
			</div>
</body>
</html>