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
public class InsercionTablaOrdenada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        int aux[] = new int[10];

        for (int i = 0; i < aux.length; i++) {
            aux[i] = (int) (Math.random() * 1000);
        }
        Arrays.sort(aux);

        System.out.println("Datos: " + Arrays.toString(aux));

        System.out.println("Qué valor desea insertar: ");
        valor = sc.nextInt();

        aux = insertarOrdenado(aux, valor);
        System.out.println(Arrays.toString(aux));
    }

    static int[] insertarOrdenado(int t[], int nuevo) {
        int indiceInsercion = Arrays.binarySearch(t, nuevo);

        if (indiceInsercion < 0) {
            //calcula dónde debería estar
            indiceInsercion = -indiceInsercion - 1;
        }

        int copia[] = new int[t.length + 1];
        
        //Copia todos los elementos hasta el indice del numero insertado
        System.arraycopy(t, 0, copia, 0, indiceInsercion);
        //Copia todo despues del indice del numero insertado
        System.arraycopy(t, indiceInsercion,
                copia, indiceInsercion + 1, t.length - indiceInsercion);

        copia[indiceInsercion] = nuevo;
        t = copia; //t referencia la nueva tabla

        return t;
    }
}
