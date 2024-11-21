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
/*pedir 3 numeros y ordenarlos de mayor a menor*/
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Introduce un número diferentes: ");
        a = sc.nextInt();
        System.out.println("Introduce otro número: ");
        b = sc.nextInt();
        System.out.println("Introduce otro número");
        c = sc.nextInt();

        if (a > b && b > c) {
            System.out.println(a + "," + b + "," + c);
        } else {
            if (a > c && c > b) {
                System.out.println(a + "," + c + "," + b);
            } else {
                if (b > a && a > c) {
                    System.out.println(b + "," + a + "," + c);
                } else {
                    if (b > c && c > a) {
                        System.out.println(b + "," + c + "," + a);
                    }
                    if (c > a && a > b) {
                        System.out.println(c + "," + a + "," + b);
                    } else {
                        if (c > b & b > a) {
                            System.out.println(c + "," + b + "," + a);

                        }
                    }
                }
            }
        }

    }

}
