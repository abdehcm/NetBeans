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
/*indiceEliminacion = 2
System.ArrayCopy(tablaOrigen(1), indiceEliminacion + 1(2), tabla(3), indiceEleminicaion(4), tabla.length -(indiceEleminicaion +1))(5) )*/
 /*5. Elementos que no se van a desplazar*/

 /*Esto copia la tabla pero con una posicion menos que la original
tabla = Arrays.copyOf(tabla, tabla.length -1)*/
/*indiceInsercion = 3
int copia [] = new int [tabla.length +1]
System.ArrayCopy(tabla, 0, copia, 0, indiceInsercion)
System.ArrayCopy(tabla, indiceInsercion, copia, indiceInsercion + 1, tabla.length - indiceInsercion)
copia[indiceInsecion] = 6
tabla = copia

 */
public class SystemArrayCopy_eliminacion {

    public static void main(String[] args) {

        int t[] = {1, 3, 5, 7, 9};

        int indiceEliminacion = 2; //seria el 5

        System.arraycopy(t, indiceEliminacion + 1, t, indiceEliminacion, t.length - (indiceEliminacion + 1));

        t = Arrays.copyOf(t, t.length - 1);

        System.out.println(Arrays.toString(t));
    }
}


