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
//Mostrar la suma de los 10 primero numeros impares
public class EClase8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, suma = 0;
        
        for (int i = 0; i < 20; i++) {
            if (i%2 != 0) {
                suma += i;
                System.out.println(i);
            }
        }
        System.out.println("La suma de los 10 primeros números impares: " + suma);

    }

}
