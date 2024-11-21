/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionescrud1;

/**
 *
 * @author martarobina
 */
import java.util.Date;

public class OperacionesCRUD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a;
        Date hoy = new Date();
        System.out.println(hoy);
        
        a = new Alumno(990, "Ana", hoy, 6.7, "1A");
        a.create();
        a = new Alumno(991, "Juan", hoy, 7.8, "2A");
        a.create();
        a = new Alumno(992, "Luis", hoy, 8.9, "1B");
        a.create();
        
        
        a = Alumno.read(991);
        System.out.println(a);
        
        a = new Alumno(990);
        a.read();
        System.out.println(a);
        
        a.setNombre("Ana María Pérez García");
        a.setNotaMedia(10.0);
        a.update();
        
        a = Alumno.read(992);
        a.delete();
    }
    
}
