/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unicode;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Introducir por teclado una frase palabra a palabra y
mostrar la frase completa separando las palabras introducidas con espacios en blanco.
Cuando se introduce "fin" terminara la frase*/
public class IntroducirPalabrasFraseString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String cad;
        int contador;
        String fin = "fin";
        String frase = "", palabra, palabraMinusculas;
        boolean primeraPalabra = true;
        
        System.out.println("escribe una palabra");
        palabra = sc.next();
        palabraMinusculas = palabra.toLowerCase();
        
        
        while (!palabraMinusculas.equals(fin)) {            
            if (primeraPalabra) {
                frase = palabra;
                primeraPalabra = false;
            }else{
                frase = frase + " " + palabra;
            }
            System.out.println("escribe una palabra");
            palabra = sc.next();
            palabraMinusculas = palabra.toLowerCase();
        }
        
        System.out.println("Introduce la ");

    }

}
