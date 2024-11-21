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
//Escribir todos los multiplos de 7 menores que 100
public class EClase5 {
    public static void main(String[] args) {
        
        int multiplos;
        
        for (int i = 0; i < 100; i++) {
            if (i%7 == 0) {
                System.out.println(i);
                
            }
        }
        
        for (int i = 0; i < 100; i+= 7) {
            System.out.println(i);
        }
    }
    
}
