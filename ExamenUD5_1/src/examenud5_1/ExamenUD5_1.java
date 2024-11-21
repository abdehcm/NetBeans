/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenud5_1;

/**
 *
 * @author abdelhachim
 */
public class ExamenUD5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CajaCarton cc1 = new CajaCarton(1, 1, 2);

        cc1.setEtiqueta("Dirección");
        System.out.println(cc1);
        System.out.println("Volumen CajaCarton1 cc1: " + cc1.calculaVolumen() + "\n");
        System.out.println("--------------------------");
         
        CajaCarton cc2 = new CajaCarton(1, 2, 2);
        
        cc2.setEtiqueta("Dirección");
        System.out.println(cc2);
        System.out.println("Volumen CajaCarton2 cc2: " + cc2.calculaVolumen());
    }

}
