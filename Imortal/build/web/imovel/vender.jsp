<%@page import="Entidade.Imovel"%>
<%@page import="Entidade.Proprietario"%>
<jsp:useBean id="imovelDAO" class="Modelo.ImovelDAO"/>
<jsp:useBean id="proprietarioDAO" class="Modelo.ProprietarioDAO"/>
<jsp:include page="../header.jsp" />

<div class="container theme-showcase" role="main" style="margin-top: 50px;">
    <h1>Vender Im�vel</h1>

    <form class="form-horizontal" role="form" name="fVenda" action="Imovel" method="GET" style="margin-top: 20px;">
        <div class="form-group">
            <label class="col-sm-2 control-label">Im�vel</label>
            <div class="col-sm-5">
                <select class="form-control" name="imovel">
                    <option value="">Escolha um Im�vel</option>
                    <% for (Imovel imovel : imovelDAO.listarDisponiveis()) { %>
                    <option value="<%=imovel.getId()%>"><%=imovel.getCustomNome()%></option>
                    <% } %>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Novo Prop</label>
            <div class="col-sm-5">
                <select class="form-control" name="novoProprietario">
                    <option value="">Escolha um Propriet�rio</option>
                    <% for (Proprietario proprietario : proprietarioDAO.listar()) {%>
                    <option value="<%=proprietario.getId()%>"><%=proprietario.getNome()%></option>
                    <% }%>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Pre�o Venda</label>
            <div class="col-sm-5">
                <input class="form-control" type="number" name="precoVenda" value=""/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-12">
                <button class="btn btn-success" id="criar-btn" type="submit">
                    <i class="glyphicon glyphicon-ok"></i> Vender
                </button>
            </div>
        </div>
    </form>
</div>

<jsp:include page="../footer.jsp" />
