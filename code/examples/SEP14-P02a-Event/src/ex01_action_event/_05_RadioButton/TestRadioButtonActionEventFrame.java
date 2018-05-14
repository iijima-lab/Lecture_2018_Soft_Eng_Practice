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
package ex01_action_event._05_RadioButton;
// =======================================================

import ex01_action_event._01_button.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// =======================================================
/**
 * [Java例題] P0002-Event: RadioButtonActionイベント
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * 2015-06-22 iijima 再調整: NetBeans Projectとして再配布 <br>
 * 2015-04-27 iijima 新規作成: プレインなJavaファイル+バッチファイルで配布 <br>
 */
// =======================================================
public class TestRadioButtonActionEventFrame extends JFrame {
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
    private JRadioButton[] aRadioButtonArray = null;
    private int numberOfRadioButtons = 0;
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
    public TestRadioButtonActionEventFrame() {
        // -----------------------------------------------
        // (1) テスト用フレームの準備
        initializeTestFrame("ButtonActionイベントのテスト");
        // -----------------------------------------------
        // (2) Actionイベントを発効するGUI部品のパネルへの追加
        numberOfRadioButtons = 3;
        aRadioButtonArray = new JRadioButton[numberOfRadioButtons];
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < numberOfRadioButtons; i++) {
            aRadioButtonArray[i] = new JRadioButton("ラジオボタン" + i );
            aRadioButtonArray[i].setFont(aFont);
            aTestPanel.add(aRadioButtonArray[i]);
            group.add(aRadioButtonArray[i]);
        }
        // -----------------------------------------------
        // (3) Windowイベントのリスナー登録
        ActionListener aRadioButtonActionListener = new RadioButtonActionListener();
        for (int i = 0; i < numberOfRadioButtons; i++) {
            aRadioButtonArray[i].addActionListener(aRadioButtonActionListener);
            aRadioButtonArray[i].setActionCommand("ラジオボタン" + i );
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
     * ※WindowListenerインタフェースを実装する代わりに<br>
     * ※WindowApapterクラスを継承することで，<br>
     * ※関心のあるハンドラーだけをオーバライドすることができる
     */
    // ---------------------------------------------------
    class RadioButtonActionListener implements ActionListener {

        // -----------------------------------------------
        /**
         * ラジオボタンのアクションイベントのハンドラー
         * @param e アクションイベント
         */
        // -----------------------------------------------
        public void actionPerformed(ActionEvent e) {
            // -------------------------------------------
            // イベントからのコマンドの取得
            String content = null;
            for (int i = 0; i < aRadioButtonArray.length; i++) {
                if (aRadioButtonArray[i].isSelected()) {
                    content = aRadioButtonArray[i].getText();
                }
            }
            // -------------------------------------------
            String message = "対象: ラジオボタン;  内容:" + content;
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
