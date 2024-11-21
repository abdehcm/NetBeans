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
//Un programa que solicite un numero entero al ususario desde el 1 hasta el numero que repite el ususario
public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        
        imprimir(numero);
        
    }
    
    static void imprimir(int num){
        for (int i = 0; i < num; i++) {
            System.out.println(i + 1);
        }
    }
    
}
