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
			<form action="/delivery/incluir" method="post">
			
			<div class="form-group">
  				<label>Endereço do Cliente:</label>
 				 <input type="text" class="form-control" name="enderecoCliente">
			</div>
			
			<div class="form-group">
  				<label>Hora da entrega:</label>
 				 <input type="time" min="07:00" max="22:00" class="form-control" name="horaEntrega">
			</div>
			
			<button type="submit">Cadastrar</button>
			
		</form>
			</div>
</body>
</html>