/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosarrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author marta
 */
public class CamaraSecreta {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Longitud de la combinación secreta: ");
        int longitud = sc.nextInt();
        int combSecreta[] = new int[longitud];
        int combJugador[] = new int[longitud];

        generaCombinacion(combSecreta);
        System.out.println(Arrays.toString(combSecreta));
        System.out.println("Escriba una combinación");
        leeTabla(combJugador);

        while (!Arrays.equals(combSecreta, combJugador)) {
            muestraPistas(combSecreta, combJugador);
            System.out.println("Escriba una combinación: ");
            leeTabla(combJugador);
        }
        System.out.println("¡La cámara está abierta!");
    }

    static void generaCombinacion(int t[]) {
        final int MAX = 5; //rango 1..MAX
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * MAX + 1);
        }
    }

    static void leeTabla(int t[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
    }

    static void muestraPistas(int secret[], int jug[]) {
        System.out.println("Pistas:");
        for (int i = 0; i < jug.length; i++) {
            System.out.print(jug[i]);
            if (secret[i] > jug[i]) {
                System.out.println(" menor");
            } else if (secret[i] < jug[i]) {
                System.out.println(" mayor");
            } else {
                System.out.println(" igual");
            }
        }
    }
}
