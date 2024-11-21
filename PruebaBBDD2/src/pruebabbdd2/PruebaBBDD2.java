/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebabbdd2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abdelhachim
 */
public class PruebaBBDD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con;
        Statement sentencia;
        String sql;
        String url = "jdbc:mysql://localhost/instituto2DAM";

        int numero = 1;
        String nombre = "Abde";
        String curso = "1ºDAM";
        double notaMedia = 8.2;
        String fechaNac = "2003-02-26";

        try {
            con = DriverManager.getConnection(url, "root", "1234");

            sql = "INSERT INTO profesores (num, nombre, media, curso, fnac) VALUES (" + numero + ",'" + nombre + "'," + notaMedia + ",'" + curso + "','" + fechaNac + "')";
            sentencia = con.createStatement();
            sentencia.executeUpdate(sql);
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(PruebaBBDD2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
