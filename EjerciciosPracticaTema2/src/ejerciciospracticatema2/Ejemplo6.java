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
//Pedir 10 numero y mostrar la media
public class Ejemplo6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0, media = 0;
        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            suma += num;
        }

        media = suma / 10;

        System.out.println("Esta es la media: " + media);
    }
}
