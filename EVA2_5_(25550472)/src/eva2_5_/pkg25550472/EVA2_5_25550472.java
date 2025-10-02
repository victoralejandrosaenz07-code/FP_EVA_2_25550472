/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_.pkg25550472;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA2_5_25550472 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int dia;
        String diasSemanas[] = new String[7];
        diasSemanas[0] = "domingo";
        diasSemanas[1] = "lunes";
        diasSemanas[2] = "martes";
        diasSemanas[3] = "miercoles";
        diasSemanas[4] = "jueves";
        diasSemanas[5] = "viernes";
        diasSemanas[6] = "sabado";
        System.out.println("introduce el dia en numero (0-6):");
        dia = captu.nextInt();
        System.out.println("el dia es" + diasSemanas[dia]);
                
    }
    
}
