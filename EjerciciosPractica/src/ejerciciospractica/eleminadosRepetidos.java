/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author abdelhachim
 */
/*Implementar la función ... que construye y devuelve una tabla de la longitud apropiada con los elemntos de t,
donde se han eleminiado los datos repetidos*/
public class eleminadosRepetidos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] original = {1, 1, 2, 3, 4, 4, 5, 5, 6};

        System.out.println("Array original: " + Arrays.toString(original));
        System.out.println("");
        System.out.println("Array modificado: " + Arrays.toString(eliminarRepetidos(original)));

    }

    public static int[] eliminarRepetidos(int[] org) {
        int longitudOriginal = org.length;
        int[] arraySinRepetidos = new int[longitudOriginal];
        int longitudNueva = 0;

        for (int i = 0; i < org.length; i++) {
            boolean repetido = false;
            int j = 0;

            while (j < longitudNueva && !repetido) {
                if (org[i] == arraySinRepetidos[j]) {
                    repetido = true;
                }
                j++;

            }

            if (!repetido) {
                arraySinRepetidos[longitudNueva++] = org[i];
            }

        }

        return Arrays.copyOf(arraySinRepetidos, longitudNueva);
    }

}
