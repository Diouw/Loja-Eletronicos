public class Cadastros {
    private String nome;
    private int cpf;
    private String endereço;
    private int cep;
    private String senha;

    public Cadastros(){
        nome = "";
        cpf = 0;
        endereço = "";
        cep = 0;
        senha = "";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public int getCpf() {
        return cpf;
    }
    public String getEndereço() {
        return endereço;
    }
    public int getCep() {
        return cep;
    }
    public String getSenha() {
        return senha;
    }
}
