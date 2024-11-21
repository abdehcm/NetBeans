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
public class NumeroSuerte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántos números favoritos tiene: ");
        int cuantos = sc.nextInt();

        int numerosFavoritos[] = new int[cuantos];

        for (int i = 0; i < numerosFavoritos.length; i++) {
            System.out.print("Número favorito " + (i + 1) + ": ");
            numerosFavoritos[i] = sc.nextInt();
        }
        Arrays.sort(numerosFavoritos);

        while (numerosFavoritos.length > 1) {
            int indiceAzar = (int) (Math.random() * numerosFavoritos.length);
            int elemento1 = numerosFavoritos[indiceAzar];

            numerosFavoritos = borrar(numerosFavoritos, indiceAzar);

            indiceAzar = (int) (Math.random() * numerosFavoritos.length);
            int elemento2 = numerosFavoritos[indiceAzar];
            numerosFavoritos = borrar(numerosFavoritos, indiceAzar);

            int media = (elemento1 + elemento2) / 2;

            numerosFavoritos = insertarOrdenado(numerosFavoritos, media);

            System.out.println(Arrays.toString(numerosFavoritos));
        }

        //Salir del while significa que ya tenemos el número de la suerte:
        System.out.println("Su número de la suerte es: " + numerosFavoritos[0]);
    }

    static int[] borrar(int t[], int indice) {
        // El quinto parámetro de entrada a arraycopy corresponde a la cantidad total de elementos de la tabla - los que no se van a copiar = nº elementos a copiar
        System.arraycopy(t, indice + 1, t, indice, t.length - (indice + 1));
        t = Arrays.copyOf(t, t.length - 1);

        return t;
    }

    static int[] insertarOrdenado(int t[], int nuevo) {
        int indiceInsercion = Arrays.binarySearch(t, nuevo);

        if (indiceInsercion < 0) {
            indiceInsercion = -indiceInsercion - 1;
        }

        int copia[] = new int[t.length + 1];

        System.arraycopy(t, 0, copia, 0, indiceInsercion);

        System.arraycopy(t, indiceInsercion,
                copia, indiceInsercion + 1, t.length - indiceInsercion);

        copia[indiceInsercion] = nuevo;
        t = copia;

        return t;   // o return copia
    }
}
