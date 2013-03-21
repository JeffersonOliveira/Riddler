<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>P&aacute;gina de ediç&atilde;o de funcion&aacute;rio</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">

<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/paginaInicial.css" rel="stylesheet">

<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />

</head>

<body>

	<jsp:include page="headerCSS.jsp" />
</head>

<body>
	<input type="hidden" />
	<div class="container">

		<jsp:include page="header.jsp"></jsp:include>

		&nbsp;
		<div align="center">

			<form action="cadastrarFuncionario" method="post">

				<input type="hidden" value="${feitos.funcionario.id}"
					name="funcionario.id" readonly="readonly" />

				<table border="0">
					<tr>
						<td align="center"><h2>Editar Funcion&aacute;rio
								${funcionario.nome}</h2></td>
					</tr>

					<tr>
						<td>Nome:</td>
						<td><input type="text" id="nome" value="${funcionario.nome}"
							name="funcionario.nome"></td>
					</tr>
					<tr>
						<td>data de admissão</td>
						<td><input type="text" id="dataDeAdmissao"
							value="${funcionario.dataDeAdmissao}"
							name="funcionario.dataDeAdmissao"></td>
					</tr>
					<c:forEach var="mapas" items="${mapa}">
						<tr>
							<td>Benefício: ${mapas.key}
								<div>
									<c:forEach var="item" items="${mapas.value}">
 							             Etapa:  ${item.etapa.nome}
									</c:forEach>
								</div>
					</c:forEach>

					<%-- 					<c:forEach var="beneficio" items="${beneficios}"> --%>
					<!-- 						<input type="hidden" id="beneficioId" name="beneficio.id" /> -->
					<!-- 						<input type="checkbox" id="feitosFuncionario" -->
					<!-- 							name="feitos.funcionarios[0]" /> -->
					<!-- 						<input type="checkbox" id="feitosEtapas" -->
					<!-- 							name="feitos.etapas[0].beneficio" /> -->

					<!-- 						<tr> -->
					<%-- 							<td>${beneficio.nome}</td> --%>
					<!-- 						<tr> -->
					<!-- 							<td> -->
					<!-- 								<h5> -->
					<!-- 									<button class="btn btn-small btn-danger"> -->
					<%-- 										<a href="deletarFuncionario?id=${funcionario.id}"><font --%>
					<!-- 											color="white">Deletar Funcionario</font></a> -->
					<!-- 									</button> -->
					<!-- 									<button class="btn btn-small"> -->

					<!-- 										<input type="submit" value="Alterar Dados" /> -->

					<!-- 									</button> -->

					<!-- 								</h5> -->
					<!-- 							</td> -->
					<!-- 						</tr> -->
					<%-- 					</c:forEach> --%>
				</table>
			</form>

		</div>

		<hr color="green">

		<jsp:include page="footer.jsp"></jsp:include>

	</div>

	<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
	<script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
	<script>
		$(function() {
			$("#datepicker").datepicker();
			$("#datepicker").datepicker("option", "dateFormat", "dd/mm/yyyy");

			$("#anim").change(
					function() {
						$("#datepicker").datepicker("option", "showAnim",
								$(this).val());
					});
		});
	</script>
</body>
</html>