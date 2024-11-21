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
//Realizar una app que solicite la edad y decir si es mayor de edad o no

public class EjercicioClase5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        int edad;
        boolean mayorEdad = true;
        
        System.out.println("Introduce tu edad");
        edad = sc.nextInt();
        
        mayorEdad = edad >= 18;
        
        System.out.println("Mayor de edad: " + mayorEdad);
        
        
    }
    
}
