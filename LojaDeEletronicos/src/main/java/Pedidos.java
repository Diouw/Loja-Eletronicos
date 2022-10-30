
public class Pedidos extends Produtos{
    private int unidades;
    private long cpf;
    private Produtos produto = new Produtos();
    //private Cadastros c = new Cadastros();
    
    public Pedidos(){
        unidades = 0;
    }
    
    public int getUnidades() {
        return unidades;
    }

    public long getCpf() {
        return cpf;
    }
    
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    
}
