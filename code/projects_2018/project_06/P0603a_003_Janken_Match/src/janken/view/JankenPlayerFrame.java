/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.view;

import janken.controller.JankenPlayerController;
import janken.model.JankenPlayer;
import java.awt.BorderLayout;

/**
 * じゃんけん
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 */
public class JankenPlayerFrame extends javax.swing.JFrame {

    private JankenPlayer player = null;
    private JankenPlayerView playerView = null;
    private JankenPlayerControlPanel playerControlPanel = null;
    private JankenPlayerController playerController= null;

    /**
     * Creates new form JankenPlayer
     */
    public JankenPlayerFrame(JankenPlayer player ) {
        
        initComponents();
        this.player = player;
        playerView = new JankenPlayerView(player );
        playerControlPanel = new JankenPlayerControlPanel(player );
        playerController = new JankenPlayerController(player,
                                playerView, playerControlPanel );
        playerControlPanel.setController(playerController);
                
        setLayout( new BorderLayout() );
        add(playerView, BorderLayout.CENTER );
        add(playerControlPanel, BorderLayout.SOUTH);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
