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
/*Solicitar 5 calificaciones de alumnos comprobando que esten entre 0 y 10 
y decir al final si hay algun suspenso*/
public class EClase13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int calificaciones = 0, suspensos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la calificación " + (i + 1));
            calificaciones = sc.nextInt();

            while (calificaciones < 0 || calificaciones > 10) {
                System.out.println("Introduce la calificación " + (i + 1));
                calificaciones = sc.nextInt();
            }

            if (calificaciones < 5) {
                suspensos++;
            }

        }

        System.out.println("En total hay: " + suspensos + "suspensos.");
    }

}
