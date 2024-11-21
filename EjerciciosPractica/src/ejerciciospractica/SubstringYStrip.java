/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author abdelhachim
 */
public class SubstringYStrip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String prefijo = "Hola";
        String sufijo = "adios";

        System.out.println("Introduce la frase: ");
        String cadena = sc.nextLine();

        boolean idioma = false;

        if (cadena.startsWith(prefijo)) {
            idioma = true;
            cadena = cadena.substring(prefijo.length());
            cadena = cadena.stripLeading();
        } else if (cadena.endsWith(sufijo)) {
            idioma = true;
            cadena = cadena.substring(0, cadena.length() - sufijo.length());
            cadena = cadena.stripTrailing();
        }

        if (idioma) {
            System.out.println(cadena);
        } else {
            System.out.println("Su idioma no esta bien");
        }
    }

}
