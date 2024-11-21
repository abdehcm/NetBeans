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
/*Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno 
(comprendidas entre 0 y 10). 
A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.
 */
public class EjercicioPractica5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double notaMedia = 0;
        int max = 0, min = 0;
        boolean primerNumero = true;
        int[] notas = new int[5];

        System.out.println("Introduzca las 5 notas (0-10): ");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
        }
        //Mostrar todas las notas
        System.out.println("Todas las notas:\n" + Arrays.toString(notas));

        for (int i = 0; i < notas.length; i++) {
            notaMedia = notaMedia + notas[i];
        }
        notaMedia = notaMedia / notas.length;
        //Mostrar nota media
        System.out.println("La nota media es:\n" + notaMedia);

        for (int i = 0; i < notas.length; i++) {

            if (primerNumero) {
                max = notas[i];
                min = notas[i];
                primerNumero = false;
            }

            if (notas[i] >= max) {
                max = notas[i];
            }
            if (notas[i] <= min) {
                min = notas[i];

            }
        }

        System.out.println("La nota más alta es: " + max);
        System.out.println("La nota más baja es: " + min);
    }

}
