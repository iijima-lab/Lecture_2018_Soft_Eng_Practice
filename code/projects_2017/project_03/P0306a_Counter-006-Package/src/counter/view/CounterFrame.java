// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2017年度・ソフトウェア工学実習
// Counter 2017-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package counter.view;
// =============================================================================

import counter.model.*;
// =============================================================================

/**
 * カウンタ(Counter): フレーム.
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * ---- 0306a-006-20170424a [iijima] カウンタ(Counter)  パッケージの分割<br>
 * ---- 0305e-005-20170421a [iijima] カウンタ(Counter)  継承の導入(属性をprotectedに変更)<br>
 * ---- 0305d-005-20170421a [iijima] カウンタ(Counter)  継承の導入(suprerの利用)<br>
 * ---- 0305c-005-20170421a [iijima] カウンタ(Counter)  継承の導入(メソッドのオーバーライド; アクセッサによるアクセス)<br>
 * ---- 0305b-005-20170421a [iijima] カウンタ(Counter)  継承の導入(メソッドのオーバーライド; 属性をpublicに変更)<br>
 * ---- 0305a-005-20170421a [iijima] カウンタ(Counter)  継承の導入(属性/メソッドの追加)<br>
 * ---- 0304a-004-20170417a [iijima] カウンタ(Counter)  進捗バーによる多重ビュー<br>
 * ---- 0303b-003-20170417a [iijima] カウンタ(Counter)  モデルに限界値を格納し，上限値もチェックする<br>
 * ---- 0303a-003-20170417a [iijima] カウンタ(Counter)  エラーを例外で識別する<br>
 * ---- 0302c-002-20170414a [iijima] カウンタ(Counter)  エラーメッセージをモデル中の配列で管理する<br>
 * ---- 0302b-002-20170414a [iijima] カウンタ(Counter)  エラーメッセージを配列で管理する<br>
 * ---- 0302a-002-20170414a [iijima] カウンタ(Counter)  エラーコードでエラーを識別する<br>
 * ---- 0301c-001-20170414a [iijima] カウンタ(Counter)　共通部分をprivateの下請けメソッドに抽出する<br>
 * ---- 0301b-001-20170414a [iijima] カウンタ(Counter)　モデルを抽出する(MVCの分離)<br>
 * ---- 0301a-001-20170410a [iijima] カウンタ(Counter)　ボタンを増やして機能を拡張する
 */
// =============================================================================
public class CounterFrame extends javax.swing.JFrame {
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// 属性(カウンタ) ////////////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================

    /**
     * [参照属性] カウンタ.
     */
    // =========================================================================
    private CounterRanged aCounter = null;

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
        /* モデル・オブジェクトの生成 */
        aCounter = new CounterRanged();
        // ---------------------------------------------------------------------
        /* 進捗バーの上限値と下限値の設定 */
        countBar.setMaximum(aCounter.getMax());
        countBar.setMinimum(aCounter.getMin());
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
     * ---- ※コンストラクタから呼ばれる<br>
     * ---- ※(フォームエディタから生成されるので編集不可)
     */
    // -------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        countLabel = new javax.swing.JLabel();
        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        errLabel = new javax.swing.JLabel();
        countBar = new javax.swing.JProgressBar();

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

        downButton.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        downButton.setText(" down");
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

        errLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        errLabel.setForeground(new java.awt.Color(255, 0, 0));
        errLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(countLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(upButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(downButton)
                                .addGap(18, 18, 18)
                                .addComponent(resetButton)))
                        .addGap(0, 82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(countBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(downButton)
                        .addComponent(resetButton)))
                .addGap(34, 34, 34)
                .addComponent(countLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(countBar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
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
     *
     * @param evt アクションイベント
     */
    // ========================================================================= 
    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        clearErrorMessage();
        try {
            aCounter.up();
        } catch (IllegalStateException e) {
            displayErrorMessage(e.getMessage());
        }
        update();
    }//GEN-LAST:event_upButtonActionPerformed
    // =========================================================================
    /**
     * 「down」ボタンのイベントハンドラ.
     *
     * @param evt アクションイベント
     */
    // ========================================================================= 
    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        clearErrorMessage();
        try {
            aCounter.down();
        } catch (IllegalStateException e) {
            displayErrorMessage(e.getMessage());
        }
        update();
    }//GEN-LAST:event_downButtonActionPerformed
    // =========================================================================
    /**
     * 「reset」ボタンのイベントハンドラ.
     *
     * @param evt アクションイベント
     */
    // ========================================================================= 
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        clearErrorMessage();
        aCounter.reset();
        update();
    }//GEN-LAST:event_resetButtonActionPerformed
    // =========================================================================
    /**
     * ビューを更新する.
     */
    // =========================================================================
    private void update() {
        countLabel.setText(Integer.toString(aCounter.getCount()));
        countBar.setValue(aCounter.getCount());
    }

    // =========================================================================
    /**
     * エラーメッセージをクリアする.
     */
    // =========================================================================
    private void clearErrorMessage() {
        errLabel.setText("");
    }

    // =========================================================================
    /**
     * エラーメッセージを表示する.
     *
     * @param errMsg エラーメッセージ
     */
    // =========================================================================
    private void displayErrorMessage(String errMsg) {
        System.err.println(errMsg);
        errLabel.setText(errMsg);
    }

    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// [Static] メソッド /////////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * メインメソッド.
     *
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
    private javax.swing.JProgressBar countBar;
    private javax.swing.JLabel countLabel;
    private javax.swing.JButton downButton;
    private javax.swing.JLabel errLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
    // =========================================================================
}
// =============================================================================
