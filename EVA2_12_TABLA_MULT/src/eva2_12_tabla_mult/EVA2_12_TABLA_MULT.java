/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_mult;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EVA2_12_TABLA_MULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("INTRODUCE UN NUMERO PARA MULTIPLICARLO : ");
        int numero = scanner.nextInt();

        System.out.println("Tabla del " + numero + " en orden:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    
}
