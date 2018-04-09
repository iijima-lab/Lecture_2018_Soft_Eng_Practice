// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2017年度・ソフトウェア工学実習
// Counter 2017-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package counter.model;
// =============================================================================
/**
 * カウンタ(Counter): モデル(カウンタ).
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
public class Counter {
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// 属性(カウンターの内部状態) ////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [値属性] カウント値.
     */
    // =========================================================================
    protected int count = 0; // <--------- protectedに替える
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// コンストラクタ (初期化) ///////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [コンストラクタ] 初期化する.
     */
    // =========================================================================
    public Counter() {
        count = 0;
    }
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// インスタンスメソッド //////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * カウントアップする.
     */
    // =========================================================================
    public void up() {
        count++;
    }
    // =========================================================================
    /**
     * カウントダウンする.
     */
    // =========================================================================
    public void down() {
        if (count > 0) {
            count--;
        } else {
            throw new IllegalStateException( "ゼロなのにダウンさせようとした");
        }
    }
    // =========================================================================
    /**
     * カウントをリセットする.
     */
    // =========================================================================
    public void reset() {
        count = 0;
    }
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// インスタンスメソッド: アクセッサ //////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [setter] カウント値を返す.
     *
     * @return カウント値.
     */
    // =========================================================================
    public int getCount() {
        return (count);
    }
    // =========================================================================
    /**
     * [setter] カウント値を設定する.
     *
     * @param count 設定するカウント値.
     */
    // =========================================================================
    public void setCount(int count) {
        if (count >= 0) {
            this.count = count;
        } else {
            throw new IllegalStateException("カウンタに不正な値をセットしようとした");
        }
    }
    // =========================================================================
}
// =============================================================================
