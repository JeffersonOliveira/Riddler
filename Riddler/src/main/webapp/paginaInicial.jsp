<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<title>Riddler</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">

<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/paginaInicial.css" rel="stylesheet">

</head>

<body>

	<div class="container">

		<div class="masthead">
			<h3 class="muted" align="center">Perfil RH</h3>&nbsp;
			<div class="navbar">
				<div class="tabbable">
					<div class="container">
						<ul class="nav">
							<li class="active"><a href="paginaInicial.jsp">Tarefas
									Urgentes</a></li>
							<li><a href="cadastroFuncionario.jsp">Cadastro Funcionário</a></li>
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
		&nbsp;
		<div class="jumbotron">
			<h1 align="center">
				<font color="#8B0000">Alertas Urgentes</font>
			</h1>
			&nbsp;
			<table class="table table-striped">
				<thead align="center">
					<tr>
						<th>ID</th>
						<th>Tarefa</th>
						<th>Funcionário</th>
				</thead>
				<tbody>
					<tr class="warning">
						<td>01</td>
						<td>Tarefa 1</td>
						<td>Lara</td>
						<td><button class="btn btn-small btn-danger">Fazer</button></td>
					</tr>

				</tbody>
			</table>
		</div>

		<hr color="green">

		<div class="footer">
			<p>&copy; Ideais Tecnologia</p>
		</div>

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
