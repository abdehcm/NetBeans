package tarea1y2_ud2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alu_tarde
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        
        System.out.println("Introducir primer número: a=");
        a = sc.nextInt();
        System.out.println("Introducir primer número: b=");
        b = sc.nextInt();
        
        
        
        System.out.println("Introducir tercer número: c=");
        c = sc.nextInt();
        System.out.println("Introducir cuarto número: d=");
        d = sc.nextInt();
        
        System.out.println("c=" + c + "d=" + d);
        System.out.println("c*d=" + (c*d));
        System.out.println("c/d" + (double)c/d);
        
        System.out.println("a²=" + Math.pow(a, b));
        System.out.println("\u221A" + "x ="+Math.sqrt((double)d));
    }
    
}
