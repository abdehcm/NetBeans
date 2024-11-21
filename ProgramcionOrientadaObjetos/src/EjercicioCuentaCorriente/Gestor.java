/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuentaCorriente;

/**
 *
 * @author abdelhachim
 */
public class Gestor {

    public String nombre;
    private String tlf;
    double importeMax;

    Gestor(String nombre, String tlf, double importeMax) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMax = importeMax;
    }

    Gestor(String nombre, String tlf) {
        this(nombre, tlf, 10000.0);
    }

    String getTlf() {
        return tlf;
    }

    void mostrarInformacion() {
        System.out.println("Nombre:");
        System.out.println("Telefono:");
        System.out.println("Importe máximo: " + importeMax + "");
    }

}
