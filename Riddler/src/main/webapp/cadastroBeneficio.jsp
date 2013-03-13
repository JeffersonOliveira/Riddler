
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Riddler - Cadastro de Benefícios</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/cadastroBeneficio.css" rel="stylesheet">
<script src="js/jquery-1.9.1.min.js"></script>

</head>

<body>

	<hr>

	<div class="jumbotron">
		<h2>Cadastro de Benefício</h2>
	</div>

	<div>
		<form class="form-horizontal" action="cadastrarBeneficio"
			method="post">
			<div class="control-group">
				<label class="control-label" for="inputNome">Nome:</label>
				<div class="controls">
					<input type="text" id="inputNome" name="beneficio.nome"
						placeholder="Nome">
				</div>
			</div>

			<div class="control-group  " id="rendered">

				<div class="clone count">
					<label class="control-label" for="inputEtapa">Etapa 1:</label>
					<div class="controls controls-row">
						<input class="span3 etapa" type="text" id="inputEtapa"
							name="etapa.nome" placeholder="Nome da etapa"> <input
							class="span2 execucao" type="number" id="inputExecucao"
							placeholder="Dias para execução"> <input type="hidden"
							id="ordem" class="ordem" name="etapa.ordem" value="1" />
						<script type="text/javascript">
							function remover(div) {
								console.log($(this).parent());
							}
						</script>
						<i class="icon-minus-sign" id="remove" onclick="remover(this)"></i>
					</div>
					<br />
				</div>

			</div>
			<i class="icon-plus-sign" id="add"></i>


			<div class="control-group" text-align : center>
				<button type="submit" class="btn btn-success">Salvar</button>
				<button type="button" class="btn">Cancelar</button>
			</div>

		</form>
	</div>

	<hr>

	<div class="footer">
		<p>&copy;Ideais Tecnologia</p>
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

	<script type="text/javascript">
		$(function() {
			$("#add").click(function() {
				var clone = $(".clone").clone();

				console.dir(clone);

				$(clone).removeClass("clone");
				var etapa = $(".count").length + 1;
				$(clone).find('label').text('Etapa ' + etapa + ':'); // alterar depois :D
				$(clone).find('div input.etapa').val('');
				$(clone).find('div input.execucao').val('');
				$(clone).find('div input.ordem').val(etapa);

				$("#rendered").append(clone);
				remover();
			});

			function remover() {
				console.log(' hausdhasdhs ');
			}

		});
	</script>

</body>
</html>
