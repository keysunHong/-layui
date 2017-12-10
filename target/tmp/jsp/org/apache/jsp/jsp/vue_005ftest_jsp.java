package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vue_005ftest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Vue Test</title>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script type=\"application/javascript\" src=\"/plugin/vue/vue.js\"></script>\r\n");
      out.write("    <script type=\"application/javascript\" src=\"/plugin/jquery/jquery-3.2.1.js\"></script>\r\n");
      out.write("    <script type=\"application/javascript\" src=\"/js/vueTest.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"app\">\r\n");
      out.write("        {{message}}\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"app-2\">\r\n");
      out.write("      <span v-bind:title=\"message\">\r\n");
      out.write("        鼠标悬停几秒钟查看此处动态绑定的提示信息！\r\n");
      out.write("      </span>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"app-3\">\r\n");
      out.write("        <p v-if=\"seen\">现在你看到我了</p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"app-4\">\r\n");
      out.write("        <ol>\r\n");
      out.write("            <li v-for=\"todo in todos\">\r\n");
      out.write("                {{ todo.text }}\r\n");
      out.write("            </li>\r\n");
      out.write("        </ol>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"app-5\">\r\n");
      out.write("        <p>{{ message }}</p>\r\n");
      out.write("        <button v-on:click=\"reverseMessage\">逆转消息</button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"app-6\">\r\n");
      out.write("        <p>{{ message }}</p>\r\n");
      out.write("        <input v-model=\"message\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"app-7\">\r\n");
      out.write("        <ol>\r\n");
      out.write("            <!--\r\n");
      out.write("              现在我们为每个 todo-item 提供 todo 对象\r\n");
      out.write("              todo 对象是变量，即其内容可以是动态的。\r\n");
      out.write("              我们也需要为每个组件提供一个“key”，晚些时候我们会做个解释。\r\n");
      out.write("            -->\r\n");
      out.write("            <todo-item\r\n");
      out.write("                    v-for=\"item in groceryList\"\r\n");
      out.write("                    v-bind:todo=\"item\"\r\n");
      out.write("                    v-bind:key=\"item.id\">\r\n");
      out.write("            </todo-item>\r\n");
      out.write("        </ol>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
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
