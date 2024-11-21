/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamenherencia_cajas;

/**
 *
 * @author marta
 */
public class EjercicioExamenHerencia_Cajas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CajaCarton cc1 = new CajaCarton(1,1,2);
        CajaCarton cc2 = new CajaCarton(1,2,2);
        
        cc1.setEtiqueta("Dirección");
        cc2.setEtiqueta("Dirección");
        
        System.out.println(cc1);
        System.out.println("Volumen cc1: " + cc1.calculaVolumen());
        
        System.out.println(cc2);
        System.out.println("Volumen cc1: " + cc2.calculaVolumen());
    }
    
}
