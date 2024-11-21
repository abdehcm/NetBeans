/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ud2;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Para dos números dados, a y b, es posible calcular el máximo común divisor (el número más
grande por el que ambos son divisibles) mediante un algoritmo ineficiente pero sencillo: desde
el menor de a y b, ir buscando, de forma decreciente, el primer número positivo por el que
ambos son divisibles simultáneamente. Realiza un programa que calcule el máximo común
divisor de dos números enteros, positivos y distintos, introducidos por el usuario. Se supondrá
que los números introducidos son positivos y distintos.
Ejemplo1: Si los números son 15 y 10, se irá comprobando si son divisores de ambos el 9, el 8,
el 7… y saldrá que el máximo común divisor es el 5.
Ejemplo2: Si los números introducidos son el 7 y el 4, el máximo común divisor será el 1.*/
public class Ejercicio2_AbdelHachim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor, menor, mcd = 1;
        boolean bandera = false;

        System.out.println("Debes introducir números distintos, el mayor y el menor.");
        System.out.println("Introduce el numero mayor que sea entero, positivo: ");
        mayor = sc.nextInt();
        System.out.println("Introduce el numero menor que sea entero, positivo: ");
        menor = sc.nextInt();

        while (mayor < 0 || menor < 0 || mayor == menor) {
            System.out.println("Debes introducir números distintos, el mayor y el menor.");
            System.out.println("Introduce el número mayor que sea entero, positivo: ");
            mayor = sc.nextInt();
            System.out.println("Introduce el número menor que sea entero, positivo: ");
            menor = sc.nextInt();
        }

        for (int i = menor; i >= 1; i--) {
            if (mayor % i == 0 && menor % i == 0) {
                mcd = i;
                bandera = true;
                break;
               // Se que no puedo usar el break, pero no sabía como hacerlo con la bandera
            }

        }
        System.out.println("El máximo común divisor es: " + mcd);
    }

}
