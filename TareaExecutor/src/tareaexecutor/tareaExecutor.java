/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaexecutor;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author abdelhachim
 */
public class tareaExecutor {
    
    public static void main(String[] args) {
        ExecutorService servicioEjecucion = Executors.newFixedThreadPool(5); // Pool con 5 hilos
        List<Future<String>> resultados = new ArrayList<>();

        // Crear tres tareas de tipo Callable
        Callable<String> tarea1 = () -> {
            Thread.sleep(1000);
            return "Tarea 1 completada";
        };

        Callable<String> tarea2 = () -> {
            Thread.sleep(1000);
            return "Tarea 2 completada";
        };

        Callable<String> tarea3 = () -> {
            Thread.sleep(1000);
            return "Tarea 3 completada";
        };

        // Crear tres tareas de tipo Runnable con Future
        Runnable tarea4 = () -> {
            try {
                Thread.sleep(1000);
                System.out.println("Tarea 4 completada");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable tarea5 = () -> {
            try {
                Thread.sleep(1000);
                System.out.println("Tarea 5 completada");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        try {
            // Enviar las tareas de tipo Callable
            resultados.add(servicioEjecucion.submit(tarea1));
            resultados.add(servicioEjecucion.submit(tarea2));
            resultados.add(servicioEjecucion.submit(tarea3));

            // Enviar las tareas de tipo Runnable (no capturamos el resultado en Future)
            servicioEjecucion.submit(tarea4);
            servicioEjecucion.submit(tarea5);

            // Mostrar resultados de los Callable
            for (Future<String> resultado : resultados) {
                System.out.println(resultado.get()); // Esperar el resultado de cada tarea
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            servicioEjecucion.shutdown(); // Cerrar el ExecutorService
        }
    }
    
}
