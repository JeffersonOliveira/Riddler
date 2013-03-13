<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<title>Riddler</title>
<jsp:include page="headerCSS.jsp"/>

</head>

<body>

	<div class="container">

		<jsp:include page="header.jsp"></jsp:include>
	
		&nbsp;
		<div class="jumbotron">
			<h1 align="center">
				<font color="#8B0000">Alertas Urgentes</font>
			</h1>
			&nbsp;
			<table class="table table-striped">
				<thead align="center">
					<tr>
						<th>ID</th>
						<th>Tarefa</th>
						<th>Funcionário</th>
				</thead>
				<tbody>
					<tr class="warning">
						<td>01</td>
						<td>Tarefa 1</td>
						<td>Lara</td>
						<td><button class="btn btn-small btn-danger">Fazer</button></td>
					</tr>

				</tbody>
			</table>
		</div>

		<hr color="green">

		<jsp:include page="footer.jsp"></jsp:include>
	
	</div>
	<!-- /container -->
</body>
</html>
