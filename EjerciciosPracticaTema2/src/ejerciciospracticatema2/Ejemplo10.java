/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospracticatema2;

/**
 *
 * @author abdelhachim
 */
//Una aplicacion que muestre todas las tablas del 1 al 10.
public class Ejemplo10 {
    public static void main(String[] args) {
        int multi = 0;
        
        for (int i = 0; i <= 10; i++) {
            System.out.println("Tabla multiplicar del " + i);
            for (int j = 0; j <= 10; j++) {
                multi = i * j;
                System.out.println(i + " X " + j + " = " + multi);
                
            }
            System.out.println("");
        }
    }
    
}
