/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_breack;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EVA2_21_BREACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor, adivinar;
        adivinar = (int)(Math.random() * 5) + 1;
        while(true){
            System.out.println("adivina el numero -1 para terminar");
        valor = captu.nextInt();
        if(valor == adivinar){
            System.out.println("felicidades adivinaste");
            break;
        
        }
        if(valor == -1)
            break;//TERMINAR POR COMPLETO EL CICLO
        }
        System.out.println("------------gracias-por-calar--------------------");
        
    }
    
}
