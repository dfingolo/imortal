package org.apache.jsp.imovel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entidade.Imovel;
import Entidade.Proprietario;

public final class vender_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      Modelo.ProprietarioDAO proprietarioDAO = null;
      synchronized (_jspx_page_context) {
        proprietarioDAO = (Modelo.ProprietarioDAO) _jspx_page_context.getAttribute("proprietarioDAO", PageContext.PAGE_SCOPE);
        if (proprietarioDAO == null){
          proprietarioDAO = new Modelo.ProprietarioDAO();
          _jspx_page_context.setAttribute("proprietarioDAO", proprietarioDAO, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container theme-showcase\" role=\"main\" style=\"margin-top: 50px;\">\n");
      out.write("    <h1>Vender Imóvel</h1>\n");
      out.write("\n");
      out.write("    <form class=\"form-horizontal\" role=\"form\" name=\"fCadastro\" action=\"Imovel\" method=\"POST\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">Imóvel</label>\n");
      out.write("            <div class=\"col-sm-5\">\n");
      out.write("                <select class=\"form-control\" name=\"imovel\">\n");
      out.write("                    <option value=\"\">Escolha um Imóvel</option>\n");
      out.write("                    ");
 for (Imovel imovel : imovelDAO.listarDisponiveis()) { 
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(imovel.getCustomNome());
      out.write('"');
      out.write('>');
      out.print(imovel.getEndereco());
      out.write("</option>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">Novo Prop</label>\n");
      out.write("            <div class=\"col-sm-5\">\n");
      out.write("                <select class=\"form-control\" name=\"novoProprietario\">\n");
      out.write("                    <option value=\"\">Escolha um Proprietário</option>\n");
      out.write("                    ");
 for (Proprietario proprietario : proprietarioDAO.listar()) {
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(proprietario.getId());
      out.write('"');
      out.write('>');
      out.print(proprietario.getNome());
      out.write("</option>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">Preço Venda</label>\n");
      out.write("            <div class=\"col-sm-5\">\n");
      out.write("                <input class=\"form-control\" type=\"number\" name=\"precoVenda\" value=\"\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-offset-2 col-sm-12\">\n");
      out.write("                <button class=\"btn btn-success\" id=\"criar-btn\" type=\"submit\">\n");
      out.write("                    <i class=\"glyphicon glyphicon-ok\"></i> Vender\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
      out.write('\n');
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
