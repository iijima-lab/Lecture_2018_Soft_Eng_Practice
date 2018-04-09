// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2017年度・ソフトウェア工学実習
// Counter 2017-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
package counter;
// =============================================================================
/**
 * カウンタ(Counter): モデル(カウンタ).
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
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
    private int count = 0;
    // =========================================================================
    // /////////////////////////////////////////////////////////////////////////
    // ///// 属性(カウンタの上限値と下限値) ////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * [値属性] 下限値.
     */
    // =========================================================================
    private int min = 0;
    // =========================================================================
    /**
     * [値属性] 上限値.
     */
    // =========================================================================
    private int max = 20;
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
        min = 0;
        max = 20;
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
        if (count < max) {
            count++;
        } else {
            throw new IllegalStateException( 
                    String.format("カウントが上限値%dなのにアップさせようとした",max) );
        }
    }
    // =========================================================================
    /**
     * カウントダウンする.
     */
    // =========================================================================
    public void down() {
        if (count > min) {
            count--;
        } else {
            throw new IllegalStateException( 
                    String.format("カウントが下限値%dなのにダウンさせようとした", min) );
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
     * [getter] カウント値を返す.
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
        if (count >= min && count <= max) {
            this.count = count;
        } else {
            throw new IllegalStateException(
                    String.format("カウンタに不正な値%dをセットしようとした", count));
        }
    }
    // =========================================================================
    /**
     * [getter] 下限値を返す.
     * @return 下限値
     */
    // =========================================================================
    public int getMin() {
        return (min);
    }
    // =========================================================================
    /**
     * [getter] 上限値を返す.
     * @return 上限値
     */
    // =========================================================================
    public int getMax() {
        return (max);
    }
    // =========================================================================
    /**
     * [setter] 下限値を設定する.
     * @param min 下限値
     */
    // =========================================================================
    public void setMin(int min) {
        this.min = min;
    }
    // =========================================================================
    /**
     * [setter] 上限値を設定する.
     * @param max 上限値
     */
    // =========================================================================
    public void setMax(int max) {
        this.max = max;
    }
    // =========================================================================
}
// =============================================================================