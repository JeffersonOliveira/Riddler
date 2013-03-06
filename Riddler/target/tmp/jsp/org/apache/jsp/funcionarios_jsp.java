package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class funcionarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Riddler - Funcionários</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<!-- Le styles -->\n");
      out.write("<link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link href=\"bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/paginaInicial.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"masthead\">\n");
      out.write("\t\t\t<h3 class=\"muted\">Riddler</h3>\n");
      out.write("\t\t\t<div class=\"navbar\">\n");
      out.write("\t\t\t\t<div class=\"tabbable\">\n");
      out.write("\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"paginaInicial.jsp\">Tarefas\n");
      out.write("\t\t\t\t\t\t\t\t\tUrgentes</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"cadastroFuncionario.jsp\">Cadastro Funcionário</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"cadastroBeneficio.jsp\">Cadastro Benefício</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Tarefas Pendentes</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Funcionários </a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<!-- Olhar pra fazer logout-->\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.jsp\">Logout </a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.navbar -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t&nbsp;\n");
      out.write("\t\t<div class=\"jumbotron\">\n");
      out.write("\t\t\t<h1 align=\"center\">\n");
      out.write("\t\t\t\tFuncionários\n");
      out.write("\t\t\t</h1>\n");
      out.write("\t\t\t&nbsp;\n");
      out.write("\t\t\t<table class=\"table table-striped\">\n");
      out.write("\t\t\t\t<thead align=\"center\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>ID</th>\n");
      out.write("\t\t\t\t\t\t<th>Funcionário</th>\n");
      out.write("\t\t\t\t\t\t<th>Data de Admissão</th>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t<tr class=\"warning\">\n");
      out.write("\t\t\t\t\t\t<td>01</td>\n");
      out.write("\t\t\t\t\t\t<td>Larissa</td>\n");
      out.write("\t\t\t\t\t\t<td>01/10/2012</td>\n");
      out.write("\t\t\t\t\t\t<td><button class=\"btn btn-small btn-success\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"paginaInicial.jsp\"><font color=\"white\">Verificar Tarefas</font></a>\n");
      out.write("\t\t\t\t\t\t\t</button></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<hr color=\"green\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<p>&copy; Ideais Tecnologia</p>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /container -->\n");
      out.write("\n");
      out.write("\t<!-- Le javascript\n");
      out.write("    ================================================== -->\n");
      out.write("\t<!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("\t<script src=\"bootstrap/js/jquery.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-transition.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-alert.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-modal.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-dropdown.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-scrollspy.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-tab.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-tooltip.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-popover.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-button.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-collapse.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-carousel.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-typeahead.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
