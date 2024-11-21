/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenejerciciofutbolista;

import java.util.Arrays;

/**
 *
 * @author marta
 */
public class ExamenEjercicioFutbolista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Futbolista[] t = new Futbolista[5];
        t[1] = new Futbolista("1A", "Ramos", 30, 15);
        t[2] = new Futbolista("3B", "Hazard", 25, 10);
        t[0] = new Futbolista("2C", "Fekir", 28, 12);
        t[4] = new Futbolista("5D", "Ronaldo", 34, 20);
        t[3] = new Futbolista("4E", "Messi", 34, 18);

        Arrays.sort(t);
        
        System.out.println("Por DNI: " + Arrays.deepToString(t));
        System.out.println("");
        Arrays.sort(t, new ComparaNombres());
        System.out.println("Por nombres: " + Arrays.deepToString(t));
        System.out.println("");
        Arrays.sort(t, new ComparaEdades());
        System.out.println("Por edades: " + Arrays.deepToString(t));
        
        Futbolista comprobacion = new Futbolista("4E", "Messi", 34, 18);
        System.out.println(t[0].compareTo(comprobacion));
        System.out.println(t[0].equals(comprobacion));
    }
    
}
