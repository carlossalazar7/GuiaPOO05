/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.guia5poo1;

/**
 *
 * @author carlo
 */
public class RadioButton extends javax.swing.JFrame {

    /**
     * Creates new form RadioButton
     */
    public RadioButton() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        rbtOpcion1 = new javax.swing.JRadioButton();
        rbtOpcion2 = new javax.swing.JRadioButton();
        rbtOpcion3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Seleccione una imagen:");

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sv/edu/udb/guia5poo1/1.jpg"))); // NOI18N

        rbtOpcion1.setText("Opcion1");
        rbtOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOpcion1ActionPerformed(evt);
            }
        });

        rbtOpcion2.setText("Opcion2");
        rbtOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOpcion2ActionPerformed(evt);
            }
        });

        rbtOpcion3.setText("Opcion3");
        rbtOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOpcion3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtOpcion2)
                    .addComponent(rbtOpcion1)
                    .addComponent(rbtOpcion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblTitulo)
                .addGap(110, 110, 110)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtOpcion1)
                .addGap(15, 15, 15)
                .addComponent(rbtOpcion2)
                .addGap(18, 18, 18)
                .addComponent(rbtOpcion3)
                .addGap(157, 157, 157))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOpcion1ActionPerformed
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sv/edu/udb/img/1.jpg")));
    }//GEN-LAST:event_rbtOpcion1ActionPerformed

    private void rbtOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOpcion2ActionPerformed
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sv/edu/udb/img/2.jpg")));
    }//GEN-LAST:event_rbtOpcion2ActionPerformed

    private void rbtOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOpcion3ActionPerformed
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sv/edu/udb/img/3.jpg")));
    }//GEN-LAST:event_rbtOpcion3ActionPerformed

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
            java.util.logging.Logger.getLogger(RadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtOpcion1;
    private javax.swing.JRadioButton rbtOpcion2;
    private javax.swing.JRadioButton rbtOpcion3;
    // End of variables declaration//GEN-END:variables
}