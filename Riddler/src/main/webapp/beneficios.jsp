<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Riddler - Lista de Beneficios</title>

<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="css/cadastroBeneficio.css" rel="stylesheet">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css" />
<jsp:include page="headerCSS.jsp" />

</head>
<body>
	<div class="container">

		<jsp:include page="header.jsp" />

		<div class="masthead" align="center">
			<h1 class="muted">Benefícios</h1>
		</div>
		<hr />

		<table class="table table-striped" border="1">
			<thead align="center">
					<th>Beneficio</th>
					<th>Prazo</th>
					<th></th>
					<th></th>
					<th></th>
			</thead>
			<tbody>			
				<c:forEach var="beneficio" items="${beneficios}">
					<tr>
						<td>${beneficio.nome}</td>
						<td><fmt:formatDate pattern="dd/MM/yyyy" value="${beneficio.prazo}" /></td>
						<td><button class="btn btn-small btn-success" value="Editar">
								<a href="editarBeneficio?id=${beneficio.id}"><font
									color="white">Editar Beneficio</font></a>
							</button></td>
						<td>
							<button class="btn btn-small btn-success">
								<a href="listarEtapas?id=${beneficio.id}"><font
									color="white">Verificar Etapas</font></a>
							</button>
						</td>
						<td>
							<button class="btn btn-small btn-danger">
								<a href="deletarBeneficios?id=${beneficio.id}"><font
									color="white">Deletar Beneficio</font></a>
							</button>
						</td>
					<tr>
						<th>Etapas:</th>
						<c:forEach var="etapa" items="${beneficio.etapas}">
							<td>${etapa.nome}</td>
						</c:forEach>
					</tr>
					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>