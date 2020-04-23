package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/inc/common.jsp");
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("       <h1><a href=\"#\">CarSelling<span>CS</span><small>Online Car Selling System</small></a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"Welcome.do\">Back</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("      <div class=\"mainbar\">\r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("          <b><font face=\"Time New Roman\" color=\"Blue\" size=\"6\">About Us</font></b>  \r\n");
      out.write("        \t<br/><br/> \r\n");
      out.write("          \t\t <div class=\"clr\"></div>  <b><font face=\"Time New Roman\" color=\"Black\" size=\"5\">\r\n");
      out.write("         \t\t\t <p>This website is base on J2EE.\r\n");
      out.write("         \t\t\t  In this system, I use K-Nearest Neighbour Classification algorithm to classify.\r\n");
      out.write("User must enter car type, car name, the price he can, model, color, regional licence and engine power.\r\n");
      out.write("My mission is to save time and money of choosing cars.</p></font></b>\r\n");
      out.write("          \t\t\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"sidebar\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <div class=\"img\"><img src=\"images/aboutus.gif\" width=\"200\" height=\"200\" alt=\"\" class=\"fl\" /></div>\r\n");
      out.write("        </div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("\r\n");
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
