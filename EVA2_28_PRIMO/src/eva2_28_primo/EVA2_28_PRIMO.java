/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EVA2_28_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, divicion = 0, i;
        
        System.out.println("Ingrese un número: ");
        num = input.nextInt();
        for(i = 1; i <= num; i++){
            if(num % i == 0){
            divicion++;
            }
        }
        if(divicion == 2){
            System.out.println(num + " es primo");
        }else{
            System.out.println(num + " no  es primo");
        }
    }
}