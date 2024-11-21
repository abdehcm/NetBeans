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
//Solicitar un numero entero positivo y mostrar por pantalla la cadena Eco tantas vesces como diga el nuemero

public class EClase3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
         
        int num;
        
        System.out.println("Introduce un numero entero y positivo");
        num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.println("Eco");
        }
    }
    
}

//Un programa que solicite un numero entero al ususario desde el 1 hasta el numero que repite el ususario
