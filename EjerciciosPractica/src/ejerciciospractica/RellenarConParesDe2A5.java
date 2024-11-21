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
public class RellenarConParesDe2A5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;
        System.out.println("Introduce la longitud del array: ");
        longitud = sc.nextInt();

        System.out.println(Arrays.toString(rellenarPares(longitud)));

    }

    static int[] rellenarPares(int longitud) {
        int[] arr = new int[longitud];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (5 - 2 + 1) + 2);

            while (arr[i] % 2 != 0) {
                arr[i] = (int) (Math.random() * (5 - 2 + 1) + 2);
            }
        }

        return arr;
    }

}
