<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BakeryProject-AT-PB</title>
</head>
<body>
		<c:import url="/WEB-INF/jsp/header.jsp"/>

		<h1>Tela Inicial</h1>
		
		<h2>Eduardo Marcello</h2>
		<h2>Sistema de Informações</h2>
		<h2>Projeto de Bloco</h2>
		
		<h3>${user.nome}</h3>
		<h3>${user.email}</h3>
		
		<p>${usuarioQtde}::<a href="/usuario">Cadastro de Usuario</a></p>
		<p>${funcionarioQtde}::<a href="/cadastroFuncionario">Cadastro de Funcionarios</a></p>
		<p>${comandaQtde}::<a href="/cadastroComanda">Cadastro de Comandas</a></p>
		
		
		<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. </p>

</body>
</html>