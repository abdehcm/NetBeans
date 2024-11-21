/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

import java.util.Arrays;

/**
 *
 * @author abdelhachim
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aux = new int[7];
        
        aux[0] = 2;
        aux[1] = 3;
        aux[2] = 4;
        aux[3] = 2;
        aux[4] = 8;
        aux[5] = 10;
        aux[6] = 0;
        
        //Arrays.sort(aux);
        System.out.println("Por nombres: " + Arrays.deepToString(aux));
        
        
        
        //for (int i = 0; i < aux.length; i++) {
//            System.out.println(aux[i]);
        //}
    }
    
}
