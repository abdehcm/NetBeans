/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenud3;

import java.util.Scanner;

/**
 *
 * @author marta
 */
public class Ejercicio2ExamenUD3 {

    public static void main(String[] args) {
        System.out.println("Escriba una sentencia en C: ");
        String sentencia = new Scanner(System.in).nextLine();

        int inicio = sentencia.indexOf("/*");
        while (inicio != -1) {
            int fin = sentencia.indexOf("*/", inicio); 
            sentencia = sentencia.substring(0, inicio) + sentencia.substring(fin + 2);
            inicio = sentencia.indexOf("/*");
        }
        sentencia = sentencia.strip();
        System.out.println(sentencia); 



    }
}
