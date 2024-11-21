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
public class Ejercicio7 {
    
    public static void main(String[] args) {
        int a1, a2;
        double y;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce A1");
        a1=sc.nextInt();
        System.out.println("Introduce A2");
        a2 = sc.nextInt();
        
        y = (double)(-a2)/a1;
        System.out.println("El resultado es: " + y);
        
        
    }
    
}
