/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2018-09-18 17:25:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.webgoat.session.WebSession;

public final class main_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

    WebSession webSession = ((WebSession) session.getAttribute(WebSession.SESSION));

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Expires\" CONTENT=\"0\">\n");
      out.write("        <meta http-equiv=\"Pragma\" CONTENT=\"no-cache\">\n");
      out.write("        <meta http-equiv=\"Cache-Control\" CONTENT=\"no-cache\">\n");
      out.write("        <meta http-equiv=\"Cache-Control\" CONTENT=\"no-store\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n");
      out.write("        <!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n");
      out.write("        <!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n");
      out.write("        <!--[if gt IE 8]><!-->\n");
      out.write("\n");
      out.write("        <!--  CSS -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\"/>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <!-- Fonts from Font Awsome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\"/>\n");
      out.write("        <!-- CSS Animate -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\"/>\n");
      out.write("        <!-- Custom styles for this theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\"/>\n");
      out.write("        <!--  end of CSS -->\n");
      out.write("\n");
      out.write("        <!-- JS -->\n");
      out.write("        \n");
      out.write("        <script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/html5shiv.js\"></script>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- Require.js used to load js asynchronously -->\n");
      out.write("        <script src=\"js/libs/require.min.js\" data-main=\"js/main.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("        <title>WebGoat</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section id=\"container\">\n");
      out.write("            <header id=\"header\">\n");
      out.write("                <!--logo start-->\n");
      out.write("                <div class=\"brand\">\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/welcome.mvc\" class=\"logo\"><span>Web</span>Goat</a>\n");
      out.write("                </div>\n");
      out.write("                <!--logo end-->\n");
      out.write("                <div class=\"toggle-navigation toggle-left\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" id=\"toggle-menu\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Toggle Navigation\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </button>\n");
      out.write("                </div><!--toggle navigation end-->\n");
      out.write("                <div id=\"lesson-title-wrapper\" >\n");
      out.write("                    \n");
      out.write("                </div><!--lesson title end-->\n");
      out.write("                <div class=\"user-nav pull-right\" id=\"user-and-info-nav\" style=\"margin-right: 75px;\">\n");
      out.write("                    <div class=\"dropdown\" style=\"display:inline\">\n");
      out.write("                        <button type=\"button\" data-toggle=\"dropdown\" class=\"btn btn-default dropdown-toggle\" id=\"user-menu\" >\n");
      out.write("                            <i class=\"fa fa-user\"></i> <span class=\"caret\"></span>\n");
      out.write("                        </button>                   \n");
      out.write("                        <ul class=\"dropdown-menu dropdown-menu-left\">\n");
      out.write("                            <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">Logout</a></li>\n");
      out.write("                            <li role=\"presentation\" class=\"divider\"></li>     \n");
      out.write("                            <li role=\"presentation\" class=\"disabled\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">User: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a></li>\n");
      out.write("                            <li role=\"presentation\" class=\"disabled\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Role: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a></li>\n");
      out.write("                            <li role=\"presentation\" class=\"divider\"></li>\n");
      out.write("                            <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#developer-controls\">Show developer controls</a></li>      \n");
      out.write("                            <li role=\"presentation\" class=\"disabled\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a></li>\n");
      out.write("                            <li role=\"presentation\" class=\"disabled\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Build: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${build}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"button\" id=\"about-button\"  class=\"btn btn-default right_nav_button\" title=\"About WebGoat\" data-toggle=\"modal\" data-target=\"#about-modal\"> \n");
      out.write("                        <i class=\"fa fa-info\"></i>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"mailto:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contactEmail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("?Subject=Webgoat%20feedback\" target=\"_top\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default right_nav_button\"data-toggle=\"tooltip\" title=\"Contact Us\">\n");
      out.write("                            <i class=\"fa fa-envelope\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <aside class=\"sidebar\" >\n");
      out.write("                <div id=\"menu-container\"></div>\n");
      out.write("            </aside>\n");
      out.write("            <!--sidebar left end-->\n");
      out.write("\n");
      out.write("            <!--main content start-->\n");
      out.write("            <section class=\"main-content-wrapper\">\n");
      out.write("                <section id=\"main-content\" > <!--ng-controller=\"goatLesson\"-->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <div class=\"col-md-12\" align=\"left\">\n");
      out.write("                                <div class=\"panel\" id=\"help-controls\">\n");
      out.write("                                    <button class=\"btn btn-primary btn-xs help-button\" id=\"show-source-button\">Show Source</button>\n");
      out.write("                                    <button class=\"btn btn-primary btn-xs help-button\" id=\"show-solution-button\">Show Solution</button>\n");
      out.write("                                    <button class=\"btn btn-primary btn-xs help-button\" id=\"show-plan-button\">Show Plan</button>\n");
      out.write("                                    <button class=\"btn btn-primary btn-xs help-button\" id=\"show-hints-button\">Show Hints</button>\n");
      out.write("                                    <button class=\"btn btn-xs help-button\" id=\"restart-lesson-button\">Restart Lesson</button>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"lesson-hint\" id=\"lesson-hint-container\">\n");
      out.write("                                    <h4>Hints</h4>\n");
      out.write("                                    <div class=\"panel\" >\n");
      out.write("                                        <div class=\"panel-body\" id=\"lesson-hint\">\n");
      out.write("                                            <span class=\"glyphicon-class glyphicon glyphicon-circle-arrow-left\" id=\"show-prev-hint\"></span>\n");
      out.write("                                            <span class=\"glyphicon-class glyphicon glyphicon-circle-arrow-right\" id=\"show-next-hint\"></span>\n");
      out.write("                                            <br/>\n");
      out.write("                                            <span id=\"lesson-hint-content\"></span>\n");
      out.write("                                        </div>                                    \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-12\" align=\"left\">\n");
      out.write("                                <div id=\"lesson-progress\" class=\"info\"></div>\n");
      out.write("                                <div id=\"lesson-content-wrapper\" class=\"panel\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div><!--col-md-8 end-->\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"panel\">\n");
      out.write("                                    <div class=\"panel-body\">\n");
      out.write("                                        <div align=\"left\">\n");
      out.write("                                            <h3>Cookies / Parameters</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                        <hr />\n");
      out.write("                                        <div id=\"cookies-and-params\">\n");
      out.write("                                            <div id=\"cookies-view\">\n");
      out.write("                                                <h4>Cookies</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"params-view\"> <!--class=\"paramsView\"-->\n");
      out.write("                                                <h4>Params</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div id=\"developer-control-container\">\n");
      out.write("\t                                        <div align=\"left\">\n");
      out.write("\t                                            <h3>Developer controls</h3>\n");
      out.write("\t                                        </div>\n");
      out.write("\t                                        <hr />\n");
      out.write("\t                                        <div id=\"developer-controls\">\n");
      out.write("\t                                        \n");
      out.write("\t                                        </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div><!--col-md-4 end-->         \n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"lesson-helps-wrapper\" class=\"panel\">\n");
      out.write("                        <div class=\"lesson-help\" id=\"lesson-plan-row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h4>Lesson Plan</h4>\n");
      out.write("                                <div class=\"panel\" >\n");
      out.write("                                    <div class=\"panel-body\" id=\"lesson-plan-content\">\n");
      out.write("                                        <!-- allowing jQuery to handle this one -->\n");
      out.write("                                    </div>                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"lesson-help\" id=\"lesson-solution-row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h4>Lesson Solution</h4>\n");
      out.write("                                <div class=\"panel\">\n");
      out.write("                                    <div class=\"panel-body\" id=\"lesson-solution-content\">\n");
      out.write("                                    </div>                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"lesson-help\" id=\"lesson-source-row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h4>Lesson Source Code</h4>\n");
      out.write("                                <div class=\"panel\">\n");
      out.write("                                    <div class=\"panel-body\" id=\"lesson-source-content\">\n");
      out.write("                                    </div>                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- About WebGoat Modal -->\n");
      out.write("        <div class=\"modal\" id=\"about-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-lg\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../pages/about.jsp", out, false);
      out.write(" \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/main_new.jsp(70,91) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("j_spring_security_logout");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
