/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Santiagod
 */
public class FrmGeneral extends javax.swing.JFrame {
    
  private int partidoActual = 0;
    private PartidoPanel[] partidos;

    public FrmGeneral() {
        initComponents();
        agregarPartidos();
        mostrarPartido(partidoActual); // Mostrar el primer partido al iniciar
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void agregarPartidos() {
// Crear algunas imágenes de ejemplo (reemplaza con tus propias imágenes)
        ImageIcon imagenEquipo1 = new ImageIcon("C:\\Users\\brasi\\Desktop\\real.png");
        ImageIcon imagenEquipo2 = new ImageIcon("C:\\Users\\brasi\\Desktop\\bar.png");
        ImageIcon imagenEquipo3 = new ImageIcon("C:\\Users\\brasi\\Desktop\\pava.png");
        ImageIcon imagenEquipo4 = new ImageIcon("C:\\Users\\brasi\\Desktop\\guala.jpg");

        // Crear un arreglo de paneles de partido
        partidos = new PartidoPanel[2]; // Cambia 5 por el número de partidos que deseas mostrar

        for (int i = 0; i < partidos.length; i++) {
            partidos[0] = new PartidoPanel(this,imagenEquipo1, imagenEquipo2, "3-1", "En juego", "Fecha: 2023-07-20");
            partidos[1] = new PartidoPanel(this,imagenEquipo3, imagenEquipo4, "2-1", "Finalizado", "Fecha: 2023-08-20");

        }
        
        // Crear un Layout para el contenedor de los paneles de partido
    BoxLayout contenedorLayout = new BoxLayout(jPanel3, BoxLayout.Y_AXIS);
    jPanel3.setLayout(contenedorLayout);
//
//    // Crear varios paneles de partido y agregarlos al contenedor
//    for (int i = 0; i < 5; i++) { // Cambia 5 por el número de partidos que deseas mostrar
//        PartidoPanel partidoPanel = new PartidoPanel(imagenEquipo1, imagenEquipo2, "3-1", "En juego", "Fecha: 2023-07-20");
//        jPanel3.add(partidoPanel);
//    }
    }

    private void mostrarPartido(int indice) {
        jPanel3.removeAll();
        jPanel3.add(partidos[indice]);
        jPanel3.revalidate();
        jPanel3.repaint();
    }    
    
    public void mostrarPartidoAnterior() {
        if (partidoActual > 0) {
            partidoActual--;
            mostrarPartido(partidoActual);
        }
    }

    public void mostrarPartidoSiguiente() {
        if (partidoActual < partidos.length - 1) {
            partidoActual++;
            mostrarPartido(partidoActual);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("General");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 50));

        jPanel3.setPreferredSize(new java.awt.Dimension(634, 140));
        jPanel3.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel3ComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1060, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel3ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3ComponentAdded

 
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
            java.util.logging.Logger.getLogger(FrmGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}