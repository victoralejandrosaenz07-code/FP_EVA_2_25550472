/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_continue;

/**
 *
 * @author victo
 */
public class EVA2_22_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IMPRIMIR NUMEROS PARES
        int i = 0;
        while (i < 100){
            int resi = i % 2;
            if(resi != 0){
                i++;
            continue;
            }
            
            System.out.print(i + "-");
            i++;
        }
    }
    
}
