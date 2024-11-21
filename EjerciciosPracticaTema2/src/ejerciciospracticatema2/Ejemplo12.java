/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospracticatema2;

import java.util.Scanner;

/**
 *
 * @author abdelhachim
 */
/*Dadas 6 notas (de tipo entero) solicitadas al usuario, 
escribir la cantidad de alumnos aprobados, 
condicionados (nota igual a 4) y suspensos. 
Comprobar que las notas están entre 0 y 10.*/
public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0, condicionados = 0, suspensos = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.println("Introduce las notas");
            int notas = sc.nextInt();

            if (notas > 4) {
                aprobados++;
            } else if (notas == 4) {
                condicionados++;
            } else if (notas < 4) {
                suspensos++;
            }
        }

        System.out.println("Hay " + aprobados + " aprobados");
        System.out.println("Hay " + condicionados + " condicionados");
        System.out.println("Hay " + suspensos + " suspensos");
    }

}
