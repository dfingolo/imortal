package Controle;

import Entidade.Bairro;
import Modelo.BairroDAO;
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

@WebServlet(name = "Bairro", urlPatterns = {"/bairro/Bairro"})
public class BairroServlet extends HttpServlet {

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
            
            RequestDispatcher rd = null;
            ResultSet rs = null;
            
            BairroDAO bairroDAO = new BairroDAO();
            Bairro bairro = new Bairro();
            
            bairro.setNome(fnome);
            
            bairroDAO.adiciona(bairro);
            
            request.setAttribute("novo", "true");
            rd = request.getRequestDispatcher("/bairro/listar.jsp");
            rd.forward(request, response);
            out.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BairroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
