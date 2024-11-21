/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenud3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author marta
 */
public class Ejercicio1ExamenUD3 {

    public static void main(String[] args) {
        double sueldos[] = new double[0];
        double sueldoLeido;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("¿Cuál es su sueldo?: ");
        sueldoLeido = sc.nextDouble();
        if (sueldoLeido == -1) {
            System.out.println("Ningún sueldo introducido.");
        } else {
            while (sueldoLeido != -1) {
                sueldos = insertarOrdenado(sueldos, sueldoLeido);
                System.out.println(Arrays.toString(sueldos));
                System.out.println("¿Cuál es su sueldo?: ");
                sueldoLeido = sc.nextDouble();
            }
            
            System.out.println("Los sueldos introducidos, ordenados de mandera decreciente son:");
            for (int i = sueldos.length - 1; i >= 0; i--) {
                System.out.print(sueldos[i] + ", ");
            }
            System.out.println("");

            mostrarMinimo(sueldos[0]);
            mostrarMaximo(sueldos[sueldos.length - 1]);

            double media = mediaSueldos(sueldos);
            System.out.println("Media de los sueldos: " + media);
        }

    }

    static double mediaSueldos(double t[]) {
        double sumatorio = 0, media;
        int contador = 0;

        for (int i = 0; i < t.length; i++) {
            sumatorio += t[i];
            contador++;
        }

        media = sumatorio / contador;

        return media;
    }

    static void mostrarMinimo(double minimo) {
        System.out.println("El sueldo mínimo es: " + minimo + " euros");
    }

    static void mostrarMaximo(double maximo) {
        System.out.println("El sueldo máximo es: " + maximo + " euros");
    }

    static double[] insertarOrdenado(double t[], double valor) {
        int indiceInsercion;
        double aux[] = new double[t.length + 1]; //Creo una tabla con una posición más.

        indiceInsercion = Arrays.binarySearch(t, valor); //Busco la posición donde ha de insertarse el sueldo.

        if (indiceInsercion < 0) {
            indiceInsercion = -indiceInsercion - 1;
        }

        System.arraycopy(t, 0, aux, 0, indiceInsercion);
        System.arraycopy(t, indiceInsercion, aux, indiceInsercion + 1, t.length - indiceInsercion);
        aux[indiceInsercion] = valor;

        return aux;
    }
}
