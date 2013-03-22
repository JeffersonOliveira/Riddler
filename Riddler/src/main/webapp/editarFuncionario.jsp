<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<title>Editar Funcionário</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="css/cadastroFuncionario.css" rel="stylesheet">
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


		<div align="left">
			<h2>Editar Colaborador</h2>
			<hr />
			<h3>${id}</h3>
		</div>
		<div class="form">
			<form action="atualizarFuncionario" method="post">
				${erro}
				<h4>
					<input type="hidden" value="${id}"
						name="funcionario.id" readonly="readonly" /> 
						
					Nome: <input type="text" id="usuario" name="funcionario.nome" value="${id}">
				</h4>
				<h4>
					Data de Admissão: <input type="text" id="datepicker"
						name="funcionario.dataDeAdmissao" value="${funcionario.dataDeAdmissao}" />
				</h4>

				<table class="table table-striped">
					<tbody>
						<c:forEach var="beneficio" items="${beneficios}" varStatus="count">
							<label class="checkbox"> <input type="checkbox"
								name="etapasSelecionadas[${count.index}]"
								value="${beneficio.primeiraEtapa.id}" /> ${beneficio.nome}
							</label>
						</c:forEach>
					</tbody>
				</table>
				<input type="submit" class="btn btn-success" value="Alterar Dados">
			</form>
			
			<!-- 			<form action="atualizarFuncionario" method="post"> -->
			<!-- 				<h4> -->
			<!-- 					Nome: <input type="text" id="usuario" name="funcionario.nome" -->
			<%-- 						value="${funcionario.nome}"> --%>
			<!-- 				</h4> -->
			<!-- 				<h4> -->
			<!-- 					Data de Admissão: -->
			<%-- 					<fmt:formatDate value="${funcionario.dataDeAdmissao}" type="date" --%>
			<%-- 						pattern="dd/MM/yyyy" var="theFormattedDate" /> --%>
			<%-- 					<input type="text" id="datepicker" value="${theFormattedDate}" name="funcionario.dataDeAdmissao" /> --%>

			<!-- 				</h4> -->

			<%-- 				<c:forEach var="mapas" items="${mapa}"> --%>
			<!-- 					<tr> -->
			<%-- 						<td><c:forEach var="feitos" items="${mapas.value}" varStatus="count"> --%>
			<!-- 								<label class="checkbox">  -->
			<!-- 									<input type="checkbox" -->
			<%-- 									name="etapasSelecionadas[${count.index}]" --%>
			<%-- 									value="${feitos.etapa.beneficio.primeiraEtapa.id}" />${mapas.key} --%>
			<!-- 								</label> -->
			<%-- 							</c:forEach></td> --%>

			<!-- 					</tr> -->
			<%-- 				</c:forEach> --%>


			<!-- 				<input type="submit" class="btn btn-success" value="Alterar Dados"> -->
			<!-- 			</form> -->
		</div>



		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>

<script type="text/javascript">
	$(function() {
		$("#datepicker").datepicker({
			"dateFormat" : "dd/mm/yy",
			"constrainInput" : true
		});
		''
		$("#anim").change(function() {
			$("#datepicker").datepicker("option", "showAnim", $(this).val());
		});
	});
</script>