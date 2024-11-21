/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareabbdd1;

/**
 *
 * @author marta
 */

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;
        
public class TareaBBDD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con;
        
        String url = "jdbc:mysql://localhost/empresa";
        try {
            // Conecta, consulta y muestra todos, y consulta y muestra empleados por edad usando una sentencia parametrizada
            con = DriverManager.getConnection(url, "root", "1234");
        
            // Apartado A
            String sql = "SELECT * FROM empleados ";
            
            Statement sentencia = con.createStatement();

            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) { 
                 int numemp = rs.getInt("numemp");
                String nombre = rs.getString("nombre");
                 int edad = rs.getInt("edad");
                int oficina = rs.getInt("oficina");
                String puesto = rs.getString("puesto");
                LocalDate contrato = rs.getDate("contrato").toLocalDate();
                
                System.out.println("Empleado: " + 
                        numemp + ", " +
                        nombre + ", " +
                        edad + " años, " +
                        "oficina (" + oficina + "), " +
                        puesto + ", " +
                        " trabajando desde " + contrato);
            }
            
            // Apartado B
            
            System.out.println("Edad inferior: ");
            int edadInferior = new Scanner(System.in).nextInt();

            System.out.println("Edad superior: ");
            int edadSuperior = new Scanner(System.in).nextInt();
            
            muestraEmpleadosXEdad(edadInferior, edadSuperior, con);           
     
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al consultar los empleados.");
        }
    }

     private static void muestraEmpleadosXEdad(int min, int max, Connection con) {
        String sql = "SELECT nombre, edad "
                   + "FROM empleados "
                   + "WHERE edad BETWEEN ? AND ?";
        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, min);
            sentencia.setInt(2, max);

            ResultSet rs = sentencia.executeQuery();
            
            while (rs.next()) { 
                 String nombre = rs.getString("nombre");
                 int edad = rs.getInt("edad");
                 
                System.out.println("Empleado: "
                        + nombre + ", " +
                        edad + " años");
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al consultar los empleados.");
        }
    }
}
