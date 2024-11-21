/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author abdelhachim
 */
/*Leer y alamcenar n números enteros en una tabla apartir de la que se construiran otras 2 tablas 
con los elemntos con valores pares e impares de la primera. 
Las tablas pares e impares hay que mostrarlas ordenadas*/
public class EjercicioPractica7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam;
        
        System.out.print("Cuántos números desea guardar: ");
        tam = sc.nextInt();
        int[] numeros = new int[tam];
        
        System.out.println("Introduce los números a guardar: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("Lista pares: " + Arrays.toString(rellenarPares(numeros)));
        System.out.println("");
        System.out.println("Lista impares: " + Arrays.toString(rellenarImpares(numeros)));
        
    }
    
    public static int[] rellenarPares(int[] num) {
        int longitudOriginal = num.length;
        int[] pares = new int[longitudOriginal];
        int longitudNueva = 0;
        
        for (int i = 0; i < num.length; i++) {
            boolean par = false;
            int j = 0;
            
            while (i < longitudNueva && num[i] % 2 == 0) {
                if (num[i] == pares[j]) {
                    par = true;
                }
                j++;
            }
            
            if (num[i] % 2 == 0) {
                pares[longitudNueva++] = num[i];
            }
        }
        
        return Arrays.copyOf(pares, longitudNueva);
    }
    
    public static int[] rellenarImpares(int[] num) {
        int longitudOriginal = num.length;
        int[] impares = new int[longitudOriginal];
        int longitudNueva = 0;
        
        for (int i = 0; i < num.length; i++) {
            boolean impar = false;
            int j = 0;
            
            while (i < longitudNueva && num[i] % 2 != 0) {
                if (num[i] == impares[j]) {
                    impar = true;
                }
                j++;
            }
            
            if (num[i] % 2 != 0) {
                impares[longitudNueva++] = num[i];
            }
        }
        
        return Arrays.copyOf(impares, longitudNueva);
    }
    
}
