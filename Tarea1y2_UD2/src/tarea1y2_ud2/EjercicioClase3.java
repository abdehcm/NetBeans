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
/*Calcular la media aritmetica de notas enteras*/
public class EjercicioClase3 {

    public static void main(String[] args) {
        
        int n1, n2, media;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca la primera nota:");
        n1 = sc.nextInt();
        System.out.println("Introduzca la segunda nota:");
        n2 = sc.nextInt();
        
        media = n1 + n2;
        media = media / 2;
        
        System.out.println("Su nota media es: " + media);
        System.out.println("La media es: "+(double)(n1+n2)/2);
    }

}
