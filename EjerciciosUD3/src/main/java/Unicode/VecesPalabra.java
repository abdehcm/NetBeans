/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unicode;

import java.util.Scanner;

/**
 *
 * @author abdel
 */
/*Diseñar un programa que solicite al usuario una frase y una palabra, y a continuación
busque cuantas veces aparece la palabra en la frase*/
public class VecesPalabra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        System.out.println("Ingrese una palabra a buscar:");
        String palabra = scanner.nextLine();

        int contador = contarPalabras(frase, palabra);

        System.out.println("La palabra '" + palabra + "' aparece " + contador);

    }

    public static int contarPalabras(String frase, String palabra) {
        String[] palabras = frase.split(" ");

        int contador = 0;

        for (String palabraFrase : palabras) {
            if (palabraFrase.equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        
        return contador;

    }
}
