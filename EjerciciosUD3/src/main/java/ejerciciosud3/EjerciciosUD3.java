/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ejerciciosud3;

/**
 *
 * @author alu_tarde
 */
public class EjerciciosUD3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        tresSaludos(2);
        cuatroSaludos(2, true);

    }

    static void tresSaludos(int veces) {
        System.out.println("Voy a saludar 3 veces");
        for (int i = 0; i < veces; i++) {
            System.out.println("Hola");
        }

    }
    
        static void cuatroSaludos(int veces, boolean imprimir) {
        System.out.println("Voy a saludar" + veces + " veces");
        for (int i = 0; i < veces; i++) {
            System.out.println("Hola");
        }

    }
}
