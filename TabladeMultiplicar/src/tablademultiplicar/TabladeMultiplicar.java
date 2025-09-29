/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablademultiplicar;

/**
 *
 * @author Junio
 */
public class TabladeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 2;
        System.out.println("Tabla del número " + numero + ":");

        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}