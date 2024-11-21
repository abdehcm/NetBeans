/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareabbdd2;

/**
 *
 * @author marta
 */

import java.sql.*;

public class EmpleadoDAO {
    
    Connection con;
    
    EmpleadoDAO (){
        con = conecta();
    }
    private Connection conecta() {
        Connection con = null;

        String url = "jdbc:mysql://localhost/EmpresaDAM";
        try {
            con = DriverManager.getConnection(url, "root", "1234");
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }

        return con;
    }
    
    void desconecta(){
        try{
            con.close();
        } catch (SQLException ex){
            System.out.println("Error al desconectar.");
        }
    }
    
    public void create(Empleado empleado) {
        if (empleado != null) {
            String sql = "INSERT INTO "
                    + "empleados (numemp, nombre, edad, oficina, puesto, contrato) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement sentencia = con.prepareStatement(sql);
                sentencia.setInt(1, empleado.getNumemp());
                sentencia.setString(2, empleado.getNombre());
                sentencia.setInt(3, empleado.getEdad());
                sentencia.setInt(4, empleado.getOficina());
                sentencia.setString(5, empleado.getPuesto());
                sentencia.setDate(6, empleado.getContrato());

                sentencia.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("Error al insertar un empleado.");
            }
        }
    }
    
    public Empleado read(int numemp) {
        Empleado empleado = null;
       
            String sql = "SELECT * "
                    + "FROM empleados "
                    + "WHERE numemp = ?";
            try {
                PreparedStatement sentencia = con.prepareStatement(sql);
                sentencia.setInt(1, numemp);
                
                ResultSet rs = sentencia.executeQuery();
                
                
                if (rs.next()) {
                    empleado = new Empleado(numemp,
                            rs.getString("nombre"),
                            rs.getInt("edad"),
                            rs.getInt("oficina"),
                            rs.getString("puesto"),
                            rs.getDate("contrato"));
                }
            } catch (SQLException ex) {
                System.out.println("Error al insertar un empleado.");
            }
            
        return empleado;
    }
    
    public void update(Empleado empleado) {
        if (empleado != null) {
            String sql = "UPDATE empleados "
                    + "SET nombre=?, edad=?, oficina=?, puesto=?, contrato=? "
                    + "WHERE numemp=?";
            try {
                PreparedStatement sentencia = con.prepareStatement(sql);
                sentencia.setString(1, empleado.getNombre());
                sentencia.setInt(2, empleado.getEdad());
                sentencia.setInt(3, empleado.getOficina());
                sentencia.setString(4, empleado.getPuesto());
                sentencia.setDate(5, empleado.getContrato());
                sentencia.setInt(6, empleado.getNumemp());

                sentencia.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("Error al actualizar un empleado.");
                System.out.println(ex);
            }
        }
    }
    
    public void delete (int numemp) {
        String sql = "DELETE FROM empleados WHERE numemp = ?";
        
        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, numemp);

            sentencia.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar un empleado");
        }
    }
}
