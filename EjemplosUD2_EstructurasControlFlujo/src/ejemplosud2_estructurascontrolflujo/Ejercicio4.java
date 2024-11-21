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
/*solicitar dos numero al ususario y decir si son iguales o cual es el mayor*/
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Introduzca un número: ");
        n1 = sc.nextInt();

        System.out.println("Introduzca otro número: ");
        n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Los números son iguales.");
        } else {
            if (n1 > n2) {
                System.out.println(n1 + " es mayor que " + n2);
            } else {
                if (n1 < n2) {
                    System.out.println(n2 + " es mayor que " + n1);
                }
            }
        }

    }

}
