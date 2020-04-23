package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcomepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Car Selling</title>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.3.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/arial.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cuf_run.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\t.mySlides {display: none;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <h1><a href=\"#\">CarSelling<span>CS</span><small>Online Car Sale Recommendation System</small></a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("          <li><a href=\"goCSearch.do\">Search</a></li>\r\n");
      out.write("          <li><a href=\"#\">Admin Login</a></li>\r\n");
      out.write("          <li><a href=\"aboutUs.do\">About Us</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"w3-content w3-section\">\r\n");
      out.write("\t\t<img class=\"mySlides\" src=\"images/1.jpg\" width=\"1000\" height=\"300\">\r\n");
      out.write("\t\t<img class=\"mySlides\" src=\"images/8.jpg\" width=\"1000\" height=\"300\">\r\n");
      out.write("\t\t<img class=\"mySlides\" src=\"images/3.jpg\" width=\"1000\" height=\"300\">\r\n");
      out.write("\t\t<img class=\"mySlides\" src=\"images/5.jpg\" width=\"1000\" height=\"300\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\tvar myIndex= 0;\r\n");
      out.write("\tcarousel();\r\n");
      out.write("\r\n");
      out.write("\tfunction carousel() {\r\n");
      out.write("\t\tvar i;\r\n");
      out.write("\t\tvar x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("\t\tfor (i= 0; i<x.length; i++){\r\n");
      out.write("\t\t\tx[i].style.display = \"none\";\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\tmyIndex++;\r\n");
      out.write("\tif (myIndex > x.length) { myIndex =1}\r\n");
      out.write("\t\tx[myIndex-1].style.display = \"block\";\r\n");
      out.write("\tsetTimeout (carousel, 3000);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"mainbar\">\r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("          <h2><span>Online Car Sale Recommendation System</span></h2>\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          <p>Nowadays, Information Technology becomes very popular all over the world and most people use it beneficially. \r\n");
      out.write("          Most of the users want to buy car but they don't have much knowledge about car. \r\n");
      out.write("          This system will replace people tours alot of car centres with online system. \r\n");
      out.write("          The data available on this website, including all tables, numbers and text are provided from myanmarcardb.com\r\n");
      out.write("          </p>\r\n");
      out.write("          <p>\r\n");
      out.write("          In this system insertion and updating can only be done by admin. The user can choose car type and insert require information about car buying.\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"sidebar\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("       \r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          <ul class=\"sb_menu\">\r\n");
      out.write("            <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("            <li><a href=\"goCSearch.do\">Search</a></li>\r\n");
      out.write("            <li><a href=\"#\">Admin Login</a></li>\r\n");
      out.write("            <li><a href=\"aboutUs.do\">About Us</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
