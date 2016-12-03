package Entidade;

public class Proprietario {
    
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int totalVendidos;
    private int totalComprados;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }    

    public int getTotalVendidos() {
        return totalVendidos;
    }

    public void setTotalVendidos(int totalVendidos) {
        this.totalVendidos = totalVendidos;
    }

    public int getTotalComprados() {
        return totalComprados;
    }

    public void setTotalComprados(int totalComprados) {
        this.totalComprados = totalComprados;
    }
}
