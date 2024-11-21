/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Arrays;
/**
 *
 * @author abdelhachim
 */
/*Hacer un programa que inicialice un vector de números con valores aleatorios, y posterior ordene los elementos de menor a mayor.*/
public class EjercicioPractica6 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()* (9 - 0 + 1)+ 0);

        }
        Arrays.sort(arr);
        System.out.println("El array ordenados:\n"+ Arrays.toString(arr));

    }

}
