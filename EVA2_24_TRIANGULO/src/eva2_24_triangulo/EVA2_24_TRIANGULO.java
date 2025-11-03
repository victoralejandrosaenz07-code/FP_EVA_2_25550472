/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_triangulo;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EVA2_24_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input =  new Scanner(System.in);
        int valor, i, j;
        
        System.out.println("TRIÁNGULO");
        System.out.println("Introduce un valor:");
        valor = input.nextInt();
        
        for(i = 1; i<= valor; i++){
            for(j = 1; j<= i; j++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}