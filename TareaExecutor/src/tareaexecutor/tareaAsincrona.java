/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaexecutor;

/**
 *
 * @author abdelhachim
 */
public class tareaAsincrona {
     public static void main(String[] args) {
        // Crear 50 tareas de tipo Runnable
        Runnable tarea = () -> {
            try {
                Thread.sleep(500); // Simulación de trabajo
                System.out.println("Tarea ejecutada por: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Crear dos hilos y ejecutar 50 tareas en cada uno
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                new Thread(tarea).start();
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 25; i < 50; i++) {
                new Thread(tarea).start();
            }
        });

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();

        // Esperar a que ambos hilos terminen
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
