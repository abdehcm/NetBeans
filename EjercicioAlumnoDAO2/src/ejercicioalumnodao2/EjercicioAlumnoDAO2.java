/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioalumnodao2;

/**
 *
 * @author martarobina
 */
import java.util.Date;

public class EjercicioAlumnoDAO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a;
        AlumnoDAO dao = new AlumnoDAO();
        
        Date hoy = new Date();
        System.out.println(hoy);
        
        a = new Alumno(990, "Ana", hoy, 6.7, "1A");
        dao.create(a);
        a = new Alumno(991, "Juan", hoy, 7.8, "2A");
        dao.create(a);
        a = new Alumno(992, "Luis", hoy, 8.9, "1B");
        dao.create(a);
        
        
        a = dao.read(991);
        System.out.println(a);
        
        a = dao.read(990);
        System.out.println(a);
        
        a.setNombre("Ana María Pérez García");
        a.setNotaMedia(10.0);
        dao.update(a);
        
        dao.delete(992);
        dao.desconectar();
        
        // En este punto del programa, la variable dao apunta a un objeto AlumnoDAO 
        // pero con la conexión cerrada, por lo que no funcionarían las operaciones CRUD.
        // En caso de querer volver a ejecutar algunas de esas operaciones, 
        // habría que crear otro objeto para volverse a conectar a la bbdd
    }
    
}
