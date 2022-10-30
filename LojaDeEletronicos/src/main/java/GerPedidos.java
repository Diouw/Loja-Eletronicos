//Jonathan Marques Christofoleti - Ra: 2266415
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerPedidos{
    static private Pedidos p;
    static private List<Pedidos> bdPedidos = new ArrayList<Pedidos>();
    
    public List<Pedidos> getBdPedidos(){
        return bdPedidos;
    }

    public void cadPedidos(Pedidos p){
            bdPedidos.add(p);
    }

    /*public Pedidos consultaPedidos(Pedidos p){
        for(int i = 0; i<bdPedidos.size(); i++){
            if(p.getCodigoP() == bdPedidos.get(i).getCodigoP()){
                return bdPedidos.get(i);
            }
        }
        return null;	
    }*/

   
}

		


		
