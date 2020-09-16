package PacoteJavaOO;
import javax.swing.*;

public class TestarObjeto {
    public static void main(String[] args) {
        Clientes clientes = new Clientes();
        
        clientes.setNome(JOptionPane.showInputDialog(null, "Digite seu nome: "));
        JOptionPane.showMessageDialog(null, clientes.getNome());
        
    }
    
}
