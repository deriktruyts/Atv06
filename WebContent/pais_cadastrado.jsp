<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="model.Pais" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Pais cadastrado</title>
		
		<style type="text/css">
			
			.container {
				max-width: 1280px;
				margin: auto;
			}
			
			.titulo {
				text-align: center;
				border-bottom: solid 1px #ccc;
				margin-bottom: 8px;
			}
			
			.dado {
				border: solid 1px black;
				border-radius: 8px;
				background-color: #ccc;
				margin-bottom: 8px;
				padding: 12px;
			}
		
		</style>
	</head>
	<body>
		<!-- isso é um scriplet -->
		<% 
			Pais pais = (Pais) request.getAttribute("pai");	
		%>
		<div class="container">
		
			<h1 class="titulo">Pais cadastrado</h1>
			
			<div class="dado">Id: <%= pais.getId() %></div>
			<div class="dado">Nome: <% out.print(pais.getNome()); %></div>
			<div class="dado">Populacao: <%= pais.getPopulacao() %></div>
			<div class="dado">Area: <%= pais.getArea() %></div>
		
		</div>
	</body>
</html>