package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ucalendar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <link href='calendarparts/css/fullcalendar.min.css' rel='stylesheet' />\n");
      out.write("        <link href='calendarparts/css/fullcalendar.print.min.css' rel='stylesheet' media='print' />\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("              <link href=\"assets/css/animate.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <link href=\"assets/css/light-bootstrap-dashboard.css?v=1.4.0\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("            <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href=\"assets/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <script src='calendarparts/js/moment.min.js'></script>\n");
      out.write("        <script src='calendarparts/js/jquery.min.js'></script>\n");
      out.write("        <script src='calendarparts/js/fullcalendar.min.js'></script>\n");
      out.write("\n");
      out.write("       \n");
      out.write(" <script type=\"text/javascript\" src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                $('#calendar').fullCalendar({\n");
      out.write("                    defaultDate: '2018-07-01',\n");
      out.write("                    editable: true,\n");
      out.write("                    eventLimit: true, // allow \"more\" link when too many events\n");
      out.write("                    events: \"CalendarJsonServlet\"\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("    <div class=\"sidebar\" data-color=\"purple\" data-image=\"assets/img/sidebar-5.jpg\">\n");
      out.write("\n");
      out.write("    <!--   you can change the color of the sidebar using: data-color=\"blue | azure | green | orange | red | purple\" -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    \t<div class=\"sidebar-wrapper\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"#\" class=\"simple-text\">\n");
      out.write("                    The Portal\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Uuserprofile.jsp\">\n");
      out.write("                        <i class=\"pe-7s-user\"></i>\n");
      out.write("                        <p>User Profile</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li >\n");
      out.write("                    <a href=\"Uevent.jsp\">\n");
      out.write("                        <i class=\"fas fa-user-friends\"></i>\n");
      out.write("                        <p>Events</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                \n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a href=\"Ucalendar.jsp\">\n");
      out.write("                        <i class=\"far fa-calendar-alt\"></i>\n");
      out.write("                        <p>Calendar</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("\t\t\t\t\n");
      out.write("            </ul>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-panel\" >\n");
      out.write("\t\t\n");
      out.write("       <a href=\"Uaddcalendar.jsp\"> <button type=\"button\" class=\"btn btn-primary\" style=\"width: 100%;color:black;text-decoration: none;\">Add events</button></a>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <div id=\"calendar\"></div>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \t<script src=\"assets/js/chartist.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap-notify.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("\t<script src=\"assets/js/light-bootstrap-dashboard.js?v=1.4.0\"></script>\n");
      out.write("\n");
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
