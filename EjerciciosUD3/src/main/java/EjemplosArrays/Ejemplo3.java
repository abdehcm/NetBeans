/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosArrays;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author alu_tarde
 */
/*Definir una función que tome como parametros 2 tablas. La 1ª con los 6 números de una apuesta de la primitiva
y otra tabla ordenada de 6 números. Los 6 números son la combinacion ganadora.
Devuelve cuantos aciertos hay.*/
public class Ejemplo3 {

    public static void main(String[] args) {

        int apuesta[] = new int[6];
        int apuestaOrdenada[] = {6, 5, 4, 3, 2, 1};

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce los números de tu apuesta: ");
            apuesta[i] = sc.nextInt();
        }

    }

    static int compararPrimitiva(int ap[], int ap2[]) {
        int aciertos= 0;
        
        for (int i = 0; i < ap.length; i++) {
            
        }

        return aciertos;
    }

}
