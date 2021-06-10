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
  				<h1>Cadastro Buffet</h1>
			</div>
		
			<div class="container">
			<form action="/buffet/incluir" method="post">
			
			<div class="form-group">
  				<label>Situação:</label>
 				 <input type="text" class="form-control" name="situacao">
			</div>
			
			<div class="form-group">
  				<label>Prato:</label>
 				 <input type="text" class="form-control" name="prato">
			</div>
			
			<div class="form-group">
				<label>Preço:</label>
			 	<input type="number" step="0.01" class="form-control" name="preco">
			</div>
			
			<button type="submit">Cadastrar</button>
			
		</form>
			</div>
</body>
</html>