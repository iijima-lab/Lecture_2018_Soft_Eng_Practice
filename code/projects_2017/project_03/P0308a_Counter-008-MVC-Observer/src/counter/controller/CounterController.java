// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2017年度・ソフトウェア工学実習
// Counter 2017-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package counter.controller;
// =============================================================================
import counter.model.*;
import counter.view.*;
// =============================================================================
/**
 * カウンタ(Counter): コントローラ.
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * ---- 0308a-008-20170424a [iijima] カウンタ(Counter)  MVCの分離(Observer/Observable)<br>
 * ---- 0307b-007-20170424a [iijima] カウンタ(Counter)  クラス名の付け替え(CounterRanged-->Counter)<br>
 * ---- 0307a-007-20170424a [iijima] カウンタ(Counter)  MVCの分離(ViewとControllerの抽出)<br>
 * ---- 0306a-006-20170424a [iijima] カウンタ(Counter)  パッケージの分割<br>
 * ---- 0305e-005-20170421a [iijima] カウンタ(Counter)  継承の導入(属性をprotectedに変更)<br>
 * ---- 0305d-005-20170421a [iijima] カウンタ(Counter)  継承の導入(suprerの利用)<br>
 * ---- 0305c-005-20170421a [iijima] カウンタ(Counter)  継承の導入(メソッドのオーバーライド; アクセッサによるアクセス)<br>
 * ---- 0305b-005-20170421a [iijima] カウンタ(Counter)  継承の導入(メソッドのオーバーライド; 属性をpublicに変更)<br>
 * ---- 0305a-005-20170421a [iijima] カウンタ(Counter)  継承の導入(属性/メソッドのの追加)<br>
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
public class CounterController extends javax.swing.JPanel {
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// 属性 //////////////////////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [参照属性] モデル: カウンタ.
     */
    // =========================================================================
    private Counter aCounter = null;;
    // =========================================================================
    /**
     * [参照属性] ビュー.
     */
    // =========================================================================
    private CounterView aView = null;

    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// コンストラクタ(初期化) ////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [コンストラクタ] 初期化する.
     * 
     * @param aCounter コントローラ
     * @param aView ヴュー
     */
    // =========================================================================
    public CounterController(Counter aCounter,CounterView aView) {
        // ---------------------------------------------------------------------
        /* NetBeansがフォームから自動生成したGUI部品の初期化 */
        initComponents();
        // ---------------------------------------------------------------------
        this.aCounter = aCounter;
        this.aView = aView;
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

        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downButton)
                .addGap(18, 18, 18)
                .addComponent(resetButton)
                .addContainerGap(37, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
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
        aView.clearErrorMessage();
        try {
            aCounter.up();
        } catch (IllegalStateException e) {
            aView.displayErrorMessage(e.getMessage());
        }
        // aView.update(); <-- Observer/Observableによる変更通知でupdateするので不要
    }//GEN-LAST:event_upButtonActionPerformed
    // =========================================================================
    /**
     * 「down」ボタンのイベントハンドラ.
     *
     * @param evt アクションイベント
     */
    // ========================================================================= 
    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        aView.clearErrorMessage();
        try {
            aCounter.down();
        } catch (IllegalStateException e) {
            aView.displayErrorMessage(e.getMessage());
        }
        // aView.update(); <-- Observer/Observableによる変更通知でupdateするので不要
    }//GEN-LAST:event_downButtonActionPerformed
    // =========================================================================
    /**
     * 「reset」ボタンのイベントハンドラ.
     *
     * @param evt アクションイベント
     */
    // ========================================================================= 
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        aView.clearErrorMessage();
        aCounter.reset();
        // aView.update(); <-- Observer/Observableによる変更通知でupdateするので不要
    }//GEN-LAST:event_resetButtonActionPerformed
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// GUI部品の参照属性(フォーム管理;編集不可) //////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton downButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
    // =========================================================================
}
// =============================================================================
