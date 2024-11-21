/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud3;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Una funcion que se llama ECO y tiene un parametro llamado n y muestra n veces el mensaje ECO*/
public class EClase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las repeticiones de ECO: ");
        int ecoRepe = sc.nextInt();
        
        Eco(ecoRepe);
    }
    
    static void Eco(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("ECO");
            
        }
    }
    
}
