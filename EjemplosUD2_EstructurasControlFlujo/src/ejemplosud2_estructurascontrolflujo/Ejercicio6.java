/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosud2_estructurascontrolflujo;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Escribir un programa que indique cuantas cifras tiene un número entero
introducido por teclado*/
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número: ");
        num = sc.nextInt();

        if (num < 10) {
            System.out.println("tiene 1 cifra");
        } else {
            if (num < 100) {
                System.out.println("Tiene 2 cifras");
            } else {
                if (num < 1000) {
                    System.out.println("Tiene 3 cifras");
                } else {
                    if (num < 10000) {
                        System.out.println("Tiene 4 cifras");
                    } else {
                        if (num < 100000) {
                            System.out.println("Tiene 5 cifras");
                        }
                    }
                }
            }
        }
    }

}
