/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examen_ud2;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Escribir un programa que solicite al usuario un número entero comprendido entre 0 y 9999,
incluidos ambos. Tras validar el número, la aplicación tendrá que comprobar e indicar si el
número introducido es capicúa.
Ejemplos de números capicúa: 7, 55, 323 y 4884*/
public class Ejercicio1_AbdelHachim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int alreves = 0;

        System.out.println("Introduce un número entero entre 0 y 9999");
        num = sc.nextInt();

        while (num < 0 || num > 9999) {
            System.out.println("Introduce un número entero entre 0 y 9999");
            num = sc.nextInt();
        }
        int primerNum = num;
        while (num != 0) {
            alreves = alreves * 10 + num % 10;
            num /= 10;
        }
        if (primerNum == alreves) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }
    }
}
