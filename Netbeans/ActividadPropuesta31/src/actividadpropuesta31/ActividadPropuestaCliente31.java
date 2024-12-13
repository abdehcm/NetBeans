/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpropuesta31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author alumnadotarde
 */
public class ActividadPropuestaCliente31 {

    private String serverIP;
    private int serverPort;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public ActividadPropuestaCliente31(String serverIP, int serverPort) {
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }

    public void start() throws IOException {
        System.out.println("(Cliente) Estableciendo conexión...");
        socket = new Socket(serverIP, serverPort);

        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        System.out.println("(Cliente) Conexión establecida.");
    }

    public void stop() throws IOException {
        System.out.println("(Cliente) Cerrando conexiones...");
        in.close();
        out.close();
        socket.close();
        System.out.println("(Cliente) Conexiones cerradas.");
    }

    public static void main(String[] args) {
        ActividadPropuestaCliente31 cliente = new ActividadPropuestaCliente31("127.0.0.1", 49171);
        try {
            cliente.start();

            // Solicitar al usuario la ruta del archivo
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("(Cliente) Introduce la ruta completa del archivo: ");
            String rutaArchivo = teclado.readLine();

            // Enviar la ruta del archivo al servidor
            cliente.out.println(rutaArchivo);

            // Leer y mostrar el contenido recibido del servidor
            String linea;
            System.out.println("(Cliente) Contenido del archivo recibido:");
            while ((linea = cliente.in.readLine()) != null) {
                if ("FIN_ARCHIVO".equals(linea)) {
                    break; // Detectar fin del archivo
                }
                System.out.println(linea);
            }

            cliente.stop();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
