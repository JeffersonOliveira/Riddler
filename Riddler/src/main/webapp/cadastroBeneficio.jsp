
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Riddler - Cadastro de Benef&iacute;cios</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Le styles -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/cadastroBeneficio.css" rel="stylesheet">


<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="../assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="../assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="../assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="../assets/ico/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="../assets/ico/favicon.png">
</head>

<body>

	<jsp:include page="header.jsp"  />

		<hr>

		<div class="jumbotron">
			<h2>Cadastro de Benef&iacute;cio</h2>
		</div>

		<div>
			<form class="form-horizontal" action="cadastrarBeneficio" method="post">
				<div class="control-group">
					<label class="control-label" for="inputNome">Nome:</label>
					<div class="controls">
						<input type="text" id="inputNome" name="beneficio.nome" placeholder="Nome">
					</div>
				</div>


				<div class="control-group">
					<div id="filho-0">
						<label class="control-label" for="inputEtapa">Etapa:</label>
						<div class="controls controls-row">
							<input class="span3" type="text" id="inputEtapa" name="etapa.nome"
								placeholder="Nome da etapa"> <input class="span2"
								type="number" id="inputExecucao"
								placeholder="Prazo para execuc&atilde;o">
						</div>
					</div>
					<i class=" icon-plus-sign"></i>
					<!--  <input type="button" class="btn btn-small btn-success" onclick="addInput()" name="add" id="add" value="Adicionar outra etapa" />
					 -->
				</div>

				<div class="control-group" text-align : center>
					<button type="submit" class="btn btn-success">Salvar</button>
					<button type="button" class="btn">Cancelar</button>
				</div>

			</form>
		</div>

		<hr>

		<div class="footer">
			<p>&copy; Batman 2013</p>
		</div>



	</div>
	

	<script language="javascript">
		$(document).ready(
				function() {
					$("#duplica").click(
							function() {
								$(".fotosbox1").append(
										$("input[name=fotos]:eq(0)").clone()
												.val(""));
							});
				});
		$("#add").click(function() {
			var novoFilho = $("#filho").clone()
		});
	</script>


</body>
</html>
