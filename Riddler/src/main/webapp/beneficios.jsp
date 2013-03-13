<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<head>

<title>Riddler - Benefícios</title>
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
				Benefícios
			</h1>
			&nbsp;
			<table class="table table-striped">
				<thead align="center">
					<tr>
					
<!-- 						<th>ID</th> -->
						<th>Beneficio</th>
						<th>Estado</th>
				</thead>
				<tbody>
					
 						<c:forEach  var="beneficio" items="${beneficios}">
 						<c:forEach  var="etapa" items="${etapas}"> 
		                  <tr> 
		                   <td>${beneficio.nome}</td>
		                   <td>${etapa.nome}</td>
		                   <td><button class="btn btn-small btn-success">
						        <a href="/editarBeneficio?id=${beneficio.id}">Editar Beneficio</a>        
						      </button>
						   </td>
		                   <td><button class="btn btn-small btn-success">
						        <a href="/deletarFuncionario?id=${beneficio.id}">Deletar Beneficio</a>         
						       </button>
						   </td>
						   <td>
						    <button class="btn btn-small btn-success">
								<a href="paginaInicial.jsp">Verificar Tarefas</a>
							</button>
					       </td>
						   </tr>
					   </c:forEach>
	                   </c:forEach> 
				</tbody>
			</table>
		</div>

		<hr color="green">

		<div class="footer">
			<p>&copy; Ideais Tecnologia</p>
		</div>

	</div>

</body>
</html>