<%@page import="Entidade.Proprietario"%>
<jsp:useBean id="proprietarioDAO" class="Modelo.ProprietarioDAO"/>
<jsp:include page="../header.jsp" />

<div class="container theme-showcase" role="main" style="margin-top: 50px;">
    <h1>Vendas de Imóveis</h1>

    <table class="table table-bordered">
        <tr>
            <th>Nome</th>
            <th>CPF</th>
            <th>Endereço</th>
            <th>Telefone</th>
            <th>Vendas</th>
        </tr>
        <% for (Proprietario proprietario : proprietarioDAO.listarVendas()) {%>
        <tr>
            <td><%=proprietario.getNome()%></td>
            <td><%=proprietario.getCpf()%></td>
            <td><%=proprietario.getEndereco()%></td>
            <td><%=proprietario.getTelefone()%></td>
            <td><%=proprietario.getTotalVendidos()%></td>
        </tr>
        <% }%>
    </table>
</div>

<jsp:include page="../footer.jsp" />
