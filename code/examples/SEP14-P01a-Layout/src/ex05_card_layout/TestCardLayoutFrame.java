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
package ex05_card_layout;
// =======================================================
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
// =======================================================
/**
 * [Java例題] P0001-Layout: CardLayout
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * 2015-06-22 iijima 再調整:   NetBeans Projectとして再配布 <br>
 * 2015-04-27 iijima 新規作成: プレインなJavaファイル+バッチファイルで配布 <br>
 */
// =======================================================
public class TestCardLayoutFrame extends JFrame implements ActionListener {
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
    private CardLayout aLayoutManager = null;
    // ===================================================
    // レイアウトのテスト用のGUI部品

    // ---------------------------------------------------
    /**
     * パネル
     */
    // ---------------------------------------------------
    private JPanel[] aPanelArray = null;
    private int numberOfPanels = 0;
    // --------------------------------------------
    // 操作用のGUI部品
    private JPanel    aControlPanel = null;
    private JButton    firstButton  = null;
    private JButton    prevButton   = null;
    private JButton    nextButton   = null;
    private JButton    lastButton   = null;
    private JButton    jumpButton   = null;
    private JTextField nameField    = null;
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
    public TestCardLayoutFrame() {
        // -----------------------------------------------
        // (1) テスト用フレームの準備
        initializeTestFrame( "レイアウト: CardLayout" );
        // -----------------------------------------------
        // (2) パネルのレイアウトマネージャの準備
        aLayoutManager = new CardLayout();
        aTestPanel.setLayout( aLayoutManager );
        // -----------------------------------------------
        // (3) GUI部品のパネルへの追加
        addComponents();
        // -----------------------------------------------
        // (4) 操作用GUI部品のフレームへの追加
        addControlPanel();
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
        numberOfPanels = 5;
        aPanelArray = new JPanel[numberOfPanels];
        // -----------------------------------------------
        for ( int i = 0; i < numberOfPanels; i++ ) {
            aPanelArray[i] = new JPanel();
            aTestPanel.add( aPanelArray[i], "パネル[" + i +"]" );
            // -------------------------------------------
            JLabel aLabel = new JLabel( "パネル[" + i +"]" );
            aLabel.setFont( aFont );
            aPanelArray[i].add( aLabel );
        }
        // -----------------------------------------------
    }
    // ===================================================
    /**
     * 操作用パネルの生成と追加
     */
    // ---------------------------------------------------
    private void addControlPanel() {
        // -----------------------------------------------
        aControlPanel = new JPanel();
        add( aControlPanel, BorderLayout.SOUTH );
        // -----------------------------------------------
        firstButton = addControlButton( "先頭" );
        prevButton  = addControlButton( "前へ" )  ;
        nextButton  = addControlButton( "次へ" );
        lastButton  = addControlButton( "最後" );
        // -----------------------------------------------
        jumpButton  = addControlButton( "移動" );
        nameField   = new JTextField( "0" );
        nameField.setFont( aFont );
        nameField.setPreferredSize( new Dimension(100, 40) );
        aControlPanel.add( nameField );
        // -----------------------------------------------
        
    }
    // ---------------------------------------------------
    /**
     * 操作用ボタンの追加
     * @param text ボタンのテキスト
     * @return 操作用ボタン
     */
    // ---------------------------------------------------
    private JButton addControlButton( String text ) {
        // -----------------------------------------------
        JButton aButton = new JButton( text );
        aButton.setFont( aFont );
        aButton.addActionListener( this );
        aButton.setActionCommand( text );
        aControlPanel.add( aButton );
        // -----------------------------------------------
        return( aButton );
        // -----------------------------------------------
    }
    // ---------------------------------------------------
    /**
     * 操作用ボタンのクリック時のイベントハンドラ
     * @param e アクションイベント
     */
    // ---------------------------------------------------
    public void actionPerformed( ActionEvent e ){
        // -----------------------------------------------
        // イベントからのコマンドの取得
        String command = e.getActionCommand();
        // -----------------------------------------------
        // 各コマンドへの振り分け
        if ( command.equals( "先頭" ) ){
            aLayoutManager.first( aTestPanel );
        } else if ( command.equals( "前へ" ) ){
            aLayoutManager.previous( aTestPanel );
        } else if ( command.equals( "次へ" ) ){
            aLayoutManager.next( aTestPanel );
        } else if ( command.equals( "最後" ) ){
            aLayoutManager.last( aTestPanel );
        } else if ( command.equals( "移動" ) ){
            System.out.println( "パネル[" + nameField.getText() + "]" );
            aLayoutManager.show( aTestPanel, "パネル[" + nameField.getText() + "]" );
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
