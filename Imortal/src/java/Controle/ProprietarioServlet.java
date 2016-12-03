package Controle;

import Entidade.Proprietario;
import Modelo.ProprietarioDAO;
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

@WebServlet(name = "Proprietario", urlPatterns = {"/proprietario/Proprietario"})
public class ProprietarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String fnome = request.getParameter("nome");
            String fcpf = request.getParameter("cpf");
            String fendereco = request.getParameter("endereco");
            String ftelefone = request.getParameter("telefone");
            
            RequestDispatcher rd = null;
            ResultSet rs = null;
            
            ProprietarioDAO proprietarioDAO = new ProprietarioDAO();
            Proprietario proprietario = new Proprietario();
            
            proprietario.setNome(fnome);
            proprietario.setCpf(fcpf);
            proprietario.setEndereco(fendereco);
            proprietario.setTelefone(ftelefone);
            
            proprietarioDAO.adiciona(proprietario);
            
            request.setAttribute("novo", "true");
            rd = request.getRequestDispatcher("/proprietario/listar.jsp");
            rd.forward(request, response);
            out.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProprietarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
