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
public class Anagrama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra1, palabra2;
        
        System.out.println("***ANAGRAMA***");
        System.out.println("Introduce la primera palabra: ");
        palabra1 = scanner.nextLine().toLowerCase();
        System.out.println("Introduce la segunda palabra: ");
        palabra2 = scanner.nextLine();
        palabra2 = palabra2.toLowerCase();

        if (comprobarPalabras(palabra1, palabra2)) {
            System.out.println(palabra1 + " y " + palabra2 + " son anagramas");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " no son anagramas");
        }
    }

    static boolean comprobarPalabras(String palabra1, String palabra2) {

        if (palabra1.length() != palabra2.length()) {
            return false;

        } else {

            char[] arrayP1 = palabra1.toCharArray();
            char[] arrayP2 = palabra2.toCharArray();
            
            Arrays.sort(arrayP1);
            Arrays.sort(arrayP2);

            for (int i = 0; i < arrayP1.length; i++) {
                if (arrayP1[i] != arrayP2[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}