/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosud2_estructurascontrolflujo;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class ER3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int etiquetaArbolMasAlto, alturaArbolMasAlto;
        int etiqueta = 0;
        int altura;
        
        System.out.println("Introduzca altura del arbol(" + etiqueta + ")");
        altura = sc.nextInt();
        alturaArbolMasAlto = altura;
        etiquetaArbolMasAlto = 0;
        
        while (altura != -1){
            if (altura > alturaArbolMasAlto){
                alturaArbolMasAlto = altura;
                etiquetaArbolMasAlto = etiqueta;
            }
            etiqueta ++;
            System.out.println("Introduzca altura del arbol(" + etiqueta + ")");
            altura = sc.nextInt();
        }
        
        if (alturaArbolMasAlto == -1){
            System.out.println("No hay ningun arbol");
        }else{
            System.out.println("El arbol más alto mide: " + alturaArbolMasAlto);
        }
    }
    
}
