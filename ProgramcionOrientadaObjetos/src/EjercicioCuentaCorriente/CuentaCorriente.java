/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuentaCorriente;

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

    String dni;
    public String nombre;
    private double saldo;
    static private String entidad;
    Gestor gestor;

    CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        /*this.entidad = entidad;*/
    }

    CuentaCorriente(String dni, double saldo) {
        this(dni, null, 0);
        /*this.dni = dni;
        this.saldo = saldo;*/
    }

    CuentaCorriente(String dni, String nombre) {
        this(dni, nombre, 0);
        /*this.dni = dni;
        this.nombre = nombre;*/
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String nuevoNombre) {
        entidad = nuevoNombre;
    }

    boolean sacarDinero(double saldo) {
        boolean retiro = false;
        if (saldo > 0) {
            retiro = true;
        } else {
            retiro = false;
        }
        return retiro;
    }

    void ingresarDinero(double saldo, double ingreso) {
        boolean retiro = false;
        if (ingreso > 0) {
            saldo += ingreso;
            System.out.println("Su saldo es: " + saldo);
        } else {
            System.out.println("No puedes ingresar 0 o menos ");
        }
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    void mostrarInformacion(/*String dni, String nombre, double saldo*/) {
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su DNI: " + dni);
        System.out.println("Su saldo: " + saldo);
    }
}
