/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClaseTexto;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author abdelhachim
 */
public class Texto {

    private String cadena;
    private final int LONGMAX;
    String vocales;
    LocalDate creacion;
    LocalDateTime modificacion;

    Texto(int longMax) {
        cadena = "";
        this.LONGMAX = longMax;
        this.vocales = vocales;
        creacion = LocalDate.now();
        modificacion = null;
    }

    public void addFinal(char c) {
        if (LONGMAX >= cadena.length() + 1) {
            cadena = cadena + c;
            modificacion = LocalDateTime.now();
        }
    }

    public void addFinal(String s) {
        if (LONGMAX >= cadena.length() + s.length()) {
            cadena = cadena + s;
            modificacion = LocalDateTime.now();
        }
    }

    public void addPrincipio(char c) {
        if (LONGMAX > cadena.length()) {
            cadena = c + cadena;
            modificacion = LocalDateTime.now();
        }
    }

    public void addPrincipio(String s) {
        if (LONGMAX >= cadena.length() + s.length()) {
            cadena = s + cadena;
            modificacion = LocalDateTime.now();
        }
    }

    public void mostrar() {
        System.out.println("Texto creado el " + creacion);
        System.out.println("Ultima modificacion: " + modificacion);
        System.out.println(cadena);
    }

    /* public int numVocales(){
        int voc = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
                voc++;
            }
        }
        return;
    }*/
 /*private boolean esVocal(char c){
        boolean vocal = false;
        String cadVocales = "aáeéiíoóuú";
        
        return;
    }*/
}
