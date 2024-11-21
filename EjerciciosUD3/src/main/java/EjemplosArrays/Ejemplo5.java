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
/*Leer y alamcenar n números enteros en una tabla apartir de la que se construiran otras 2 tablas 
con los elemntos con valores pares e impares de la primera. 
Las tablas pares e impares hay que mostrarlas ordenadas*/
public class Ejemplo5 {

    public static void main(String[] args) {
        int almacenar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuántos números desea guardar: ");
        almacenar = sc.nextInt();

        int t[] = new int[almacenar];

        for (int i = 0; i < t.length; i++) {
            System.out.println("Introduzca los números: ");
            t[i] = sc.nextInt();
        }

        int tImpar[] = new int[0];
        int tPar[] = new int[0];

        for (int elementoImpar : t) {
            if (elementoImpar % 2 != 0) {
                tImpar = Arrays.copyOf(tImpar, tImpar.length + 1);
                tImpar[tImpar.length - 1] = elementoImpar;
            }
        }

        for (int elementoPar : t) {
            if (elementoPar % 2 == 0) {
                tPar = Arrays.copyOf(tPar, tPar.length + 1);
                tPar[tPar.length - 1] = elementoPar;
            }
        }

        Arrays.sort(tImpar);
        Arrays.sort(tPar);

        System.out.println("Lista impares:" + Arrays.toString(tImpar));
        System.out.println("Lista pares:" + Arrays.toString(tPar));

    }

}
