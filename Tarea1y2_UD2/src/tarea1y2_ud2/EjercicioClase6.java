/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1y2_ud2;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*solicitar un numero al usuario e idnicar mediante un litral boleano si es par*/
public class EjercicioClase6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        boolean par;

        System.out.println("Introduzca un número: ");
        num = sc.nextInt();
        par = (num % 2 == 0);
        
        System.out.println("Par: " + par);
    }

}
