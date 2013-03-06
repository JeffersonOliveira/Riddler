package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroFuncionario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Cadastro de Funcion&atilde;rios</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/cadastroFuncionario.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"container\" >\n");
      out.write("\n");
      out.write("\t\t<div class=\"masthead\" align=\"center\">\n");
      out.write("\t\t\t<h1 class=\"muted\">Cadastro de Funcionários</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr/>\n");
      out.write("\t\t<div class=\"form\">\n");
      out.write("        \n");
      out.write("\t\tNome:&nbsp;<p/><input type=\"text\" name=\"nome\" value=\"\" size=\"35\" /><p/>\n");
      out.write("\t\tData de Admissão:&nbsp;<p/><input type=\"text\" name=\"dataDeAdmissão\" value=\"\" size=\"35\" /><p/>\n");
      out.write("\t    </div>\n");
      out.write("\t\t<div class=\"form-actions\">\n");
      out.write("\t\t   <button type=\"submit\" class=\"btn btn-success\">Cadastrar</button>\n");
      out.write("           <button type=\"button\" class=\"btn\">Cancelar</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\t\t<script src=\"../bootstrap/js/jquery.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-transition.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-alert.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-modal.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-dropdown.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-scrollspy.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-tab.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-tooltip.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-popover.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-button.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-collapse.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-carousel.js\"></script>\n");
      out.write("\t\t<script src=\"../bootstrap/js/bootstrap-typeahead.js\"></script>\n");
      out.write("\t</div>\n");
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
