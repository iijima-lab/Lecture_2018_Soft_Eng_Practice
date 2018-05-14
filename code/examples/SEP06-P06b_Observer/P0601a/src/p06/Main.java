// =======================================================
// ソフトウェア工学実習 iijima@ae.keio.ac.jp
// =======================================================
package p06;
// =======================================================
/**
 * ソフトウェア工学実習
 * @author iijima@ae.keio.ac.jp
 */
// =======================================================
public class Main {
    // ===================================================
    /**
     * メイン・メソッド
     * @param args コマンド行引数
     */
    // ===================================================
    public static void main( String[] args ) {
        // -----------------------------------------------
        TestObservable o = new TestObservable();
        // -----------------------------------------------
        o.addObserver( new TestObserver( "オブザーバ-A" ) );
        
        // -----------------------------------------------
        o.countUp();
        o.countUp();
        o.countUp();
        // -----------------------------------------------
    }
    // ===================================================
}
// =======================================================
