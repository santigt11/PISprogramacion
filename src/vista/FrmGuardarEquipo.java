/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import AccesoDatos.EquipoImplementacion;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Equipo;

/**
 *
 * @author santi
 */
public class FrmGuardarEquipo extends javax.swing.JFrame {
    
    String imagePath;
    
    public FrmGuardarEquipo() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        previewIcono = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(587, 428));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(587, 213));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("NOMBRE:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 60, -1));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("CIUDAD:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 50, -1));

        txtNombre.setMinimumSize(new java.awt.Dimension(45, 26));
        txtNombre.setPreferredSize(new java.awt.Dimension(68, 22));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 441, -1));

        txtCiudad.setMinimumSize(new java.awt.Dimension(45, 26));
        txtCiudad.setPreferredSize(new java.awt.Dimension(68, 22));
        jPanel2.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 441, -1));

        jButton1.setText("LOGO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 90, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mi proyecto (2) (1).png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("ROG Fonts", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("F-natics");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel10)
                .addContainerGap(273, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        jLabel8.setFont(new java.awt.Font("ROG Fonts", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("EQUIPO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 70, 20));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("cargar imagen");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        previewIcono.setForeground(new java.awt.Color(153, 153, 153));
        previewIcono.setText("jLabel4");
        jPanel2.add(previewIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 150, 150));

        btGuardar.setText("GUARDAR EQUIPO");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
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
            
            
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

        // Muestra el cuadro de diálogo de abrir archivo
        int result = fileChooser.showOpenDialog(this);

        // Si el usuario selecciona un archivo y hace clic en "Abrir"
        if (result == JFileChooser.APPROVE_OPTION) {
            // Obtiene la ruta seleccionada del archivo
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            // Muestra la ruta del archivo en una etiqueta o en otro componente
            //previewIcono.setText("Ruta del archivo: " + filePath);
            // Ruta de la imagen en el proyecto
            imagePath = filePath; // Cambia esto a la ruta correcta
            System.out.println(imagePath);

            // Carga la imagen desde el archivo
            ImageIcon imageIcon = new ImageIcon(imagePath);

            // Escala la imagen para ajustar el tamaño del JLabel
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(previewIcono.getWidth(), previewIcono.getHeight(), Image.SCALE_SMOOTH);

            // Asigna la imagen escalada al JLabel
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            previewIcono.setIcon(scaledIcon);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        Equipo equipo = new Equipo(txtNombre.getText(), txtCiudad.getText(), imagePath);
        EquipoImplementacion equipoImplementacion = new EquipoImplementacion();
        equipoImplementacion.guardar(equipo);
    }//GEN-LAST:event_btGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGuardarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGuardarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGuardarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGuardarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGuardarEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel previewIcono;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
