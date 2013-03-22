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

		<h2>Todas as tarefas</h2>


		<table class="table table-striped">
			<thead align="center">
				<th>Funcionário</th>
				<th>Benefício</th>
				<th>Etapa</th>
			</thead>

			<tbody>
				<c:forEach var="mapaPendente" items="${mapaPendente}">
					<tr align="left">${mapaPendente.key}
					</tr>
					<c:forEach var="item" items="${mapaPendente.value}">
						<tr>
						<td>${item.etapa.beneficio.nome}</td>
						<td>${item.etapa.nome}</td>
						</tr>
					</c:forEach>
				</c:forEach>
			</tbody>
		</table>
	</div>



	<td><jsp:include page="footer.jsp"></jsp:include>
		</div>
</body>
</html>