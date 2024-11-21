/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareabbdd2;

import java.util.Scanner;
import java.sql.Date;

/**
 *
 * @author marta
 */
public class TareaBBDD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoDAO dao = new EmpleadoDAO();
        // Apartado A: Leer y Crear
        System.out.println("Introduzca número del empleado a insertar.");
        
        System.out.print("Número de empleado: ");
        int numemp = new Scanner(System.in).nextInt();
        
        Empleado empleado = dao.read(numemp);
        
        if (empleado != null) {
            System.out.println("El numemp ya existe en la BD.");
            System.out.println(empleado);
        } else {
            System.out.println("Introduzca el resto de datos del empleado.");
            System.out.print("Nombre: ");
            String nombre = new Scanner(System.in).nextLine();

            System.out.print("Edad: ");
            int edad = new Scanner(System.in).nextInt();

            System.out.print("Oficina: ");
            int oficina = new Scanner(System.in).nextInt();

            System.out.print("Puesto:");
            String puesto = new Scanner(System.in).nextLine();        

            System.out.print("Fecha contrato:");
            String fcontrato = new Scanner(System.in).nextLine();
            //Date fcontrato = Date.valueOf("2021-02-27");
            empleado = new Empleado(numemp, nombre, edad, oficina, puesto, Date.valueOf(fcontrato));

            dao.create(empleado);            
        }
        // Apartado B: Modificar (Cambiar a un empleado de una oficina a otra, solicitando su número de empleado y la oficina de destino)
        System.out.println("Introduzca número del empleado para el cambio de oficina.");

        System.out.print("Número de empleado: ");
        numemp = new Scanner(System.in).nextInt();
        
        System.out.print("Oficina de destino: ");
        int numof = new Scanner(System.in).nextInt();
        
        empleado = dao.read(numemp);
        
        if(empleado!=null)
        {
            empleado.setOficina(numof);
            dao.update(empleado);
        } else {
            System.out.println("El número de empleado no existe.");
        }
        
        // Apartado C: Borrar empleado
        System.out.print("Número del empleado a borrar: ");
        numemp = new Scanner(System.in).nextInt();

        dao.delete(numemp);
        
        dao.desconecta();
    }
    
}
