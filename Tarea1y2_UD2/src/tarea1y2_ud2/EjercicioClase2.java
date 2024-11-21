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
/*Pedir año actual y año de nacimiento, tiene que calcular la edad 
y mostrarla suponiendo que ya ha cumplido años en el año actual*/
public class EjercicioClase2 {
    
    public static void main(String[] args) {
        
        int añoActual, añoNac, edad;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca el año actual: ");
        añoActual = sc.nextInt();
        
        System.out.println("Introduca su año de nacimiento: ");
        añoNac = sc.nextInt();
        
        edad = añoActual - añoNac;
        
        System.out.println("Su edad actualmente es: "+ edad +" años");
   
        
        
    }
    
}
