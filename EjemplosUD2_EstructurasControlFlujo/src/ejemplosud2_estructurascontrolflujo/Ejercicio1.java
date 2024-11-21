/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosud2_estructurascontrolflujo;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        boolean CumpleCondicion;
        int n1,n2;
        System.out.println("Escriba un número entero:");
        n1 = sc.nextInt();
        System.out.println("Escriba otro número entero, diferente de 0:");
        n2 = sc.nextInt();
        
        CumpleCondicion = (n1%n2 == 0);
    }
    
}
