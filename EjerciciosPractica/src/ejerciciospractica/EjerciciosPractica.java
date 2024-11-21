/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author abdelhachim
 */
public class EjerciciosPractica {

    /**
     * @param args the command line arguments
     */
    /*Escribe un programa en Java que permita al usuario ingresar un número y luego busque ese número en un array predefinido. 
    El programa deberá mostrar el array original, solicitar al usuario que ingrese el número a buscar 
    y, finalmente, indicar si el número se encuentra en el array y en qué posición.
    Utiliza un método llamado buscar que tome como parámetros el array y el número a buscar, 
    devolviendo la posición del número en el array o -1 si no se encuentra. 
    Asegúrate de manejar adecuadamente el caso en el que el número no esté presente en el array.*/
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        int elemento;
        int [] array = {14, 21, 32, 4, 92, 60, 7, 8, 9, 10};
        
        System.out.print("Introduce el numero a buscar: ");
        elemento = sc.nextInt();
        
        for (int i = 0; i < array.length; i++) {
            if (elemento == array[i]) {
                System.out.println("La posición de su número es: " + array[i]);
                
            }else{
                System.out.println("Su número no se encuentra");
            }
            
        }
        
        
    }
    
}
