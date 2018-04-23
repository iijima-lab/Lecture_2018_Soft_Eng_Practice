// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2018年度・ソフトウェア工学実習
// Counter 2018-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package counter.view;
// =============================================================================
import counter.controller.CounterController;
import counter.model.Counter;
// =============================================================================
/**
 * カウンタ(CounterControlPanel): コントロールパネル.
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * ---- 0306d-006-20180427a [iijima] カウンタ(Counter)  Viewの細分化<br>
 * ---- 0306c-006-20180427a [iijima] カウンタ(Counter)  Controllerの分離<br>
 * ---- 0306b-006-20180427a [iijima] カウンタ(Counter)  Viewの分離<br>
 * ---- 0306a-006-20180427a [iijima] カウンタ(Counter)  MVCパッケージの分割<br>
 * ---- 0305e-005-20180423a [iijima] カウンタ(Counter)  継承の導入(属性をprotectedに変更)<br>
 * ---- 0305d-005-20180423a [iijima] カウンタ(Counter)  継承の導入(suprerの利用)<br>
 * ---- 0305c-005-20180423a [iijima] カウンタ(Counter)  △継承の導入(メソッドのオーバーライド; アクセッサによるアクセス)<br>
 * ---- 0305b-005-20180423a [iijima] カウンタ(Counter)  継承の導入(メソッドのオーバーライド; 属性をpublicに変更)<br>
 * ---- 0305a-005-20180423a [iijima] カウンタ(Counter)  △継承の導入(属性/メソッドの追加)<br>
 * ---- 0304a-004-20180423a [iijima] カウンタ(Counter)  進捗バーを追加し多重ビューを実現する<br>
 * ---- 0303b-003-20180420a [iijima] カウンタ(Counter)  モデルに限界値を格納し，上限値もチェックする<br>
 * ---- 0303a-003-20180420a [iijima] カウンタ(Counter)  エラーを例外で識別する<br>
 * ---- 0302f-002-20180420a [iijima] カウンタ(Counter)  パッケージの導入<br>
 * ---- 0302e-002-20180420a [iijima] カウンタ(Counter)  JOptionPaneによるエラーメッセージの表示<br>
 * ---- 0302d-002-20180420a [iijima] カウンタ(Counter)  JDialogによるエラーメッセージの表示<br>
 * ---- 0302b-002-20180416a [iijima] カウンタ(Counter)  エラーメッセージを配列で管理する<br>
 * ---- 0302a-002-20180416a [iijima] カウンタ(Counter)  エラーコードでエラーを識別する<br>
 * ---- 0301c-001-20180416a [iijima] カウンタ(Counter)　共通部分をprivateの下請けメソッドに抽出する<br>
 * ---- 0301b-001-20180416a [iijima] カウンタ(Counter)　モデルを抽出する(MVCの分離)<br>
 * ---- 0301a-001-20180413a [iijima] カウンタ(Counter)　モデル抽出前の準備(0201a-001のコピー)
 */
// =============================================================================
public class CounterControlPanel extends javax.swing.JPanel {
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// 属性(カウンタ) ////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [参照属性] カウンタ・コントローラ..
     */
    // =========================================================================
    private CounterController controller = null;
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// コンストラクタ(初期化) ////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [コンストラクタ] 初期化する.
     * 
     * @param controller カウンタ・コントローラ.
     */
    // =========================================================================
    public CounterControlPanel(
                CounterController controller ) {
        // ---------------------------------------------------------------------
        // NetBeansがフォームから自動生成したGUI部品の初期化
        initComponents();
        // ---------------------------------------------------------------------
        // コントローラの参照を保持する
        this.controller = controller;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(upButton)
                    .addGap(34, 34, 34)
                    .addComponent(downButton)
                    .addGap(18, 18, 18)
                    .addComponent(resetButton)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(upButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(downButton)
                            .addComponent(resetButton)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
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
        controller.up();
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
        controller.down();
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
        controller.reset();
        // ---------------------------------------------------------------------
    }//GEN-LAST:event_resetButtonActionPerformed

    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// [Static] メソッド /////////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================

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
