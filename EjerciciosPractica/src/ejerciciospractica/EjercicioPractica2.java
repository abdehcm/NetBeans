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
/*Escribe un programa que pida 10 números por teclado, 
los almacene en un array y que luego muestre el máximo valor,
el mínimo y las posiciones que ocupan en el array.*/
public class EjercicioPractica2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0, min = 0;
        int posMin = 0, posMax = 0;
        boolean primerNumero = true;
        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce 10 números: ");
            numero[i] = sc.nextInt();
            /*Durante la primera iteración del bucle, cuando primerNumero es true, 
            se asigna tanto el máximo (max) como el mínimo (min) al valor del primer número ingresado. 
            Después de esa primera iteración, se cambia el valor de primerNumero a false, 
            y en las iteraciones posteriores, el código compara los números ingresados directamente con max y min.*/
            if (primerNumero) {
                min = numero[i];
                max = numero[i];
                primerNumero = false;
                
            }
            if (numero[i] >= max) {
                max = numero[i];
                posMax = i + 1;
            }
            if (numero[i] <= min) {
                min = numero[i];
                posMin = i + 1;

            }

        }
        //Para imprimir Array
        System.out.println(Arrays.toString(numero));
        System.out.println("Este es el mayor " + max + " y su posición " + posMax);
        System.out.println("Este es el menor " + min + " y su posición " + posMin);

    }

}
