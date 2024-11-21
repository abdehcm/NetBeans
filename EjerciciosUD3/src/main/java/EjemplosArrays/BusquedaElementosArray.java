/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Buscar */
public class BusquedaElementosArray {

    public static void main(String[] args) {

        int elemento, donde;

        int[] aux = {8, 15, 13, 2, 5, 1, 9, 3, 4, 10};

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número que desea buscar: ");
        elemento = sc.nextInt();
        
        donde = buscar(aux, elemento);
        System.out.println(Arrays.toString(aux));
        if (donde == -1) {
            System.out.println("Su numero no esta");
        }else{
            System.out.println("El numero esta en el indice: "+ donde);
        }
    }

    static int buscar(int t[], int clave) {
        int posicion;
        int i = 0;

        while (i < t.length && t[i] != clave) {
            i++;

        }
        
        if (i < t.length){
            posicion = i;
        }else{
            posicion = -1;
        }

        return clave;
    }

}
