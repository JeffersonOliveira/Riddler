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

</head>

<body>

	<div class="masthead">
		<h2 class="muted" align="center">Riddler</h2>
		<div class="navbar">
			<div class="tabbable">
				<div class="container">
					<ul class="nav">
						<li class="active"><a href="paginaInicial.jsp">Tarefas
								Urgentes</a></li>
						<li><a href="cadastroFuncionario.jsp">Cadastro
								Funcionário</a></li>
						<li><a href="cadastroBeneficio.jsp">Cadastro Benefício</a></li>
						<li><a href="#">Tarefas Pendentes</a></li>
						<li><a href="funcionarios.jsp">Funcionários </a></li>

						<!-- Olhar pra fazer logout-->



						<li><a href="index.jsp">Logout </a></li>



					</ul>
				</div>
			</div>
		</div>
		<!-- /.navbar -->
	</div>

	<div align="center">

		<form action="cadastrarFuncionario" method="post">

			<input type="hidden" value="${funcionario.id}" name="funcionario.id"
				readonly="readonly" />

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
				<tr>
					<td>
						<h4>Benefícios</h4>
						<h6>
							Vale Transporte<input type="checkbox" id="nome"
								value="${beneficio.nome}" name="beneficio.nome" />
						</h6>
						<h6>
							Vale Refeição<input type="checkbox" id="nome"
								value="${beneficio.nome}" name="beneficio.nome" />
						</h6>
						<h6>
							Plano de saúde<input type="checkbox" id="nome"
								value="${beneficio.nome}" name="beneficio.nome" />
						</h6>
						<h6>
							Plano Dental<input type="checkbox" id="nome"
								value="${beneficio.nome}" name="beneficio.nome" />
						</h6>
					</td>
				</tr>
				<tr>
					<td>
						<h5>
							<button class="btn btn-small btn-danger">
								<a href="/deletarFuncionario?id=${funcionario.id}"><font
									color="white">Deletar Funcionario</font></a>
							</button>
							<button class="btn btn-small btn-success">

								<input type="submit" value="Alterar Dados" />

							</button>
						</h5>
					</td>
				</tr>
			</table>
		</form>

	</div>

	<!-- /container -->

	<!-- Le javascript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="bootstrap/js/jquery.js"></script>
	<script src="bootstrap/js/bootstrap-transition.js"></script>
	<script src="bootstrap/js/bootstrap-alert.js"></script>
	<script src="bootstrap/js/bootstrap-modal.js"></script>
	<script src="bootstrap/js/bootstrap-dropdown.js"></script>
	<script src="bootstrap/js/bootstrap-scrollspy.js"></script>
	<script src="bootstrap/js/bootstrap-tab.js"></script>
	<script src="bootstrap/js/bootstrap-tooltip.js"></script>
	<script src="bootstrap/js/bootstrap-popover.js"></script>
	<script src="bootstrap/js/bootstrap-button.js"></script>
	<script src="bootstrap/js/bootstrap-collapse.js"></script>
	<script src="bootstrap/js/bootstrap-carousel.js"></script>
	<script src="bootstrap/js/bootstrap-typeahead.js"></script>


</body>
</html>