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
/*Pedri al ususario un numero entre 1 y 7 y mostrar el nombre del dia de la semana al que correseponde*/
public class Ejercicio8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int numS;
        System.out.println("DÍAS DE LA SEMANA");
        System.out.println("Introduce un número del 1 al 7");
        numS = sc.nextInt();
        
        switch (numS) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número Incorrecto");
        }
    }
    
}
