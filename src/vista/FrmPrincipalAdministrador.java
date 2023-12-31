/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario iTC
 */
public class FrmPrincipalAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal1
     */
    public FrmPrincipalAdministrador() {
        initComponents();
        cerrar();
        this.setLocationRelativeTo(null);
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
        jpnControl = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        subtitulo1 = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        subtitulo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnGeneral = new javax.swing.JMenu();
        btnPartidos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnControl.setBackground(new java.awt.Color(255, 51, 51));
        jpnControl.setPreferredSize(new java.awt.Dimension(331, 570));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MENU");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CERRAR SESION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Acerca de");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-menú-40 (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        subtitulo1.setFont(new java.awt.Font("ROG Fonts", 1, 18)); // NOI18N
        subtitulo1.setText("F-natics");

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mi proyecto (2) (1).png"))); // NOI18N

        jButton3.setText("AGREGAR EQUIPO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("AGREGAR ENTRENADOR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("AGREGAR ARBITRO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("AGREGAR JUGADOR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("AGREGAR PARTIDO");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("AGREGAR CAMPEONATO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnControlLayout = new javax.swing.GroupLayout(jpnControl);
        jpnControl.setLayout(jpnControlLayout);
        jpnControlLayout.setHorizontalGroup(
            jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnControlLayout.createSequentialGroup()
                .addGap(10, 10, Short.MAX_VALUE)
                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(subtitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnControlLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jButton2)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnControlLayout.createSequentialGroup()
                                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnControlLayout.createSequentialGroup()
                        .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60))))
            .addGroup(jpnControlLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpnControlLayout.setVerticalGroup(
            jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnControlLayout.createSequentialGroup()
                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnControlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(jpnControlLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitulo1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jPanel1.add(jpnControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 230, 570));

        subtitulo.setFont(new java.awt.Font("ROG Fonts", 1, 18)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(255, 102, 102));
        subtitulo.setText("F-natics");
        jPanel1.add(subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mi proyecto (2) (1).png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 100, 90));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        btnGeneral.setText("General");

        btnPartidos.setText("Partidos");
        btnPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidosActionPerformed(evt);
            }
        });
        btnGeneral.add(btnPartidos);

        jMenuBar1.add(btnGeneral);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cerrar(){
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(
               new WindowAdapter() {
                  public void windowClosing(WindowEvent e){
                      confirmarSalida();
                  }
               }
            );
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void confirmarSalida(){
        int valor = JOptionPane.showConfirmDialog(this, "¿Seguro de cerrar la app?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            //se puede ingresar un mensaje de agradecimiento
            System.exit(0);
        }
    }
            
            
    
    
    private void btnPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidosActionPerformed
        new FrmGeneral().setVisible(true);
    }//GEN-LAST:event_btnPartidosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int posicion = this.jpnControl.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -180, 2, 2, jpnControl);
        } else{
            Animacion.Animacion.mover_derecha(-180, 0, 2, 2, jpnControl);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new FrmInicioSesion().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        new FrmAcercaDe().setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new FrmGuardarEquipo().setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        new FrmGuardarEntrenador().setVisible(true);
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new FrmGuardarArbitro().setVisible(true);
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        new FrmGuardarJugador().setVisible(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new FrmCampeonato().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new FrmAgregarPartido(null, true).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipalAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnGeneral;
    private javax.swing.JMenuItem btnPartidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnControl;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel subtitulo1;
    // End of variables declaration//GEN-END:variables
}
