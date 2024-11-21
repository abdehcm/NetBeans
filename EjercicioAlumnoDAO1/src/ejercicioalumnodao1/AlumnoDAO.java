/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioalumnodao1;

/**
 *
 * @author martarobina
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class AlumnoDAO {

    private static Connection conectar() {
        Connection con = null;

        String url = "jdbc:mysql://localhost/Instituto";
        try {
            con = DriverManager.getConnection(url, "Pepe", "12345");
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }

        return con;
    }

    public static void create(Alumno alumno) {
        if (alumno != null) {
            Connection conexion = conectar();

            String sql = "INSERT INTO Alumnos (num, nombre, fnac, media, curso) "
                    + "             VALUES ( ?,    ?,     ?,     ?,     ?  )";

            try {
                PreparedStatement sentencia = conexion.prepareStatement(sql);
                sentencia.setInt(1, alumno.getId());
                sentencia.setString(2, alumno.getNombre());
                sentencia.setDate(3, new java.sql.Date(alumno.getfNacimiento().getTime()));
                sentencia.setDouble(4, alumno.getNotaMedia());
                sentencia.setString(5, alumno.getCurso());

                sentencia.executeUpdate();

                conexion.close(); 
            } catch (SQLException ex) {
                System.out.println("Error al insertar.");
            }
        }
    }

    public static Alumno read(int id) {
        Alumno alumno = null;
        String sql = "SELECT *"
                + "FROM Alumnos "
                + "WHERE num = ?";
        try {
            Connection conexion = conectar();

            PreparedStatement sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, id); 

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) { 
                String nombre = rs.getString("nombre");
                Date fNacimiento = rs.getDate("fNac");
                Double notaMedia = rs.getDouble("media");
                String curso = rs.getString("curso");

                alumno = new Alumno(id, nombre, fNacimiento, notaMedia, curso);
                conexion.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar un alumno.");
        }

        return alumno; 
    }

    public static void update(Alumno alumno) {
        if (alumno != null) {
            String sql = "UPDATE Alumnos "
                    + "SET nombre=?, fNac=?, media=?, curso=? "
                    + "WHERE num = ?";
            try {
                Connection conexion = conectar();
                PreparedStatement sentencia = conexion.prepareStatement(sql);

                sentencia.setString(1, alumno.getNombre());
                sentencia.setDate(2, (java.sql.Date) alumno.getfNacimiento());
                sentencia.setDouble(3, alumno.getNotaMedia());
                sentencia.setString(4, alumno.getCurso());
                sentencia.setInt(5, alumno.getId()); 

                sentencia.executeUpdate();
                conexion.close();
            } catch (SQLException ex) {
                System.out.println("Error al actualizar un alumno.");
            }
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM Alumnos "
                + "WHERE num = ?";
        try {
            Connection conexion = conectar();
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, id); 

            sentencia.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar un alumno.");
        }
    }
}
