/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosud2_estructurascontrolflujo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*
Programa que pida por teclado un número decimal e indique si es un número casi-cero, 
que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, 
aunque curiosamente el 0 no se considera un número casi-cero. 
Ejemplos de números casi-ceros son: 0.3, -0.99, 0.123. 
Algunos números que no se consideran casi-ceros son: 12.3, 0, ó -1.*/
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double n1;

        System.out.println("Introduzca un número decimal: ");
        n1 = sc.nextDouble();

        if (-1 < n1 && n1 < 1 && n1 != 0) {
            System.out.println(n1 +" es casi-cero");

        } else {
            System.out.println(n1 +" no es casi-cero");

        }
    }

}
