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
//Solicitar un numero entero y positivo y calcular su factorial.
public class EClase9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, factorial;

        System.out.println("Introduce un numero entero y positivo");
        num = sc.nextInt();

        while (num <= 0) {
            System.out.println("Introduce un numero entero y positivo");
            num = sc.nextInt();
        }
        factorial = 1;
        
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        
        System.out.println("El factorial de " + num + " es " + factorial);
        
    }

}
