/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author abdelhachim
 */
public class EliminarTablaOrdenada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aBorrar, indiceBorrado;

        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Introduce el elemento a borrar: ");
        aBorrar = sc.nextInt();

        indiceBorrado = Arrays.binarySearch(t, aBorrar);

        if (indiceBorrado >= 0) {
            System.arraycopy(t, indiceBorrado + 1, t, indiceBorrado, aBorrar);

        }

    }

}
/*src: El array de origen desde el cual se copiarán los elementos.
srcPos: La posición inicial en el array de origen desde donde comenzará la copia.
dest: El array de destino donde se copiarán los elementos.
destPos: La posición inicial en el array de destino donde se copiarán los elementos.
length: El número de elementos a copiar.*/
