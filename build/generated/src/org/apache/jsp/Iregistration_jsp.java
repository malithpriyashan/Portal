package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Iregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <meta charset=\"UTF-8\" />\n");
      out.write("        <!-- <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">  -->\n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <meta name=\"description\" content=\"Login and Registration Form with HTML5 and CSS3\" />\n");
      out.write("        <meta name=\"keywords\" content=\"html5, css3, form, switch, animation, :target, pseudo-class\" />\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"student login handling/css/demo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"student login handling/css/style.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"student login handling/css/animate-custom.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <!-- Codrops top bar -->\n");
      out.write("           \n");
      out.write("                \n");
      out.write("                \n");
      out.write("           \n");
      out.write("            <section>\t\t\t\t\n");
      out.write("                <div id=\"container_demo\" >\n");
      out.write("                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"toregister\"></a>\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"tologin\"></a>\n");
      out.write("                    <div id=\"wrapper\">\n");
      out.write("                        <div id=\"login\" class=\"animate form\">\n");
      out.write("                            <form  action=\"Iregvalidation\" method=\"post\" enctype=\"multipart/form-data\"> \n");
      out.write("                                <h1>Industry Registration</h1> \n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"email\" class=\"uname\" data-icon=\"u\" > Your email  </label>\n");
      out.write("                                    <input id=\"email\" name=\"iemail\" required=\"required\" type=\"text\" placeholder=\"mymail@mail.com\"/>\n");
      out.write("                                </p>\n");
      out.write("                                \n");
      out.write("                                 <p> \n");
      out.write("                                    <label for=\"sname\" class=\"uu\" data-icon=\"u\"> Username</label>\n");
      out.write("                                    <input id=\"user\" name=\"iname\" required=\"required\" type=\"text\" placeholder=\"eg. Fatzi12\" /> \n");
      out.write("                                </p>\t\t\t\t\n");
      out.write("                                \n");
      out.write("                                <p> \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                           \n");
      out.write("                                    <label for=\"password\" class=\"youpasswd\" data-icon=\"p\"> Your password </label>\n");
      out.write("                                    <input id=\"password\" name=\"password\" required=\"required\" type=\"password\" placeholder=\"eg. X8df!90EO\" /> \n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"password\" class=\"youpasswd\" data-icon=\"p\"> confirm password </label>\n");
      out.write("                                    <input id=\"password\" name=\"password\" required=\"required\" type=\"password\" placeholder=\"eg. X8df!90EO\" /> \n");
      out.write("                                </p>\n");
      out.write("\t\t\t\t<p> \n");
      out.write("                                    <label  class=\"uu\" data-icon=\"u\"> Company</label>\n");
      out.write("                                    <input id=\"user\" name=\"icompany\" required=\"required\" type=\"text\" placeholder=\"eg. Apple\" /> \n");
      out.write("                                </p>\t\t\n");
      out.write("                               \n");
      out.write("                                <p> \n");
      out.write("                                    <label  class=\"uu\" data-icon=\"u\"> Address</label>\n");
      out.write("                                    <input  name=\"iaddress\" required=\"required\" type=\"text\"  /> \n");
      out.write("                                </p>\t\n");
      out.write("                                <p> \n");
      out.write("                                    <label  class=\"uu\" data-icon=\"u\"> City</label>\n");
      out.write("                                    <input  name=\"icity\" required=\"required\" type=\"text\"  /> \n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label  class=\"uu\" data-icon=\"u\"> Country</label>\n");
      out.write("                                    <input  name=\"icountry\" required=\"required\" type=\"text\"  /> \n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label  class=\"uu\" data-icon=\"u\"> Postal Code</label>\n");
      out.write("                                    <input  name=\"ipostalcode\" required=\"required\" type=\"text\"  /> \n");
      out.write("                                </p>\t\n");
      out.write("                                <p> \n");
      out.write("                                    <label  class=\"uu\" data-icon=\"u\"> About</label>\n");
      out.write("                                    <input  name=\"iabout\" required=\"required\" type=\"text\"  /> \n");
      out.write("                                </p>\t\n");
      out.write("                                <p> \n");
      out.write("                                    <label  class=\"uu\" data-icon=\"\"> profile picture</label>\n");
      out.write("                                    <input type=\"file\" name=\"image\" required=\"required\"/>\n");
      out.write("                                     \n");
      out.write("                                </p>\t\n");
      out.write("                                <p class=\"login button\"> \n");
      out.write("                                    <input type=\"submit\" value=\"submit\"/> \n");
      out.write("\t\t\t\t</p>\n");
      out.write("                                \n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
