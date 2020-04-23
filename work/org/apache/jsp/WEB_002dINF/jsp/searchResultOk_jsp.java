package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import presentation.form.ResultView;

public final class searchResultOk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/inc/common.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.release();
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
      out.write("         <h1><a href=\"#\">CarSelling<span>CS</span><small>Online Car Sale Recommendation System</small></a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        \r\n");
      out.write("           <ul>\r\n");
      out.write("          <li><a href=\"searchBack.do\">Back</a></li>\r\n");
      out.write("  \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("      <div class=\"mainbar\">\r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("        \r\n");
      out.write("        ");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("     <div class=\"sidebar\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <div class=\"img\"><img width=\"230\" height=\"200\" alt=\"\" class=\"fl\" src=\"");
      out.print(request.getAttribute("photo1"));
      out.write("\"></img></div>\r\n");
      out.write("        </div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("  \r\n");
      out.write("   \t<div class=\"sidebar\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <div class=\"img\"><img width=\"230\" height=\"200\" alt=\"\" class=\"fl\" src=\"");
      out.print(request.getAttribute("photo2"));
      out.write("\"></img></div>\r\n");
      out.write("        </div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("\r\n");
      out.write("   \t<div class=\"sidebar\">\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <div class=\"img\"><img width=\"230\" height=\"200\" alt=\"\" class=\"fl\" src=\"");
      out.print(request.getAttribute("photo3"));
      out.write("\"></img></div>\r\n");
      out.write("        </div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t\r\n");
      out.write("   \t<div class=\"sidebar\">\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <div class=\"img\"><img width=\"230\" height=\"200\" alt=\"\" class=\"fl\" src=\"");
      out.print(request.getAttribute("photo4"));
      out.write("\"></img></div>\r\n");
      out.write("        </div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t\r\n");
      out.write("   \t<div class=\"sidebar\">\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <div class=\"img\"><img width=\"230\" height=\"200\" alt=\"\" class=\"fl\" src=\"");
      out.print(request.getAttribute("photo5"));
      out.write("\"></img></div>\r\n");
      out.write("        </div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("</div>\r\n");
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
    _jspx_th_html_005fform_005f0.setAction("/searchResultOk");
    _jspx_th_html_005fform_005f0.setMethod("POST");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("          ");
        if (_jspx_meth_logic_005fnotEmpty_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t           ");
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

  private boolean _jspx_meth_logic_005fnotEmpty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEmpty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_logic_005fnotEmpty_005f0.setName("carSellingForm");
    int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("          <b><font face=\"Time New Roman\" color=\"blue\" size=\"5\">First Nearest Neighbour</font></b> \r\n");
        out.write("          <br></br>\r\n");
        out.write("          <table border=\"0\" width=\"60%\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Id:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Type:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Name:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t          \t <tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Price:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Model:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f4(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Color:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Regional License:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Engine Power:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f7(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Control:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f8(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Oil:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f9(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Hand Drive:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f10(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t          </table>\r\n");
        out.write("<br></br>\t\t          \r\n");
        out.write(" <b><font face=\"Time New Roman\" color=\"blue\" size=\"5\">Second Nearest Neighbour</font></b> \r\n");
        out.write("          <br></br>\r\n");
        out.write("          <table border=\"0\" width=\"58%\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("          <tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Id:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f11(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Type:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f12(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Name:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f13(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t          \t <tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Price:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f14(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Model:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f15(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Color:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f16(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Regional License:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f17(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Engine Power:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f18(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Control:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f19(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Oil:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f20(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Hand Drive:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f21(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t          </table>\r\n");
        out.write("\t          \r\n");
        out.write("\t    <br></br>\r\n");
        out.write("\t     <b><font face=\"Time New Roman\" color=\"blue\" size=\"5\">Third Nearest Neighbour</font></b> \r\n");
        out.write("          <br></br>\r\n");
        out.write("          <table border=\"0\" width=\"60%\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("          <tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Id:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f22(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Type:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f23(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Name:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f24(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t          \t <tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Price:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f25(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Model:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f26(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Color:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f27(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Regional License:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f28(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Engine Power:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f29(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Control:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f30(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Oil:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f31(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Hand Drive:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f32(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t          </table>\r\n");
        out.write("        \t <br></br>\r\n");
        out.write("\t     <b><font face=\"Time New Roman\" color=\"blue\" size=\"5\">Fourth Nearest Neighbour</font></b> \r\n");
        out.write("          <br></br>\r\n");
        out.write("          <table border=\"0\" width=\"60%\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("          <tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Id:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f33(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Type:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f34(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Name:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f35(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t          \t <tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Price:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f36(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Model:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f37(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Color:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f38(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Regional License:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f39(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Engine Power:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f40(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Control:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f41(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Oil:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f42(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Hand Drive:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f43(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t          </table>\r\n");
        out.write("\t           <br></br>\r\n");
        out.write("\t           \r\n");
        out.write("\t     <b><font face=\"Time New Roman\" color=\"blue\" size=\"5\">Fifth Nearest Neighbour</font></b> \r\n");
        out.write("          <br></br>\r\n");
        out.write("          <table border=\"0\" width=\"60%\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("          <tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Id:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f44(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Type:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f45(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Car Name:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f46(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t          \t <tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Price:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f47(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Model:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f48(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Color:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f49(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Regional License:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f50(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Engine Power:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f51(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Control:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f52(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Oil:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f53(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t         \t \t<td align=\"left\" height=\"30\">\r\n");
        out.write("\t          \t\t\t<b><font face=\"Time New Roman\" color=\"#C9\" size=\"3\">Hand Drive:</font></b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<td align=\"left\" height=\"30\"> \r\n");
        out.write("\t\t\t\t\t\t\t<font face=\"Time New Roman\" size=\"3\">\r\n");
        out.write("          \t\t\t\t\t<b>");
        if (_jspx_meth_bean_005fwrite_005f54(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("</b></font>\r\n");
        out.write("          \t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t          </table>\r\n");
        out.write("\t\t          ");
        int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f0.setProperty("carId1");
    _jspx_th_bean_005fwrite_005f0.setScope("request");
    _jspx_th_bean_005fwrite_005f0.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f1.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f1.setProperty("type1");
    _jspx_th_bean_005fwrite_005f1.setScope("request");
    _jspx_th_bean_005fwrite_005f1.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f2.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f2.setProperty("name1");
    _jspx_th_bean_005fwrite_005f2.setScope("request");
    _jspx_th_bean_005fwrite_005f2.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f3.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f3.setProperty("price1");
    _jspx_th_bean_005fwrite_005f3.setScope("request");
    _jspx_th_bean_005fwrite_005f3.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f4.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f4.setProperty("model1");
    _jspx_th_bean_005fwrite_005f4.setScope("request");
    _jspx_th_bean_005fwrite_005f4.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f5.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f5.setProperty("color1");
    _jspx_th_bean_005fwrite_005f5.setScope("request");
    _jspx_th_bean_005fwrite_005f5.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f6.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f6.setProperty("rLicence1");
    _jspx_th_bean_005fwrite_005f6.setScope("request");
    _jspx_th_bean_005fwrite_005f6.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f7.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f7.setProperty("ePower1");
    _jspx_th_bean_005fwrite_005f7.setScope("request");
    _jspx_th_bean_005fwrite_005f7.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f8.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f8.setProperty("control1");
    _jspx_th_bean_005fwrite_005f8.setScope("request");
    _jspx_th_bean_005fwrite_005f8.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f9.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f9.setProperty("oil1");
    _jspx_th_bean_005fwrite_005f9.setScope("request");
    _jspx_th_bean_005fwrite_005f9.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f10.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f10.setProperty("drive1");
    _jspx_th_bean_005fwrite_005f10.setScope("request");
    _jspx_th_bean_005fwrite_005f10.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f11 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f11.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f11.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f11.setProperty("carId2");
    _jspx_th_bean_005fwrite_005f11.setScope("request");
    _jspx_th_bean_005fwrite_005f11.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f11 = _jspx_th_bean_005fwrite_005f11.doStartTag();
    if (_jspx_th_bean_005fwrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f12 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f12.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f12.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f12.setProperty("type2");
    _jspx_th_bean_005fwrite_005f12.setScope("request");
    _jspx_th_bean_005fwrite_005f12.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f12 = _jspx_th_bean_005fwrite_005f12.doStartTag();
    if (_jspx_th_bean_005fwrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f13 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f13.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f13.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f13.setProperty("name2");
    _jspx_th_bean_005fwrite_005f13.setScope("request");
    _jspx_th_bean_005fwrite_005f13.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f13 = _jspx_th_bean_005fwrite_005f13.doStartTag();
    if (_jspx_th_bean_005fwrite_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f14 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f14.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f14.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f14.setProperty("price2");
    _jspx_th_bean_005fwrite_005f14.setScope("request");
    _jspx_th_bean_005fwrite_005f14.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f14 = _jspx_th_bean_005fwrite_005f14.doStartTag();
    if (_jspx_th_bean_005fwrite_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f15 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f15.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f15.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f15.setProperty("model2");
    _jspx_th_bean_005fwrite_005f15.setScope("request");
    _jspx_th_bean_005fwrite_005f15.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f15 = _jspx_th_bean_005fwrite_005f15.doStartTag();
    if (_jspx_th_bean_005fwrite_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f16 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f16.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f16.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f16.setProperty("color2");
    _jspx_th_bean_005fwrite_005f16.setScope("request");
    _jspx_th_bean_005fwrite_005f16.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f16 = _jspx_th_bean_005fwrite_005f16.doStartTag();
    if (_jspx_th_bean_005fwrite_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f17 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f17.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f17.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f17.setProperty("rLicence2");
    _jspx_th_bean_005fwrite_005f17.setScope("request");
    _jspx_th_bean_005fwrite_005f17.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f17 = _jspx_th_bean_005fwrite_005f17.doStartTag();
    if (_jspx_th_bean_005fwrite_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f18 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f18.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f18.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f18.setProperty("ePower2");
    _jspx_th_bean_005fwrite_005f18.setScope("request");
    _jspx_th_bean_005fwrite_005f18.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f18 = _jspx_th_bean_005fwrite_005f18.doStartTag();
    if (_jspx_th_bean_005fwrite_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f19 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f19.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f19.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f19.setProperty("control2");
    _jspx_th_bean_005fwrite_005f19.setScope("request");
    _jspx_th_bean_005fwrite_005f19.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f19 = _jspx_th_bean_005fwrite_005f19.doStartTag();
    if (_jspx_th_bean_005fwrite_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f20 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f20.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f20.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f20.setProperty("oil2");
    _jspx_th_bean_005fwrite_005f20.setScope("request");
    _jspx_th_bean_005fwrite_005f20.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f20 = _jspx_th_bean_005fwrite_005f20.doStartTag();
    if (_jspx_th_bean_005fwrite_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f21 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f21.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f21.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f21.setProperty("drive2");
    _jspx_th_bean_005fwrite_005f21.setScope("request");
    _jspx_th_bean_005fwrite_005f21.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f21 = _jspx_th_bean_005fwrite_005f21.doStartTag();
    if (_jspx_th_bean_005fwrite_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f22 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f22.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f22.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f22.setProperty("carId3");
    _jspx_th_bean_005fwrite_005f22.setScope("request");
    _jspx_th_bean_005fwrite_005f22.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f22 = _jspx_th_bean_005fwrite_005f22.doStartTag();
    if (_jspx_th_bean_005fwrite_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f23 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f23.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f23.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f23.setProperty("type3");
    _jspx_th_bean_005fwrite_005f23.setScope("request");
    _jspx_th_bean_005fwrite_005f23.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f23 = _jspx_th_bean_005fwrite_005f23.doStartTag();
    if (_jspx_th_bean_005fwrite_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f23);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f24 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f24.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f24.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f24.setProperty("name3");
    _jspx_th_bean_005fwrite_005f24.setScope("request");
    _jspx_th_bean_005fwrite_005f24.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f24 = _jspx_th_bean_005fwrite_005f24.doStartTag();
    if (_jspx_th_bean_005fwrite_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f24);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f25 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f25.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f25.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f25.setProperty("price3");
    _jspx_th_bean_005fwrite_005f25.setScope("request");
    _jspx_th_bean_005fwrite_005f25.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f25 = _jspx_th_bean_005fwrite_005f25.doStartTag();
    if (_jspx_th_bean_005fwrite_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f25);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f26 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f26.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f26.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f26.setProperty("model3");
    _jspx_th_bean_005fwrite_005f26.setScope("request");
    _jspx_th_bean_005fwrite_005f26.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f26 = _jspx_th_bean_005fwrite_005f26.doStartTag();
    if (_jspx_th_bean_005fwrite_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f26);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f27 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f27.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f27.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f27.setProperty("color3");
    _jspx_th_bean_005fwrite_005f27.setScope("request");
    _jspx_th_bean_005fwrite_005f27.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f27 = _jspx_th_bean_005fwrite_005f27.doStartTag();
    if (_jspx_th_bean_005fwrite_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f27);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f28 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f28.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f28.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f28.setProperty("rLicence3");
    _jspx_th_bean_005fwrite_005f28.setScope("request");
    _jspx_th_bean_005fwrite_005f28.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f28 = _jspx_th_bean_005fwrite_005f28.doStartTag();
    if (_jspx_th_bean_005fwrite_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f28);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f29 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f29.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f29.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f29.setProperty("ePower3");
    _jspx_th_bean_005fwrite_005f29.setScope("request");
    _jspx_th_bean_005fwrite_005f29.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f29 = _jspx_th_bean_005fwrite_005f29.doStartTag();
    if (_jspx_th_bean_005fwrite_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f29);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f30 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f30.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f30.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f30.setProperty("control3");
    _jspx_th_bean_005fwrite_005f30.setScope("request");
    _jspx_th_bean_005fwrite_005f30.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f30 = _jspx_th_bean_005fwrite_005f30.doStartTag();
    if (_jspx_th_bean_005fwrite_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f30);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f31 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f31.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f31.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f31.setProperty("oil3");
    _jspx_th_bean_005fwrite_005f31.setScope("request");
    _jspx_th_bean_005fwrite_005f31.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f31 = _jspx_th_bean_005fwrite_005f31.doStartTag();
    if (_jspx_th_bean_005fwrite_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f31);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f32 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f32.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f32.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f32.setProperty("drive3");
    _jspx_th_bean_005fwrite_005f32.setScope("request");
    _jspx_th_bean_005fwrite_005f32.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f32 = _jspx_th_bean_005fwrite_005f32.doStartTag();
    if (_jspx_th_bean_005fwrite_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f32);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f33 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f33.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f33.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f33.setProperty("carId4");
    _jspx_th_bean_005fwrite_005f33.setScope("request");
    _jspx_th_bean_005fwrite_005f33.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f33 = _jspx_th_bean_005fwrite_005f33.doStartTag();
    if (_jspx_th_bean_005fwrite_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f33);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f34 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f34.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f34.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f34.setProperty("type4");
    _jspx_th_bean_005fwrite_005f34.setScope("request");
    _jspx_th_bean_005fwrite_005f34.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f34 = _jspx_th_bean_005fwrite_005f34.doStartTag();
    if (_jspx_th_bean_005fwrite_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f34);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f35 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f35.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f35.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f35.setProperty("name4");
    _jspx_th_bean_005fwrite_005f35.setScope("request");
    _jspx_th_bean_005fwrite_005f35.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f35 = _jspx_th_bean_005fwrite_005f35.doStartTag();
    if (_jspx_th_bean_005fwrite_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f35);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f36 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f36.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f36.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f36.setProperty("price4");
    _jspx_th_bean_005fwrite_005f36.setScope("request");
    _jspx_th_bean_005fwrite_005f36.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f36 = _jspx_th_bean_005fwrite_005f36.doStartTag();
    if (_jspx_th_bean_005fwrite_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f36);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f37 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f37.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f37.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f37.setProperty("model4");
    _jspx_th_bean_005fwrite_005f37.setScope("request");
    _jspx_th_bean_005fwrite_005f37.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f37 = _jspx_th_bean_005fwrite_005f37.doStartTag();
    if (_jspx_th_bean_005fwrite_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f37);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f38 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f38.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f38.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f38.setProperty("color4");
    _jspx_th_bean_005fwrite_005f38.setScope("request");
    _jspx_th_bean_005fwrite_005f38.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f38 = _jspx_th_bean_005fwrite_005f38.doStartTag();
    if (_jspx_th_bean_005fwrite_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f38);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f39 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f39.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f39.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f39.setProperty("rLicence4");
    _jspx_th_bean_005fwrite_005f39.setScope("request");
    _jspx_th_bean_005fwrite_005f39.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f39 = _jspx_th_bean_005fwrite_005f39.doStartTag();
    if (_jspx_th_bean_005fwrite_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f39);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f40 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f40.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f40.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f40.setProperty("ePower4");
    _jspx_th_bean_005fwrite_005f40.setScope("request");
    _jspx_th_bean_005fwrite_005f40.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f40 = _jspx_th_bean_005fwrite_005f40.doStartTag();
    if (_jspx_th_bean_005fwrite_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f40);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f41 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f41.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f41.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f41.setProperty("control4");
    _jspx_th_bean_005fwrite_005f41.setScope("request");
    _jspx_th_bean_005fwrite_005f41.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f41 = _jspx_th_bean_005fwrite_005f41.doStartTag();
    if (_jspx_th_bean_005fwrite_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f41);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f42 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f42.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f42.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f42.setProperty("oil4");
    _jspx_th_bean_005fwrite_005f42.setScope("request");
    _jspx_th_bean_005fwrite_005f42.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f42 = _jspx_th_bean_005fwrite_005f42.doStartTag();
    if (_jspx_th_bean_005fwrite_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f42);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f43 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f43.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f43.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f43.setProperty("drive4");
    _jspx_th_bean_005fwrite_005f43.setScope("request");
    _jspx_th_bean_005fwrite_005f43.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f43 = _jspx_th_bean_005fwrite_005f43.doStartTag();
    if (_jspx_th_bean_005fwrite_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f43);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f44(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f44 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f44.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f44.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f44.setProperty("carId5");
    _jspx_th_bean_005fwrite_005f44.setScope("request");
    _jspx_th_bean_005fwrite_005f44.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f44 = _jspx_th_bean_005fwrite_005f44.doStartTag();
    if (_jspx_th_bean_005fwrite_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f44);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f45 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f45.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f45.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f45.setProperty("type5");
    _jspx_th_bean_005fwrite_005f45.setScope("request");
    _jspx_th_bean_005fwrite_005f45.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f45 = _jspx_th_bean_005fwrite_005f45.doStartTag();
    if (_jspx_th_bean_005fwrite_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f45);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f46(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f46 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f46.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f46.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f46.setProperty("name5");
    _jspx_th_bean_005fwrite_005f46.setScope("request");
    _jspx_th_bean_005fwrite_005f46.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f46 = _jspx_th_bean_005fwrite_005f46.doStartTag();
    if (_jspx_th_bean_005fwrite_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f46);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f47(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f47 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f47.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f47.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f47.setProperty("price5");
    _jspx_th_bean_005fwrite_005f47.setScope("request");
    _jspx_th_bean_005fwrite_005f47.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f47 = _jspx_th_bean_005fwrite_005f47.doStartTag();
    if (_jspx_th_bean_005fwrite_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f47);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f48(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f48 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f48.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f48.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f48.setProperty("model5");
    _jspx_th_bean_005fwrite_005f48.setScope("request");
    _jspx_th_bean_005fwrite_005f48.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f48 = _jspx_th_bean_005fwrite_005f48.doStartTag();
    if (_jspx_th_bean_005fwrite_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f48);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f49(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f49 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f49.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f49.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f49.setProperty("color5");
    _jspx_th_bean_005fwrite_005f49.setScope("request");
    _jspx_th_bean_005fwrite_005f49.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f49 = _jspx_th_bean_005fwrite_005f49.doStartTag();
    if (_jspx_th_bean_005fwrite_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f49);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f50(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f50 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f50.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f50.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f50.setProperty("rLicence5");
    _jspx_th_bean_005fwrite_005f50.setScope("request");
    _jspx_th_bean_005fwrite_005f50.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f50 = _jspx_th_bean_005fwrite_005f50.doStartTag();
    if (_jspx_th_bean_005fwrite_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f50);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f51(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f51 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f51.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f51.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f51.setProperty("ePower5");
    _jspx_th_bean_005fwrite_005f51.setScope("request");
    _jspx_th_bean_005fwrite_005f51.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f51 = _jspx_th_bean_005fwrite_005f51.doStartTag();
    if (_jspx_th_bean_005fwrite_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f51);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f52(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f52 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f52.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f52.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f52.setProperty("control5");
    _jspx_th_bean_005fwrite_005f52.setScope("request");
    _jspx_th_bean_005fwrite_005f52.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f52 = _jspx_th_bean_005fwrite_005f52.doStartTag();
    if (_jspx_th_bean_005fwrite_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f52);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f53(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f53 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f53.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f53.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f53.setProperty("oil5");
    _jspx_th_bean_005fwrite_005f53.setScope("request");
    _jspx_th_bean_005fwrite_005f53.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f53 = _jspx_th_bean_005fwrite_005f53.doStartTag();
    if (_jspx_th_bean_005fwrite_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f53);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f54(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f54 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f54.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f54.setName("carSellingForm");
    _jspx_th_bean_005fwrite_005f54.setProperty("drive5");
    _jspx_th_bean_005fwrite_005f54.setScope("request");
    _jspx_th_bean_005fwrite_005f54.setIgnore(true);
    int _jspx_eval_bean_005fwrite_005f54 = _jspx_th_bean_005fwrite_005f54.doStartTag();
    if (_jspx_th_bean_005fwrite_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fscope_005fproperty_005fname_005fignore_005fnobody.reuse(_jspx_th_bean_005fwrite_005f54);
    return false;
  }
}
