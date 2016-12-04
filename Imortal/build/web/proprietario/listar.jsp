<%@page import="Entidade.Proprietario"%>
<jsp:useBean id="proprietarioDAO" class="Modelo.ProprietarioDAO"/>
<jsp:include page="../header.jsp" />

<div class="container theme-showcase" role="main" style="margin-top: 50px;">
    <h1>Proprietários</h1>
    
    <%
        String novo = (String) request.getAttribute("novo");

        if (novo == "true") {
    %>

    <div class="alert alert-success alert-dismissible" role="alert" style="margin-top: 20px;">
        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        Proprietário criado com sucesso!
    </div>

    <% } %>

    <table class="table table-bordered" style="margin-top: 20px;">
        <tr>
            <th>Nome</th>
            <th>CPF</th>
            <th>Endereço</th>
            <th>Telefone</th>
        </tr>
        <% for (Proprietario proprietario : proprietarioDAO.listar()) {%>
        <tr>
            <td><%=proprietario.getNome()%></td>
            <td><%=proprietario.getCpf()%></td>
            <td><%=proprietario.getEndereco()%></td>
            <td><%=proprietario.getTelefone()%></td>
        </tr>
        <% }%>
    </table>
</div>

<jsp:include page="../footer.jsp" />
