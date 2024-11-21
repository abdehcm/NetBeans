/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosClase;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Dadas 6 notas (de tipo entero) solicitadas al usuario, 
escribir la cantidad de alumnos aprobados, 
condicionados (nota igual a 4) y suspensos. 
Comprobar que las notas están entre 0 y 10.*/

public class EClase12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int num, aprobados = 0, condicionados = 0, suspensos = 0;
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Dime una nota de alumnos: ");
            num = sc.nextInt();
            
            while(num < 0 || num > 10){
                System.out.println("Dime una nota de alumnos: ");
            }
            
            if(num >= 5){
                aprobados++;
            }else if(num >= 4 && num < 5){
                condicionados ++;
            }else{
                suspensos++;
            }
            
        }
        
        System.out.println("el numero de aprobados es: " + aprobados);
        System.out.println("El numero de condicionados es: " + condicionados);
        System.out.println("El numero de suspensos es: " + suspensos);
    }
    
}
