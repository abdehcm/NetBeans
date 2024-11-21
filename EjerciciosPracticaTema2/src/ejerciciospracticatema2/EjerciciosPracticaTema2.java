/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospracticatema2;

import java.util.Scanner;

/**
 *
 * @author abdelhachim
 */
/*Solicitar dos números enteros y distintos al usuario 
y mostrarlos ordenados de manera decreciente (supondremos que son diferentes).
Debes hacerlo de dos formas: usando el operador ternario, 
y usando if-else. Ambas en el mismo archivo, comentando la
opción que no vayas a ejecutar en cada momento.*/
public class EjerciciosPracticaTema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero entero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero entero: ");
        int num2 = sc.nextInt();

        //if / else
        if (num1 > num2) {
            System.out.println("Ordenados decrecientes: " + num1 + ", " + num2);
        }else{
            System.out.println("Ordenados decrecientes: " + num2 + ", " + num1);
        }
        
        //Operador ternario
        int mayor = (num1 > num2) ? num1 : num2;
        int menor = (num1 < num2) ? num1 : num2;
        
        System.out.println(num1 + "," + num2);

    }

}
