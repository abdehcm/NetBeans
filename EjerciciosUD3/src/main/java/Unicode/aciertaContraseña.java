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
/*Diseñar el juego “Acierta la contraseña”. 
La mecánica del juego es la siguiente: el primer jugador introduce la contraseña; 
a continuación, el segundo jugador debe teclear palabras hasta que acierte.
Realizar dos versiones: 
en la primera, se facilita el juego indicando si la palabra introducida es mayor o menor 
alfabéticamente que la contraseña. 
En la segunda versión, el programa mostrará la longitud de la contraseña 
y una cadena con los caracteres acertados en sus lugares respectivos y asteriscos en los no acertados.*/
public class aciertaContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String contraseña1, contraseña2;
        
        System.out.println("***Acierta la contraseña***");
        System.out.println("Jugador1: Introduce la contraseña");
        contraseña1 = sc.nextLine();
        System.out.println("Jugador2: Acierta la contraseña");
        contraseña2 = sc.nextLine();
        
       // int longContraseña1 = contraseña1.length();
        
        if (contraseña1.compareTo(contraseña2) == contraseña2.compareTo(contraseña1)) {
            System.out.println("Las contraseñas son iguales");
        }else if (contraseña1.compareTo(contraseña2) < contraseña2.compareTo(contraseña1)) {
            System.out.println("Contraseña2 es mayor");
        }else{
            System.out.println("Contraseña 2 es menor");
        }
        
    }
    
}
