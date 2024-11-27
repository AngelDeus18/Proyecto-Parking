/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Parqueadero;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Administrador
 */
public class Principal extends javax.swing.JFrame {


    PanelIngreso panelingresar;
    PanelRetirar panelretirar;
    PanelTabla paneltabla;
    public Principal() {
        
        initComponents();
        setSize(766,590);
        ModeloParking modelo = new ModeloParking();
        panelingresar = new PanelIngreso(modelo);
        panelingresar.setBounds(322,0,450,590);
        add(panelingresar);
        panelretirar= new PanelRetirar(modelo);
        panelretirar.setBounds(322,0,450,590);
        add(panelretirar);
        panelretirar.setVisible(false);
        paneltabla= new PanelTabla(modelo);
        paneltabla.setBounds(329,0,1131,590);
        add(paneltabla);
        paneltabla.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelopciones = new javax.swing.JPanel();
        btningresar = new java.awt.Button();
        btnsacar = new java.awt.Button();
        btntabla = new java.awt.Button();
        btnexit = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        panelopciones.setBackground(new java.awt.Color(50, 50, 50));
        panelopciones.setMinimumSize(new java.awt.Dimension(316, 550));

        btningresar.setBackground(new java.awt.Color(100, 165, 248));
        btningresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btningresar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btningresar.setLabel("Ingresar vehiculo");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        btnsacar.setBackground(new java.awt.Color(100, 165, 248));
        btnsacar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsacar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnsacar.setLabel("Sacar vehiculo");
        btnsacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsacarActionPerformed(evt);
            }
        });

        btntabla.setBackground(new java.awt.Color(100, 165, 248));
        btntabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntabla.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btntabla.setLabel("Tabla vehiculos");
        btntabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntablaActionPerformed(evt);
            }
        });

        btnexit.setBackground(new java.awt.Color(204, 0, 0));
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnexit.setLabel("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(102, 0, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5452502_automobile_car_parking_sign_signaling_icon.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 255, 204));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 8)); // NOI18N
        jLabel3.setText("By Angel and Julian");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jLabel4.setBackground(new java.awt.Color(0, 255, 204));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PARKING");

        javax.swing.GroupLayout panelopcionesLayout = new javax.swing.GroupLayout(panelopciones);
        panelopciones.setLayout(panelopcionesLayout);
        panelopcionesLayout.setHorizontalGroup(
            panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelopcionesLayout.createSequentialGroup()
                .addGroup(panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelopcionesLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelopcionesLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btntabla, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelopcionesLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnsacar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelopcionesLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panelopcionesLayout.setVerticalGroup(
            panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelopcionesLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(44, 44, 44)
                .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsacar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntabla, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelopciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 791, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelopciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        setSize(766,590);
        panelingresar.setVisible(true);
        panelretirar.setVisible(false);
        paneltabla.setVisible(false);

        revalidate();
        repaint();
    }//GEN-LAST:event_btningresarActionPerformed

    private void btnsacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsacarActionPerformed
        setSize(766,590);
        panelingresar.setVisible(false);
        panelretirar.setVisible(true);
        paneltabla.setVisible(false);

        revalidate();
        repaint();
    }//GEN-LAST:event_btnsacarActionPerformed

    private void btntablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntablaActionPerformed
        setSize(1131,590);
        panelingresar.setVisible(false);
        panelretirar.setVisible(false);
        paneltabla.setVisible(true);

        revalidate();
        repaint();
    }//GEN-LAST:event_btntablaActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
    int i=JOptionPane.showConfirmDialog(null, "¿Seguro que quiere salir?");
    if(i==0)
    System.exit(0);
               
    }//GEN-LAST:event_btnexitActionPerformed
    public void actualizarTabla() {
    paneltabla.actualizarTabla();
    }
  
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnexit;
    private java.awt.Button btningresar;
    private java.awt.Button btnsacar;
    private java.awt.Button btntabla;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelopciones;
    // End of variables declaration//GEN-END:variables
}
