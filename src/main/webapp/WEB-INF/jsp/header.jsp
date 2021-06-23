<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Dream'sBakery</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="/home">Home</a></li>
        <li><a href="/usuario/lista">Usuários</a></li>
        <li><a href="/comanda/lista">Comandas</a></li>
        <li><a href="/funcionario/lista">Funcionários</a></li>
        <li><a href="/servico/lista">Serviços</a></li>
        <li><a href="/buffet/lista">Buffet</a></li>
        <li><a href="/conveniencia/lista">Conveniência</a></li>
        <li><a href="/confeitaria/lista">Confeitaria</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li>${user.nome}</li>
        <li><a href="/">Sair</a></li>
      </ul>
    </div>
  </div>
</nav>