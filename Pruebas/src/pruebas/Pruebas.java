/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.sql.*;

/**
 *
 * @author abdelhachim
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    // Configuraciones de conexión
    private static final String URL = "jdbc:mysql://localhost:3306/abdemotor";
    private static final String USUARIO = "root"; // Cambia según sea necesario
    private static final String PASSWORD = "1234"; // Cambia según sea necesario

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Conectar a la base de datos
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conexión exitosa");

            // Crear una declaración para ejecutar consultas
            stmt = con.createStatement();

            // Realizar una consulta para obtener todos los coches
            String consulta = "SELECT * FROM coche";
            rs = stmt.executeQuery(consulta);
            System.out.println("Resultados de la consulta 'SELECT * FROM coche':");
            while (rs.next()) {
                int id = rs.getInt("id");
                String tipoVehiculo = rs.getString("tipoVehiculo");
                String marca = rs.getString("marca");
                String color = rs.getString("color");
                System.out.println("ID: " + id + ", Tipo Vehículo: " + tipoVehiculo + ", Marca: " + marca + ", Color: " + color);
            }

            // Realizar una consulta para obtener un coche específico por ID
            int idConsulta = 23; // Cambia este valor para probar
            String consultaEspecifica = "SELECT * FROM coche WHERE id = " + idConsulta;
            rs = stmt.executeQuery(consultaEspecifica);
            System.out.println("\nResultados de la consulta 'SELECT * FROM coche WHERE id = " + idConsulta + "':");
            if (rs.next()) {
                int id = rs.getInt("id");
                String tipoVehiculo = rs.getString("tipoVehiculo");
                String marca = rs.getString("marca");
                String color = rs.getString("color");
                System.out.println("ID: " + id + ", Tipo Vehículo: " + tipoVehiculo + ", Marca: " + marca + ", Color: " + color);
            } else {
                System.out.println("No se encontró un coche con ID: " + idConsulta);
            }

            // Realizar una inserción
            String insercion = "INSERT INTO coche (tipoVehiculo, marca, color) VALUES ('SUV', 'BMW', 'Negro')";
            stmt.executeUpdate(insercion);
            System.out.println("\nUn coche ha sido insertado.");

            // Mostrar todos los coches nuevamente para verificar la inserción
            rs = stmt.executeQuery("SELECT * FROM coche");
            System.out.println("Resultados después de la inserción:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String tipoVehiculo = rs.getString("tipoVehiculo");
                String marca = rs.getString("marca");
                String color = rs.getString("color");
                System.out.println("ID: " + id + ", Tipo Vehículo: " + tipoVehiculo + ", Marca: " + marca + ", Color: " + color);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
