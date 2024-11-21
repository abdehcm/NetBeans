/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexamenherencia_cajas;

/**
 *
 * @author marta
 */
public class Caja {

    protected final double ANCHO, ALTO, FONDO; //dimensiones
    public String etiqueta; //permitimos que la etiqueta se modifique libremente

    public Caja(double ancho, double alto, double fondo) {
        this.ANCHO = ancho;
        this.ALTO = alto;
        this.FONDO = fondo;
    }

    //devuelve la capacidad de la caja, siempre en metros cúbicos
    public double calculaVolumen() {
        return ANCHO * ALTO * FONDO;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return ANCHO + "x" + ALTO + "x" + FONDO + "\n" + etiqueta;
    }

}
