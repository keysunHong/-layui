package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class spider_005fmanager_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Spider Manager</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/plugin/layui/css/layui.css\">\r\n");
      out.write("    <script type=\"application/javascript\" src=\"/plugin/layui/layui.js\"></script>\r\n");
      out.write("    <script type=\"application/javascript\" src=\"/js/spiderManagerEntrance.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/html\" id=\"spider-option\">\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"width: 1000px;height:450px;margin:100px auto\">\r\n");
      out.write("    <div class=\" layui-tab layui-tab-card\"  lay-filter=\"main\">\r\n");
      out.write("        <ul class=\"layui-tab-title\">\r\n");
      out.write("            <li class=\"layui-this\">网站设置</li>\r\n");
      out.write("            <li>用户管理</li>\r\n");
      out.write("            <li>权限分配</li>\r\n");
      out.write("            <li>商品管理</li>\r\n");
      out.write("            <li>订单管理</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"layui-tab-content\" style=\"height: 370px;\">\r\n");
      out.write("            <div class=\"layui-tab-item layui-show\">\r\n");
      out.write("                <table class=\"table-content0\" lay-filter=\"table-content0\"></table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-tab-item\">\r\n");
      out.write("                <table class=\"table-content1\" lay-filter=\"table-content1\"></table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-tab-item\">\r\n");
      out.write("                <table class=\"table-content2\" lay-filter=\"table-content2\"></table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-tab-item\">\r\n");
      out.write("                <table class=\"table-content3\" lay-filter=\"table-content3\"></table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-tab-item\">\r\n");
      out.write("                <table class=\"table-content4\" lay-filter=\"table-content4\"></table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
