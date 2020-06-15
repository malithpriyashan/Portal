package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class testevent_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
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
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"eventstyle.css\">\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
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
      out.write("                    The Portal\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <a href=\"user.html\">\n");
      out.write("                        <i class=\"pe-7s-user\"></i>\n");
      out.write("                        <p>User Profile</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a href=\"event.jsp\">\n");
      out.write("                        <i class=\"fas fa-user-friends\"></i>\n");
      out.write("                        <p>Events</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"typography.html\">\n");
      out.write("                        <i class=\"far fa-question-circle\"></i>\n");
      out.write("                        <p>Forum</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"typography.html\">\n");
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
      out.write("\n");
      out.write("         <section>\n");
      out.write("\t\t<div class=\"leftbox\">\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t<h1>Events and Shows</h1>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("\t\t\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("\t\t\t\tquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("\t\t\t\tconsequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("\t\t\t\tcillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("\t\t\t\tproident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                <form>\n");
      out.write("                \n");
      out.write("                \t<button type=\"button\" name=\"addeventbtn\"  id=\"addeventbtn\" data-target=\"#loginmodal\" data-toggle=\"modal\" style=\"width: 150px;\">+ ADD EVENT  </button>\n");
      out.write("                \t\n");
      out.write("                \t\n");
      out.write("\t                  \t\n");
      out.write("    <button type=\"button\" name=\"deleteeventbtn\"  id=\"deleteeventbtn\" data-target=\"#deletemodal\" data-toggle=\"modal\" >- DELETE EVENT</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("            \n");
      out.write("\t\t\n");
      out.write("  \n");
      out.write(" <div class=\"events\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("                             ");

String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "javaproject";
String userId = "root";
String password = "";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM event";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("                      <li >\n");
      out.write("                                   \n");
      out.write("\t\t\t\t\t<div class=\"time\">\n");
      out.write("\t\t\t\t\t\t<h2 style=\"word-wrap:break-word\">");
      out.print(resultSet.getString("day") );
      out.write("<br><span style=\"word-wrap:break-word\">");
      out.print(resultSet.getString("month") );
      out.write("</span></h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"details\" >\n");
      out.write("                                        \n");
      out.write("                                            <h3 style=\"word-wrap:break-word\">");
      out.print(resultSet.getString("title") );
      out.write("</h3>\n");
      out.write("\t\t\t\t\t\t<p style=\"word-wrap:break-word\">\n");
      out.write("                                                 ");
      out.print(resultSet.getString("description") );
      out.write("\n");
      out.write("                                                    </p>\n");
      out.write("                                                <a href=\"#\">View Details</a>\n");
      out.write("                                        \t\t                                                               \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                                    <div style=\"clear: both;\"></div>\n");
      out.write("\t\t\t\t</li>\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("    \n");
      out.write("\t\t\t\t\n");
      out.write("\t</section>\n");
      out.write("     \n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"modal\" id=\"loginmodal\" tabindex=\"-1\" >\n");
      out.write("\t\t              <div class=\"modal-dialog\"> \n");
      out.write("\t\t\t            <div class=\"modal-content\">\n");
      out.write("\t\t\t\t        <div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t    <button class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\n");
      out.write("\t\t\t\t        </div>\n");
      out.write("\t\t\t\t        <div class=\"modal-body\">\n");
      out.write("                                            <form action=\"servlet/Register\" method=\"post\">\n");
      out.write("                                                <h2 style=\"text-align: center;\">Event Details</h2>\n");
      out.write("\t\n");
      out.write("                            <table >\n");
      out.write("    \t                      <tr><b><label style=\"padding-right: 300px;\">Day:</label>    <label >month:</label> </b></tr>\n");
      out.write("    \t                      <tr><td><input type=\"text\" name=\"day\" style=\"margin-right: 90px;width: 238px\"></td>\n");
      out.write("                                  <td><input type=\"text\" name=\"month\" style=\"width: 235px;\"></td>\n");
      out.write("    \t                      </tr>\n");
      out.write("    \t                      <tr><td><b><label><br>Title:</label></b></td></tr>\n");
      out.write("    \t\n");
      out.write("                            </table>\n");
      out.write("\t                        <input type=\"text\" name=\"title\" style=\"width: 570px;\"><br>\n");
      out.write("\t                        <b><label>Visibility</label></b><br>\n");
      out.write("\t                        <b><label>Description:</label></b><br>\n");
      out.write("                                <textarea rows=\"5\" cols=\"86\" name=\"description\"></textarea><br><br>\n");
      out.write("                                <center> <input type=\"submit\" name=\"submit\" class=\"btn btn-primary\" id=\"eventsubmit\" ></center>\t\n");
      out.write("\t \n");
      out.write("                           </form>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t        </div>\n");
      out.write("\t\t\t\t        <div class=\"modal-footer\"></div>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t         </div>\n");
      out.write("\t\t\n");
      out.write("\t           </div>\n");
      out.write("                    <div class=\"modal\" id=\"deletemodal\" tabindex=\"-1\" >\n");
      out.write("\t\t              <div class=\"modal-dialog\"> \n");
      out.write("\t\t\t            <div class=\"modal-content\">\n");
      out.write("\t\t\t\t        <div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t    <button class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\n");
      out.write("\t\t\t\t        </div>\n");
      out.write("\t\t\t\t        <div class=\"modal-body\">\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write(" ");

String driver = "com.mysql.jdbc.Driver";
String connectionURL = "jdbc:mysql://localhost:3306/";
String database = "javaproject";
String userid = "root";
String dpassword = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}


      out.write("                                           \n");
      out.write("\n");
      out.write("<table class=\"deletetable\"  align=\"center\"  style=\"border-collapse: collapse;width: 100%;\">\n");
      out.write("<tr>\n");
      out.write("    <th style=\"text-align: left; padding: 8px;background-color: #e91e63;color: white;\">Day</th>\n");
      out.write("<th style=\"text-align: left; padding: 8px;background-color: #e91e63;color: white;\">Month</th>\n");
      out.write("<th style=\"text-align: left; padding: 8px;background-color: #e91e63;color: white;\">Title</th>\n");
      out.write("<th style=\"text-align: left; padding: 8px;background-color: #e91e63;color: white;\">Description</th>\n");
      out.write("<th style=\"text-align: left; padding: 8px;background-color: #e91e63;color: white;\">Action</th>\n");
      out.write("</tr>\n");

try{
connection = DriverManager.getConnection(connectionURL+database, userid, dpassword);
statement=connection.createStatement();
String sql ="select * from event";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td style=\"text-align: left; padding: 8px;\">");
      out.print(resultSet.getString("day") );
      out.write("</td>\n");
      out.write("<td style=\"text-align: left; padding: 8px;\">");
      out.print(resultSet.getString("month") );
      out.write("</td>\n");
      out.write("<td style=\"text-align: left; padding: 8px;\">");
      out.print(resultSet.getString("title") );
      out.write("</td>\n");
      out.write("<td style=\"text-align: left; padding: 8px;\">");
      out.print(resultSet.getString("description") );
      out.write("</td>\n");
      out.write("<td><a href=\"delete.jsp?id=");
      out.print(resultSet.getString("id") );
      out.write("\"><button type=\"button\" class=\"btn btn-danger\">Delete</button></a></td>\n");
      out.write("</tr>\n");

i++;
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t        </div>\n");
      out.write("\t\t\t\t        <div class=\"modal-footer\"></div>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t         </div>\n");
      out.write("\t\t\n");
      out.write("\t           </div>\n");
      out.write("                   \n");
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
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write(" <script type=\"text/javascript\" src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
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
