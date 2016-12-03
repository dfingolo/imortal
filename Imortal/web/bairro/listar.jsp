<%@page import="Entidade.Bairro"%>
<jsp:useBean id="bairroDAO" class="Modelo.BairroDAO"/>
<jsp:include page="../header.jsp" />

<div class="container theme-showcase" role="main" style="margin-top: 50px;">
    <h1>Bairros</h1>

    <%
        String novo = (String) request.getAttribute("novo");

        if (novo == "true") {
    %>

    <div class="alert alert-success alert-dismissible" role="alert">
        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        Bairro criado com sucesso!
    </div>

    <% } %>

    <table class="table table-bordered">
        <tr>
            <th>Nome</th>
        </tr>
        <% for (Bairro bairro : bairroDAO.listar()) {%>
        <tr>
            <td><%=bairro.getNome()%></td>
        </tr>
        <% }%>
    </table>
</div>

<jsp:include page="../footer.jsp" />
