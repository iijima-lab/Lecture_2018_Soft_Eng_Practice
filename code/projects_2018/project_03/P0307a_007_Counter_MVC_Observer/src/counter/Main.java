// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2018年度・ソフトウェア工学実習
// Counter2 2018-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package counter;
// =============================================================================
import counter.model.Counter;
import counter.view.CounterFrame;
// =============================================================================
/**
 * カウンタ(Main): メイン.
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 ---- 0306d-006-20180427a [iijima] カウンタ(Counter2)  Viewの細分化<br>
 ---- 0306c-006-20180427a [iijima] カウンタ(Counter2)  Controllerの分離<br>
 ---- 0306b-006-20180427a [iijima] カウンタ(Counter2)  Viewの分離<br>
 ---- 0306a-006-20180427a [iijima] カウンタ(Counter2)  MVCパッケージの分割<br>
 ---- 0305e-005-20180423a [iijima] カウンタ(Counter2)  継承の導入(属性をprotectedに変更)<br>
 ---- 0305d-005-20180423a [iijima] カウンタ(Counter2)  継承の導入(suprerの利用)<br>
 ---- 0305c-005-20180423a [iijima] カウンタ(Counter2)  △継承の導入(メソッドのオーバーライド; アクセッサによるアクセス)<br>
 ---- 0305b-005-20180423a [iijima] カウンタ(Counter2)  継承の導入(メソッドのオーバーライド; 属性をpublicに変更)<br>
 ---- 0305a-005-20180423a [iijima] カウンタ(Counter2)  △継承の導入(属性/メソッドの追加)<br>
 ---- 0304a-004-20180423a [iijima] カウンタ(Counter2)  進捗バーを追加し多重ビューを実現する<br>
 ---- 0303b-003-20180420a [iijima] カウンタ(Counter2)  モデルに限界値を格納し，上限値もチェックする<br>
 ---- 0303a-003-20180420a [iijima] カウンタ(Counter2)  エラーを例外で識別する<br>
 ---- 0302f-002-20180420a [iijima] カウンタ(Counter2)  パッケージの導入<br>
 ---- 0302e-002-20180420a [iijima] カウンタ(Counter2)  JOptionPaneによるエラーメッセージの表示<br>
 ---- 0302d-002-20180420a [iijima] カウンタ(Counter2)  JDialogによるエラーメッセージの表示<br>
 ---- 0302b-002-20180416a [iijima] カウンタ(Counter2)  エラーメッセージを配列で管理する<br>
 ---- 0302a-002-20180416a [iijima] カウンタ(Counter2)  エラーコードでエラーを識別する<br>
 ---- 0301c-001-20180416a [iijima] カウンタ(Counter2)　共通部分をprivateの下請けメソッドに抽出する<br>
 ---- 0301b-001-20180416a [iijima] カウンタ(Counter2)　モデルを抽出する(MVCの分離)<br>
 ---- 0301a-001-20180413a [iijima] カウンタ(Counter2)　モデル抽出前の準備(0201a-001のコピー)
 */
// =============================================================================
public class Main {
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
                // -------------------------------------------------------------
                // モデル・オブジェクトの生成
                Counter counter1 = new Counter("カウンタ-1");
                Counter counter2 = new Counter("カウンタ-2");
                // -------------------------------------------------------------
                // カウンタ・フレームの生成
                new CounterFrame(counter1).setVisible(true);
                new CounterFrame(counter2).setVisible(true);
            }
        });
        // ---------------------------------------------------------------------
    }
    // =========================================================================
}
// =============================================================================
