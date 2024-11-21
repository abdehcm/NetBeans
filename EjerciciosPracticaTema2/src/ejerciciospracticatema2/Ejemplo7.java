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
/*Que el usuario introduzca un numero y le devuelova su tabla de multiplicar*/
public class Ejemplo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        
        tablaMultiplicar(numero);
        
    }
    
    static void tablaMultiplicar(int num){
        for (int i = 0; i <= 10; i++) {
            int result = 0;
            result = i * num;
            System.out.println(i + " X " + num + " = " + result);
        }
    }
    
}
