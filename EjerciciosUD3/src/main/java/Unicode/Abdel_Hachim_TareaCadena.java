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
/*Realizar un programa que lea una frase del teclado y nos indique si es
palíndroma, es decir, que la frase sea igual leyendo de izquierda a
derecha que de derecha a izquierda, sin tener en cuenta los espacios. 
Un ejemplo de frase palíndroma es: "Dábale arroz a la zorra el abad".
Las vocales con tilde hacen que los algoritmos consideren una frase
palíndroma como si no lo fuese. Por esto, el usuario no podrá introducir
frases con tildes.*/
public class Abdel_Hachim_TareaCadena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase, fraseReves;
        char caracter;
        //Dábale arroz a la zorra el abad
        System.out.println("Introduce la frase: ");
        frase = sc.nextLine().toLowerCase();

        //sinEspacios = eliminaEspacios

        /*if (sinEspacios.equals(invertida)) {
            System.out.println("Es palindroma");

        } else {
            System.out.println("No es palindroma");
        }*/

    }

    static String eliminaEspacios(String cadena) {
        String sin = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (!Character.isWhitespace(c)) {
                sin = sin + c;
                
            }
        }
        return sin;
    }

    static String alreves(String original) {
        String nueva = "";
        
        for (int i = 0; i < original.length(); i++) {
            nueva = original.charAt(i) + nueva;
        }
        return nueva;
    }

}
//replace para quitar espacios
