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
public class EClase7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número del 1 al 10 incluidos: ");
        num = sc.nextInt();
        System.out.println("");
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x "+ i + " = "+num*i);
        }
    }

}
