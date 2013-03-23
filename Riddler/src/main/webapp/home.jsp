<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<title>Riddler</title>
<jsp:include page="headerCSS.jsp" />

</head>

<body>

	<div class="container">

		<jsp:include page="header.jsp"></jsp:include>

		<div class="jumbotron">
			<h1 align="center">
				<font color="#8B0000">Alertas Urgentes</font>
			</h1>
			&nbsp;
			<c:forEach var="mapa" items="${mapaPendente}">
				<table align="center">
					<thead align="center">
						<h3 align="left" class="text-error">
							<b>${mapa.key}</b>
						</h3>
						<h4></h4>
					</thead>
				</table>

				<table align="center" class="table table-striped" >
					<c:forEach var="item" items="${mapa.value}">
						<input type="hidden" value="${item.funcionario.id}"
							name="funcionario.id" readonly="readonly" />

					<tr class="error">

						<td><b>${item.etapa.beneficio.nome}</b> - Status: <font
							color="red">${item.etapa.nome}</font></td>

						<td><button class="btn btn-small btn-danger">
								<a href="terefasPendentes?id=${item.funcionario.id}"><font
									color="white">Verificar</font></a>
							</button></td>
					</tr>
					</c:forEach>
					</c:forEach>
					</tbody>
				</table>
		</div>


		<jsp:include page="footer.jsp"></jsp:include>

	</div>
</body>
</html>
