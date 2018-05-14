/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital_clock.view;

import digital_clock.model.DigitalClock;
import java.util.Observable;
import java.util.Observer;

/**
 * ディジタルクロック
 * @author 飯島 正(iijima@ae.keio.ac.jp)
 */
public class DigitalClockView extends javax.swing.JPanel implements Observer {

    private DigitalClock clock = null;

    /**
     * Creates new form DigitalClockView
     */
    public DigitalClockView(DigitalClock clock) {
        initComponents();
        this.clock = clock;
        clock.addObserver(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeLabel = new javax.swing.JLabel();

        timeLabel.setText("00時00分00秒");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(timeLabel)
                    .addContainerGap(110, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(timeLabel)
                    .addContainerGap(135, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void update(Observable o, Object arg) {
        String currentTime = clock.getCurrentTime();
        System.out.println( currentTime);
        timeLabel.setText( currentTime );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}