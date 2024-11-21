/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuentaCorriente2;

import java.awt.CardLayout;

/**
 *
 * @author abdelhachim
 */
/*Clase CuentaCorriente (7/02)

Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, 
así como el saldo. Las operaciones típicas con una cuenta corriente son:
Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
Sacar dinero: el método debe indicar (devolviendo true o false) si ha sido posible llevar a cabo la operación, 
si existe saldo suficiente. Si es posible, se decrementa el saldo.
Ingresar dinero: se incrementa el saldo.
Mostrar información: muestra la información disponible de la cuenta corriente.*/

 /*Continuación CuentaCorriente (para 8/02)

En la clase CuentaCorriente, sobrecargar los constructores para poder crear objetos también de las dos siguientes maneras:
Con el DNI y un saldo inicial
Con el DNI, nombre y saldo inicial
Usar, cuando se pueda, la reutilización de constructores mediante el uso de “this”.
Escribir un programa que compruebe, como consideres, el funcionamiento de los métodos.
 */
 /*Modificar la visibilidad de cuentaCorriente para que sea visible desde clases externas y la visibilidad de sus atributos
para que saldo no sea visible para otras clases, nombre sea publico y dni solo sea visible por clases vecinas */

 /*Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco
añadir un atributo que almacene el nombre del banco que es unico en la clase cuentaCorriente
diseñar un metodo que permita modificar y recuperar el nombre del banco al que 
pertenecen todas las cuentas corrientes*/
public class Principal {

    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("29628679X", "Abdel");
        CuentaCorriente c2 = new CuentaCorriente("29628679W", 1800.50);
        CuentaCorriente c3 = new CuentaCorriente("29628680F", "Foad");
        
        //CuentaCorriente C1
        c1.setEntidad("BBVA");
        c1.setSaldo(1200);
        System.out.println(c1.sacarDinero(450));
        System.out.println("\nSu información c1: ");
        c1.mostrarInformacion();
        
        //CuentaCorriente C2
        c2.setSaldo(1900.5);
        c2.ingresarDinero(400.4);
        System.out.println("\nSu información c2: ");
        c2.mostrarInformacion();
        
        //CuentaCorriente C3
        System.out.println("\nSu información c3: ");
        c3.setEntidad("CaixaBank");
        c3.setSaldo(600.89);
        c3.mostrarInformacion();
    }

}
