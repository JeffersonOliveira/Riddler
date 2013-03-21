<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>Atualizar Tarefas</title>
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
						<td align="center"><h2>${funcionario.nome}</h2></td>
					</tr>

					<c:forEach var="mapas" items="${mapa}">
						<tr>
							<td>Benefício: ${mapas.key}
								<div>
									<c:forEach var="item" items="${mapas.value}">
 										<td>Etapa:  ${item.etapa.nome}</td>
									</c:forEach>
								</div>
					</c:forEach>

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