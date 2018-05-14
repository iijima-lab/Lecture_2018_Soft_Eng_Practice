// =======================================================
/*
 * 2015年度ソフトウェア工学実習: [Java例題] P0002-Event
 *                      2015-06-22
 *                      飯島 正 (iijima@ae.keio.ac.jp)
 * -------------------------------------------------------
 * P0002a-Event-20150622 iijima 2015-04-27に配布したものを再調整
 * -------------------------------------------------------
 */
// =======================================================
package ex07_item_event;
// =======================================================

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


// =======================================================
// =======================================================

/**
 * [Java例題] P0002-Event: Itemイベント<br>
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * 2015-06-22 iijima 再調整: NetBeans Projectとして再配布 <br>
 * 2015-04-27 iijima 新規作成: プレインなJavaファイル+バッチファイルで配布 <br>
 */
// =======================================================
public class TestItemEventFrame extends JFrame {
// =======================================================
    // ===================================================
    // ///////////////////////////////////////////////////
    // ///// フィールド変数 //////////////////////////////
    // ///////////////////////////////////////////////////
    // ===================================================
    // ///// GUI 部品 ////////////////////////////////////
    // ===================================================
    // パネルとフォント
    // ---------------------------------------------------

    /**
     * テスト用のパネル
     */
    // ---------------------------------------------------
    private JPanel aTestPanel = null;
    // ---------------------------------------------------
    /**
     * 結果表示用のパネル
     */
    // ---------------------------------------------------
    private JPanel aResultPanel = null;
    // ---------------------------------------------------
    /**
     * 結果表示用のテキストエリア
     */
    // ---------------------------------------------------
    private JTextArea aResultTextArea = null;
    // ---------------------------------------------------   

    /**
     * フォント
     */
    // ---------------------------------------------------
    private Font aFont = null;
    // ---------------------------------------------------
    // Itemイベントを発生させるGUI部品
    
    // ---------------------------------------------------
    /**
     * チェックボックス(Itemイベントを発生させる)
     */
    
    // ---------------------------------------------------
    private JCheckBox aCheckBox = null;
    // ===================================================
    // ===================================================
    // ///////////////////////////////////////////////////
    // ///// メソッド (コンストラクタ) ///////////////////
    // ///////////////////////////////////////////////////
    // ===================================================
    /**
     * 【コンストラクタ】 GUI部品の配置とイベントリスナーの登録
     */
    // ---------------------------------------------------
    public TestItemEventFrame() {
        // -----------------------------------------------
        // (1) テスト用フレームの準備
        initializeTestFrame( "Itemイベントのテスト" );
        // ----------------------------------------
        // (2) Itemイベントを発効するGUI部品のパネルへの追加
        aCheckBox = new JCheckBox( "チェックボックス" );
        aCheckBox.setFont( aFont );
        aTestPanel.add( aCheckBox );
        // ----------------------------------------
        // (3) Itemイベントのリスナー登録
        aCheckBox.addItemListener( new TestItemEventListener() );
        // ----------------------------------------
        // (4) GUI部品の調整
        pack();
        // ----------------------------------------
    }
    // ===================================================
    /**
     * テスト用フレームの初期化
     * @param title タイトルバーの文字列
     */
    // ---------------------------------------------------
    private void initializeTestFrame(String title) {
        // -----------------------------------------------
        // (1) フレームの準備
        setTitle(title);
        setPreferredSize(new Dimension(600, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // -----------------------------------------------
        // (2) パネルのレイアウトマネージャの準備
        setLayout(new BorderLayout());
        // -----------------------------------------------
        // (3) フォントの準備
        aFont = new Font("ＭＳ ゴシック", Font.PLAIN, 28);
        // -----------------------------------------------
        // (4) テスト用パネルの準備
        aTestPanel = new JPanel();
        add(aTestPanel, BorderLayout.CENTER);
        // -----------------------------------------------
        // (5) 結果表示用パネルの準備
        aResultTextArea = new JTextArea(5, 40);
        aResultTextArea.setFont(aFont);
        JScrollPane aScrollPane = new JScrollPane(aResultTextArea);
        aResultPanel = new JPanel();
        aResultPanel.add(aScrollPane);
        add(aResultPanel, BorderLayout.SOUTH);
        // -----------------------------------------------
    }

    // ===================================================
    // ///////////////////////////////////////////////////
    // ///// イベントハンドラー //////////////////////////
    // ///////////////////////////////////////////////////
    // ===================================================
    // ===================================================
    /**
     * イベントリスナー
     * 
     * ※ItemListenerインタフェースを実装する代わりに<br>
     * ※ItemApapterクラスを継承することで，<br>
     * ※関心のあるハンドラーだけをオーバライドすることができる
     */
    // ---------------------------------------------------
    class TestItemEventListener implements ItemListener {
        // -----------------------------------------------
        /**
         * アイテムstateChangeイベントのハンドラー
         * @param e アイテムイベント
         */
        // -----------------------------------------------
        public void itemStateChanged( ItemEvent e ) {
            // -------------------------------------------
            if ( e.getStateChange() == ItemEvent.SELECTED ) {
                String message = "選択された";
                outputResult( message );
            } else if ( e.getStateChange() == ItemEvent.DESELECTED ) {
                String message = "選択が外された";
                outputResult( message );
            }
            // -------------------------------------------
        }
        // ===============================================
        /**
         * 結果表示
         * @param message 表示する結果
         */
        // -----------------------------------------------        
        private void outputResult( String message ) {
            // -------------------------------------------
            System.out.println(message);
            aResultTextArea.append(message + "\n");
            // -------------------------------------------
        }
        // ===============================================
    }
    // ===================================================
}
// =======================================================
