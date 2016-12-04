<jsp:include page="../header.jsp" />

<div class="container theme-showcase" role="main" style="margin-top: 50px;">
    <h1>Novo Proprietário</h1>

    <form class="form-horizontal" role="form" name="fCadastro" action="Proprietario" method="POST" style="margin-top: 20px;">
        <div class="form-group">
            <label class="col-sm-2 control-label">Nome</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="nome" value=""/>
            </div>
        </div>
        
        <div class="form-group">
            <label class="col-sm-2 control-label">CPF</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="cpf" value="" maxlength="11" minlength="11"/>
            </div>
        </div>
        
        <div class="form-group">
            <label class="col-sm-2 control-label">Endereço</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="endereco" value=""/>
            </div>
        </div>
        
        <div class="form-group">
            <label class="col-sm-2 control-label">Telefone</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="telefone" value="" maxlength="11" minlength="11"/>
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
