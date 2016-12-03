package Controle;

import Entidade.Imovel;
import Modelo.ImovelDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static javax.xml.bind.DatatypeConverter.*;

@WebServlet(name = "Imovel", urlPatterns = {"/imovel/Imovel"})
public class ImovelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String fendereco = request.getParameter("endereco");
            String fbairro = request.getParameter("bairro");
            String farea = request.getParameter("area");
            String fantigoProprietario = request.getParameter("antigoProprietario");
            String fdescricao = request.getParameter("descricao");
            String fprecoMin = request.getParameter("precoMin");
            String fprecoCompra = request.getParameter("precoCompra");
            
            RequestDispatcher rd = null;
            ResultSet rs = null;
            
            ImovelDAO imovelDAO = new ImovelDAO();
            Imovel imovel = new Imovel();
            
            imovel.setEndereco(fendereco);
            imovel.setBairroId(parseInt(fbairro));
            imovel.setArea(parseDouble(farea));
            imovel.setAntProprietarioId(parseInt(fantigoProprietario));
            imovel.setDescricao(fdescricao);
            imovel.setPrecoMin(parseDouble(fprecoMin));
            imovel.setPrecoCompra(parseDouble(fprecoCompra));
            
            imovelDAO.adiciona(imovel);
            
            request.setAttribute("novo", "true");
            rd = request.getRequestDispatcher("/imovel/listar_disponiveis.jsp");
            rd.forward(request, response);
            out.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProprietarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
