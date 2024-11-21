/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author alu_tarde
 */
public class Ejemplo2 {
    public enum Dias{Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo}

    /**
     * @param args the command line arguments
     */
    /*Sring frase = "\"Hola\ny\tadiós\"";
    Esto imprimira 
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dias diaActual = Dias.Martes;
        Dias diaSiguiente = Dias.Miercoles;
        
        System.out.println("Hoy es: ");
        System.out.println(diaActual);
        System.out.println("Mañana\nes\n"+diaSiguiente);
    }
    
}
