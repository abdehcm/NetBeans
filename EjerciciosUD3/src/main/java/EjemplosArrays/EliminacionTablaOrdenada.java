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
public class EliminacionTablaOrdenada {
    public static void main(String[] args) {
        int t[] = {12, 27, 33, 38, 72, 92};
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero a borrar: ");
        int aBorrar = sc.nextInt();
        

        int indiceBorrado = Arrays.binarySearch(t, aBorrar);
        if (indiceBorrado >= 0) {
            System.arraycopy(t, indiceBorrado + 1, t, indiceBorrado, t.length - (indiceBorrado + 1));
            t = Arrays.copyOf(t, t.length - 1);
            System.out.println(Arrays.toString(t));
            System.out.println("El elemento " + aBorrar + " fue eliminado");
        }else{
            System.out.println("Ese número no se esncuentra en la lista");
        }
    }
}

/*src: El array de origen desde el cual se copiarán los elementos.
srcPos: La posición inicial en el array de origen desde donde comenzará la copia.
dest: El array de destino donde se copiarán los elementos.
destPos: La posición inicial en el array de destino donde se copiarán los elementos.
length: El número de elementos a copiar.*/

