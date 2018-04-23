// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2018年度・ソフトウェア工学実習
// SimpleCounter 2018-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package counter.view;
// =============================================================================
import counter.model.RangedCounter;
import counter.model.SimpleCounter;
// -----------------------------------------------------------------------------
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
// =============================================================================
/**
 * カウンタ(CounterFrame): フレーム.
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
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
    private RangedCounter counter = null;
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
        counter = new RangedCounter();
        // ---------------------------------------------------------------------
        // 進捗バー（グラフィカルビュー）の初期化
        countBar.setMaximum(counter.getMax());
        countBar.setMinimum(counter.getMin());
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
        downButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        errorMsgLabel = new javax.swing.JLabel();
        countBar = new javax.swing.JProgressBar();

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(countLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(errorMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(countBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(upButton)
                                .addGap(34, 34, 34)
                                .addComponent(downButton)
                                .addGap(18, 18, 18)
                                .addComponent(resetButton)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(countLabel)
                .addGap(18, 18, 18)
                .addComponent(countBar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(downButton)
                        .addComponent(resetButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        clearErrorMessage();
        // ---------------------------------------------------------------------
        try {
            counter.up();
        } catch (IllegalStateException e) {
            printErrorMessage(e.getMessage());
        }
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
        clearErrorMessage();
        // ---------------------------------------------------------------------
        try {
            counter.down();
        } catch (IllegalStateException e) {
            printErrorMessage(e.getMessage());
        }
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
        clearErrorMessage();
        // ---------------------------------------------------------------------
        counter.reset();
        // ---------------------------------------------------------------------
        update();
        // ---------------------------------------------------------------------
    }//GEN-LAST:event_resetButtonActionPerformed
    // =========================================================================
    /**
     * エラーメッセージを表示する.
     */
    // =========================================================================
    private void printErrorMessage(String errorMessage) {
        // ---------------------------------------------------------------------
        // コンソールへエラーメッセージを表示する
        System.err.println(errorMessage);
        // ---------------------------------------------------------------------
        // フレームへエラーメッセージを表示する
        errorMsgLabel.setText(errorMessage);
        // ---------------------------------------------------------------------
        // オプションペインをポップアップしエラーメッセージを表示する
        JLabel dialogLabel = new JLabel(errorMessage);
        dialogLabel.setForeground(Color.RED);
        JOptionPane.showMessageDialog(this, dialogLabel);
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
        // カウント値を数字（テキスチュアルビュー）で表示する
        countLabel.setText(Integer.toString(counter.getCount()));
        // ---------------------------------------------------------------------
        // カウント値を進捗バー（グラフィカルビュー）で表示する
        countBar.setValue(counter.getCount());
        // ---------------------------------------------------------------------
    }
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
    private javax.swing.JProgressBar countBar;
    private javax.swing.JLabel countLabel;
    private javax.swing.JButton downButton;
    private javax.swing.JLabel errorMsgLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
    // =========================================================================
}
// =============================================================================
