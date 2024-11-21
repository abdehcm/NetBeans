/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaspsp;

import java.util.concurrent.Exchanger;

/**
 *
 * @author abdelhachim
 */
public class Intercambio5Tareas {

    public static void main(String[] args) {

        Exchanger<String> exchanger = new Exchanger<>();

        Thread t1 = new Thread(new Tarea("Tarea 1", exchanger));
        Thread t2 = new Thread(new Tarea("Tarea 2", exchanger));
        Thread t3 = new Thread(new Tarea("Tarea 3", exchanger));
        Thread t4 = new Thread(new Tarea("Tarea 4", exchanger));
        Thread t5 = new Thread(new Tarea("Tarea 5", exchanger));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class Tarea implements Runnable {

    private String nombre;
    private Exchanger<String> exchanger;

    public Tarea(String nombre, Exchanger<String> exchanger) {
        this.nombre = nombre;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {

            String mensajeEnviado = "Mensaje desde " + nombre;
            String mensajeRecibido = exchanger.exchange(mensajeEnviado);

            System.out.println(nombre + " envió: " + mensajeEnviado);
            System.out.println(nombre + " recibió: " + mensajeRecibido);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
