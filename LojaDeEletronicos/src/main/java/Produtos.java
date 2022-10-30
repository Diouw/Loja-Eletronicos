
public class Produtos {
    private int codigo;
    private String nome;
    private int preco;
    private int estoque;

    public Produtos(){
        codigo = 0;
        nome = "";
        preco = 0;
        estoque = 0;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public int getPreco() {
        return preco;
    }
    public int getEstoque() {
        return estoque;
    }
    
    
}
