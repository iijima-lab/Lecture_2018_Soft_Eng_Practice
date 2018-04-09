// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2017年度・ソフトウェア工学実習
// Hello 2017-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package hello;
// =============================================================================
/**
 * Hello: フレーム表示.
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * ---- 001-20170407a [iijima] Hello: フレーム表示
 */
// =============================================================================
public class HelloFrame extends javax.swing.JFrame {
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// コンストラクタ(初期化) ////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [コンストラクタ] 初期化する.
     */
    // =========================================================================
    public HelloFrame() {
        // ---------------------------------------------------------------------
        /* NetBeansがフォームから自動生成したGUI部品の初期化 */
        initComponents();
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// インスタンスメソッド //////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    // -------------------------------------------------------------------------
    /**
     * フォームを初期化する．<br>
     *  ---- ※コンストラクタから呼ばれる<br>
     *  ---- ※(フォームエディタから生成されるので編集不可)
     */
    // -------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helloLabel = new javax.swing.JLabel();
        countButton = new javax.swing.JButton();
        countLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        helloLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        helloLabel.setText("Hello");

        countButton.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        countButton.setText("いいね");
        countButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countButtonActionPerformed(evt);
            }
        });

        countLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        countLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(countLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(countButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helloLabel)
                    .addComponent(countButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// 属性(カウンターの内部状態) ////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [値属性] カウント値.
     */
    // =========================================================================
    private int count = 0;
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// GUI部品のイベントハンドラ(フォーム管理) ///////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * 「いいね」ボタンのイベントハンドラ.
     * @param evt アクションイベント
     */
    // =========================================================================
    private void countButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countButtonActionPerformed
        count++;
        System.out.printf("いいね %d\n", count);
        countLabel.setText(Integer.toString(count));
    }//GEN-LAST:event_countButtonActionPerformed

    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// [Static] メソッド /////////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * メインメソッド.
     * @param args コマンド行引数
     */
    // =========================================================================
    public static void main(String args[]) {
        // ---------------------------------------------------------------------
        /* Nimbusルック＆フィールの設定 */
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
            java.util.logging.Logger.getLogger(HelloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        // ---------------------------------------------------------------------
        /* フォームの生成と表示 (正式な方法) */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelloFrame().setVisible(true);
            }
        });
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// GUI部品の参照属性(フォーム管理;編集不可) //////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton countButton;
    private javax.swing.JLabel countLabel;
    private javax.swing.JLabel helloLabel;
    // End of variables declaration//GEN-END:variables
    // =========================================================================
}
// =============================================================================
