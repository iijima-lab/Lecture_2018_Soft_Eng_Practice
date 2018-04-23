// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2018年度・ソフトウェア工学実習
// Counter 2018-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
// =============================================================================
/**
 * カウンタ(Counter): フレーム.
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * ---- 0302b-002-20180416a [iijima] カウンタ(Counter)  エラーメッセージを配列で管理する<br>
 * ---- 0302a-002-20180416a [iijima] カウンタ(Counter)  エラーコードでエラーを識別する<br>
 * ---- 0301c-001-20180416a [iijima] カウンタ(Counter)　共通部分をprivateの下請けメソッドに抽出する<br>
 * ---- 0301b-001-20180416a [iijima] カウンタ(Counter)　モデルを抽出する(MVCの分離)<br>
 * ---- 0301a-001-20180413a [iijima] カウンタ(Counter)　モデル抽出前の準備(0201a-001のコピー)
 */
// =============================================================================
public class CounterFrame extends javax.swing.JFrame {
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// 属性(カウンタ) ////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [参照属性] カウンタ.
     */
    // =========================================================================
    private Counter counter = null;
    // =========================================================================
    /**
     * [値属性] エラーコード.
     */
    // =========================================================================
    private int errorCode = 0;
    // =========================================================================
    /**
     * [値属性] エラーメッセージ配列.
     */
    // =========================================================================
    private String[] errorMessage = {
        "", 
        "エラー : カウントがゼロなのにダウンさせようとした" };
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
        // NetBeansがフォームから自動生成したGUI部品の初期化 
        initComponents();
        // ---------------------------------------------------------------------
        // モデル・オブジェクトの生成
        counter = new Counter();
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

        errorMsgDialog = new javax.swing.JDialog();
        countLabel = new javax.swing.JLabel();
        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        errorMsgLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout errorMsgDialogLayout = new javax.swing.GroupLayout(errorMsgDialog.getContentPane());
        errorMsgDialog.getContentPane().setLayout(errorMsgDialogLayout);
        errorMsgDialogLayout.setHorizontalGroup(
            errorMsgDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        errorMsgDialogLayout.setVerticalGroup(
            errorMsgDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        countLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        countLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countLabel.setText("0");
        countLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        upButton.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        upButton.setText("up");
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        downButton.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        downButton.setText("down");
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        resetButton.setText("reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        errorMsgLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        errorMsgLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorMsgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(countLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(errorMsgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(upButton)
                                .addGap(34, 34, 34)
                                .addComponent(downButton)
                                .addGap(18, 18, 18)
                                .addComponent(resetButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(countLabel)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(downButton)
                        .addComponent(resetButton)))
                .addGap(18, 18, 18)
                .addComponent(errorMsgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
        // ---------------------------------------------------------------------
        errorCode = counter.up();
        // ---------------------------------------------------------------------
        update();
        // ---------------------------------------------------------------------
    }//GEN-LAST:event_upButtonActionPerformed
    // =========================================================================
    /**
     * 「down」ボタンのイベントハンドラ.
     * @param evt アクションイベント
     */
    // ========================================================================= 
    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        // ---------------------------------------------------------------------
        errorCode = counter.down();
        // ---------------------------------------------------------------------
        update();
        // ---------------------------------------------------------------------
    }//GEN-LAST:event_downButtonActionPerformed
    // =========================================================================
    /**
     * 「reset」ボタンのイベントハンドラ.
     * @param evt アクションイベント
     */
    // ========================================================================= 
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // ---------------------------------------------------------------------
        errorCode = counter.reset();
        // ---------------------------------------------------------------------
        update();
        // ---------------------------------------------------------------------
    }//GEN-LAST:event_resetButtonActionPerformed
    // =========================================================================
    /**
     * エラーメッセージを表示する.
     */
    // =========================================================================
    private void printErrorMessage( int errorCode ) {
        // ---------------------------------------------------------------------
        // コンソールへエラーメッセージを表示する
        System.err.println(errorMessage[errorCode]);
        // ---------------------------------------------------------------------
        // フレームへエラーメッセージを表示する
        errorMsgLabel.setText(errorMessage[errorCode]);
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    /**
     * エラーメッセージをクリアする.
     */
    // =========================================================================
    private void clearErrorMessage() {
        // ---------------------------------------------------------------------
        errorMsgLabel.setText("");
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    /**
     * ビューを更新する.
     */ 
    // =========================================================================
    private void update() {
        // ---------------------------------------------------------------------
        // カウント値を表示する
        countLabel.setText( Integer.toString(counter.getCount()) );
        // ---------------------------------------------------------------------
        // エラーメッセージを表示する
        printErrorMessage( errorCode );
        // ---------------------------------------------------------------------
    }
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
        // Nimbusルック＆フィールの設定
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
        // フォームの生成と表示 (正式な方法)
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
    private javax.swing.JButton downButton;
    private javax.swing.JDialog errorMsgDialog;
    private javax.swing.JLabel errorMsgLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
    // =========================================================================
}
// =============================================================================
