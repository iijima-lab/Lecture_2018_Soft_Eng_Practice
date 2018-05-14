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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
// =======================================================
/**
 * [Java例題] P0001-Layout: SpringLayout
 * 
 * 参考: http://www.javadrive.jp/tutorial/springlayout/index3.html<br>
 *       基本的に上記ページの例をそのまま借用しています
 * 
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * 2015-06-22 iijima 再調整:   NetBeans Projectとして再配布 <br>
 * 2015-04-27 iijima 新規作成: プレインなJavaファイル+バッチファイルで配布 <br>
 */
// =======================================================
public class TestSpringLayoutFrame extends JFrame {
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
    private SpringLayout aLayoutManager = null;
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
    public TestSpringLayoutFrame() {
        // -----------------------------------------------
        // (1) テスト用フレームの準備
        initializeTestFrame( "レイアウト: FlowLayout" );
        // -----------------------------------------------
        // (2) パネルのレイアウトマネージャの準備
        aLayoutManager = new SpringLayout();
        aTestPanel.setLayout( aLayoutManager );
        // -----------------------------------------------
        // (3) GUI部品のパネルへの追加
        addComponents();
        // ----------------------------------------
        // (4) レイアウト制約の設定
        putLayoutConstraints();
        // -----------------------------------------------
        // (5) GUI部品の調整
        pack();
        // -----------------------------------------------
    }
    
    // ===================================================
    /**
     * GUI部品のパネルへの追加
     */
    // ---------------------------------------------------
    private void addComponents() {
        // -----------------------------------------------
        numberOfButtons = 3;
        aButtonArray = new JButton[numberOfButtons];
        // -----------------------------------------------
        for ( int i = 0; i < numberOfButtons; i++ ) {
            aButtonArray[i] = new JButton( "ボタン[" + i +"]" );
            aButtonArray[i].setFont( aFont );
            aTestPanel.add( aButtonArray[i] );
        }
        // -----------------------------------------------
    }

    // ============================================
    /**
     * レイアウト制約の設定
     */
    // ---------------------------------------------------
    private void putLayoutConstraints() {
        // ----------------------------------------
        // putConstraint( 依存するエッジ, 
        //                依存するコンポーネント,
        //                依存する側とされる側の間の固定距離,
        //                依存されるエッジ,
        //                依存されるコンポーネント )
        // ----------------------------------------
        // SpringLayout.NORTH   上端
        // SpringLayout.SOUTH   下端
        // SpringLayout.WEST    左端
        // SpringLayout.EAST    右端
        // ----------------------------------------
        // ボタン[0]の，上端はパネルの上端から50, 左端はパネルの左端から10
        aLayoutManager.putConstraint( SpringLayout.NORTH, aButtonArray[0], 50, SpringLayout.NORTH, aTestPanel );
        aLayoutManager.putConstraint( SpringLayout.WEST,  aButtonArray[0], 10, SpringLayout.WEST,  aTestPanel );
        // ----------------------------------------
        // ボタン[1]の，上端はパネルの上端から50, 右端はボタン[0]の右端から10
        aLayoutManager.putConstraint( SpringLayout.NORTH, aButtonArray[1], 50, SpringLayout.NORTH, aTestPanel );
        aLayoutManager.putConstraint( SpringLayout.WEST,  aButtonArray[1], 10, SpringLayout.EAST, aButtonArray[0] );
        // ----------------------------------------
        // ボタン[2]の，上端はボタン[1]の下端から10, 左端はボタン[1]の左端と同じ
        aLayoutManager.putConstraint( SpringLayout.NORTH, aButtonArray[2], 10, SpringLayout.SOUTH, aButtonArray[1] );
        aLayoutManager.putConstraint( SpringLayout.WEST,  aButtonArray[2],  0, SpringLayout.WEST,  aButtonArray[1] );
        // ----------------------------------------
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

