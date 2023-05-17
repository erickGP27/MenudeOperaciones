/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuoperacionesbasicas;
import javax.swing.JOptionPane;
/**
 *
 * @author Erick
 */
public class MenuOperacionesBasicas {
    int opcion;
    char sino;
    
    public void Menu(){
       sino = JOptionPane.showInputDialog("¿Desea realizar una operacion matematica? (s/n)").charAt(0);
        
        while (sino=='s'){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion de la operacion a realizar:"
            + "\n1. Suma"
            + "\n2. Resta"
            + "\n3. Multiplicación"
            + "\n4. Division"));
            
            Operaciones Ope = new Operaciones();
            
            switch (opcion){
                case 1:
                    Ope.Suma();
                    break;
                case 2:
                    Ope.Resta();
                    break;
                case 3:
                    Ope.Multiplicacion();
                    break;
                case 4:
                    Ope.Division();
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    
            }  
        sino = JOptionPane.showInputDialog("¿Desea realizar otra operacion? (s/n)").charAt(0);    
        }  
    }
        
    
    public static void main(String[] args) {
        MenuOperacionesBasicas OpeBas = new MenuOperacionesBasicas();
        OpeBas.Menu();
    }
    
}
