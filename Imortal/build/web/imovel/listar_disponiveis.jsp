<%@page import="Entidade.Imovel"%>
<jsp:useBean id="imovelDAO" class="Modelo.ImovelDAO"/>
<jsp:include page="../header.jsp" />

<div class="container theme-showcase" role="main" style="margin-top: 50px;">
    <h1>Imóveis Disponíveis</h1>
    
    <%
        String novo = (String) request.getAttribute("novo");

        if (novo == "true") {
    %>

    <div class="alert alert-success alert-dismissible" role="alert">
        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        Imóvel criado com sucesso!
    </div>

    <% } %>

    <table class="table table-bordered">
        <tr>
            <th>Endereço</th>
            <th>Bairro</th>
            <th>Área(m²)</th>
            <th>Antigo Prop</th>
            <th>Descrição</th>
            <th>Preço Min</th>
            <th>Preço Compra</th>
        </tr>
        <% for (Imovel imovel : imovelDAO.listarDisponiveis()) {%>
        <tr>
            <td><%=imovel.getEndereco()%></td>
            <td><%=imovel.getBairroNome()%></td>
            <td><%=imovel.getArea()%></td>
            <td><%=imovel.getAntProprietarioNome()%></td>
            <td><%=imovel.getDescricao()%></td>
            <td><%=imovel.getPrecoMin()%></td>
            <td><%=imovel.getPrecoCompra()%></td>
        </tr>
        <% }%>
    </table>
</div>

<jsp:include page="../footer.jsp" />
