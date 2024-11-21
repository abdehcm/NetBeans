/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionescrud1;

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

public class Alumno {
    private final int TAM_NOMBRE = 30; 
    private int id; 
    private String nombre;
    private Date fNacimiento;
    private double notaMedia;
    private String curso; 

    public Alumno(int id) {
        this.id = id;
    }
    
    public Alumno(int id, String nombre, Date fNacimiento, double notaMedia, String curso) {
        this.id = id;
        setNombre(nombre);
        this.fNacimiento = fNacimiento;
        this.notaMedia = notaMedia;
        this.setCurso(curso);
    }

    static private Connection conexion() {
        Connection con=null;

        String url = "jdbc:mysql://localhost/Instituto";
        try {
            con = DriverManager.getConnection(url, "Pepe", "12345");
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }

        return con;
    }
    
    public void create() {
        Connection con = conexion();
        
        String sql = "INSERT INTO Alumnos (num, nombre, fnac, media, curso) " +
                     "             VALUES ( ?,    ?,     ?,     ?,     ?  )";

        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, id);
            sentencia.setString(2, nombre);
            sentencia.setDate(3, new java.sql.Date(fNacimiento.getTime()));
            sentencia.setDouble(4, notaMedia);
            sentencia.setString(5, curso);
            
            sentencia.executeUpdate();
            
            con.close(); 
        } catch (SQLException ex) {
            System.out.println("Error al insertar.");
        }
    }
    
    static public Alumno read(int id) {
        Alumno alumno = null;
        String sql = "SELECT *"
                   + "FROM Alumnos "
                   + "WHERE num = ?";
        try {
            Connection con = conexion();
            PreparedStatement sentencia = con.prepareStatement(sql);

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
    
    public void read() {
        String sql = "SELECT *"
                   + "FROM Alumnos "
                   + "WHERE num = ?";
        try {
            Connection con = conexion();
            PreparedStatement sentencia = con.prepareStatement(sql);

            sentencia.setInt(1, id); 

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) { 
                this.nombre = rs.getString("nombre");
                this.fNacimiento = rs.getDate("fNac");
                this.notaMedia = rs.getDouble("media");
                this.curso = rs.getString("curso");
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar un alumno.");
        }
    }
    
    public void update() {
        String sql = "UPDATE Alumnos "
                   + "SET nombre=?, fNac=?, media=?, curso=? "
                   + "WHERE num = ?";
        try {
            Connection con = conexion();
            PreparedStatement sentencia = con.prepareStatement(sql);

            sentencia.setString(1, this.nombre); 
            sentencia.setDate(2, (java.sql.Date)this.fNacimiento); 
            sentencia.setDouble(3, this.notaMedia); 
            sentencia.setString(4, this.curso); 
            sentencia.setInt(5, id); 

            sentencia.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un alumno.");
        }
    }
    
    public void delete() {
        String sql = "DELETE FROM Alumnos "
                   + "WHERE num = ?";
        try {
            Connection con = conexion();
            PreparedStatement sentencia = con.prepareStatement(sql);

            sentencia.setInt(1, id); 

            sentencia.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar un alumno.");
        }
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.substring(0, Math.min(TAM_NOMBRE, nombre.length()));
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso.substring(0, Math.min(2, nombre.length()));
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + 
               ", fNacimiento=" + fNacimiento + ", notaMedia=" + notaMedia + 
               ", curso=" + curso + '}';
    }
    
}
