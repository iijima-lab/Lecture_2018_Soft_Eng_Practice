/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.view;

import janken.model.JankenPlayer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Observable;
import java.util.Observer;

/**
 * じゃんけん
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 */
public class JankenPlayerView extends javax.swing.JPanel implements Observer {

    private JankenPlayer player = null;
    private JankenImageCanvas canvas = null;
    private int hand = 0;

    /**
     * Creates new form JankenPlayerView
     */
    public JankenPlayerView(JankenPlayer player) {
        initComponents();
        this.player = player;
        player.addObserver(this);

        canvas = new JankenImageCanvas(player);
        imagePanel.setLayout(new BorderLayout());
        imagePanel.add(canvas, BorderLayout.CENTER);
        canvas.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        handLabel = new javax.swing.JLabel();
        imagePanel = new javax.swing.JPanel();

        handLabel.setText("ぐー");

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(handLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(handLabel)
                .addGap(41, 41, 41)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void update(Observable o, Object data) {
        hand = player.getHand();
        String handString = player.getHandString();
        System.out.println(handString);
        handLabel.setText(handString);
        canvas.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel handLabel;
    private javax.swing.JPanel imagePanel;
    // End of variables declaration//GEN-END:variables
}

class JankenImageCanvas extends javax.swing.JPanel {
    private JankenPlayer player = null;
    private Image handImage[];

    public JankenImageCanvas(JankenPlayer player) {
        this.player = player;
        handImage = new Image[3];
        for (int i = 0; i <= 2; i++) {
            handImage[i] = getToolkit().getImage(i + ".jpg")
                    .getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        }
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(200, 200));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int hand = player.getHand();
        Image img = handImage[hand];
        if (img != null) {
            g.drawImage(img, 0, 0, this);
        }
    }
}