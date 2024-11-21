/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package abdemotor.Interfaz;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author alumnadotarde
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    PanelConImagen fondo = new PanelConImagen();

    public PantallaPrincipal() {
        this.setContentPane(fondo);
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelTipoVehiculo = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelColor = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jComboBoxColor = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabelTipoVehiculo.setFont(new java.awt.Font("Helvetica", 1, 25)); // NOI18N
        jLabelTipoVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTipoVehiculo.setText("Tipo de vehículo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(112, 63, 0, 0);
        getContentPane().add(jLabelTipoVehiculo, gridBagConstraints);

        jLabelMarca.setFont(new java.awt.Font("Helvetica", 1, 25)); // NOI18N
        jLabelMarca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMarca.setText("Marca:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 163, 0, 0);
        getContentPane().add(jLabelMarca, gridBagConstraints);

        jLabelColor.setFont(new java.awt.Font("Helvetica", 1, 25)); // NOI18N
        jLabelColor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelColor.setText("Color:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 163, 0, 0);
        getContentPane().add(jLabelColor, gridBagConstraints);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deportivo", "Sedán", "SUV" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(112, 101, 0, 0);
        getContentPane().add(jComboBoxTipo, gridBagConstraints);

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercedes", "Audi", "Lamborghini", "Ferrari" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 101, 0, 0);
        getContentPane().add(jComboBoxMarca, gridBagConstraints);

        jComboBoxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Blanco", "Gris metalizado", "Plata ", "Rojo" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 101, 0, 0);
        getContentPane().add(jComboBoxColor, gridBagConstraints);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 66, 68, 71);
        getContentPane().add(jButtonBuscar, gridBagConstraints);

        jButton1.setText("Todos los Vehículos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 25, 68, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("Insertar Vehículo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 44, 68, 0);
        getContentPane().add(jButton2, gridBagConstraints);

        jLabelPrecio.setFont(new java.awt.Font("Helvetica Neue", 1, 25)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecio.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 163, 0, 0);
        getContentPane().add(jLabelPrecio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 94;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 101, 0, 71);
        getContentPane().add(jTextFieldPrecio, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        // Obtener valores seleccionados de los ComboBoxes

        String tipoVehiculo = (String) jComboBoxTipo.getSelectedItem();
        String marca = (String) jComboBoxMarca.getSelectedItem();
        String color = (String) jComboBoxColor.getSelectedItem();

        String URl = "jdbc:mysql://localhost:3306/abdemotor";
        String USUARIO = "root"; // Cambia "root" si tienes otro usuario
        String PASSWORD = "1234"; // Agrega tu contraseña de MySQL

        ResultSet rs = null;
        String sql = null;
        Statement stmt = null;
        Connection con = null;

        try {
            con = DriverManager.getConnection(URl, USUARIO, PASSWORD);
            System.out.println("Conexión exitosa");

            stmt = con.createStatement();
            sql = "SELECT * FROM coche WHERE tipoVehiculo = '" + tipoVehiculo + "' AND marca = '" + marca + "' AND color = '" + color + "'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);

            // Llama a la ventana de resultados solo si hay resultados
            if (rs.isBeforeFirst()) { // Verifica si hay resultados
                ResultadoVehiculos rv = new ResultadoVehiculos(rs);
                rv.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron resultados.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
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

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String url = "jdbc:mysql://localhost:3306/abdemotor";
        String usuario = "root"; // Cambia "root" si tienes otro usuario
        String password = "1234"; // Agrega tu contraseña de MySQL

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Conectar a la base de datos
            con = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión exitosa");

            // Crear la consulta SQL para obtener todos los coches
            String sql = "SELECT * FROM coche";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            // Crear la ventana para mostrar los resultados
            ResultadoVehiculos rv = new ResultadoVehiculos(rs);
            rv.setVisible(true);

        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        } finally {
            // Cerrar recursos
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
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        // Obtener los valores de los campos de entrada
        String tipoVehiculo = (String) jComboBoxTipo.getSelectedItem(); // JComboBox para tipo
        String marca = (String) jComboBoxMarca.getSelectedItem(); // JComboBox para marca
        String color = (String) jComboBoxColor.getSelectedItem(); // JComboBox para color
        double precio; // Precio como double

        // Validar el campo de precio (puedes usar un JTextField para esto)
        try {
            precio = Double.parseDouble(jTextFieldPrecio.getText()); // Obtener precio de un JTextField
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un precio válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String url = "jdbc:mysql://localhost:3306/abdemotor";
        String usuario = "root"; // Cambia "root" si tienes otro usuario
        String password = "1234"; // Agrega tu contraseña de MySQL

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // Conectar a la base de datos
            con = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión exitosa");

            // Crear la consulta SQL para insertar un nuevo vehículo
            String sql = "INSERT INTO coche (tipoVehiculo, marca, color, precio) VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);

            // Establecer los valores en el PreparedStatement
            pstmt.setString(1, tipoVehiculo);
            pstmt.setString(2, marca);
            pstmt.setString(3, color);
            pstmt.setDouble(4, precio);

            // Ejecutar la inserción
            int filasAfectadas = pstmt.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Vehículo insertado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al insertar vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar recursos
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Crear la ventana principal
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear una instancia de la pantalla principal
                PantallaPrincipal pantalla = new PantallaPrincipal();
                pantalla.setVisible(true);
            }
        });
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox<String> jComboBoxColor;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTipoVehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}