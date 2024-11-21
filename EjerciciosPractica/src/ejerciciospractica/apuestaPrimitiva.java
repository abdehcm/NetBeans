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
/*/*Definir una función que tome como parametros 2 tablas. La 1ª con los 6 números de una apuesta de la primitiva
y otra tabla ordenada de 6 números. Los 6 números son la combinacion ganadora.
Devuelve cuantos aciertos hay.*/
public class apuestaPrimitiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] apuesta = new int[6];
        int[] apuestaOrdenada = {1, 2, 3, 4, 5, 6};

        System.out.println("Introduce los numeros de la apuesta: ");
        for (int i = 0; i < apuesta.length; i++) {
            apuesta[i] = sc.nextInt();
        }
        comprobarApuesta(apuesta, apuestaOrdenada);

    }

    static void comprobarApuesta(int[] ap, int[] apOrd) {
        int contador = 0;
        for (int i = 0; i < ap.length; i++) {
            if (ap[i] == apOrd[i]) {
                contador++;
            }
        }
        
        if (Arrays.equals(ap, apOrd)) {
            System.out.println("Las combinaciones son iguales, Enhorabuena");
        }else{
            System.out.println("Las combinaciones no son iguales, tienes "+ contador + " aciertos");
            
        }
    }

}
