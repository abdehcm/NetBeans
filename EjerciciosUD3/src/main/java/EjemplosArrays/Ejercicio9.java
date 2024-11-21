/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosArrays; 

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] t = {10, 40, 6, 20, 34, 50};
        int elementoBorrar = sc.nextInt();
        
        int indiceBorrado = Arrays.binarySearch(t, elementoBorrar);
        if (indiceBorrado >= 0) {
           // System.arraycopy();
        }
    }
    
}
