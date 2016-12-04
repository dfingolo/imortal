<%@page import="Entidade.Proprietario"%>
<jsp:useBean id="proprietarioDAO" class="Modelo.ProprietarioDAO"/>
<jsp:include page="../header.jsp" />

<div class="container theme-showcase" role="main" style="margin-top: 50px;">
    <h1>Compra de Imóveis</h1>

    <table class="table table-bordered" style="margin-top: 20px;">
        <tr>
            <th>Nome</th>
            <th>CPF</th>
            <th>Endereço</th>
            <th>Telefone</th>
            <th>Compras</th>
        </tr>
        <% for (Proprietario proprietario : proprietarioDAO.listarCompras()) {%>
        <tr>
            <td><%=proprietario.getNome()%></td>
            <td><%=proprietario.getCpf()%></td>
            <td><%=proprietario.getEndereco()%></td>
            <td><%=proprietario.getTelefone()%></td>
            <td><%=proprietario.getTotalComprados()%></td>
        </tr>
        <% }%>
    </table>
</div>

<jsp:include page="../footer.jsp" />
