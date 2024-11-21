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
public class ER3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        int numSecreto = (int)(Math.random()*100 + 1);
        //System.out.println(numSecreto);
        
        System.out.println("Introduzca un número entre 1 y 100");
        num = sc.nextInt();
        
        while (numSecreto!= num && num != -1) {
            if(num > numSecreto){
                System.out.println("Mayor");
            }else{
                System.out.println("Menor");
            }
            
            System.out.println("Introduzca otro número: ");
            num = sc.nextInt();            
        }
        
        if(numSecreto == num){
            System.out.println("Enhorbuena...");
        }else{
            
        }
    }
    
}
