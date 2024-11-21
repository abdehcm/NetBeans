/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosfuncionesud3;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class Abdel_Hachim_Ejercicio1 {

    public static void main(String[] args) {
        
        int horas1, minutos1, horas2, minutos2, diferenciaMinutos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora y los minutos del primer instante:");
        horas1 = sc.nextInt();
        minutos1 = sc.nextInt();

        System.out.println("Introduce la hora y los minutos del segundo instante:");
        horas2 = sc.nextInt();
        minutos2 = sc.nextInt();

        diferenciaMinutos = calcularDiferenciaMinutos(horas1, minutos1, horas2, minutos2);
        System.out.println("La diferencia de minutos es: " + diferenciaMinutos + " minutos");

        System.out.println("Segundos en el primer instante: " + calcularSegundos(horas1, minutos1) + " segundos");
        System.out.println("Segundos en el segundo instante: " + calcularSegundos(horas2, minutos2) + " segundos");

    }

    static int calcularDiferenciaMinutos(int horas1, int minutos1, int horas2, int minutos2) {
        int totalMinutos1 = horas1 * 60 + minutos1;
        int totalMinutos2 = horas2 * 60 + minutos2;

        return Math.abs(totalMinutos1 - totalMinutos2);
    }

    static int calcularSegundos(int horas, int minutos) {
        return horas * 3600 + minutos * 60;
    }

}
