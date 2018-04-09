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
import counter.controller.*;
import java.awt.FlowLayout;
// =============================================================================
/**
 * カウンタ(Counter): フレーム.
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
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
public class CounterFrame extends javax.swing.JFrame {

    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// 属性 //////////////////////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [参照属性] モデル: カウンタ.
     */
    // =========================================================================
    private CounterRanged aCounter = null;
    // =========================================================================
    /**
     * [参照属性] ビュー.
     */
    // =========================================================================
    private CounterView aView = null;
    // =========================================================================
    /**
     * [参照属性] コントローラ.
     */
    // =========================================================================
    private CounterController aController = null;

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
        /* ビューの生成 */
        aView = new CounterView( aCounter );
        viewPlaceHolderPanel.setLayout(new FlowLayout());
        viewPlaceHolderPanel.add(aView);
        // ---------------------------------------------------------------------
        /* コントローラの生成 */
        aController = new CounterController(aCounter,aView);
        controllerPlaceHolderPanel.setLayout(new FlowLayout());
        controllerPlaceHolderPanel.add(aController);
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

        controllerPlaceHolderPanel = new javax.swing.JPanel();
        viewPlaceHolderPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controllerPlaceHolderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout controllerPlaceHolderPanelLayout = new javax.swing.GroupLayout(controllerPlaceHolderPanel);
        controllerPlaceHolderPanel.setLayout(controllerPlaceHolderPanelLayout);
        controllerPlaceHolderPanelLayout.setHorizontalGroup(
            controllerPlaceHolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        controllerPlaceHolderPanelLayout.setVerticalGroup(
            controllerPlaceHolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        viewPlaceHolderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout viewPlaceHolderPanelLayout = new javax.swing.GroupLayout(viewPlaceHolderPanel);
        viewPlaceHolderPanel.setLayout(viewPlaceHolderPanelLayout);
        viewPlaceHolderPanelLayout.setHorizontalGroup(
            viewPlaceHolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        viewPlaceHolderPanelLayout.setVerticalGroup(
            viewPlaceHolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controllerPlaceHolderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewPlaceHolderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controllerPlaceHolderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPlaceHolderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel controllerPlaceHolderPanel;
    private javax.swing.JPanel viewPlaceHolderPanel;
    // End of variables declaration//GEN-END:variables
    // =========================================================================
}
// =============================================================================
