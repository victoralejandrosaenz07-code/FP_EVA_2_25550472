/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EVA2_27_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double money= 1000000;
        double retiro;
        
        System.out.println("tu cuenta cuenta con: " +money);
        
        while(money > 0){
            System.out.println("¿cantidad de retiro?");
            retiro = input.nextDouble();
            money -= retiro;
             if(money > 0){
                System.out.println("retiro exitoso: $" + money);
            }else if(money == 0){
                System.out.println("tu cuenta quedo sin fondos");
            }else{
                System.out.println("exeso de saldo en tu cuenta $" + (-money));
            }
        }
    }
}