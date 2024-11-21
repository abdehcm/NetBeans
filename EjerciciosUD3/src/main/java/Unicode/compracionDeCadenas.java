/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unicode;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Introducir por teclado dos frases e indicar cual de ellas es mas corta es decir
la que tiene menos caractweres
 */
public class compracionDeCadenas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cad1;
        String cad2;

        System.out.println("Introduce una frase corta: ");
        cad1 = sc.nextLine();
        System.out.println("Introduce otra frase corta: ");
        cad2 = sc.nextLine();

        if (cad1.length() > cad2.length()) {
            System.out.println("Esta es la mayor " + cad1);
        } else {
            System.out.println("Esta es la mayor " + cad2);
        }

    }

}
