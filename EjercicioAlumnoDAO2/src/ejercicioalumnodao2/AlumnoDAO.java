/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioalumnodao2;

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
    private Connection conexion;
    private final String USUARIO="root";
    private final String PASSWORD="1234";
    private final String MAQUINA = "localhost";
    private final String BD = "instituto1DAM";
    
    public AlumnoDAO() {
        conexion = conectar();
    }
        

    private Connection conectar() {
        Connection con = null;

        String url = "jdbc:mysql://" + MAQUINA + "/" + BD;
        try {
            con = DriverManager.getConnection(url, USUARIO, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }

        return con;
    }
    
    public void desconectar() {

        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al desconectar del SGBD.");
        }
    }

    public void create(Alumno alumno) {
        if (alumno != null) {
            String sql = "INSERT INTO alumnos (num, nombre, fnac, media, curso) "
                    + "VALUES ( ?,    ?,     ?,     ?,     ?  )";

            try {
                PreparedStatement sentencia = conexion.prepareStatement(sql);
                sentencia.setInt(1, alumno.getId());
                sentencia.setString(2, alumno.getNombre());
                sentencia.setDate(3, new java.sql.Date(alumno.getfNacimiento().getTime()));
                sentencia.setDouble(4, alumno.getNotaMedia());
                sentencia.setString(5, alumno.getCurso());

                sentencia.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("Error al insertar.");
            }
        }
    }

    public Alumno read(int id) {
        Alumno alumno = null;
        String sql = "SELECT *"
                + "FROM alumnos "
                + "WHERE num = ?";
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, id); 

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) { 
                String nombre = rs.getString("nombre");
                Date fNacimiento = rs.getDate("fNac");
                Double notaMedia = rs.getDouble("media");
                String curso = rs.getString("curso");

                alumno = new Alumno(id, nombre, fNacimiento, notaMedia, curso);
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar un alumno.");
        }

        return alumno; 
    }

    public  void update(Alumno alumno) {
        if (alumno != null) {
            String sql = "UPDATE alumnos "
                    + "SET nombre=?, fNac=?, media=?, curso=? "
                    + "WHERE num = ?";
            try {
                PreparedStatement sentencia = conexion.prepareStatement(sql);

                sentencia.setString(1, alumno.getNombre());
                sentencia.setDate(2, (java.sql.Date) alumno.getfNacimiento());
                sentencia.setDouble(3, alumno.getNotaMedia());
                sentencia.setString(4, alumno.getCurso());
                sentencia.setInt(5, alumno.getId()); 

                sentencia.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("Error al actualizar un alumno.");
            }
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM alumnos "
                + "WHERE num = ?";
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, id); 

            sentencia.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar un alumno.");
        }
    }
}
