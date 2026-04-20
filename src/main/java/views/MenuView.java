package views;

import javax.swing.*;
import java.awt.*;

public class MenuView extends javax.swing.JFrame {

    private javax.swing.JButton btnListarVehiculos;
    private javax.swing.JButton btnAgregarVehiculo;
    private javax.swing.JLabel lblTitulo;

    public MenuView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        lblTitulo = new javax.swing.JLabel("Sistema de Logística");
        btnListarVehiculos = new javax.swing.JButton("Listar Vehículos");
        btnAgregarVehiculo = new javax.swing.JButton("Agregar Vehículo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logística - Menú Principal");
        setPreferredSize(new java.awt.Dimension(300, 180));
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 16));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnListarVehiculos.setFont(new java.awt.Font("Tahoma", 0, 13));
        btnListarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVehiculosActionPerformed(evt);
            }
        });

        btnAgregarVehiculo.setFont(new java.awt.Font("Tahoma", 0, 13));
        btnAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnListarVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnAgregarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(btnListarVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnAgregarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }

    private void btnListarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {
        ListarVehiculosView view = new ListarVehiculosView();
        view.setVisible(true);
        dispose();
    }

    private void btnAgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {
        IngresarVehiculo view = new IngresarVehiculo();
        view.setVisible(true);
        dispose();
    }
}
