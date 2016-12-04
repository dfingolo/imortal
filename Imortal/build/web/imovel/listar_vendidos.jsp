<%@page import="Entidade.Imovel"%>
<jsp:useBean id="imovelDAO" class="Modelo.ImovelDAO"/>
<jsp:include page="../header.jsp" />

<div class="container theme-showcase" role="main" style="margin-top: 50px;">
    <h1>Imóveis Vendidos</h1>
    
    <%
        String novo = (String) request.getAttribute("novo");

        if (novo == "true") {
    %>

    <div class="alert alert-success alert-dismissible" role="alert" style="margin-top: 20px;">
        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        Imóvel Vendido com sucesso!
    </div>

    <% } %>

    <table class="table table-bordered" style="margin-top: 20px;">
        <tr>
            <th>Endereço</th>
            <th>Bairro</th>
            <th>Área(m²)</th>
            <th>Antigo Prop</th>
            <th>Novo Prop</th>
            <th>Descrição</th>
            <th>Preço Min</th>
            <th>Preço Compra</th>
            <th>Preço Venda</th>
        </tr>
        <% for (Imovel imovel : imovelDAO.listarVendidos()) {%>
        <tr>
            <td><%=imovel.getEndereco()%></td>
            <td><%=imovel.getBairroNome()%></td>
            <td><%=imovel.getArea()%></td>
            <td><%=imovel.getAntProprietarioNome()%></td>
            <td><%=imovel.getNovoProprietarioNome()%></td>
            <td><%=imovel.getDescricao()%></td>
            <td><%=imovel.getPrecoMin()%></td>
            <td><%=imovel.getPrecoCompra()%></td>
            <td><%=imovel.getPrecoVenda()%></td>
        </tr>
        <% }%>
    </table>
</div>

<jsp:include page="../footer.jsp" />
