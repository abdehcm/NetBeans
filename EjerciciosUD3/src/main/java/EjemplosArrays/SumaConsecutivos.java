/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosArrays;

import java.util.Arrays;

/**
 *
 * @author alu_tarde
 */
public class SumaConsecutivos {

    public static void main(String[] args) {

        int t[] = {10, 1, 5, 8, 9, 2};

    }

    static int[] suma(int t[], int numElementos) {
        int sumas[] = new int[0];
        int indicePrimerSumando = 0;
        int suma_aux = 0;

        while (indicePrimerSumando <= t.length - numElementos) {
            for (int i = indicePrimerSumando; i < indicePrimerSumando + numElementos; i++) {
                suma_aux += t[i];
                System.out.println(t[i]);
            }

            System.out.println("Suma = " + suma_aux);
            sumas = insertarOrdenado(sumas, suma_aux);

            indicePrimerSumando += 1;
            suma_aux = 0;
        }
        return (sumas);
    }

    static int[] insertarOrdenado(int t[], int nuevo) {
        int indiceInsercion = Arrays.binarySearch(t, nuevo);

        if (indiceInsercion < 0) {
            indiceInsercion = -indiceInsercion - 1;
        }

        int copia[] = new int[t.length + 1];

        System.arraycopy(t, 0, copia, 0, indiceInsercion);

        System.arraycopy(t, indiceInsercion, copia, indiceInsercion + 1, t.length - indiceInsercion);

        copia[indiceInsercion] = nuevo;
        t = copia;

        return t; //o return copia
    }

}
