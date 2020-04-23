package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import presentation.form.CarSellingForm;

public final class goCWelcomeSearchPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/inc/common.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction.release();
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
      out.write("<style>\r\n");
      out.write("\ta:link{ text-decoration: none;}\r\n");
      out.write("\ta:hover {\r\n");
      out.write("    color: red;\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("       <h1><a href=\"#\">CarSelling<span>CS</span><small>Online Car Sale Recommendation System</small></a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"active\"><a href=\"#\">Search</a></li>        \r\n");
      out.write("          <li><a href=\"Welcome.do\">Back</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("     \r\n");
      out.write("  \t");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("     \r\n");
      out.write("      \r\n");
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

  private boolean _jspx_meth_html_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent(null);
    _jspx_th_html_005fform_005f0.setAction("/goSearchInfo");
    _jspx_th_html_005fform_005f0.setMethod("POST");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("  \t\r\n");
        out.write("          \t\t<table  align=\"center\" border=\"0\"  cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("\t<tr>\r\n");
        out.write("<td align=\"left\"><img src=\"images/4.jpg\" width=\"270\" height=\"200\" alt=\"\"  /></td>\r\n");
        out.write("<td><img src=\"images/2.jpg\" width=\"270\" height=\"200\" alt=\"\"  /></td>\r\n");
        out.write("<td><img src=\"images/8.jpg\" width=\"270\" height=\"200\" alt=\"\"  /></td>\t\t\r\n");
        out.write("<td><img src=\"images/5.jpg\" width=\"270\" height=\"200\" alt=\"\"  /></td>\t\t\t</tr>\r\n");
        out.write("<tr>\r\n");
        out.write("<th> <a href=\"goSearchInfo.do?id=Sedan\"><font size='4'>Sedan</font></a></th>\r\n");
        out.write("<th><a href=\"goSearchInfo.do?id=Sports\"><font size='4'>Sports</font></a></th>\r\n");
        out.write("<th> <a href=\"goSearchInfo.do?id=Hatchback\"><font size='4'>Hatchback</font></a></th>\r\n");
        out.write("<th><a href=\"goSearchInfo.do?id=Station Wagon\"><font size='4'>Station Wagon</font></a></th>\r\n");
        out.write("</tr>\t         \t \t\r\n");
        out.write("<tr>\r\n");
        out.write("<td><img src=\"images/1.jpg\" width=\"270\" height=\"200\" alt=\"\"  /></td>\r\n");
        out.write("<td><img src=\"images/3.jpg\" width=\"270\" height=\"200\" alt=\"\"  /></td>\r\n");
        out.write("<td><img src=\"images/7.jpg\" width=\"270\" height=\"200\" alt=\"\"  /></td>\t\t\r\n");
        out.write("<td><img src=\"images/6.jpg\" width=\"270\" height=\"200\" alt=\"\"  /></td>\t\t\t</tr>\r\n");
        out.write("<tr>\r\n");
        out.write("<th> <a href=\"goSearchInfo.do?id=SUV\"><font size='4'>SUV</font></a></th>\r\n");
        out.write("<th><a href=\"goSearchInfo.do?id=Mini Bus\"><font size='4'>Mini Bus</font></a></th>\r\n");
        out.write("<th> <a href=\"goSearchInfo.do?id=City Bus\"><font size='4'>City Bus</font></a></th>\r\n");
        out.write("<th><a href=\"goSearchInfo.do?id=Express Bus\"><font size='4'>Express Bus</font></a></th>\r\n");
        out.write("</tr>\t         \t\t            \t\r\n");
        out.write("\t\t          </table>\r\n");
        out.write("\t\t          \r\n");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }
}
