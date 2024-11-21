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
public class ListaDos {

    int[] tabla;

    public ListaDos() {
        tabla = new int[0];
    }

    void insertarPrincipio(int nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(int nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    void insertarSegunPosicion(int posicion, int nuevo) {
        if (posicion >= 0 && posicion < tabla.length) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            System.arraycopy(tabla, posicion, tabla, posicion + 1,
                    tabla.length - posicion - 1);
            tabla[posicion] = nuevo;
        } else {
            System.out.println("Posición de inserción inválida");
        }
    }

    int eliminar(int indice) {
        int eliminado = 0;
        if (indice >= 0 && indice < tabla.length) { // La comprobación del índice del elemento a eliminar debería hacerse donde se llame al método, en lugar de aquí dentro, de manera que este método no devuelva un valor entero que no corresponda.
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    int get(int indice) {
        int valorElemento = 0;
        if (indice >= 0 && indice < tabla.length) { // La comprobación del índice del elemento a devolver debería hacerse donde se llame al método, en lugar de aquí dentro, de manera que este método no devuelva un valor entero que no corresponda.
            valorElemento = tabla[indice];
        } else {
            System.out.println("Posición incorrecta");
        }
        return valorElemento;
    }

    int buscar(int claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i] == claveBusqueda) {
                indice = i;
            }
        }
        return indice;
    }

    public int numeroElementos() {
        return tabla.length;
    }

    public void mostrar() {
        System.out.println("Lista: " + Arrays.toString(tabla));
    }

    static Lista concatena(Lista l1, Lista l2) {
        Lista resultado = new Lista();
        /*for (Integer e : l1.tabla) { 
         resultado.insertarFinal(e); 
      }
      for (Integer e : l2.tabla) { 
         resultado.insertarFinal(e);
      }*/
        resultado.insertarFinal(l1);
        resultado.insertarFinal(l2);

        return resultado;
    }

}
