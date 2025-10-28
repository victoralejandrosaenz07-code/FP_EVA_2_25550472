/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EVA2_19_DO_WHILE {
    final static String USUARIO = "admin";
    final static String PWD = "admin";        
    public static void main(String[] args) {
        //pedimos datos de acceso
        Scanner captu = new Scanner(System.in);
        String usu, contra;
        //2.validamos
        //incorrrecto ---> volvemos a preguntar
        //correcto -----> acceso al sistema
        do{
        System.out.println("usuario");
        usu = captu.nextLine();
        System.out.println("contraseña");
        contra = captu.nextLine();
        }while(!(usu.equals(USUARIO)&& contra.equals(PWD)));
        //if(usu.equals(USUARIO)&& contra.equals(PWD))
        System.out.println("vienvenido cara de verga UwU");
        //else
           // System.out.println("pendejo neta que pendejo mijo osea ponte verggas ");
                    
    }
    
}
