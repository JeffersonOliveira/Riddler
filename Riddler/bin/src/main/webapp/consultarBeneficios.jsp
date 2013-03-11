<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Consulta de Benefícios</title>
</head>
<body>

	<h2>Lista de Beneficios do Funcionario ${funcionario}</h2>

	<c:forEach items="${beneficios}" var="b">
		<p>${b} </p>
	</c:forEach>

</body>
</html>