/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo5;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Ejemplo clase Scanner        
        Scanner sc = new Scanner (System.in);
        int x;
        String Abdel = "Hola Abdel";
        
        
        System.out.println("Introduce un valor entero");
        x = sc.nextInt();
        System.out.println("El valor introducido es: " + x);
        
        //Esto nos dara el numero de caracteres aue tiene la cadena
        System.out.println(Abdel.length());
    }
    
}
