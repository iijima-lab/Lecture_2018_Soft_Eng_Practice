// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// 慶應義塾大学・理工学部・飯島研究室
// 2018年度・ソフトウェア工学実習
// Counter 2018-04 飯島 正 (iijima@ae.keio.ac.jp)
// =============================================================================
// =============================================================================
/**
 * カウンタ(Counter): モデル(カウンタ).
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * ---- 0301b-001-20180416a [iijima] カウンタ(Counter)　モデルを抽出する(MVCの分離)<br>
 * ---- 0301a-001-20180413a [iijima] カウンタ(Counter)　モデル抽出前の準備(0201a-001のコピー)
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
    // ///// インスタンスメソッド //////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////
    // =========================================================================
    /**
     * カウントアップする.
     */
    // =========================================================================
    public void up() {
        // ---------------------------------------------------------------------
        count++;
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    /**
     * カウントダウンする.
     */
    // =========================================================================
    public void down() {
        // ---------------------------------------------------------------------
        if ( count > 0 ) {
            // -----------------------------------------------------------------
            count--;
            // -----------------------------------------------------------------
        }
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    /**
     * カウントをリセットする.
     */
    // =========================================================================
    public void reset() {
        // ---------------------------------------------------------------------
        count = 0;
        // ---------------------------------------------------------------------
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
        // ---------------------------------------------------------------------
        return( count );
        // ---------------------------------------------------------------------
    }
    // =========================================================================
}
// =============================================================================
