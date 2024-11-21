/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosClase;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Solicitar dos números enteros y distintos al usuario 
y mostrarlos ordenados de manera decreciente (supondremos que son diferentes).
Debes hacerlo de dos formas: usando el operador ternario, 
y usando if-else. Ambas en el mismo archivo, comentando la
opción que no vayas a ejecutar en cada momento.*/
public class EClase1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduce un número entero");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número entero");
        num2 = sc.nextInt();

        while (num1 == num2) {
            System.out.println("Introduce un número entero");
            num1 = sc.nextInt();
            System.out.println("Introduce otro número entero");
            num2 = sc.nextInt();
        }

        System.out.println("*** IF / ELSE ***");
        if (num1 > num2) {

            System.out.println("Ordenados decrecientemente: " + num1 + "," + num2);

        } else {

            System.out.println("Ordenados decrecientemente: " + num2 + "," + num1);
        }
        
        /*System.out.println("*** OPERADOR TERNARIO ***");
        int mayor = (num1 > num2) ? num1 : num2;
        int menor = (num1 < num2) ? num1 : num2;
        
        System.out.println("Ordenados decrecientemente: " + mayor + ", " + menor);*/
    }

}
