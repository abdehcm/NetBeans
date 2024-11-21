/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioscecilica1dam;

import java.util.Scanner;

/**
 *
 * @author abdelhachim
 */
public class Ej1 {

    public static void main(String[] args) {

        //Factorial de un número: Calcula el factorial de un número ingresado por el usuario.
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número:");
        num = sc.nextInt();
        int res = calcularFctorial(num);
        System.out.println(res);

    }

    public static int calcularFctorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            
            resultado = resultado * i;
        }
        return resultado;
    }
}
