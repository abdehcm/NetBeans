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
/*– Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y los almacene en un array. 
El programa debe crear un nuevo array con los números primos que haya entre esos 20 números. 
Luego debe mostrar los dos arrays.*/
public class EjercicioPractica3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            //array[i] = (int) (Math.random() * (max - min + 1) + min);
            array[i] = (int) (Math.random() * 100);

        }
        System.out.println(Arrays.toString(array));

    }

}
