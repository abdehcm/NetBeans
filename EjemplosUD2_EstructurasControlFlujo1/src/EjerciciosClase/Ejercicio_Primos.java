/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosClase;

import java.util.Scanner;

/**
 *
 * @author martarobina
 */
public class Ejercicio_Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
	// Bandera que se pondrá a true si se encuentra algún valor por el que sea divisible un número distinto de 1 o del propio número
        boolean noPrimo = false; 
        int j;
        
	// Solicitamos al usuario el número tantas veces como sea necesario hasta que se introduzca un valor positivo
        do{
            System.out.println("Introduce un número entero y positivo");
            num = sc.nextInt();
        }while(num<=0);
        
        System.out.printf("Los primos entre 1 y " + num + " son:\n");
        // El número 1 es primo, así que siempre saldrá en la lista 
        System.out.println("1 es primo");
        
        // Bucle externo que recorre los números entre 2 y num (el 1 ya lo hemos mostrado por eso empezamos en 2)
        for(int i=2;i<=num;i++){
            // Bucle interno que recorre los números desde el 2 al (i-1) 
            // para ver si i es divisible por algún número que no sea 1 e i.
	    // Si encuentra algún valor por el que sea divisible, pone la bandera a true y salimos del bucle
	    // Por ejemplo, si i=6, tendría que recorrer los números del 2 al 5. Pero, al llegar al 3, 6%3 daría 0 
            // y pondría la bandera a true, indicando que el 6 no es primo.
            // Para i=7, por ejemplo, recorrería todos los valores del 2 al 6 y no se encontraría ningún valor por el que 7 sea divisible,
            // por lo que la bandera noPrimo quedaría a false, lo que indicaría que 7 sí es primo.
            j=2;
            while(j<=(i-1) && noPrimo==false){
                if(i%j==0){
                    noPrimo = true;
                }
                j++;
            }
            if(noPrimo==false){
                System.out.println(i + " es primo");
            }
            // Reseteamos la bandera para la comprobación del siguiente valor de i
            noPrimo = false;
        } 
    }
}
