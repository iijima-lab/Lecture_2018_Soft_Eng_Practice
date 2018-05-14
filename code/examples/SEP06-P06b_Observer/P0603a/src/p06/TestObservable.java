// =============================================================================
// 45678901234567890123456789012345678901234567890123456789012345678901234567890
// =============================================================================
// ソフトウェア工学実習 iijima@ae.keio.ac.jp
// =============================================================================
package p06;
// =============================================================================
import java.util.Observer;
import java.util.Observable;
// -----------------------------------------------------------------------------
import java.util.Calendar;
import java.text.SimpleDateFormat;
// =============================================================================
/**
 * ソフトウェア工学実習
 * @author iijima@ae.keio.ac.jp
 */
// =============================================================================
public class TestObservable extends Observable implements Runnable{
    // =========================================================================
    /**
     * [値属性] カウント.
     */
    // -------------------------------------------------------------------------
    private int count = 0;
    // =========================================================================
    /**
     * [参照属性] カレンダー
     */
    // -------------------------------------------------------------------------
    private Calendar cal = null;

    private SimpleDateFormat dateFormat = null;
    // =========================================================================
    /**
     * [コンストラクタ] 初期化する.
     */
    // -------------------------------------------------------------------------
    public TestObservable() {
	    // ---------------------------------------------------------------------
        count = 0;
	    // ---------------------------------------------------------------------
        dateFormat = new SimpleDateFormat("hh時mm分ss秒");
	    // ---------------------------------------------------------------------
    }
    // =========================================================================
    /**
     * 変更通知する.
     */
    // -------------------------------------------------------------------------
    private void changed() {
        // ---------------------------------------------------------------------
        setChanged();
        notifyObservers(); // カウント値をpushしない．
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    /**
     * 3秒に一度，カウントアップし続ける．
     */
    // -------------------------------------------------------------------------
    public void run() {
        // ---------------------------------------------------------------------
        count = 0;
        while ( true ) {
            count++;      // カウントアップ
			cal = Calendar.getInstance();
            System.out.printf( "カウンタをカウントアップしました (%s)\n", 
			                   dateFormat.format(cal.getTime()) );
            changed();    // イベント通知
            try {
                Thread.sleep( 3000 ); // 3秒休止
            } catch ( InterruptedException ex ) {
                System.exit( 1 );
            }
        }
        // ---------------------------------------------------------------------
    }
    // =========================================================================
    public int getCount() {
        // ---------------------------------------------------------------------
        return( count );
        // ---------------------------------------------------------------------
    }
    // =========================================================================
}
// =============================================================================