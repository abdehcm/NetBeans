/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClaseHora;

import EjercicioClaseHora.Hora;
import java.util.Scanner;

/**
 *
 * @author abdelhachim
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hora, minuto, segundo;

        Hora h1 = new Hora("Lunes");

        System.out.print("Hora: ");
        hora = sc.nextInt();
        System.out.print("Minuto: ");
        minuto = sc.nextInt();
        System.out.print("Segundo: ");
        segundo = sc.nextInt();

        h1.setHora(hora);
        h1.setMinuto(minuto);
        h1.setSegundo(segundo);

        System.out.println("Cuántos segundos quieres mostrar: ");
        int numSegundos = sc.nextInt();

        for (int i = 0; i < numSegundos; i++) {
            System.out.println(h1.getHora() + ":" + h1.getMinuto() + ":" + h1.getSegundo());
            h1.incrementarSegundo();
        }
    }

}
