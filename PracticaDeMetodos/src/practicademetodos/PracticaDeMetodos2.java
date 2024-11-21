/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicademetodos;

import java.util.Arrays;

/**
 *
 * @author abdelhachim
 */
public class PracticaDeMetodos2 {
    public static void main(String[] args) {
        
        int[] arrayOriginal = {1,2,3,4,5,6};
        
        int[] arrayCopia = new int[6];
        
        System.arraycopy(arrayOriginal, 0, arrayCopia, 0, arrayOriginal.length);
        
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.println(arrayCopia[i]);
        }
        
    }
    
}
