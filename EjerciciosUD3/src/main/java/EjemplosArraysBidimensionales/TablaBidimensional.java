/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosArraysBidimensionales;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class TablaBidimensional {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int tabla2D [][] = new int [5][5];
        
        for (int x = 0; x < tabla2D.length; x++) {
            for (int y = 0; y < tabla2D.length; y++) {
                System.out.println("Introduce los valores: ");
                tabla2D[x][y] = sc.nextInt();      
            }
        }
        System.out.println(Arrays.deepToString(tabla2D));
        
    }
    
}
