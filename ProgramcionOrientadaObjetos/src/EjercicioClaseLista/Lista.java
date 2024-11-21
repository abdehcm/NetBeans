/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClaseLista;

import java.util.Arrays;

/**
 *
 * @author abdelhachim
 */
/*Las listas son estructuras dinámicas de datos donde se pueden insertar o 
eliminar elementos de un determinado tipo sin limitación de espacio.
Implementar la clase Lista correspondiente a una lista de números enteros. 
Los números se guardarán en una tabla que se redimensionará con las inserciones y eliminaciones, 
aumentando o disminuyendo la capacidad de la lista según el caso. 
En los métodos de la clase se incluirán las siguientes tareas:
- Un constructor que inicialice la tabla con un tamaño cero.
- Obtener el número de elementos insertados en la tabla.
- Insertar un número al final de la lista.
- Insertar un número al principio de la lista.
- Insertar un número en un lugar de la lista cuyo índice, que es el de la tabla, se pasa como parámetro.
- Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
- Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
- Obtener el elemento cuyo índice se pasa como parámetro.
- Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no está, devolverá -1.
- Mostrar los elementos de la lista por consola.
*/
public class Lista {
    
    int [] tabla;

    public Lista() {
        tabla = new int[0];
    }
    //Obtener el número de elementos insertados en la tabla.
    public int numeroElementos(){
        return tabla.length;
    }
    
    //Insertar un número al final de la lista.
    void insertarPrincipio(int nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }
    
    
    
}