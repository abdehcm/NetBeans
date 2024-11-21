/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatGPT;

import java.util.Arrays;

/**
 *
 * @author abdelhachim
 */
public class EliminarRepetidosGPT {

    public static void main(String[] args) {
        int[] arrayOriginal = {1,1,2,2,3,3,4,4,5,5,6,6};

        // Eliminar duplicados
        int[] arraySinRepetidos = eliminarRepetidos(arrayOriginal);

        // Imprimir el array original
        System.out.println("Array original: " + Arrays.toString(arrayOriginal));

        // Imprimir el array sin duplicados
        System.out.println("Array sin repetidos: " + Arrays.toString(arraySinRepetidos));
    }

    static int[] eliminarRepetidos(int[] array) {
        int longitudOriginal = array.length;
        int[] arraySinRepetidos = new int[longitudOriginal];
        int nuevoTamaño = 0;

        for (int i = 0; i < longitudOriginal; i++) {
            boolean repetido = false;

            // Verificar si el elemento ya está en el nuevo array
            int j = 0;
            while (j < nuevoTamaño && !repetido) {
                if (array[i] == arraySinRepetidos[j]) {
                    repetido = true;
                }
                j++;
            }

            // Si no está repetido, agregarlo al nuevo array
            if (!repetido) {
                arraySinRepetidos[nuevoTamaño++] = array[i];
            }
        }

        // Crear un array del tamaño correcto y copiar los elementos únicos
        return Arrays.copyOf(arraySinRepetidos, nuevoTamaño);
    }
}
