/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import AccesoDatos.ArbitroImplementacion;
import AccesoDatos.EquipoImplementacion;
import AccesoDatos.PartidoImplementacion;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Arbitro;
import modelo.Campeonato;
import modelo.Equipo;
import modelo.Partido;

/**
 *
 * @author santi
 */
public class FrmAgregarPartido extends javax.swing.JDialog {

    EquipoImplementacion dao;
    EquipoAbstractTableModel modelo;
    static Equipo equipo;
    ArbitroImplementacion daoA;
    ArbitroAbstractTableModel modeloA;
    static Arbitro arbitro;
    static Partido partido;
    
    public FrmAgregarPartido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dao = new EquipoImplementacion();
        modelo = new EquipoAbstractTableModel(dao.listarTodos());
        tablaEquipo.setModel(modelo);
        tablaEquipo.updateUI();
        daoA = new ArbitroImplementacion();
        modeloA = new ArbitroAbstractTableModel(daoA.listarTodos());
        tablaArbitro.setModel(modeloA);
        tablaArbitro.updateUI();
        arbitro = new Arbitro("", "", "", "", 0);
        equipo = new Equipo("", "", "");
        partido = new Partido(String.valueOf(cbEstadio.getSelectedItem()), new Equipo("", "", ""), new Equipo("", "", ""), new Arbitro("", "", "", "", 0), new Arbitro("", "", "", "", 0), new Arbitro("", "", "", "", 0), String.valueOf(cbEstado.getSelectedItem()),"", new Campeonato(""));
        cerrar();
    }
    
    
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
        int valor = JOptionPane.showConfirmDialog(this, "¿Seguro de cerrar la venta?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            //se puede ingresar un mensaje de agradecimiento
            System.exit(0);
        }
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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEquipo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        cbEstadio = new javax.swing.JComboBox<>();
        btGuadar = new javax.swing.JButton();
        btEquipoLocal = new javax.swing.JButton();
        btArbitroLinea1 = new javax.swing.JButton();
        btEquipoVisitante = new javax.swing.JButton();
        btArbitroPrinc = new javax.swing.JButton();
        btArbitroLinea2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArbitro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setText("AGREGAR PARTIDOS");

        tablaEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tablaEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEquipoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEquipo);

        jLabel5.setText("EQUIPOS ");

        cbEstadio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPLIMPICO_LUZHNIKI", "IGNAL_IDUNA_PARK", "STADE_FRANCE", "SANTIAGO_BERNABEU", "CAMP_NOU" }));

        btGuadar.setText("GUARDAR");
        btGuadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuadarActionPerformed(evt);
            }
        });

        btEquipoLocal.setText("AGREGAR EQUIPO LOCAL");
        btEquipoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEquipoLocalActionPerformed(evt);
            }
        });

        btArbitroLinea1.setText("AGREGAR ARBITRO LINEA 1");
        btArbitroLinea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArbitroLinea1ActionPerformed(evt);
            }
        });

        btEquipoVisitante.setText("AGREGAR EQUIPO VISITANTE");
        btEquipoVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEquipoVisitanteActionPerformed(evt);
            }
        });

        btArbitroPrinc.setText("AGREGAR ARBITRO PRINCIPAL");
        btArbitroPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArbitroPrincActionPerformed(evt);
            }
        });

        btArbitroLinea2.setText("AGREGAR ARBITRO LINEA 2");
        btArbitroLinea2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArbitroLinea2ActionPerformed(evt);
            }
        });

        jLabel6.setText("ARBITROS");

        tablaArbitro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tablaArbitro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArbitroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaArbitro);

        jLabel1.setText("Fecha:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EN_CURSO", "PENDIENTE", "FINALIZADO" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(385, 385, 385))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btGuadar)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btArbitroPrinc)
                            .addComponent(btArbitroLinea1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btArbitroLinea2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEquipoVisitante)
                            .addComponent(btEquipoLocal))))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btEquipoVisitante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEquipoLocal))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btArbitroPrinc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btArbitroLinea1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btArbitroLinea2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGuadar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEquipoMouseClicked
        int fila = tablaEquipo.getSelectedRow();
        dao = new EquipoImplementacion();
        modelo = new EquipoAbstractTableModel(dao.listarTodos());
        equipo = modelo.getListaEquipos().get(fila);
    }//GEN-LAST:event_tablaEquipoMouseClicked

    private void btGuadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuadarActionPerformed
        partido.setFecha(txtFecha.getText());
        new PartidoImplementacion().guardar(partido);
    }//GEN-LAST:event_btGuadarActionPerformed

    private void btArbitroLinea2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArbitroLinea2ActionPerformed
        partido.setArbitroLinea2(arbitro);
    }//GEN-LAST:event_btArbitroLinea2ActionPerformed

    private void btArbitroLinea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArbitroLinea1ActionPerformed
        partido.setArbitroLinea1(arbitro);
    }//GEN-LAST:event_btArbitroLinea1ActionPerformed

    private void btArbitroPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArbitroPrincActionPerformed
        partido.setArbitroPrincipal(arbitro);
    }//GEN-LAST:event_btArbitroPrincActionPerformed

    private void btEquipoVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEquipoVisitanteActionPerformed
        partido.setEquipoVisitante(equipo);
    }//GEN-LAST:event_btEquipoVisitanteActionPerformed

    private void btEquipoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEquipoLocalActionPerformed
        partido.setEquipoLocal(equipo);
    }//GEN-LAST:event_btEquipoLocalActionPerformed

    private void tablaArbitroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArbitroMouseClicked
        int fila = tablaArbitro.getSelectedRow();
        daoA = new ArbitroImplementacion();
        modeloA = new ArbitroAbstractTableModel(daoA.listarTodos());
        arbitro = modeloA.getLista().get(fila);
    }//GEN-LAST:event_tablaArbitroMouseClicked

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
            java.util.logging.Logger.getLogger(FrmAgregarPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmAgregarPartido dialog = new FrmAgregarPartido(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btArbitroLinea1;
    private javax.swing.JButton btArbitroLinea2;
    private javax.swing.JButton btArbitroPrinc;
    private javax.swing.JButton btEquipoLocal;
    private javax.swing.JButton btEquipoVisitante;
    private javax.swing.JButton btGuadar;
    private javax.swing.JComboBox<String> cbEstadio;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaArbitro;
    private javax.swing.JTable tablaEquipo;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
