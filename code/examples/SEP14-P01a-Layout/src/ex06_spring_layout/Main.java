// =======================================================
/*
 * 2015年度ソフトウェア工学実習: [Java例題] P0001-Layout
 *                      2015-06-22
 *                      飯島 正 (iijima@ae.keio.ac.jp)
 * -------------------------------------------------------
 * P0001a-Layout-20150622 iijima 2015-04-27に配布したものを再調整
 * -------------------------------------------------------
 */
// =======================================================
package ex06_spring_layout;
// =======================================================

import java.awt.EventQueue;

// =======================================================
// =======================================================
/**
 * [Java例題] P0001-Layout: SpringLayout
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * 2015-06-22 iijima 再調整:   NetBeans Projectとして再配布 <br>
 * 2015-04-27 iijima 新規作成: プレインなJavaファイル+バッチファイルで配布 <br>
 */
// =======================================================
// =======================================================
public class Main {
// =======================================================
    // ===================================================
    /**
     * メインメソッド (フレームの生成と表示)
     * @param args コマンド行引数(使用していない)
     */
    // ---------------------------------------------------
    public static void main(String[] args) {
        // -----------------------------------------------
        // フレームの生成と表示
        EventQueue.invokeLater( new Runnable() {
            public void run() {
                new TestSpringLayoutFrame().setVisible( true );
            }
        } );
        // -----------------------------------------------
        // SwingのUIコンポーネントの呼び出しは，
        // mainスレッドではなく，イベント・ディスパッチ・スレッド 
        // (EDT; event dispatch thread) で行うべきなので，
        // このように記述するが，通常は以下だけでも問題ない．
        // new TestFlowLayout().setVisible( true );
        // -----------------------------------------------
    }
    // ===================================================
}
// =======================================================
