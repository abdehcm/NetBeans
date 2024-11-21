/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estirarseapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author abdelhachim
 */
public class EstirarseApp {

    private static final int INTERVALO_MINUTOS = 30;  // Intervalo de recordatorio (30 minutos)
    private static final int MILISEGUNDOS_POR_MINUTO = 60000; // 60 segundos * 1000 ms

    public static void main(String[] args) {
        // Comprobar si el sistema admite SystemTray
        if (!SystemTray.isSupported()) {
            System.out.println("El sistema no admite notificaciones.");
            return;
        }

        try {
            // Crear un icono en la bandeja del sistema
            SystemTray systemTray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().createImage("fondo_login.jpg");  // Puedes usar una imagen de tu elección

            PopupMenu popup = new PopupMenu();
            MenuItem salir = new MenuItem("Salir");
            salir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            popup.add(salir);

            TrayIcon trayIcon = new TrayIcon(image, "Recordatorio de Estirarse", popup);
            trayIcon.setImageAutoSize(true);
            systemTray.add(trayIcon);

            // Crear un temporizador que ejecute la tarea cada 30 minutos
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    // Mostrar notificación
                    trayIcon.displayMessage("Recordatorio", "¡Es hora de levantarse y estirar las piernas!", TrayIcon.MessageType.INFO);
                }
            }, 0, INTERVALO_MINUTOS * MILISEGUNDOS_POR_MINUTO);  // Ejecución inicial y cada 30 minutos

        } catch (AWTException e) {
            System.out.println("Error al añadir el icono a la bandeja del sistema.");
            e.printStackTrace();
        }
    }
}
