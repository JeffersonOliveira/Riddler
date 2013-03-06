package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroBeneficio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("\n");
      out.write("<title>Riddler - Cadastro de Benef&iacute;cios</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<!-- Le styles -->\n");
      out.write("<link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/cadastroBeneficio.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("      <script src=\"../assets/js/html5shiv.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("<!-- Fav and touch icons -->\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\"\n");
      out.write("\thref=\"../assets/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\"\n");
      out.write("\thref=\"../assets/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\"\n");
      out.write("\thref=\"../assets/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\"\n");
      out.write("\thref=\"../assets/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"../assets/ico/favicon.png\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"container-narrow\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"masthead\">\n");
      out.write("\t\t\t<ul class=\"nav nav-pills pull-right\">\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">About</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Contact</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<h3 class=\"muted\">Riddler</h3>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<hr>\n");
      out.write("\n");
      out.write("\t\t<div class=\"jumbotron\">\n");
      out.write("\t\t\t<h2>Cadastro de Benef&iacute;cio</h2>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<form class=\"form-horizontal\">\n");
      out.write("\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t<label class=\"control-label\" for=\"inputNome\">Nome:</label>\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"inputNome\" placeholder=\"Nome\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t<div id=\"filho-0\">\n");
      out.write("\t\t\t\t\t\t<label class=\"control-label\" for=\"inputEtapa\">Etapa:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"controls controls-row\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"span3\" type=\"text\" id=\"inputEtapa\" placeholder=\"Nome da etapa\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"span2\" type=\"number\" id=\"inputExecucao\" placeholder=\"Prazo para execuc&atilde;o\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<i class=\" icon-plus-sign\"></i>\n");
      out.write("\t\t\t\t\t<!--  <input type=\"button\" class=\"btn btn-small btn-success\" onclick=\"addInput()\" name=\"add\" id=\"add\" value=\"Adicionar outra etapa\" />\n");
      out.write("\t\t\t\t\t -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\">Salvar</button>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn\">Cancelar</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<hr>\n");
      out.write("\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<p>&copy; Batman 2013</p>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /container -->\n");
      out.write("\n");
      out.write("\t<!-- Le javascript\n");
      out.write("    ================================================== -->\n");
      out.write("\t<!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("\t<script src=\"../assets/js/jquery.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-transition.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-alert.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-modal.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-dropdown.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-scrollspy.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-tab.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-tooltip.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-popover.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-button.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-collapse.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-carousel.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-typeahead.js\"></script>\n");
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("$(document).ready(function() {\n");
      out.write("    $(\"#duplica\").click(function(){\n");
      out.write("            $(\".fotosbox1\").append($(\"input[name=fotos]:eq(0)\").clone().val(\"\"));\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\t$(\"#add\").click(function(){\n");
      out.write("\t\tvar novoFilho = $(\"#filho\").clone()\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
