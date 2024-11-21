/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospracticatema2;

import java.util.Scanner;

/**
 *
 * @author abdelhachim
 */
//Solicitar un numero entero y positivo y calcular su factorial.
// Factorial de 7 = 7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040

public class Ejemplo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número: ");
        int numero = sc.nextInt();
        
        factorial(numero);
    }
    
    static void factorial (int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("El factorial de " + num + " es " + fact);
    }
    
}
