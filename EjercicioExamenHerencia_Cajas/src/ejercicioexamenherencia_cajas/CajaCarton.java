/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexamenherencia_cajas;

/**
 *
 * @author marta
 */
public class CajaCarton extends Caja {

    static double superficieCartonTotal = 0; //cartón utilizado para construir todas las cajas
    protected double superficieCaja; //area de la superficie de la caja de cartón

    CajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo); //reutilizamos constructor
        superficieCaja = 2 * (ancho * alto + ancho * fondo + alto * fondo); //calculamos el área de la caja
        superficieCartonTotal += superficieCaja; //acumulamos el área total de cartón utilizado en la contrucción de todas las cajas
    }

    double getSuperficieCaja() {
        return superficieCaja; //devolvemos el área
    }

    @Override //sustituimos el método de la superclase
    public double calculaVolumen() {
        //Aunque el volumen de una caja de cartón coincida con el volumen de una caja, 
        //en la práctica, para evitar roturas, se calcula el volumen "práctico" como un
        // 80% del volumen real:
        return super.calculaVolumen() * 0.8; //devolvemos el 80% del volumen
    }

    @Override
    public String toString() {
        String result = "Cartón total " + superficieCartonTotal + "m2\n";
        result += "Área: " + superficieCaja + "m2\n";
        result += super.toString(); //aprovechamos el método de la superclase
        return result;
    }
}
