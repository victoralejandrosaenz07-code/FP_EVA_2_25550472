/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_arreglos_multidim;

/**
 *
 * @author victo
 */
public class EVA2_16_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j;
        int matriz[][] = new int[3][4];
//        matriz.length solo es la primer dimensión (filas)
//        matriz[]
        
       /* matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[0][3] = 400;*/
//        clicos anidados
        for(i = 0; i< matriz.length; i++){ //filas
            for(j = 0; j < matriz[i].length; j++){ // columnas
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        
        for(i = 0; i< matriz.length; i++){ //filas
            for(j = 0; j < matriz[i].length; j++){ // columnas
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");  
        }
    }
}// TODO code application logic here