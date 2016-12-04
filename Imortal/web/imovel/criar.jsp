<%@page import="Entidade.Bairro"%>
<%@page import="Entidade.Proprietario"%>
<jsp:useBean id="proprietarioDAO" class="Modelo.ProprietarioDAO"/>
<jsp:useBean id="bairroDAO" class="Modelo.BairroDAO"/>
<jsp:include page="../header.jsp" />

<div class="container theme-showcase" role="main" style="margin-top: 50px;">
    <h1>Novo Imóvel</h1>

    <form class="form-horizontal" role="form" name="fCadastro" action="Imovel" method="POST">
        <div class="form-group">
            <label class="col-sm-2 control-label">Endereço</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="endereco" value=""/>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Bairro</label>
            <div class="col-sm-5">
                <select class="form-control" name="bairro">
                    <option value="">Escolha um Bairro</option>
                    <% for (Bairro bairro : bairroDAO.listar()) { %>
                    <option value="<%=bairro.getId()%>"><%=bairro.getNome()%></option>
                    <% } %>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Área(m²)</label>
            <div class="col-sm-5">
                <input class="form-control" type="number" name="area" value=""/>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Antigo Prop</label>
            <div class="col-sm-5">
                <select class="form-control" name="antigoProprietario">
                    <option value="">Escolha um Proprietário</option>
                    <% for (Proprietario proprietario : proprietarioDAO.listar()) { %>
                    <option value="<%=proprietario.getId()%>"><%=proprietario.getNome()%></option>
                    <% } %>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Descrição</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="descricao" value=""/>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Preço Min</label>
            <div class="col-sm-5">
                <input class="form-control" type="number" name="precoMin" value=""/>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Preço Compra</label>
            <div class="col-sm-5">
                <input class="form-control" type="number" name="precoCompra" value=""/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-12">
                <button class="btn btn-success" id="criar-btn" type="submit">
                    <i class="glyphicon glyphicon-floppy-disk"></i> Criar
                </button>
            </div>
        </div>
    </form>
</div>

<jsp:include page="../footer.jsp" />
