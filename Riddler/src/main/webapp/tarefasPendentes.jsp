<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tarefas Pendentes</title>
<jsp:include page="headerCSS.jsp" />

</head>
<body>
	<div class="container">


		<jsp:include page="header.jsp" />

		<h2 align="center">Todas as tarefas</h2>


		<!-- 				<th>Beneficio</th> -->
		<!-- 				<th>Etapa</th> -->
		<!-- 			</thead> -->
		<c:forEach var="mapa" items="${mapaPendente}">
			<table align="center">
				<thead align="center">
					<th align="center"><b>${mapa.key}</b></th>
					<br>
				</thead>
			</table>

			<table class="table table-striped">
				<c:forEach var="item" items="${mapa.value}">
					<th>${item.etapa.beneficio.nome}</th>
					<td><b>${item.etapa.nome}</b></td>

				</c:forEach>
				</c:forEach>
				</tbody>
			</table>
	</div>


	<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>