/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unicode;

/**
 *
 * @author alu_tarde
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        int letra = 0; 
        int e = 'a';
        System.out.println(e);
        e = '\u0061';
        System.out.println(e);
        char c = 'a';
        System.out.println((int)c);
        e = 97;
        c = (char)e;        
        
        Character.isDigit(c);
        
        // Clase character
        //digitos: 0-9
        //letras: aA -zZ;áÁ
        //caracteres blancos: espacio, tabulador..
        //Otros caracteres: +, -, $...
        
        // static boolean isDigit(char c)
        // static boolean isLetter(char c)
        // static boolean isLetterOrDigit(char c)
        // static boolean isLowerCase(char c)
        // static boolean isUpperCase(char c)
        // static boolean isSpaceChar(char c)
        // static boolean isWhiteSpace(char c)
        
        System.out.println(Character.isDigit(letra));
        System.out.println("Ella dijo \"Hola\"");
        
        //--------------Metodos caracteres--------------
        
        int a = 1234;
        //Static String valueOf(tipoValor);
        
        String cad = String.valueOf(true);
        
        //Static String equals(String a)
        //String cad1 = "Hola";
        //String cad2 = "HOLA";
        //cad1.equals(cad2) --> false
        //cad1.equalsIgnoreCase(cad2) --> true 
    }
    
}
