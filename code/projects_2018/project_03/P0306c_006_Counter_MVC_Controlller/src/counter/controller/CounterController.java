// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2018年度・ソフトウェア工学実習
// Counter 2018-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package counter.controller;
// =============================================================================
import counter.model.RangedCounter;
import counter.view.CounterViewPanel;
// =============================================================================
/**
 * カウンタ(CounterController): コントローラ.
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
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
public class CounterController {
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// 属性(カウンタ) ////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [参照属性] カウンタ・モデル.
     */
    // =========================================================================
    private RangedCounter counter = null;
    // =========================================================================
    /**
     * [参照属性] カウンタ・ビュー.
     */
    // =========================================================================
    private CounterViewPanel counterView = null;
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// コンストラクタ(初期化) ////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [コンストラクタ] 初期化する.
     * 
     * @param counter カウンタ・モデル.
     * @param counterView カウンタ・ビュー.
     */
    // =========================================================================
    public CounterController(RangedCounter counter, CounterViewPanel counterView ) {
        // ---------------------------------------------------------------------
        // モデルの参照を保持する
        this.counter = counter;
        // ---------------------------------------------------------------------
        // ビューの参照を保持する
        this.counterView = counterView;
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    /**
     * カウンタをカウントアップする.
     */
    // =========================================================================
    public void up() {
        // ---------------------------------------------------------------------
        counterView.clearErrorMessage();
        // ---------------------------------------------------------------------
        try {
            counter.up();
        } catch (IllegalStateException e) {
            counterView.displayErrorMessage(e.getMessage());
        }
        // ---------------------------------------------------------------------
        update();
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    /**
     * カウンタをカウントダウンする.
     */
    // =========================================================================
    public void down() {
        // ---------------------------------------------------------------------
        counterView.clearErrorMessage();
        // ---------------------------------------------------------------------
        try {
            counter.down();
        } catch (IllegalStateException e) {
            counterView.displayErrorMessage(e.getMessage());
        }
        // ---------------------------------------------------------------------
        update();
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    /**
     * カウンタをリセットする.
     */
    // =========================================================================
    public void reset() {
        // ---------------------------------------------------------------------
        counterView.clearErrorMessage();
        // ---------------------------------------------------------------------
        counter.reset();
        // ---------------------------------------------------------------------
        update();
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    /**
     * ビューを更新する.
     */
    // =========================================================================
    public void update() {
        // ---------------------------------------------------------------------
        counterView.update();
        // ---------------------------------------------------------------------
    }
    // =========================================================================
}
// =============================================================================
