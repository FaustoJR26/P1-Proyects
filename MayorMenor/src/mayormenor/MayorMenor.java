/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayormenor;

/**
 *
 * @author Junio
 */
public class MayorMenor {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        
        int num1 = 8;
        int num2 = 15;

        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
            System.out.println("El número menor es: " + num2);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
            System.out.println("El número menor es: " + num1);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}
    
    

