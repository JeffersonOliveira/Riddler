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

		<c:forEach var="mapa" items="${mapaPendente}">
			<table align="center">
				<thead align="center">
					<h3 align="center">
						<b>${mapa.key}</b>
					</h3>
					<h4>
					</h4>
				</thead>
			</table>

			<table align="center" class="table table-striped">
				<c:forEach var="item" items="${mapa.value}">
			<input type="hidden" value="${item.funcionario.id}"
				name="funcionario.id" readonly="readonly" />


					<td><b>${item.etapa.beneficio.nome}</b> - Status: <font color="red">${item.etapa.nome}</font></td>

					<td><button class="btn btn-small btn-success">
							<a href="terefasPendentes?id=${item.funcionario.id}"><font
								color="white">Verificar</font></a>
						</button></td>
				</c:forEach>
				</c:forEach>
				</tbody>
			</table>
	</div>


	<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>