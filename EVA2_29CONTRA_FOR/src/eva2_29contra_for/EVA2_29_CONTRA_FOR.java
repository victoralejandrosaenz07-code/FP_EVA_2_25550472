/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29contra_for;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EVA2_29_CONTRA_FOR {
    final static String USUARIO = "admin";
    final static String PWD = "admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usu, contra;
        int i;
        Scanner input = new Scanner(System.in);
        
        for (i = 1; i <= 4; i++){
            System.out.println("usuario");
            usu = input.nextLine();
            System.out.println("contraseña");
            contra = input.nextLine();
            
            if(usu.equals(USUARIO) && contra.equals(PWD)){
                System.out.println("acceso concedido");
                break;
            }
            
            
        }
        }
            
        }
    
        

