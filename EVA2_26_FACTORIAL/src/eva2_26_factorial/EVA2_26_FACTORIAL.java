/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EVA2_26_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int num, factorial = 1, i;
        
        System.out.print("Ingrese un número: ");
        num = input.nextInt();
        
        System.out.print("El factorial de " + num + " es: ");
        for(i = num; i >= 1; i--){
            System.out.print(i);
            if(i > 1){
                System.out.print("*");
            }
            factorial *= i;
        }
            System.out.println("=" + factorial);
    }
}