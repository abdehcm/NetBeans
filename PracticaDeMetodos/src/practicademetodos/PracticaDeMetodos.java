/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicademetodos;

import java.util.Arrays;

/**
 *
 * @author abdelhachim
 */
public class PracticaDeMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] arrayOriginal = {1, 2, 3, 4, 5, 6};

        //Copia todos los elementos del Array Original al Array Copia y le 
        int[] arrayCopia = Arrays.copyOf(arrayOriginal, 5);

        System.out.println("Elemento Orign: " + arrayOriginal[5]);
        System.out.println("Elemento Copia: " + arrayCopia[4]);
        System.out.println("");
        System.out.println("Tamaño Orign: " + arrayOriginal.length);
        System.out.println("Tamaño Copia: " + arrayCopia.length);

    }

}
