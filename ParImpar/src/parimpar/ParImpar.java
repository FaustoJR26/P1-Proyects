/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parimpar;

/**
 *
 * @author Junio
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
    }
}