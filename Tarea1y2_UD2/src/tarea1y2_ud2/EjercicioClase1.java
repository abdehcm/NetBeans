/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1y2_ud2;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Pedir a un usuario su edad y decir la que tendra el proximo año*/
public class EjercicioClase1 {
    
    public static void main(String[] args) {  
        
        int edad;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();
        
        edad = edad + 1;
        System.out.println("Su edad el próximo año será: " + edad + " años");
        
    }

    
}
