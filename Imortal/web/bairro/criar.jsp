<jsp:include page="../header.jsp" />

<div class="container theme-showcase" role="main" style="margin-top: 50px;">
    <h1>Novo Bairro</h1>

    <form class="form-horizontal" role="form" name="fCadastro" action="Bairro" method="POST" style="margin-top: 20px;">
        <div class="form-group">
            <label class="col-sm-2 control-label">Nome</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="nome" value=""/>
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
