// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2017年度・ソフトウェア工学実習
// Counter 2017-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package counter;
// =============================================================================
/**
 * カウンタ(Counter): フレーム.
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * ---- 0201a-001-20170410a [iijima] カウンタ(Counter)　自力で一から作ってみましょう
 */
// =============================================================================
public class CounterFrame extends javax.swing.JFrame {
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// コンストラクタ(初期化) ////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [コンストラクタ] 初期化する.
     */
    // =========================================================================
    public CounterFrame() {
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

        countLabel = new javax.swing.JLabel();
        upButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        countLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        countLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countLabel.setText("0");

        upButton.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        upButton.setText("up");
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(countLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(upButton)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upButton))
                .addContainerGap(39, Short.MAX_VALUE))
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
     * 「up」ボタンのイベントハンドラ.
     * @param evt アクションイベント
     */
    // ========================================================================= 
    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        count++;
        countLabel.setText( Integer.toString(count));
    }//GEN-LAST:event_upButtonActionPerformed
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
            java.util.logging.Logger.getLogger(CounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        // ---------------------------------------------------------------------
        /* フォームの生成と表示 (正式な方法) */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CounterFrame().setVisible(true);
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
    private javax.swing.JLabel countLabel;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
    // =========================================================================
}
// =============================================================================
