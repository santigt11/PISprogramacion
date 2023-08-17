/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import AccesoDatos.CampeonatoImplementacion;
import AccesoDatos.EntrenadorImplementacion;
import AccesoDatos.EquipoImplementacion;
import modelo.Campeonato;
import modelo.Entrenador;

/**
 *
 * @author Santiagod
 */
public class FrmAgregarCampeonatoEntrenador extends javax.swing.JFrame {
    
    CampeonatoImplementacion dao;
    EntrenadorImplementacion dao2;
    CampeonatoAbstractModel modelo1;
    EntrenadorAbstractModel modelo2;
    static Campeonato campeonato;
    static Entrenador entrenador;
    /**
     * Creates new form FrmAgregarCampeonatoEntrenador
     */
    public FrmAgregarCampeonatoEntrenador() {
        initComponents();
        this.setLocationRelativeTo(null);
        dao = new CampeonatoImplementacion();
        dao2 = new EntrenadorImplementacion();     
        modelo1 = new CampeonatoAbstractModel(dao.listarTodos());
        modelo2 = new EntrenadorAbstractModel(dao2.listarTodos());
        tablaCampeonato.setModel(modelo1);
        tablaCampeonato.updateUI();
        tablaEntrenador.setModel(modelo2);
        tablaEntrenador.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEntrenador = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCampeonato = new javax.swing.JTable();
        btnCampeonato1 = new javax.swing.JButton();
        btnCampeonato2 = new javax.swing.JButton();
        btnEntrenador = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Elegir Campeonato");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Elegir Entrenador");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 19, 122, -1));

        tablaEntrenador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaEntrenador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEntrenadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEntrenador);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 200, 170));

        tablaCampeonato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaCampeonato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCampeonatoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCampeonato);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 200, 170));

        btnCampeonato1.setText("Agregar Campeonato 1");
        jPanel4.add(btnCampeonato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        btnCampeonato2.setText("Agregar Campeonato 2");
        jPanel4.add(btnCampeonato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        btnEntrenador.setText("Agregar Entrenador");
        jPanel4.add(btnEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 630, 280));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mi proyecto (2) (1).png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("ROG Fonts", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("F-natics");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaCampeonatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCampeonatoMouseClicked
        int fila = tablaCampeonato.getSelectedRow();
        dao = new CampeonatoImplementacion();
        modelo1 = new CampeonatoAbstractModel(dao.listarTodos());
        campeonato = modelo1.getLista().get(fila);
    }//GEN-LAST:event_tablaCampeonatoMouseClicked

    private void tablaEntrenadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEntrenadorMouseClicked
        int fila = tablaEntrenador.getSelectedRow();
        dao2 = new EntrenadorImplementacion();
        modelo2 = new EntrenadorAbstractModel(dao.listarTodos());
        entrenador = modelo2.getLista().get(fila);
    }//GEN-LAST:event_tablaEntrenadorMouseClicked

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
            java.util.logging.Logger.getLogger(FrmAgregarCampeonatoEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarCampeonatoEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarCampeonatoEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarCampeonatoEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarCampeonatoEntrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCampeonato1;
    private javax.swing.JButton btnCampeonato2;
    private javax.swing.JButton btnEntrenador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCampeonato;
    private javax.swing.JTable tablaEntrenador;
    // End of variables declaration//GEN-END:variables
}
