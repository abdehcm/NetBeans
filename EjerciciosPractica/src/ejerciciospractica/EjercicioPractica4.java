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
/*Crear un vector de 5 elementos de cadenas de caracteres, 
inicializa el vector con datos leídos por el teclado. 
Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la pantalla.*/
public class EjercicioPractica4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] caracteres = new String[5];
        String[] caracteresInv = new String[5];

        System.out.println("Introduce las cadenas de caracteres: ");

        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = sc.nextLine();

        }

        for (int i = 0; i < caracteres.length; i++) {
            caracteresInv[i] = caracteres[caracteres.length - 1 - i];
        }
        System.out.println("\nArray Original");
        
        for (String elemento : caracteres) {
            System.out.println(elemento);
            
        }
        
        System.out.println("\nArray Invertido");
        for (String elemento : caracteresInv) {
            System.out.println(elemento);
            
        }
    }

}
