/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenud5_1;

/**
 *
 * @author abdelhachim
 */
public class Caja {
    
    protected final double ANCHO, ALTO, FONDO;
    public String etiqueta;

    public Caja(double ANCHO, double ALTO, double FONDO) {
        this.ANCHO = ANCHO;
        this.ALTO = ALTO;
        this.FONDO = FONDO;
    }
    
    public double calculaVolumen() {
        return ANCHO * ALTO * FONDO;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return ANCHO + " x " + ALTO + " x " + FONDO + " --> Etiqueta: " + etiqueta;
    }
    
    
    
    
}
