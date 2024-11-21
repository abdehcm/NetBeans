/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenud5_1;

/**
 *
 * @author abdelhachim
 */
public class CajaCarton extends Caja {

    static double superficieCartonTotal;
    protected double superficieCaja;

    public CajaCarton(double ANCHO, double ALTO, double FONDO) {
        super(ANCHO, ALTO, FONDO);
        superficieCaja = 2 * (ANCHO * ALTO + ANCHO * FONDO + ALTO * FONDO);
        superficieCartonTotal += superficieCaja;
    }

    public double getSuperficieCaja() {
        return superficieCaja;
    }

    @Override
    public double calculaVolumen() {
        return super.calculaVolumen() * 0.8;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + 
                "Área: " + superficieCaja + "\n" + "Cartón total: " + superficieCartonTotal;
    }

    
    

}
