/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosClase;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
//Pedir 10 numero y mostrar la media
public class EClase6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;
        double media;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Introduce 10 números: ");
            num = sc.nextInt();
            suma += num;
        }
        
        media = (double)suma/10;
        System.out.println("La media es: "+media);
        
    }

}

//Solicitar un numero del 1 al 10 y mostrar la tabla de multiplicar de dicho numero
