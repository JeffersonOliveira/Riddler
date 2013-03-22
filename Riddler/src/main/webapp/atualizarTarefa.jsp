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

			<input type="hidden" value="${feitos.funcionario.id}"
				name="funcionario.id" readonly="readonly" /> <input type="hidden"
				value="${feitos.id}" name="feitos.id" readonly="readonly" />

			<div align="left">
				<h2>${funcionario.nome}</h2>
				</td>
			</div>
			<div align="center">
				<table class="table table-striped">
					<tbody>
						<c:forEach var="mapas" items="${mapa}">
							<tr>
								<td align="left"><b>${mapas.key}</b></td>
								<c:forEach var="item" items="${mapas.value}">
									<td><b>${item.etapa.nome}</b></td>
									<td>
										<button class="btn btn-small btn-success">
											<a href="finalizarEtapa?id=${item.id}"><font
												color="white">Avançar Etapa</font></a>
										</button>
									</td>
								</c:forEach>
								<td><c:forEach var="item" items="${mapas.value}">
										<textarea rows="5">
 											${item.observacao}
									</textarea>&nbsp;&nbsp;&nbsp;&nbsp;
										<button class="btn btn-small btn-success">
											<a href="adicionarObservacao?id=${item.id}"><font
												color="white">Salvar Observação</font></a>
										</button>
									</c:forEach></td>

							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

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