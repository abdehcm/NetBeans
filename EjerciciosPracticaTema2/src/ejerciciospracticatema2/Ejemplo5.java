/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospracticatema2;

import java.util.Scanner;

/**
 *
 * @author abdelhachim
 */
//Escribir todos los multiplos de 7 menores que 100
public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 7;
        
        
        multiplos7(numero);
        
    }
    
    static void multiplos7(int num){
        for (int i = 0; i <= 100; i++) {
            if (i % num == 0) {
                System.out.println(i);
            }
        }
        
    }
    
}
