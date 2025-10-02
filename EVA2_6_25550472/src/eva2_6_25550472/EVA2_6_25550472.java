/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_25550472;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA2_6_25550472 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int dia;
        String diasSemanas[] = {"domingo","lunes","martes",
                                "miercoles","jueves","viernes",
                                "sabado"};
        System.out.println("introduce el numero (0 - 6):");
        dia = captu.nextInt();
        System.out.println("el dia es " + diasSemanas[dia]);
                                
        }
    }
    

