package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Connection;

public final class Ianswerpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicon.ico\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\n");
      out.write("\t<title>Light Bootstrap Dashboard by Creative Tim</title>\n");
      out.write("\n");
      out.write("\t<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS     -->\n");
      out.write("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- Animation library for notifications   -->\n");
      out.write("    <link href=\"assets/css/animate.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <!--  Light Bootstrap Table core CSS    -->\n");
      out.write("    <link href=\"assets/css/light-bootstrap-dashboard.css?v=1.4.0\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("    <link href=\"assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href=\"assets/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("    <div class=\"sidebar\" data-color=\"purple\" data-image=\"assets/img/sidebar-5.jpg\">\n");
      out.write("\n");
      out.write("    <!--   you can change the color of the sidebar using: data-color=\"blue | azure | green | orange | red | purple\" -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    \t<div class=\"sidebar-wrapper\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"#\" class=\"simple-text\">\n");
      out.write("                   THE PORTAL\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Ianswerpage\">\n");
      out.write("                        <i class=\"pe-7s-user\"></i>\n");
      out.write("                        <p>User Profile</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li >\n");
      out.write("                    <a href=\"Ievent.jsp\">\n");
      out.write("                        <i class=\"fas fa-user-friends\"></i>\n");
      out.write("                        <p>Events</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a href=\"Iquestions\">\n");
      out.write("                        <i class=\"far fa-question-circle\"></i>\n");
      out.write("                        <p>Forum</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
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
      out.write("    <div class=\"main-panel\">\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"content\" >\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <div class=\"card\"style=\"background-color:  #E0E0E0;\">\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <h2 class=\"title\" style=\"font-family: 'Montserrat', sans-serif; text-align: center;\">Post Your Answers</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content\" style=\"height: 940px;margin-left: 30px;\">\n");
      out.write("                             \n");
      out.write("                                <div class=\"row\">\n");
      out.write("            <div class=\"box-panel\" style=\"width: 100%\">\n");
      out.write("\n");
      out.write("               \n");
      out.write("              <hr>\n");
      out.write("              <!-- form login -->\n");
      out.write("              \n");
      out.write("              ");

                   java.sql.Connection connection = null;
                   
        
                    try
                    {
                       
                        //connection = Connector.ConnectDb(); create the connection here//
                        int id = Integer.valueOf(request.getParameter("id"));
                        String driverName = "com.mysql.jdbc.Driver";
                        String connectionUrl = "jdbc:mysql://localhost:3306/";
                        String dbName = "javaproject";
                        String userId = "root";
                        String password = "";
                        
                        Class.forName(driverName);
                        connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);

                        PreparedStatement pst = connection.prepareStatement(" SELECT * FROM question where id = '"+id+"'");
                        ResultSet rs = pst.executeQuery();
                        while(rs.next())
                        {
                            String title=rs.getString("title");
                            String tags = rs.getString("tags");
                            String question = rs.getString("question");
                            int qid = rs.getInt("id");
                            request.setAttribute("tags", tags);
                            request.setAttribute("title", title);
                            request.setAttribute("question", question);
                            session.setAttribute("qid", qid);
                        }
                    } 

                    catch (SQLException ex) {
                        
                    }
                
      out.write("\n");
      out.write("                <form class=\"margin-top-40\" action=\"IPostAnswer\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Place your title here\" disabled style=\"color:black; font-size: 20px; font-weight: bold;width: 97%;\" class=\"form-control\" style=\"font-weight: bold;font-size: 20px;\"  name=\"title\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                      <label style=\"color: #C93535; font-size:20px;\">Tags</label>\n");
      out.write("                      <input type=\"text\" placeholder=\"Place your tags here\" disabled class=\"form-control\"  name=\"keywords\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tags}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' style=\"color: black;width: 97%;\">\n");
      out.write("                      <input type=\"hidden\" display=\"none\" name=\"qid\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' style=\"color:#C93535;\">\n");
      out.write("                      \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label style=\"color:#C93535;font-size:20px;\">Question Details</label>\n");
      out.write("                  <textarea cols=\"100\" rows=\"12\" placeholder=\"Post Your Question Details Here.....\" name=\"message\" class=\"form-control\" style=\"color:black;width: 933px;\" disabled=\"\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </textarea>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                  <label style=\"color:#C9353;font-size:20px;\">Image</label>\n");
      out.write("                  <input class=\"input--style-4\" type=\"file\" name=\"image\">\n");
      out.write("                </div> \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                  <label style=\"color: #C93535;font-size:20px;\">Answer</label>\n");
      out.write("                  <textarea cols=\"50\" rows=\"12\" style=\"width: 933px;\" placeholder=\"Post Your Answer Here.....\"  name=\"comment\" class=\"form-control\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"text-align: center\"><button class=\"btn btn-danger\" value=\"submit\"  type=\"submit\"> Post </button> </div>\n");
      out.write("               <!-- <button class=\"btn btn-primary pull-right\" value=\"reset\">Reset</button>-->\n");
      out.write("               <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <hr style=\"border: 2px solid; color:#F80000;\">\n");
      out.write("               \n");
      out.write("                <h2 style=\"text-align: center\">Answers</h2>\n");
      out.write("               \n");
      out.write("               <table> \n");
      out.write("              \n");
      out.write("              ");
                  
                    try
                    {
                        int id = Integer.valueOf(request.getParameter("id"));
                        String driverName = "com.mysql.jdbc.Driver";
                        String connectionUrl = "jdbc:mysql://localhost:3306/";
                        String dbName = "javaproject";
                        String userId = "root";
                        String password = "";
                        
                        Class.forName(driverName);
                        connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);

                        //connection = Connector.ConnectDb();
                        PreparedStatement pst = connection.prepareStatement(" SELECT * FROM comment where q_id = '"+id+"' order by id ");
                        ResultSet rs = pst.executeQuery();
                        while(rs.next())
                        {
                            String answer = rs.getString("comment");
                            request.setAttribute("answer",answer);
                
      out.write("\n");
      out.write("                \n");
      out.write("              <tr>\n");
      out.write("\n");
      out.write("                    <td><ul><li>");
      out.print( rs.getString("comment") );
      out.write("</li></ul></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");
 
                }

                } 
                catch (Exception e) {
                e.printStackTrace();
                }
                
      out.write("\n");
      out.write("                </table>\n");
      out.write("               \n");
      out.write("\n");
      out.write("\n");
      out.write("              </form>\n");
      out.write("              <!-- form login -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"assets/js/jquery.3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<!--  Charts Plugin -->\n");
      out.write("\t<script src=\"assets/js/chartist.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Notifications Plugin    -->\n");
      out.write("    <script src=\"assets/js/bootstrap-notify.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Google Maps Plugin    -->\n");
      out.write("    <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("\n");
      out.write("    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\n");
      out.write("\t<script src=\"assets/js/light-bootstrap-dashboard.js?v=1.4.0\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->\n");
      out.write("\t<script src=\"assets/js/demo.js\"></script>\n");
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
