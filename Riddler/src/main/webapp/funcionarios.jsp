<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<head>

<title>Riddler - Funcionários</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">

<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/paginaInicial.css" rel="stylesheet">

</head>

<body>
    <input type="hidden" />
	<div class="container">

		<div class="masthead">
			<h3 class="muted">Riddler</h3>
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
				Funcionários
			</h1>
			&nbsp;
			<table class="table table-striped">
				<thead align="center">
					<tr>
					
<!-- 						<th>ID</th> -->
						<th>Funcionário</th>
						<th>Data de Admissão</th>
				</thead>
				<tbody>
					
 						<c:forEach  var="funcionario" items="${funcionarios}"> 
		                  <tr> 
		                  <td>
		                   <td>${funcionario.nome}</td>
		                   <td>${funcionario.dataDeAdmissao}</td>
		                   <td><button class="btn btn-small btn-success">
						        <a href="/editarFuncionario?id=${funcionario.id}">Editar Funcionario</a>        
						      </button>
						   </td>
		                   <td><button class="btn btn-small btn-success">
						        <a href="/deletarFuncionario?id=${funcionario.id}">Deletar Funcionario</a>         
						       </button>
						   </td>
						   <td>
						    <button class="btn btn-small btn-success">
								<a href="paginaInicial.jsp"><font color="white">Verificar Tarefas</font></a>
							</button>
					       </td>
						   </tr>
	                    </c:forEach> 
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