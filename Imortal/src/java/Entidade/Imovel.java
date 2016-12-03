package Entidade;

public class Imovel {
    
    private String endereco;
    private int bairroId;
    private String bairroNome;
    private double area;
    private int antProprietarioId;
    private String antProprietarioNome;
    private int novoProprietarioId;
    private String novoProprietarioNome;
    private String descricao;
    private double precoMin;
    private double precoVenda;
    private double precoCompra;

    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getBairroId() {
        return bairroId;
    }
    
    public void setBairroId(int bairroId) {
        this.bairroId = bairroId;
    }
    
    public String getBairroNome() {
        return bairroNome;
    }
    
    public void setBairroNome(String bairroNome) {
        this.bairroNome = bairroNome;
    }
    
    public double getArea() {
        return area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public int getAntProprietarioId() {
        return antProprietarioId;
    }
   
    public void setAntProprietarioId(int antProprietarioId) {
        this.antProprietarioId = antProprietarioId;
    }
    
    public String getAntProprietarioNome() {
        return antProprietarioNome;
    }
    
    public void setAntProprietarioNome(String antProprietarioNome) {
        this.antProprietarioNome = antProprietarioNome;
    }
    
    public int getNovoProprietarioId() {
        return novoProprietarioId;
    }
    
    public void setNovoProprietarioId(int novoProprietarioId) {
        this.novoProprietarioId = novoProprietarioId;
    }
    
    public String getNovoProprietarioNome() {
        return novoProprietarioNome;
    }
    
    public void setNovoProprietarioNome(String novoProprietarioNome) {
        this.novoProprietarioNome = novoProprietarioNome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getPrecoMin() {
        return precoMin;
    }
    
    public void setPrecoMin(double precoMin) {
        this.precoMin = precoMin;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }
    
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    public double getPrecoCompra() {
        return precoCompra;
    }
    
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }
    
}
