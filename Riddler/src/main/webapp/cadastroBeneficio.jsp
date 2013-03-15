<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
	<head>
		<title>Riddler - Cadastro de Benefícios</title>
		
		<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
		<link href="css/cadastroBeneficio.css" rel="stylesheet">
		<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
		<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
		<script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
		<link rel="stylesheet" href="/resources/demos/style.css" />
		<jsp:include page="headerCSS.jsp"/>
		
	</head>
	
	<body>
	
		<div class="container">
	
		<jsp:include page="header.jsp"  />
	
			<div class="masthead" align="center">
				<h1 class="muted">Cadastro de Benefícios</h1>
			</div>
			<hr />
			<div class="form">
				<form action="cadastrarBeneficios" method="post">
					<div>
					${erro}
						Nome <input type="text" id="beneficio" name="beneficio.nome">
					</div>
<!-- 					<div> -->
<!-- 						Etapa: <input class="span3 etapa" type="text" id="inputEtapa" name="etapa.nome" placeholder="Nome da etapa"> -->
<!-- 						<input class="span2 execucao" type="number" id="inputExecucao" placeholder="Dias para execução"> -->
<!-- 						<input type="hidden" id="ordem" class="ordem" name="etapa.ordem" value="1" /> -->
<!-- 					</div> -->
					<input type="submit" class="btn btn-success" value="Cadastrar">
				</form>
			</div>
			
			
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
	</body>
</html>
