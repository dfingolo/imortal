<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>IMOR Tal</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <link href="${pageContext.request.contextPath}/resources/bootstrap/dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/resources/bootstrap/dist/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>

        <a href="${pageContext.request.contextPath}/resources/bootstrap/assets/ico/favicon.ico"></a>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/Imortal/index.jsp">IMOR Tal</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Imóveis <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="/Imortal/imovel/criar.jsp">Novo</a></li>
                                <li><a href="/Imortal/imovel/listar_disponiveis.jsp">Disponíveis</a></li>
                                <li><a href="/Imortal/imovel/vender.jsp">Vender</a></li>
                                <li><a href="/Imortal/imovel/listar_vendidos.jsp">Vendidos</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Proprietários <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="/Imortal/proprietario/listar.jsp">Listar</a></li>
                                <li><a href="/Imortal/proprietario/criar.jsp">Novo</a></li>
                                <li><a href="/Imortal/proprietario/listar_vendas.jsp">Top Vendas</a></li>
                                <li><a href="/Imortal/proprietario/listar_compras.jsp">Top Compras</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Bairro <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="/Imortal/bairro/listar.jsp">Listar</a></li>
                                <li><a href="/Imortal/bairro/criar.jsp">Novo</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
