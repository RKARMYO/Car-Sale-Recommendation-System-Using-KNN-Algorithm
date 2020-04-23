package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import presentation.form.CarSellingForm;
import presentation.form.CarName;
import presentation.form.CarModel;
import presentation.form.CarColor;
import presentation.form.CarPrice;
import presentation.form.CarLicence;
import presentation.form.CarEnginePower;

public final class inputInfoPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/inc/common.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fstyle_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fstyle_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fstyle_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
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
      out.write("       <h1><a href=\"#\">CarSelling<span>CS</span><small>Online Car Sale Recommendation System</small></a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"active\"><a href=\"Welcome.do\">Home</a></li>\r\n");
      out.write("          <li><a href=\"goCSearch.do\">Back</a></li>\r\n");
      out.write("         \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("      <div class=\"mainbar\">\r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("          <b><font face=\"Time New Roman\" color=\"blue\" size=\"5\">Search Page</font></b>  \r\n");
      out.write("        \t<br/><br/> \r\n");
      out.write("          \t\t <div class=\"clr\"></div>\r\n");
      out.write("         \t\t\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      _jspx_th_html_005fform_005f0.setAction("/searchInfo");
      _jspx_th_html_005fform_005f0.setMethod("POST");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
          out.write("          \r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t         \t \t<td align=\"left\" height=\"50\">\r\n");
          out.write("\t          \t\t\t<b><font face=\"Verdana\" color=\"#C9\" size=\"3\">Car Name:</font></b>\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t            <td align=\"left\" height=\"50\" > \r\n");
          out.write("\t\t            ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
          _jspx_th_html_005fselect_005f0.setProperty("cName");
          _jspx_th_html_005fselect_005f0.setStyle("max-width:90%;");
          int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
          if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fselect_005f0.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("             \t\t");

             	
						ArrayList<CarName> cSearch=(ArrayList)request.getAttribute("carName");
						Iterator it=cSearch.iterator();
						while (it.hasNext()){
							CarName c=(CarName)it.next();		
					
              out.write("\r\n");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t");
              //  html:option
              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
              _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
              _jspx_th_html_005foption_005f0.setValue(c.cName );
              int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
              if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005foption_005f0.doInitBody();
                }
                do {
                  out.print(c.cName );
                  int evalDoAfterBody = _jspx_th_html_005foption_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f0);
              out.write("\r\n");
              out.write("                \t\r\n");
              out.write("\t\t\t\t\t");

						}
					
              out.write("\t\r\n");
              out.write("\t             \t ");
              int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fselect_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fselect_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>          \t               \r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t             <tr></tr>\r\n");
          out.write("\t             \r\n");
          out.write("\t             \r\n");
          out.write("\t             <tr>\r\n");
          out.write("\t         \t \t<td align=\"left\" height=\"50\">\r\n");
          out.write("\t          \t\t\t<b><font face=\"Verdana\" color=\"#C9\" size=\"3\">Price:</font></b>\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t            <td align=\"left\" height=\"50\"> \r\n");
          out.write("\t\t            ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
          _jspx_th_html_005fselect_005f1.setProperty("price");
          int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
          if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fselect_005f1.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("             \t\t");

             	
						ArrayList<CarPrice> carP=(ArrayList)request.getAttribute("carPrice");
						Iterator it=carP.iterator();
						while (it.hasNext()){
							CarPrice cp=(CarPrice)it.next();		
					
              out.write("\r\n");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t");
              //  html:option
              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
              _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
              _jspx_th_html_005foption_005f1.setValue(cp.price );
              int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
              if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005foption_005f1.doInitBody();
                }
                do {
                  out.print(cp.price );
                  int evalDoAfterBody = _jspx_th_html_005foption_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f1);
              out.write("\r\n");
              out.write("                \t\r\n");
              out.write("\t\t\t\t\t");

						}
					
              out.write("\t\r\n");
              out.write("\t             \t ");
              int evalDoAfterBody = _jspx_th_html_005fselect_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>          \t\r\n");
          out.write("                 </tr>\r\n");
          out.write("\t             \r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t         \t \t<td align=\"left\" height=\"50\">\r\n");
          out.write("\t          \t\t\t<b><font face=\"Verdana\" color=\"#C9\" size=\"3\">Model:</font></b>\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t            <td align=\"left\" height=\"50\"> \r\n");
          out.write("\t\t            ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
          _jspx_th_html_005fselect_005f2.setProperty("cModel");
          _jspx_th_html_005fselect_005f2.setStyle("max-width:90%;");
          int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
          if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fselect_005f2.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("             \t\t");

             	
						ArrayList<CarModel> carModel=(ArrayList)request.getAttribute("carModel");
						Iterator it=carModel.iterator();
						while (it.hasNext()){
							CarModel cmodel=(CarModel)it.next();		
					
              out.write("\r\n");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t");
              //  html:option
              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
              _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
              _jspx_th_html_005foption_005f2.setValue(cmodel.cModel );
              int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
              if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005foption_005f2.doInitBody();
                }
                do {
                  out.print(cmodel.cModel );
                  int evalDoAfterBody = _jspx_th_html_005foption_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f2);
              out.write("\r\n");
              out.write("                \t\r\n");
              out.write("\t\t\t\t\t");

						}
					
              out.write("\t\r\n");
              out.write("\t             \t ");
              int evalDoAfterBody = _jspx_th_html_005fselect_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fselect_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fselect_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f2);
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>          \t\r\n");
          out.write("                 </tr>\r\n");
          out.write("\t             <tr></tr>\r\n");
          out.write("\t             \r\n");
          out.write("\t             <tr>\r\n");
          out.write("\t         \t \t<td align=\"left\" height=\"50\">\r\n");
          out.write("\t          \t\t\t<b><font face=\"Verdana\" color=\"#C9\" size=\"3\">Color:</font></b>\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t            <td align=\"left\" height=\"50\" > \r\n");
          out.write("\t\t            ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f3 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_005fselect_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
          _jspx_th_html_005fselect_005f3.setProperty("cColor");
          int _jspx_eval_html_005fselect_005f3 = _jspx_th_html_005fselect_005f3.doStartTag();
          if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fselect_005f3.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("             \t\t");

             	
						ArrayList<CarColor> carColor=(ArrayList)request.getAttribute("carColor");
						Iterator it=carColor.iterator();
						while (it.hasNext()){
							CarColor cc=(CarColor)it.next();		
					
              out.write("\r\n");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t");
              //  html:option
              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
              _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
              _jspx_th_html_005foption_005f3.setValue(cc.cColor );
              int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
              if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005foption_005f3.doInitBody();
                }
                do {
                  out.print(cc.cColor );
                  int evalDoAfterBody = _jspx_th_html_005foption_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005foption_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f3);
              out.write("\r\n");
              out.write("                \t\r\n");
              out.write("\t\t\t\t\t");

						}
					
              out.write("\t\r\n");
              out.write("\t             \t ");
              int evalDoAfterBody = _jspx_th_html_005fselect_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f3);
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>          \t\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t             <tr></tr>\r\n");
          out.write("\t             \r\n");
          out.write("\t             <tr>\r\n");
          out.write("\t         \t \t<td align=\"left\" height=\"50\">\r\n");
          out.write("\t          \t\t\t<b><font face=\"Verdana\" color=\"#C9\" size=\"3\">Regional Licence:</font></b>\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t            <td align=\"left\" height=\"50\"> \r\n");
          out.write("\t\t            ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f4 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_005fselect_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fselect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
          _jspx_th_html_005fselect_005f4.setProperty("cLicence");
          int _jspx_eval_html_005fselect_005f4 = _jspx_th_html_005fselect_005f4.doStartTag();
          if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fselect_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fselect_005f4.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("             \t\t");

             	
						ArrayList<CarLicence> cLicence=(ArrayList)request.getAttribute("carLicence");
						Iterator it=cLicence.iterator();
						while (it.hasNext()){
							CarLicence cl=(CarLicence)it.next();		
					
              out.write("\r\n");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t");
              //  html:option
              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f4 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
              _jspx_th_html_005foption_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
              _jspx_th_html_005foption_005f4.setValue(cl.cLicence );
              int _jspx_eval_html_005foption_005f4 = _jspx_th_html_005foption_005f4.doStartTag();
              if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005foption_005f4.doInitBody();
                }
                do {
                  out.print(cl.cLicence );
                  int evalDoAfterBody = _jspx_th_html_005foption_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005foption_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f4);
              out.write("\r\n");
              out.write("                \t\r\n");
              out.write("\t\t\t\t\t");

						}
					
              out.write("\t\r\n");
              out.write("\t             \t ");
              int evalDoAfterBody = _jspx_th_html_005fselect_005f4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fselect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f4);
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>          \t               \r\n");
          out.write("\t\t\t\t </tr>\r\n");
          out.write("\t             <tr></tr>\r\n");
          out.write("\t             \r\n");
          out.write("\t            \r\n");
          out.write("\t             <tr></tr>\r\n");
          out.write("\t             \r\n");
          out.write("\t             <tr>\r\n");
          out.write("\t             \t<td align=\"center\" height=\"50\" colspan=\"2\"> <input type=submit value=\"Search\"></input><br/>\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t             </tr>\r\n");
          out.write("\t             \r\n");
          out.write("\t             \r\n");
          out.write("          </table>\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
      out.write("\r\n");
      out.write("          \t\t\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"sidebar\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <div class=\"img\"><img src=\"images/images4.jpg\" width=\"200\" height=\"200\" alt=\"\" class=\"fl\" /></div>\r\n");
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
