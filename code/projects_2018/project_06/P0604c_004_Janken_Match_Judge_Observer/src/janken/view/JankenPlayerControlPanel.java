/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.view;

import janken.controller.JankenPlayerController;
import janken.model.JankenPlayer;

/**
 * じゃんけん
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 */
public class JankenPlayerControlPanel extends javax.swing.JPanel {
    protected JankenPlayer player = null;
    protected JankenPlayerController playerController = null;

    /**
     * Creates new form JankenPlayerControlPanel
     */
    public JankenPlayerControlPanel(JankenPlayer player) {
        initComponents();
        this.player = player;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ponButton = new javax.swing.JButton();

        ponButton.setText("pon");
        ponButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(ponButton)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ponButton)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ponButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponButtonActionPerformed
        playerController.pon();
    }//GEN-LAST:event_ponButtonActionPerformed
    
    public void setController(JankenPlayerController playerController) {
        this.playerController = playerController;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ponButton;
    // End of variables declaration//GEN-END:variables
}
