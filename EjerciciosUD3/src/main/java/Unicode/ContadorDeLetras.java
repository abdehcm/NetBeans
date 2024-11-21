/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unicode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*diseñar un algoritmo que lee de teclado una frase e indique para cada letra que aparece en la frase
cuantas veces se repite. Se consideran iguales las mayusculas y las minusculas para realizar 
la cuanta*/
public class ContadorDeLetras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.println("***CONTADOR DE PALABRAS***");
        System.out.println("Introduce la frase");
        String frase = sc.nextLine().toLowerCase();

        char[] arrayFrase = frase.toCharArray();
        Arrays.sort(arrayFrase);
        System.out.println(arrayFrase);

        for (int i = 0; i < arrayFrase.length; i++) {
            if (Character.isLetter(arrayFrase[i])) {
                if (contador == 0 || arrayFrase[i] == arrayFrase[i - 1]) {
                    contador++;
                } else if (arrayFrase[i] != arrayFrase[i - 1]) {
                    System.out.println("La letra " + "\'" + arrayFrase[i - 1] + "\'" + " se repite " + contador);
                    contador = 1;
                }
                if (i == arrayFrase.length - 1) {
                    System.out.println("La letra " + "\'" + arrayFrase[i] + "\'" + " se repite " + contador);
                }
            }
        }

    }

}
