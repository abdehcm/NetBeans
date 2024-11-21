/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosArrays;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author alu_tarde
 */
/*Implementar la función ... que construye y devuelve una tabla de la longitud apropiada con los elemntos de t,
donde se han eleminiado los datos repetidos*/

public class Ejemplo4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int t[] = new int [0];
        int original[] = {1, 2, 2, 4, 5, 5, 7};
        int copiaSinRepetidos[] = sinRepetidos(original);

        System.out.println("Con:" + Arrays.toString(original));
        System.out.println("Sin:" + Arrays.toString(copiaSinRepetidos));
    }

    public static int[] sinRepetidos(int[] t) {
        int temporal[] = new int[0];

        for (int elemento : t) {
            if (buscar(temporal, elemento) == -1) {
                temporal = Arrays.copyOf(temporal, temporal.length + 1);
                temporal[temporal.length - 1] = elemento;
            }
        }
        return temporal;
    }

    static int buscar(int[] t, int clave) {
        int posicion = -1;
        int i = 0;

        while (i < t.length && t[i] != clave) {
            i++;
        }
        if (i < t.length) {
            posicion = i;
        }
        return posicion;
    }
}
