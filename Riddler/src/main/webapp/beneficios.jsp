<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Riddler - Lista de Beneficios</title>
</head>
<body>
<div class="container">

	<jsp:include page="header.jsp"  />

	<h2>Lista de Beneficios do Funcionario ${funcionario.nome}</h2>
	
	<table cellspacing="10px;">
		<tr>
			<th>Nome do Beneficio</th>
		</tr>
		<c:forEach items="${beneficios}" var="beneficio">
		 <tr>
		   <td>${beneficio.nome}</td>
	     </tr>
	    </c:forEach>
	</table>
	</div>
</body>
</html>