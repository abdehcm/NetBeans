/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenejerciciofutbolista;

import java.util.Comparator;

/**
 *
 * @author marta
 */
public class ComparaEdades implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int resultado = ((Futbolista) o2).edad - ((Futbolista) o1).edad;
        
        if(resultado == 0){
            resultado = ((Futbolista) o1).numGoles - ((Futbolista) o2).numGoles;
        }
        
        return resultado;
    }

}