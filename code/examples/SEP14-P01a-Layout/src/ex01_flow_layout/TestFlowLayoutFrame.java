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
package ex01_flow_layout;
// =======================================================

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
// =======================================================
/**
 * [Java例題] P0001-Layout: FlowLayout
 * 
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * 2015-06-22 iijima 再調整:   NetBeans Projectとして再配布 <br>
 * 2015-04-27 iijima 新規作成: プレインなJavaファイル+バッチファイルで配布 <br>
 */
// =======================================================
public class TestFlowLayoutFrame extends JFrame {
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
     * パネル
     */
    // ---------------------------------------------------
    private JPanel aTestPanel = null;
    // ---------------------------------------------------
    /**
     * フォント
     */
    // ---------------------------------------------------
    private Font aFont = null;
    // ===================================================
    // レイアウトマネージャ
    private FlowLayout aLayoutManager = null;
    // ===================================================
    // レイアウトのテスト用のGUI部品

    // ---------------------------------------------------
    /**
     * ボタン
     */
    // ---------------------------------------------------
    private JButton[] aButtonArray = null;
    private int numberOfButtons = 0;
    // ---------------------------------------------------


    // ===================================================
    // ///////////////////////////////////////////////////
    // ///// メソッド (コンストラクタ) ///////////////////
    // ///////////////////////////////////////////////////
    // ===================================================
    // ===================================================

    /**
     * 【コンストラクタ】 GUI部品の配置
     */
    // ---------------------------------------------------
    public TestFlowLayoutFrame() {
        // -----------------------------------------------
        // (1) テスト用フレームの準備
        initializeTestFrame( "レイアウト: FlowLayout" );
        // -----------------------------------------------
        // (2) パネルのレイアウトマネージャの準備
        aLayoutManager = new FlowLayout();
        aTestPanel.setLayout( aLayoutManager );
        // -----------------------------------------------
        // (3) GUI部品のパネルへの追加
        addComponents();
        // -----------------------------------------------
        // (4) GUI部品の調整
        pack();
        // -----------------------------------------------
    }
    
    // ===================================================
    /**
     * GUI部品のパネルへの追加
     */
    private void addComponents() {
        // -----------------------------------------------
        numberOfButtons = 5;
        aButtonArray = new JButton[numberOfButtons];
        // -----------------------------------------------
        for ( int i = 0; i < numberOfButtons; i++ ) {
            aButtonArray[i] = new JButton( "ボタン[" + i +"]" );
            aButtonArray[i].setFont( aFont );
            aTestPanel.add( aButtonArray[i] );
        }

        // -----------------------------------------------
    }
    // ===================================================
    /**
     * テスト用フレームの初期化
     *
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
        setLayout( new BorderLayout() );
        // -----------------------------------------------
        // (3) フォントの準備
        aFont = new Font("ＭＳ ゴシック", Font.PLAIN, 28);
        // -----------------------------------------------
        // (4) テスト用パネルの準備
        aTestPanel = new JPanel();
        add(aTestPanel, BorderLayout.CENTER);
        // -----------------------------------------------
    }
    // ===================================================
}
// =======================================================
