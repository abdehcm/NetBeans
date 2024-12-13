/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadpropuesta31;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author alumnadotarde
 */
public class ActividadPropuestaServidor31 {

    /**
     * @param args the command line arguments
     */
    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public ActividadPropuestaServidor31(int puerto) throws IOException {
        serverSocket = new ServerSocket(puerto);
    }

    public void start() throws IOException {
        System.out.println("(Servidor) Esperando conexiones...");
        socket = serverSocket.accept();
        System.out.println("(Servidor) Conexión establecida.");

        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        // Recibe la ruta del archivo 
        String rutaArchivo = in.readLine();
        System.out.println("(Servidor) Cliente solicita el archivo: " + rutaArchivo);

        // Intentar leer el archivo y lo envia al cliente
        try (BufferedReader archivo = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = archivo.readLine()) != null) {
                out.println(linea); // Enviar línea por línea al cliente
            }
            out.println("FIN_ARCHIVO"); // Marcar el fin del archivo
            System.out.println("(Servidor) Archivo enviado correctamente.");
        } catch (FileNotFoundException e) {
            out.println("ERROR: Archivo no encontrado.");
            System.out.println("(Servidor) Error: Archivo no encontrado.");
        } catch (IOException e) {
            out.println("ERROR: Problema al leer el archivo.");
            System.out.println("(Servidor) Error: Problema al leer el archivo.");
        }
    }

    public void stop() throws IOException {
        System.out.println("(Servidor) Cerrando conexiones...");
        in.close();
        out.close();
        socket.close();
        serverSocket.close();
        System.out.println("(Servidor) Conexiones cerradas.");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ActividadPropuestaServidor31 servidor = new ActividadPropuestaServidor31(49171);
            servidor.start();
            servidor.stop();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
