/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnodaoenmac;

import java.util.Date;

/**
 *
 * @author abdelhachim
 */
public class AlumnoDAOenMAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno a;
        AlumnoDAO dao = new AlumnoDAO();
        
        Date hoy = new Date();
        System.out.println(hoy);
        
        a = new Alumno (4, "Ana", hoy, 6.5, "2DAM");
        dao.create(a);
        a = new Alumno (5, "Juan", hoy, 7.5, "1DAM");
        dao.create(a);
        a = new Alumno (6, "Luis", hoy, 9.5, "2DAM");
        dao.create(a);
        
        a = dao.read(5);
        System.out.println(a);
        
        a = dao.read(4);
        System.out.println(a);
        
        a.setNombre("Abdel Hachim Leftakh");
        a.setNotaMedia(10.0);
        dao.update(a);
        
        dao.delete(6);
        dao.delete(1);
        dao.desconectar();
    }
    
}
