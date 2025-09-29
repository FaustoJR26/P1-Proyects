/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatoria1al50;

/**
 *
 * @author Junio
 */
public class Sumatoria1al50 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        int i = 1;
        int suma = 0;
        
        do { 
            suma += i;
            i++;
        } while (i <= 50);
        
        System.out.println("La sumatoria total de los numeros del 1 al 50 es: " + suma);
    }
}