//Jonathan Marques Christofoleti - Ra: 2266415
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerProdutos{
    static private Produtos p;
    static private List<Produtos> bdProdutos = new ArrayList<Produtos>();
    
    public List<Produtos> getBdProdutos(){
        return bdProdutos;
    }

    public Produtos getP() {
        return p;
    }

    public Produtos cadProdutos(Produtos p){
        if(consultaProdutos(p) == null){
                bdProdutos.add(p);
                return p;
        }			
        else{
                return null;
        }
    }

    public Produtos consultaProdutos(Produtos p){
        for(int i = 0; i<bdProdutos.size(); i++){
            if(p.getCodigo() == bdProdutos.get(i).getCodigo()){
                return bdProdutos.get(i);
            }
        }
        return null;	
    }

    public Produtos retiraProdutos(Produtos p){
        p = consultaProdutos(p);
        if(p != null){
            if(p.getEstoque() == 0){
                bdProdutos.remove(p);
            }
            else{
                return null;
            }
        }
            return p;
    }
    
    
    public Produtos atualizaEstoque(Produtos p){
        for(int i = 0; i < bdProdutos.size(); i++){
            if(p.getCodigo() == bdProdutos.get(i).getCodigo()){
                p.setEstoque(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o NOVO estoque", "Atualização",2)));
                p.setNome(bdProdutos.get(i).getNome());
                p.setPreco(bdProdutos.get(i).getPreco());
                bdProdutos.set(i, p);
                return p;
            }
        }
        return null;
    }
    
    public void alteraEstoque (Produtos p, Integer unidades){
        for(int i = 0; i < bdProdutos.size(); i++){
            if(bdProdutos.get(i).getCodigo()== p.getCodigo()){
                bdProdutos.get(i).setEstoque(bdProdutos.get(i).getEstoque()-unidades);
            }
        }
    }
    
    public Produtos compra(Produtos p, Integer unidades){
        p = consultaProdutos(p);
        if(p==null){
            JOptionPane.showMessageDialog(null, "Nenhum produto corresponde a esse código", "Fazer pedido", 2);
            return null;
        }
        else{
            if((p.getEstoque()- unidades)>= 0){
                alteraEstoque(p,unidades);
                JOptionPane.showMessageDialog(null, "Pedido realizado", "Fazer pedido", 1);
                return p;
            }
            else{
               JOptionPane.showMessageDialog(null, "Estoque Invalido", "Fazer pedido", 2);
               return null;
            }
        }
        
    }
}

		


		
