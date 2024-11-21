/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuentaCorriente2;

import java.util.Scanner;

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
public class CuentaCorriente {

    private String dni;
    public String nombre;
    private double saldo;
    private String entidad;

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
        this.entidad = "Santander";
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, null);
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, String nombre) {
        this(dni, nombre, 0);
        //this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getDni() {
        return dni;
    }
    
    

    boolean sacarDinero(double retiro) {
        boolean retirar = false;
        if (retiro < saldo) {
            saldo = saldo - retiro;
            retirar = true;
            System.out.println("Saldo: " + saldo);
        } else {
            retirar = false;
            System.out.println("Saldo: " + saldo);
        }
        return retirar;
    }

    void ingresarDinero(double ingreso) {
        
        if (ingreso > 0) {
            saldo += ingreso;
            System.out.println("Saldo: " + saldo);
        } else {
            System.out.println("El ingreso no fue posible");
            System.out.println("Saldo: " + saldo);
        }
    }

    void mostrarInformacion() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: " + saldo);
        System.out.println("Banco: " + entidad);
    }

}
