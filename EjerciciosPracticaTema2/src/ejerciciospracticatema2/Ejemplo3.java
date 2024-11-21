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
//Solicitar un numero entero positivo y mostrar por pantalla la cadena Eco tantas vesces como diga el nuemero
public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero entero y positivo: ");
        int numero = sc.nextInt();
        
        /*for (int i = 0; i < numero; i++) {
            System.out.println("ECO");
        }*/
        
        eco(numero);
        
    }
    
    static void eco(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("ECO");
        }
    }
    
}
