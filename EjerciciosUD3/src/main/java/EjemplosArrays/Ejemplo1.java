/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*
que se encuentra rellena de numeros pares aleatorios entre 2 y 5 incluidos*/
public class Ejemplo1 {

    public static void main(String[] args) {

        int longitud;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una longitud: ");
        longitud = sc.nextInt();

        System.out.println(Arrays.toString(rellenarPares(longitud, longitud)));

    }

    public static int[] rellenarPares(int longitud2, int fin2) {
        int tablaNumerosPares[] = new int[longitud2];

        for (int i = 0; i < longitud2; i++) {
            tablaNumerosPares[i] = (int) (Math.random() * (fin2 - 2 + 1) + 2);

            while (tablaNumerosPares[i] % 2 != 0) {
                tablaNumerosPares[i] = (int) (Math.random() * (fin2 - 2 + 1) + 2);
            }
        }
        return tablaNumerosPares;
    }

}
