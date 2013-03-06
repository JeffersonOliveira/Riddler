package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("   <meta charset=\"utf-8\">\n");
      out.write("    <title>Sign in &middot; Riddler</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <!-- Le styles -->\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/inpage.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"../assets/js/html5shiv.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <!-- Fav and touch icons -->\n");
      out.write("  <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"bootstrap/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("  <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"bootstrap/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"bootstrap/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("                  <link rel=\"apple-touch-icon-precomposed\" href=\"bootstrap/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("                                 <link rel=\"shortcut icon\" href=\"bootstrap/ico/favicon.png\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <form class=\"form-signin\">\n");
      out.write("        <h2 class=\"form-signin-heading\">Login</h2>\n");
      out.write("        <input type=\"text\" class=\"input-block-level\" placeholder=\"Login\">\n");
      out.write("        <input type=\"password\" class=\"input-block-level\" placeholder=\"Senha\">\n");
      out.write("        <label class=\"checkbox\">\n");
      out.write("          <input type=\"checkbox\" value=\"remember-me\"> Lembre-me\n");
      out.write("        </label>\n");
      out.write("        <button class=\"btn btn-large btn-success\" type=\"submit\">Entrar</button>\n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("    </div> <!-- /container -->\n");
      out.write("\n");
      out.write("    <!-- Le javascript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"bootstrap/js/jquery.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-transition.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-alert.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-modal.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-dropdown.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-scrollspy.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-tab.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-tooltip.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-popover.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-button.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-collapse.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-carousel.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-typeahead.js\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
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
