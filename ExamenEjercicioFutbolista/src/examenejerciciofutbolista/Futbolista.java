/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenejerciciofutbolista;

/**
 *
 * @author marta
 */
public class Futbolista implements Comparable{

    String dni;
    String nombre;
    int edad;
    int numGoles;

    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    @Override
    public boolean equals(Object otro) {
        return dni.equals(((Futbolista) otro).dni);
    }

    @Override
    public int compareTo(Object otro) {
        return dni.compareTo(((Futbolista) otro).dni);
    }

    @Override
    public String toString() {
        return "\nDNI:" + dni + " nombre:" + nombre
                + " edad:" + edad + " goles:" + numGoles;
    }

}
