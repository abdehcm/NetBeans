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
//Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado, 
//utilizando para ello asteriscos (*), con espacios entre ellos. Por ejemplo, para n=4:

public class EClase11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        
        for (int fila = 1; fila <= n; fila++) {
            for (int col = fila; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
