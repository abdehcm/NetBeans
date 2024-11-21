/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosClase;

/**
 *
 * @author alu_tarde
 */
//Una aplicacion que muestre todas las tablas del 1 al 10.
public class EClase10 {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {
            System.out.println("\nTabla de multiplicar del numero " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = "+i * j);
            } 
        }
    }
    
}
