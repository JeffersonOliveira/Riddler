<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Riddler - Editar Tarefa</title>

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
			<h1 class="muted">Editar Tarefa</h1>
		</div>
		<hr />
		<div class="form">
			<form action="editarBeneficio?id=${beneficio.id}" method="post">
				<div>
				<input type="hidden" id="beneficio" name="beneficio.id"
						value="${beneficio.id}" />
					<p>${erro}</p>
					Nome <input type="text" id="beneficio" name="beneficio.nome"
						value="${beneficio.nome}" />
					Prazo <input type="text" id="prazo"
						name="beneficio.prazo" value="${beneficio.prazo}" />
				</div>
				<div>
					<div>
						<p class="clone" style="display:none">
							Etapa : <input class="etapaName" type="text" id="inputEtapa" name="" value="">
							<i class="icon-minus-sign" onclick="removerEtapa(this)" ></i>
								<input type="hidden" class="etapaId" name="" value="" />
							<input type="hidden" id="ordem" class="ordem" name="" value="" />
						</p>
					</div>
					
					<c:forEach var="etapa" items="${beneficio.etapas}" varStatus="status">
						<div id="rendered" rel="etapa">
							<p class="teste">
								Etapa : <input class="etapaName" type="text" id="inputEtapa" name="etapas[${status.index}].nome" value="${etapa.nome}">
								<i class="icon-minus-sign" onclick="removerEtapa(this)" ></i>
								<input type="hidden" name="etapas[${status.index}].id" value="${etapa.id}" />
								<input type="hidden" id="ordem" class="ordem" name="etapas[${status.index}].ordem" value="${etapa.ordem}" />
							</p>
						</div>
						 
						
						
						<c:set var="indice" value="${status.index}" />
					</c:forEach>
				</div>

<!-- 				<div class="control-group  " id="rendered"> -->

<!-- 					<div class="clone count" style="display:none"> -->
<!-- 						<label class="control-label" for="inputEtapa">Etapa</label> -->
<%-- 							<input class="etapaName" type="text" id="inputEtapa" name="beneficio.etapas[${indice + 1}].nome" placeholder="Nome da etapa"> --%>
<%-- 						<input type="hidden" id="ordem" class="ordem" name="beneficio.etapas[${indice + 1}].ordem" value="${indice + 1}" /> <i class="icon-minus-sign" id="remove" onclick="removerEtapa(this)"></i> --%>
<!-- 						<br /> -->
<!-- 					</div> -->

<!-- 				</div> -->

<!-- 				<div class="concluida"> -->
<%-- 					<input type="hidden" class="etapaFinal" id="inputFinal" name="beneficio.etapas[${etapa.ordem}].nome" value="Concluida"> --%>
<%-- 					<input type="hidden" id="ordem" class="ordem" name="beneficio.etapas[${etapa.ordem}].ordem" value="${etapa.ordem}" /> --%>
<!-- 				</div> -->
				
				<i class="icon-plus-sign" id="add"></i>
				<input type="submit" class="btn btn-success" value="Cadastrar">
			</form>
		</div>



	</div>

	<jsp:include page="footer.jsp"></jsp:include>

	<script type="text/javascript">
	
			function removerEtapa(div){
				var pai = $(div).parent();
				pai.remove();
				
				// atualizar nome
				$(".teste").each(function(index){
					$(this).find(".etapaName").attr("name", "etapas[" + index + "].nome");					
				});
				
				// atualizar ordem
				$(".teste").each(function(index){
					$(this).children(".ordem").attr("name", "etapas[" + index + "].ordem");
				});
			}
		
			$("#add").click(
				function() {
				var clone = $(".clone").clone();
				$(clone).removeClass("clone");
				$(clone).addClass("teste");
				var etapaCount = $(".teste").length;
				var name = "etapas[" + (etapaCount)+ "].nome";
				var order = "etapas[" + (etapaCount)+ "].ordem";
				var id = "etapas[" + (etapaCount - 1)+ "].id";
				$(clone).find('input.etapaName').val('').attr("name",name);
				$(clone).find('input.ordem').val(etapaCount).attr("name", order);
				$(clone).find('input.etapaId').val(etapaCount).attr("name", id);
				$("#rendered").append(clone);
				$(clone).show();
			});
	</script>

</body>
</html>
