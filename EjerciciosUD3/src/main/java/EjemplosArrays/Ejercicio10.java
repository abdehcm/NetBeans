/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*Desarrollar el juego “la cámara secreta” que consiste en abrir una cámara mediante su combinación secreta, 
que está formada por una combinación de dígitos del 1 al 5. 
El jugador especificará cuál es la longitud de la combinación; a mayor longitud, mayor será la dificultad del juego.
La aplicación genera, de forma aleatoria, una combinación secreta que el usuario tendrá que acertar. 
En cada intento se muestra como pista, para cada dígito de la combinación introducido por el jugador, 
si es mayor, menor o igual que el correspondiente en la combinación secreta.*/
package EjemplosArrays;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author alu_tarde
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int longitud;
        
        System.out.println("Introduce la longitud: ");
        longitud = sc.nextInt();
        
        int [] camaraSecreta = new int [longitud];
    }

}
