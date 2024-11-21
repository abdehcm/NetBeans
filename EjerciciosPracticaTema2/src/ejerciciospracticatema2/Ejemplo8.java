/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospracticatema2;

/**
 *
 * @author abdelhachim
 */
//Mostrar la suma de los 10 primero numeros impares
public class Ejemplo8 {

    public static void main(String[] args) {
        int suma = 0;
        impares(suma);
    }

    static void impares(int sum) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                sum = sum + i;

            }
        }
        System.out.println("Suma 10 primeros impares = " + sum);
    }

}
