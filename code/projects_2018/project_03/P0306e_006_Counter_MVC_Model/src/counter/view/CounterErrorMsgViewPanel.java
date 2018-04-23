// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2018年度・ソフトウェア工学実習
// Counter 2018-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package counter.view;
// =============================================================================
import counter.model.Counter;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
// =============================================================================
/**
 * カウンタ(CounterErrorMsgViewPanel): ビュー・パネル.
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
public class CounterErrorMsgViewPanel extends javax.swing.JPanel {
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// 属性(カウンタ) ////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [参照属性] カウンタ・モデル.
     */
    // =========================================================================
    private Counter counter = null;
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// コンストラクタ(初期化) ////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [コンストラクタ] 初期化する.
     * 
     * @param counter カウンタ・モデル.
     */
    // =========================================================================
    public CounterErrorMsgViewPanel(Counter counter) {
        // ---------------------------------------------------------------------
        // NetBeansがフォームから自動生成したGUI部品の初期化
        initComponents();
        // ---------------------------------------------------------------------
        // モデルの参照を保持する
        this.counter = counter;
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

        errorMsgLabel = new javax.swing.JLabel();

        errorMsgLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        errorMsgLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorMsgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(errorMsgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents


    // =========================================================================
    /**
     * エラーメッセージを表示する.
     */
    // =========================================================================
    public void display(String errorMessage) {
        // ---------------------------------------------------------------------
        // コンソールへエラーメッセージを表示する
        System.err.println( counter.getName() + ": " + errorMessage);
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
    public void clear() {
        // ---------------------------------------------------------------------
        errorMsgLabel.setText("");
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
    private javax.swing.JLabel errorMsgLabel;
    // End of variables declaration//GEN-END:variables
    // =========================================================================
}
// =============================================================================
