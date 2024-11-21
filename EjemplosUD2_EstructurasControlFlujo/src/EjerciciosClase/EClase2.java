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
/*que solicite al usuario un número, entero y positivo, y muestre cada
una de sus cifras empezando por las unidades. Por ejemplo, si el número
es 123, mostrará un 3, después un 2 y, por último, un 1. Supondremos que
el número introducido cumple las especificaciones.*/
public class EClase2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número entero y positivo");
        num = sc.nextInt();

        while (num < 0) {
            System.out.println("Introduce un número entero y positivo");
            num = sc.nextInt();
        }
        
        /*while (num > 0) {
            int cifra = num % 10; 
            System.out.print(cifra + ",");
            num = num / 10; 
        }*/
        
        do{
            System.out.println("Introduce un número entero y positivo");
            num = sc.nextInt();
        }while(num<=0);

    }
}
