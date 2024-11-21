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
/*Una funcion que calcule la longitud del area de una circunferencia piediendo al usuario el radio*/
public class EjercicioClase4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double radio, longitud, area;
        final double PI = 3.1416;
        
        System.out.println("Introduzca el radio:");
        radio = sc.nextDouble();
        
        longitud = PI*radio*2;
        
        System.out.println("La longitud es: "+ longitud);
        System.out.printf("El área es: %.2f", PI*Math.pow(radio, 2));
        //Realizar una app que solicite la edad y decir si es mayor de 
        
        
        
        
        
    }
    
}
