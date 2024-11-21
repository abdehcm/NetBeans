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
public class Abdel_Hachim_Ejercicio3 {

    public static void main(String[] args) {

        int n, resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de n para la serie de Fibonacci:");
        n = sc.nextInt();

        resultado = calcularFibonacci(n);
        System.out.println("El lugar " + n + " es: " + resultado);
    }

    static int calcularFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
