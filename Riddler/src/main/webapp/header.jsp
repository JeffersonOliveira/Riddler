<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="masthead">

			<h3 class="muted" align="center">- Perfil RH</h3>&nbsp;
			<div class="navbar">
				<div class="tabbable">
					<div class="container">
						<ul class="nav">
							<li class="active" ><a href="home.jsp">Tarefas
									Urgentes</a></li>
							<li><a href="cadastroFuncionario.jsp">Cadastro Funcion�rio</a></li>
							<li><a href="cadastroBeneficio.jsp">Cadastro Benef�cio</a></li>
							<li><a href="tarefasPendentes.jsp">Tarefas Pendentes</a></li>
							<li><a href="funcionarios.jsp">Funcion�rios </a></li>
						
							<!-- Olhar pra fazer logout-->						
							<li><a href="<c:url value="j_spring_security_logout" />" >Logout </a></li>
					
					
						</ul>
					</div>
				</div>
			</div>
			<!-- /.navbar -->