/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2018-09-19 13:04:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.plugin_005fextracted.plugin.DangerousEval.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.regex.*;
import org.owasp.webgoat.plugin.DangerousEval;

public final class eval_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

String action = request.getParameter("action");
String field1 = request.getParameter("field1");
String field2 = request.getParameter("field2");
String regex1 = "^[0-9]{3}$";// any three digits
Pattern pattern1 = Pattern.compile(regex1);

if(action == null) action = "Purchase";
if(field1 == null) field1 = "123";
if(field2 == null) field2 = "-1";

/** For security reasons, we remove all '<' and '>' characters to prevent XSS **/
// Thank you Victor Bucutea for noticing replaceAll only cleans taint to the return value.
field1 = field1.replaceAll("<", "");
field1 = field1.replaceAll(">", "");
field2 = field2.replaceAll("<", "");
field2 = field2.replaceAll(">", "");

if("Purchase".equals(action))
{
	if(!pattern1.matcher(field1).matches())
	{
		/** If they supplied the right attack, pass them **/
		if(field1.indexOf("');") != -1 && field1.indexOf("alert") != -1 && field1.indexOf("document.cookie") != -1)
		{
			session.setAttribute(DangerousEval.PASSED, "true");
		}
		
		out.write("alert('Whoops: You entered an incorrect access code of \"" + field1 + "\"');");
	}
	else
	{
		out.write("alert('Purchase completed successfully with credit card \"" + field2 + "\" and access code \"" + field1 + "\"');");
	}
}

      out.write('\n');
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
}
