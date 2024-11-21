/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosfuncionesud3;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class Abdel_Hachim_Ejercicio2 {

    public static void main(String[] args) {
        
        int cantidadEnteros, minEntero, maxEntero, cantidadReales;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de números aleatorios :");
        cantidadEnteros = sc.nextInt();

        System.out.println("Introduce el número mínimo:");
        minEntero = sc.nextInt();

        System.out.println("Introduce el número máximo:");
        maxEntero = sc.nextInt();

        mostrarNumerosAleatorios(cantidadEnteros, minEntero, maxEntero);

        System.out.println("\n\nIntroduce la cantidad de números aleatorios entre 0 y 1 a mostrar:");
        cantidadReales = sc.nextInt();

        mostrarNumerosAleatorios(cantidadReales);
    }

    static void mostrarNumerosAleatorios(int cantidad, int min, int max) {
        System.out.println("\nNúmeros aleatorios entre " + min + " y " + max + ":");
        for (int i = 0; i < cantidad; i++) {
            int num = (int) (Math.random() * ((max - min) + 1)) + min;
            System.out.print(num + " ");
        }
    }

    static void mostrarNumerosAleatorios(int cantidad) {
        System.out.println("\nNúmeros aleatorios reales entre 0 y 1:");
        for (int i = 0; i < cantidad; i++) {
            double num = Math.random();
            System.out.print(num + " ");
        }
    }
}
