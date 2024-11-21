/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al juego de la Cámara Secreta!");

        // Obtener la longitud de la combinación
        System.out.print("Ingrese la longitud de la combinación: ");
        int longitud = sc.nextInt();

        // Generar la combinación secreta aleatoria
        int[] combinacionSecreta = generarCombinacionSecreta(longitud);

        // Iniciar el juego
        boolean juegoTerminado = false;
        int intentos = 0;

        while (!juegoTerminado) {
            // Obtener la combinación del jugador
            int[] combinacionJugador = obtenerCombinacionJugador(longitud, sc);

            // Verificar la combinación
            boolean esCorrecta = verificarCombinacion(combinacionSecreta, combinacionJugador);

            // Mostrar pistas
            if (esCorrecta) {
                System.out.println("¡Felicidades! Has descifrado la combinación secreta en " + (intentos + 1) + " intentos.");
                juegoTerminado = true;
            } else {
                mostrarPistas(combinacionSecreta, combinacionJugador);
                intentos++;
            }
        }
    }

    // Método para generar la combinación secreta aleatoria
    static int[] generarCombinacionSecreta(int longitud) {
        int[] combinacionSecreta = new int[longitud];
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            combinacionSecreta[i] = random.nextInt(5) + 1; // Números del 1 al 5
        }

        return combinacionSecreta;
    }

    // Método para obtener la combinación ingresada por el jugador
    static int[] obtenerCombinacionJugador(int longitud, Scanner scanner) {
        int[] combinacionJugador = new int[longitud];

        System.out.print("Ingrese su combinación de " + longitud + " dígitos (del 1 al 5): ");

        for (int i = 0; i < longitud; i++) {
            combinacionJugador[i] = scanner.nextInt();
        }

        return combinacionJugador;
    }

    // Método para verificar si la combinación es correcta
    static boolean verificarCombinacion(int[] combinacionSecreta, int[] combinacionJugador) {
        return Arrays.equals(combinacionSecreta, combinacionJugador);
    }

    // Método para mostrar pistas
    static void mostrarPistas(int[] combinacionSecreta, int[] combinacionJugador) {
        System.out.print("Pistas: ");

        for (int i = 0; i < combinacionSecreta.length; i++) {
            if (combinacionJugador[i] < combinacionSecreta[i]) {
                System.out.print("+" + " ");
            } else if (combinacionJugador[i] > combinacionSecreta[i]) {
                System.out.print("-" + " ");
            } else {
                System.out.print("=" + " ");
            }
        }

        System.out.println();
    }
}

/*indiceEliminacion = 2
System.ArrayCopy(tablaOrigen(1), indiceEliminacion + 1(2), tabla(3), indiceEleminicaion(4), tabla.length -(indiceEleminicaion +1))(5) )*/
/*5. Elementos que no se van a desplazar*/

/*Esto copia la tabla pero con una posicion menos que la original
tabla = Arrays.copyOf(tabla, tabla.length -1)*/