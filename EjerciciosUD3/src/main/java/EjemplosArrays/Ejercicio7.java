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
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int puntuacionEx;
        int[] puntuaciones = new int[5];
        int[] puntuacionesEx = new int[2];

        System.out.println("CAMPEONATO DE PROGRAMACIÓN");

        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.println("Introduce la puntuación de los programadores:");
            puntuaciones[i] = sc.nextInt();
        }

        Arrays.sort(puntuaciones);
        System.out.println(Arrays.toString(puntuaciones));
        
        System.out.println("Introduce la puntuación de los programadores de exhibicion:");
        puntuacionEx = sc.nextInt();
        
        while (puntuacionEx != -1) {            
            int indiceInsercion= Arrays.binarySearch(puntuacionesEx, puntuacionEx);
        }
        System.arraycopy(puntuaciones, 0, puntuacionesEx, 0, 0);

    }

}
