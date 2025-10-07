/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10.pkg25550472;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EVA2_1025550472 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i <= 20; i++)
            System.out.println(i + "-");
        System.out.println("\n");
        //imprimir los numeros pares de 0 a 100
        //0-2 -4-6....100
        //+= SUMA -=RESTA *=MULTIPLICA /=DIVIDE
        System.out.println("");
        for(int i = 0; i <= 100; i+=2){
            System.out.print(i + "-");
        }
        System.out.println("\n");
        
        for(int i = 100; i >= 0; i-=2){
            System.out.print(i + "-");
        }
        System.out.println("\n");
        
        for(int i = -15; i <= 5; i++){
            System.out.print(i + "-");
        }
        System.out.println("\n");
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar número al usuario
        System.out.print("Introduce un número para imprimir su tabla de multiplicar en orden inverso: ");
        int numero = scanner.nextInt();

        // Imprimir tabla de multiplicar en orden inverso
        System.out.println("Tabla del " + numero + " en orden inverso:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Bucle adicional que mencionaste
        System.out.println("\nSecuencia del bucle:");
        for (int i = -15; i <= 5; i++) {
            System.out.print(i + "-");
        }

    }
    
}
