/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuoperacionesbasicas;
import javax.swing.JOptionPane;
/**
 *
 * @author Erick
 */
public class Operaciones {
    int  nums, total, num;
    char sino;
    
    public void Suma(){
        System.out.println("Operacion realizada: Suma");
        System.out.println("Numeros sumados:");
        total = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        System.out.println(total);
        sino = JOptionPane.showInputDialog("¿Desea ingresar otro número? (s/n)").charAt(0);
        while (sino=='s') {
            nums = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para sumar"));
            System.out.println(nums);
            total += nums;
            sino = JOptionPane.showInputDialog("¿Desea ingresar otro número? (s/n)").charAt(0);
        }
        System.out.println("El resultado de la suma es: " + total);
    }
    
    public void Resta(){
        System.out.println("Operacion realizada: Resta");
        System.out.println("Numero restados:");
        total = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        System.out.println(total);
        sino = JOptionPane.showInputDialog("¿Desea ingresar otro número? (s/n)").charAt(0);
        while (sino=='s') {
            nums = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para restar"));
            System.out.println(nums);
            total -= nums;
            sino = JOptionPane.showInputDialog("¿Desea ingresar otro número? (s/n)").charAt(0);
        }
        System.out.println("El resultado de la resta es: " + total);
    }
    
    public void Multiplicacion(){
        System.out.println("Operacion realizada: Multiplicacion");
        System.out.println("Numeros multiplicados:");
        total = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        System.out.println(total);
        sino = JOptionPane.showInputDialog("¿Desea ingresar otro número? (s/n)").charAt(0);
        while (sino=='s') {
            nums = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para multiplicar"));
            System.out.println(nums);
            total *= nums;
            sino = JOptionPane.showInputDialog("¿Desea ingresar otro número? (s/n)").charAt(0);
        }
        System.out.println("El resultado de la multiplicacion es: " + total);
    }
    
    public void Division(){
        System.out.println("Operacion realizada: Division");
        System.out.println("Numeros divididos:");
        total = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        System.out.println(total);
        sino = JOptionPane.showInputDialog("¿Desea ingresar otro número? (s/n)").charAt(0);
        while (sino=='s') {
            nums = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para dividir"));
            System.out.println(nums);
            if (nums!=0){
                System.out.println(nums);
                total /= nums;
            }
            else{
                JOptionPane.showMessageDialog(null,"La division entre 0 no es posible");
            }
            sino = JOptionPane.showInputDialog("¿Desea ingresar otro número? (s/n)").charAt(0);
        }
        System.out.println("El resultado de la division es: " + total);
    }
}
