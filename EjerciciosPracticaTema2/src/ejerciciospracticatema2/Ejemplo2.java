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
/*que solicite al usuario un número, entero y positivo, y muestre cada
una de sus cifras empezando por las unidades. Por ejemplo, si el número
es 123, mostrará un 3, después un 2 y, por último, un 1. Supondremos que
el número introducido cumple las especificaciones.*/
public class Ejemplo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 0, temp = 0;

        System.out.println("Introduce un numero entero y positivo");
        int num1 = sc.nextInt();

        while (num1 <= 0) {
            System.out.println("Introduce un numero entero y positivo");
            num1 = sc.nextInt();
        }
        while (num1 != 0) {            
            num = num1 % 10;
            num1 = num1/10;
            System.out.println(num);
        }
        
        
        

    }

}
