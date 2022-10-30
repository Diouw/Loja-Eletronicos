//Jonathan Marques Christofoleti - Ra: 2266415
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerCadastros{
    static private Cadastros c;
    static private List<Cadastros> bdCadastros = new ArrayList<Cadastros>();
    
    public List<Cadastros> getBdCadastros(){
        return bdCadastros;
    }

    public Cadastros cadCadastros(Cadastros c){
        if(consultaCadastros(c) == null){
                bdCadastros.add(c);
                return c;
        }			
        else{
                return null;
        }
    }

    public Cadastros consultaCadastros(Cadastros c){
        for(int i = 0; i<bdCadastros.size(); i++){
            if(c.getCpf() == bdCadastros.get(i).getCpf()){
                return bdCadastros.get(i);
            }
        }
        return null;	
    }
    
    public Cadastros login (Cadastros c){
        for(int i = 0; i<bdCadastros.size(); i++){
            if(c.getCpf()==bdCadastros.get(i).getCpf()){
                if(c.getSenha().equals(bdCadastros.get(i).getSenha())){
                    JOptionPane.showMessageDialog(null, "Login realizado", "Login", 1);
                    return bdCadastros.get(i);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Senha Incorreta", "Login", 2);
                    return null;
                }
                
            }
            
        }
        JOptionPane.showMessageDialog(null, "Cadastro não encontrado", "Login", 2);
        return null;
    }
}

		


		
