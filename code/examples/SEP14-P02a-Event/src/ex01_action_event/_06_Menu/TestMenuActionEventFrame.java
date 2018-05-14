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
package ex01_action_event._06_Menu;
// =======================================================

import ex01_action_event.TestActionEventFrame;
import ex01_action_event._01_button.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// =======================================================
/**
 * [Java例題] P0002-Event: ButtonActionイベント
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * 2015-06-22 iijima 再調整: NetBeans Projectとして再配布 <br>
 * 2015-04-27 iijima 新規作成: プレインなJavaファイル+バッチファイルで配布 <br>
 */
// =======================================================
public class TestMenuActionEventFrame extends JFrame {
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
    // ---------------------------------------------------
    /**
     * フォント
     */
    // ---------------------------------------------------
    private Font aFont = null;
    // ===================================================
    // Actionイベントを発生させるGUI部品

    // ---------------------------------------------------
    /**
     * ボタン(Actionイベントを発生させる)
     */
    // ---------------------------------------------------
    private JMenuBar aMenuBar = null;
    private JMenu[] aMenuArray = null;
    private JMenuItem[][] aMenuItemArray = null;
    private int menuNumber = 0;
    private int itemNumber = 0;
    // ---------------------------------------------------


    // ===================================================
    // ///////////////////////////////////////////////////
    // ///// メソッド (コンストラクタ) ///////////////////
    // ///////////////////////////////////////////////////
    // ===================================================
    // ===================================================

    /**
     * 【コンストラクタ】 GUI部品の配置とイベントリスナーの登録
     */
    // ---------------------------------------------------
    public TestMenuActionEventFrame() {
        // -----------------------------------------------
        // (1) テスト用フレームの準備
        initializeTestFrame("ButtonActionイベントのテスト");
        // -----------------------------------------------
        // (2) Actionイベントを発効するGUI部品のパネルへの追加
        menuNumber = 3;
        itemNumber = 4;
        //
        aMenuBar = new JMenuBar();
        aMenuBar.setFont(aFont);
        setJMenuBar(aMenuBar);
        // 
        aMenuArray = new JMenu[menuNumber];
        aMenuItemArray = new JMenuItem[menuNumber][];
        for (int i = 0; i < menuNumber; i++) {
            aMenuArray[i] = new JMenu("メニュー" + i);
            aMenuArray[i].setFont(aFont);
            aMenuBar.add(aMenuArray[i]);
            aMenuItemArray[i] = new JMenuItem[itemNumber];
            for (int j = 0; j < itemNumber; j++) {
                aMenuItemArray[i][j] = new JMenuItem("項目" + i + j);
                aMenuItemArray[i][j].setFont(aFont);
                aMenuArray[i].add(aMenuItemArray[i][j]);
                aMenuItemArray[i][j].setActionCommand("メニュー項目" + i + j);
            }
        }
        // -----------------------------------------------
        // (3) Windowイベントのリスナー登録
        for (int i = 0; i < menuNumber; i++) {
            for (int j = 0; j < itemNumber; j++) {
                aMenuItemArray[i][j].addActionListener(new MenuItemActionListener());
            }
        }
        // -----------------------------------------------
        // (4) GUI部品の調整
        pack();
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
        setLayout(new BorderLayout());
        // -----------------------------------------------
        // (3) フォントの準備
        aFont = new Font("ＭＳ ゴシック", Font.PLAIN, 28);
        // -----------------------------------------------
        // (4) テスト用パネルの準備
        aTestPanel = new JPanel();
        aTestPanel.setLayout(new BoxLayout(aTestPanel, BoxLayout.PAGE_AXIS));
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
    // ---------------------------------------------------
    // ===================================================
    // ///////////////////////////////////////////////////
    // ///// イベントハンドラー //////////////////////////
    // ///////////////////////////////////////////////////
    // ===================================================
    // ===================================================
    /**
     * イベントリスナー
     * 
     * ※ActionListenerインタフェースを実装する代わりに<br>
     * ※ActionApapterクラスを継承することで，<br>
     * ※関心のあるハンドラーだけをオーバライドすることができる
     */
    // ---------------------------------------------------
    class MenuItemActionListener implements ActionListener {

        // -----------------------------------------------
        /**
         * メニュー項目のアクションイベントのハンドラー
         * @param e アクションイベント
         */
        // -----------------------------------------------
        public void actionPerformed(ActionEvent e) {
            // -------------------------------------------
            // イベントからのコマンドの取得
            String command = e.getActionCommand();
            // -------------------------------------------
            String message = "対象: " + command + "; 内容: 選択された";
            outputResult( message );
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
