<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<head>

<title>Riddler - Funcionários </title>

<script>
	$(function() {
		$("#datepicker").datepicker();
		$("#datepicker").datepicker("option", "dateFormat", "dd/mm/yy");
		
		$("#anim").change(function() {
			$("#datepicker").datepicker("option", "showAnim", $(this).val());
		});
	});
</script>

<jsp:include page="headerCSS.jsp"/>

</head>

<body>
    <input type="hidden" />
	<div class="container">

		<jsp:include page="header.jsp"></jsp:include>
		
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
		                   <td>${funcionario.nome}</td>
		                   <td>${funcionario.dataDeAdmissao}</td>
		                   <td><button class="btn btn-small btn-success" value="Editar">
						        <a href="/editarFuncionario?id=${funcionario.id}"><font color="white">Editar Funcionario</font></a>        
						      </button>
						   </td>
		                   <td>
						    <button class="btn btn-small btn-success">
								<a href="paginaInicial.jsp" ><font color="white">Verificar Tarefas</font></a>
							</button>
					       </td>
					       <td>
					       	 <button class="btn btn-small btn-danger">
						        <a href="deletarFuncionario?id=${funcionario.id}"><font color="white">Deletar Funcionario</font></a>         
						     </button>
						   </td>
						   </tr>
	                    </c:forEach> 
				</tbody>
			</table>
		</div>

		<hr color="green">

		<jsp:include page="footer.jsp"></jsp:include>

	</div>
	<!-- /container -->


</body>
</html>