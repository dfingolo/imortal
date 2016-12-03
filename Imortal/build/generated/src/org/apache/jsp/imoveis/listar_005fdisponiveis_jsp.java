package org.apache.jsp.imoveis;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entidade.Imovel;

public final class listar_005fdisponiveis_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      Modelo.ImovelDAO imovelDAO = null;
      synchronized (_jspx_page_context) {
        imovelDAO = (Modelo.ImovelDAO) _jspx_page_context.getAttribute("imovelDAO", PageContext.PAGE_SCOPE);
        if (imovelDAO == null){
          imovelDAO = new Modelo.ImovelDAO();
          _jspx_page_context.setAttribute("imovelDAO", imovelDAO, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/header.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null), out, false);
      out.write("\n");
      out.write("<h1>Imóveis Disponíveis</h1>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("        <th>Endereço</th>\n");
      out.write("        <th>Bairro</th>\n");
      out.write("        <th>Área(m²)</th>\n");
      out.write("        <th>Antigo Prop</th>\n");
      out.write("        <th>Descrição</th>\n");
      out.write("        <th>Preço Min</th>\n");
      out.write("        <th>Preço Compra</th>\n");
      out.write("    </tr>\n");
      out.write("    ");
 for (Imovel imovel : imovelDAO.listarDisponiveis()) {
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print(imovel.getEndereco());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(imovel.getBairroNome());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(imovel.getArea());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(imovel.getAntProprietarioNome());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(imovel.getDescricao());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(imovel.getPrecoMin());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(imovel.getPrecoCompra());
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    ");
 }
      out.write("\n");
      out.write("</table>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/footer.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null), out, false);
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
