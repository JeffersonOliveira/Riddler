<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Riddler - Lista de Beneficios</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="container">

		<h2>Lista de Beneficios</h2>

		<table class="table table-striped">
			<thead align="center">
				<tr>

					<!-- 						<th>ID</th> -->
					<th>Beneficio</th>
					<th>Prazo</th>
			</thead>
			<tbody>
				<c:forEach var="beneficio" items="${beneficios}">
					<tr>
						<td>${beneficio.nome}</td>
						<td>${beneficio.prazo}</td>
						<td><button class="btn btn-small btn-success" value="Editar">
								<a href="editarBeneficio?id=${beneficio.id}"><font
									color="white">Editar Beneficio</font></a>
							</button></td>
						<td>
							<button class="btn btn-small btn-success">
								<a href="listarEtapas?id=${beneficio.id}"><font color="white">Verificar
										Etapas</font></a>
							</button>
						</td>
						<td>
							<button class="btn btn-small btn-danger">
								<a href="deletarBeneficios?id=${beneficio.id}"><font
									color="white">Deletar Beneficio</font></a>
							</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>