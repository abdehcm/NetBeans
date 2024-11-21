/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package abdemotor.Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JScrollPane;

/**
 *
 * @author abdelhachim
 */
public class ResultadoVehiculos extends JFrame {

    private JTable tablaVehiculos;
    private DefaultTableModel modeloTabla;

    public ResultadoVehiculos() {
        initComponents();
    }

    // Constructor que recibe el ResultSet de la consulta
    public ResultadoVehiculos(ResultSet rs) {

        setTitle("Resultados de Vehículos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Crear el modelo de la tabla
        modeloTabla = new DefaultTableModel();
        tablaVehiculos = new JTable(modeloTabla);

        // Añadir columnas al modelo
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Tipo Vehículo");
        modeloTabla.addColumn("Marca");
        modeloTabla.addColumn("Color");
        modeloTabla.addColumn("Precio");

        // Cargar los datos desde el ResultSet
        try {
            while (rs.next()) {
                // Obtener los valores de las columnas
                int id = rs.getInt("id");
                String tipoVehiculo = rs.getString("tipoVehiculo");
                String marca = rs.getString("marca");
                String color = rs.getString("color");
                int precio = rs.getInt("precio");

                // Añadir la fila al modelo de la tabla
                Object[] fila = {id, tipoVehiculo, marca, color, precio};
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Añadir la tabla a la ventana
        JScrollPane scrollPane = new JScrollPane(tablaVehiculos);
        add(scrollPane, BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultadoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultadoVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
