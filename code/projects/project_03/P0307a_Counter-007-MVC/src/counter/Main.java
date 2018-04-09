// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2017年度・ソフトウェア工学実習
// Counter 2017-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package counter;
// =============================================================================
import counter.view.*;
// =============================================================================
/**
 * カウンタ(Counter): メイン.
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
public class Main {
    // =========================================================================
    /**
     * メインメソッド.
     * @param args コマンド行引数
     */
    // =========================================================================
    public static void main(String[] args) {
        // ---------------------------------------------------------------------
         new CounterFrame().setVisible(true);
        // ---------------------------------------------------------------------
    }
    // =========================================================================
}
// =============================================================================
