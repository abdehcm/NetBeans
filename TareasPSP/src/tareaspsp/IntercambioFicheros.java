/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaspsp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author abdelhachim
 */
public class IntercambioFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Define las rutas de los dos archivos a intercambiar
        Path file1 = Path.of("/Users/abdelhachim/NetBeansProjects/TareasPSP/archivo1.txt");
        Path file2 = Path.of("/Users/abdelhachim/NetBeansProjects/TareasPSP/archivo2.txt");
        
        try {
            // Crea un archivo temporal
            Path tempFile = Files.createTempFile("temp", ".tmp");

            // Copia el contenido de file1 al archivo temporal
            Files.copy(file1, tempFile, StandardCopyOption.REPLACE_EXISTING);

            // Copia el contenido de file2 a file1
            Files.copy(file2, file1, StandardCopyOption.REPLACE_EXISTING);

            // Copia el contenido del archivo temporal a file2
            Files.copy(tempFile, file2, StandardCopyOption.REPLACE_EXISTING);

            // Borra el archivo temporal
            Files.delete(tempFile);

            System.out.println("Intercambio completado correctamente.");
        } catch (IOException e) {
            System.err.println("Error durante el intercambio: " + e.getMessage());
        }
    }
    
}
