/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author abdelhachim
 */
/*Que el usuario introduzca un elemento y le devuelva la posicion en la que esta*/
public class BuscarElementosArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int elemento;
        int[] arr = {12, 25, 31, 4, 15, 63, 72, 87, 94, 10};

        System.out.println("Introduce el numero que buscas: ");
        elemento = sc.nextInt();

        buscarElemento(arr, elemento);

    }

    static void buscarElemento(int[] aux, int clave) {
        int i = 0;
        int pos = -1;
        while (i < aux.length && aux[i] != clave) {
            i++;
        }

        if (i < aux.length) {
            pos = i;
            System.out.println("Su numero esta en el indice: " + (pos + 1));
        } else  {
            System.out.println("Su numero no esta");
        }
    }

}
