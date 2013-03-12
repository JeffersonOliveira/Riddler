<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<title>Cadastro de Funcion&atilde;rios</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="css/cadastroFuncionario.css" rel="stylesheet">

</head>

<body>

	<div class="container" >

		<div class="masthead" align="center">
			<h1 class="muted">Cadastro de Funcionários</h1>
		</div>
		<hr/>
		<div class="form">
       		<form action="cadastrarFuncionario" method="post">
				<h4>Nome</h4>    	 <input type="text" id="usuario" name="funcionario.nome">
				<h4>Data de Admissão <input type="text" id="password" name="funcionario.dataDeAdmissao"></h4>
									 <input type="submit" class="btn btn-success" value="Cadastrar">
			</form>
		</div>

	</div>
</body>
</html>