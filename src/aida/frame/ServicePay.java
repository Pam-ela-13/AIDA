/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aida.frame;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Maicol Andres
 */
public class ServicePay extends javax.swing.JFrame {

    /**
     * Creates new form ServicePay
     */
    public ServicePay() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtmonto = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        txttitular = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtnumCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta-bancaria (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 300, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 268, 300, -1));

        txtmonto.setBackground(new java.awt.Color(2, 2, 2));
        txtmonto.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmonto.setForeground(new java.awt.Color(153, 153, 153));
        txtmonto.setText("Ingrese monto a pagar $");
        txtmonto.setBorder(null);
        txtmonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtmontoMousePressed(evt);
            }
        });
        txtmonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmontoActionPerformed(evt);
            }
        });
        jPanel1.add(txtmonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 170, -1));

        jComboBox1.setBackground(new java.awt.Color(52, 73, 94));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agua", "Luz", "Telefono", "Internet" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jTextField2.setBackground(new java.awt.Color(2, 2, 2));
        jTextField2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Método a pagar");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, 20));

        jComboBox2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta", "Tarjeta de crédito", "Tarjeta de débito" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 130, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 160, 10));

        txttitular.setBackground(new java.awt.Color(2, 2, 2));
        txttitular.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txttitular.setForeground(new java.awt.Color(153, 153, 153));
        txttitular.setText("Ingrese nombres completos del titular o código");
        txttitular.setBorder(null);
        txttitular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txttitularMousePressed(evt);
            }
        });
        txttitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttitularActionPerformed(evt);
            }
        });
        jPanel1.add(txttitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jTextField5.setBackground(new java.awt.Color(2, 2, 2));
        jTextField5.setFont(new java.awt.Font("Roboto Light", 2, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(241, 196, 15));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("PAGO DE SERVICIOS");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 240, -1));

        jTextField7.setBackground(new java.awt.Color(2, 2, 2));
        jTextField7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("Seleccione el servicio a pagar");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 230, 10));

        txtnumCuenta.setBackground(new java.awt.Color(2, 2, 2));
        txtnumCuenta.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtnumCuenta.setForeground(new java.awt.Color(153, 153, 153));
        txtnumCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumCuenta.setText("Numero de Cuenta");
        txtnumCuenta.setBorder(null);
        txtnumCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnumCuentaMousePressed(evt);
            }
        });
        txtnumCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnumCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 150, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Regresar");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 196, 15)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 160, 30));

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setForeground(new java.awt.Color(204, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/18702139_sep09.jpg"))); // NOI18N
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 160, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pagar");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 196, 15)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 160, 30));

        jButton1.setBackground(new java.awt.Color(2, 2, 2));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/18702139_sep09.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 160, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/18702139_sep09.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 440, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmontoActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txttitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttitularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttitularActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Total a pagar: 0.00$");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnumCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumCuentaActionPerformed

    private void txttitularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttitularMousePressed
        // TODO add your handling code here:
         if(txttitular.getText().equals("Ingrese nombres completos del titular o código")){
        txttitular.setText("");
        txttitular.setForeground(Color.white);
       }
       if(String.valueOf(txtnumCuenta.getText()).isEmpty()){
        txtnumCuenta.setText("Numero de Cuenta");
        txtnumCuenta.setForeground(Color.white);
       }
         if(String.valueOf(txtmonto.getText()).isEmpty()){
        txtmonto.setText("Ingrese monto a pagar $");
        txtmonto.setForeground(Color.white);
       } 
    }//GEN-LAST:event_txttitularMousePressed

    private void txtnumCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnumCuentaMousePressed
        // TODO add your handling code here:
        if(String.valueOf(txtnumCuenta.getText()).equals("Numero de Cuenta")){
        txtnumCuenta.setText("");
        txtnumCuenta.setForeground(Color.white);
       }
        if(txttitular.getText().isEmpty()){
        txttitular.setText("Ingrese nombres completos del titular o código");
        txttitular.setForeground(Color.white);
       }
       
        if(String.valueOf(txtmonto.getText()).isEmpty()){
        txtmonto.setText("Ingrese monto a pagar $");
        txtmonto.setForeground(Color.white);
       } 
    }//GEN-LAST:event_txtnumCuentaMousePressed

    private void txtmontoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmontoMousePressed
        // TODO add your handling code here:
         if(String.valueOf(txtmonto.getText()).equals("Ingrese monto a pagar $")){
        txtmonto.setText("");
        txtmonto.setForeground(Color.white);
       } 
        if(String.valueOf(txtnumCuenta.getText()).isEmpty()){
        txtnumCuenta.setText("Numero de Cuenta");
        txtnumCuenta.setForeground(Color.white);
       }
        if(txttitular.getText().isEmpty()){
        txttitular.setText("Ingrese nombres completos del titular o código");
        txttitular.setForeground(Color.white);
       }
       
       
    }//GEN-LAST:event_txtmontoMousePressed

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
            java.util.logging.Logger.getLogger(ServicePay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicePay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicePay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicePay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicePay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField txtmonto;
    private javax.swing.JTextField txtnumCuenta;
    private javax.swing.JTextField txttitular;
    // End of variables declaration//GEN-END:variables
}
