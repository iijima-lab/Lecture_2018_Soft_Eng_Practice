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
package ex01_action_event;
// =======================================================

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

// =======================================================
/**
 * [Java例題] P0002-Event: Actionイベント
 *
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * 2015-06-22 iijima 再調整: NetBeans Projectとして再配布 <br>
 * 2015-04-27 iijima 新規作成: プレインなJavaファイル+バッチファイルで配布 <br>
 */
// =======================================================
public class TestActionEventFrame extends JFrame {
// =======================================================
    // ===================================================
    // ///////////////////////////////////////////////////
    // ///// フィールド変数 //////////////////////////////
    // ///////////////////////////////////////////////////
    // ===================================================
    // ///// GUI 部品 ////////////////////////////////////
    // ===================================================
    // ---------------------------------------------------
    // 

    private Font aFont = null;
    // ---------------------------------------------------
    // 
    private JPanel westControlPanel = null;
    private JPanel northControlPanel = null;
    private JPanel centerControlPanel = null;
    private JPanel eastControlPanel = null;
    // ---------------------------------------------------
    // 
    private JPanel displayPanel = null;
    private JLabel targetLabel = null;
    private JLabel contentLabel = null;
    // ---------------------------------------------------
    // 
    private JMenuBar aMenuBar = null;
    private JMenu[] aMenuArray = null;
    private JMenuItem[] aMenuItemArray = null;
    // ---------------------------------------------------
    // 
    private JButton[] aButtonArray = null;
    private JComboBox aComboBox = null;
    private JTextField aTextField = null;
    private JCheckBox[] aCheckBoxArray = null;
    private JRadioButton[] aRadioButtonArray = null;
    // ---------------------------------------------------
    // 
    private String[] items = {"項目1", "項目2", "項目3"};

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
    public TestActionEventFrame() {
        // -----------------------------------------------
        setPreferredSize(new Dimension(600, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // -----------------------------------------------
        setTitle("Actionイベントのテスト");
        setLayout(new BorderLayout());
        // -----------------------------------------------
        // (4) フォントの準備
        aFont = new Font("ＭＳ ゴシック", Font.PLAIN, 28);
        // -----------------------------------------------
        // (5) パネルの追加
        addPanels();
        // -----------------------------------------------
        // (6) Actionイベントを発効するGUI部品のパネルへの追加
        addMenus(3, 4);
        addButtons(3, westControlPanel);
        addTextField(northControlPanel);
        addCheckBoxs(3, centerControlPanel);
        addRadioButtons(3, eastControlPanel);
        addComboBox(items, westControlPanel);
        // -----------------------------------------------
        // (7) GUI部品の調整
        pack();
        // -----------------------------------------------
    }

    // ===================================================
    /**
     * パネルの追加
     */
    // ---------------------------------------------------
    private void addPanels() {
        westControlPanel = new JPanel();
        westControlPanel.setLayout(new BoxLayout(westControlPanel, BoxLayout.PAGE_AXIS));
        add(westControlPanel, BorderLayout.WEST);
        // -----------------------------------------------
        northControlPanel = new JPanel();
        northControlPanel.setLayout(new BoxLayout(northControlPanel, BoxLayout.PAGE_AXIS));
        add(northControlPanel, BorderLayout.NORTH);
        // -----------------------------------------------
        centerControlPanel = new JPanel();
        centerControlPanel.setLayout(new BoxLayout(centerControlPanel, BoxLayout.PAGE_AXIS));
        add(centerControlPanel, BorderLayout.CENTER);
        // -----------------------------------------------
        eastControlPanel = new JPanel();
        eastControlPanel.setLayout(new BoxLayout(eastControlPanel, BoxLayout.PAGE_AXIS));
        add(eastControlPanel, BorderLayout.EAST);
        // -----------------------------------------------
        displayPanel = new JPanel();
        displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.PAGE_AXIS));
        add(displayPanel, BorderLayout.SOUTH);
        addDisplayPanel(displayPanel);
    }

    // ===================================================
    /**
     * 表示パネルの追加
     * @param displayPanel 表示パネル
     */
    // ---------------------------------------------------
    private void addDisplayPanel(JPanel displayPanel) {
        targetLabel = new JLabel("対象:");
        targetLabel.setFont(aFont);
        displayPanel.add(targetLabel);
        //
        contentLabel = new JLabel("内容:");
        contentLabel.setFont(aFont);
        displayPanel.add(contentLabel);
    }

    // ===================================================
    /**
     * メニューの追加
     * @param menuNumber メニュー数
     * @param itemNumber 項目数
     */
    // ---------------------------------------------------
    private void addMenus(int menuNumber, int itemNumber) {
        // 
        aMenuBar = new JMenuBar();
        aMenuBar.setFont(aFont);
        setJMenuBar(aMenuBar);
        // 
        aMenuArray = new JMenu[menuNumber];
        for (int i = 0; i < menuNumber; i++) {
            aMenuArray[i] = new JMenu("メニュー" + i);
            aMenuArray[i].setFont(aFont);
            aMenuBar.add(aMenuArray[i]);
            aMenuItemArray = new JMenuItem[itemNumber];
            for (int j = 0; j < itemNumber; j++) {
                aMenuItemArray[j] = new JMenuItem("項目" + i + j);
                aMenuItemArray[j].setFont(aFont);
                aMenuArray[i].add(aMenuItemArray[j]);
                aMenuItemArray[j].setActionCommand("メニュー項目" + i + j);
                aMenuItemArray[j].addActionListener(new MenuItemActionListener());
            }
        }
    }

    // ===================================================
    /**
     * パネルへのコンボボックスの追加
     *
     * @param items 項目
     * @param controlPanel 制御パネル
     */
    private void addComboBox(String[] items, JPanel controlPanel) {
        aComboBox = new JComboBox<String>(items);
        aComboBox.setFont(aFont);
        aComboBox.setMaximumSize(new Dimension(100, 40));
        aComboBox.addActionListener(new ComboBoxActionListener());
        controlPanel.add(aComboBox);
    }

    // ===================================================
    /**
     * パネルへのボタンの追加
     *
     * @param number ボタンの個数
     * @param controlPanel 制御パネル
     */
    private void addButtons(int number, JPanel controlPanel) {
        aButtonArray = new JButton[number];
        ActionListener aButtonActionListener = new ButtonActionListener();
        for (int i = 0; i < number; i++) {
            aButtonArray[i] = createButton("ボタン" + i, aButtonActionListener);
            controlPanel.add(aButtonArray[i]);
        }
    }

    // ===================================================
    // ---------------------------------------------------
    /**
     * パネルへのボタンの追加
     *
     * @param text ボタンのテキスト
     * @param aButtonActionListener ボタンのアクションイベントリスナー
     * @return 追加したボタン
     */
    private JButton createButton(String text, ActionListener aButtonActionListener) {
        JButton aButton = new JButton(text);
        aButton.setFont(aFont);
        aButton.addActionListener(aButtonActionListener);
        aButton.setActionCommand(text);
        return (aButton);
    }

    // ===================================================
    // ///////////////////////////////////////////////////
    // ///// イベントハンドラー //////////////////////////
    // ///////////////////////////////////////////////////
    // ===================================================
    /**
     * メニューアイテムアクションイベントリスナー
     */
    // ---------------------------------------------------
    class MenuItemActionListener implements ActionListener {
        // -----------------------------------------------
        /**
         * アクションイベントリスナー
         * @param e アクションイベント
         */
        // -----------------------------------------------
        public void actionPerformed(ActionEvent e) {
            // -------------------------------------------
            // イベントからのコマンドの取得
            String command = e.getActionCommand();
            // -------------------------------------------
            targetLabel.setText("対象: " + command);
            contentLabel.setText("内容: 選択された");
            // -------------------------------------------
        }
        // -----------------------------------------------
    }

    // ===================================================
    // ---------------------------------------------------
    class ButtonActionListener implements ActionListener {
        // -----------------------------------------------
        /**
         * アクションイベントリスナー
         * @param e アクションイベント
         */
        // -----------------------------------------------
        public void actionPerformed(ActionEvent e) {
            // -------------------------------------------
            // イベントからのコマンドの取得
            String command = e.getActionCommand();
            // -------------------------------------------
            targetLabel.setText("対象: " + command);
            contentLabel.setText("内容: クリックされた");
            // -------------------------------------------
        }
        // -----------------------------------------------
    }

    // ===================================================
    /**
     * パネルへのチェックボックスの追加
     *
     * @param number チェックボックスの個数
     * @param controlPanel 制御パネル
     */
    private void addCheckBoxs(int number, JPanel controlPanel) {
        aCheckBoxArray = new JCheckBox[number];
        ActionListener aCheckBoxActionListener = new CheckBoxActionListener();
        for (int i = 0; i < number; i++) {
            aCheckBoxArray[i] = createCheckBox("チェック" + i, aCheckBoxActionListener);
            controlPanel.add(aCheckBoxArray[i]);
        }
    }
    // ===================================================
    // ---------------------------------------------------
    /**
     * パネルへのチェックボックスの追加
     *
     * @param text チェックボックスのテキスト
     * @param aCheckBoxActionListener チェックボックスのアクションイベントリスナー
     * @return チェックボックス
     */
    private JCheckBox createCheckBox(String text, ActionListener aCheckBoxActionListener) {
        JCheckBox aCheckBox = new JCheckBox(text);
        aCheckBox.setFont(aFont);
        aCheckBox.addActionListener(aCheckBoxActionListener);
        return (aCheckBox);
    }
    // ===================================================
    // ---------------------------------------------------
    class ComboBoxActionListener implements ActionListener {
        // -----------------------------------------------
        /**
         * アクションイベントリスナー
         * @param e アクションイベント
         */
        // -----------------------------------------------
        public void actionPerformed(ActionEvent e) {
            // -------------------------------------------
            String item = null;

            if (aComboBox.getSelectedIndex() == -1) {
                item = "(not select)";
            } else {
                item = (String) aComboBox.getSelectedItem();
            }
            targetLabel.setText("対象: コンボボックス");
            contentLabel.setText("内容: [" + item + "]が選択された");
            // -------------------------------------------
        }
        // -----------------------------------------------
    }

    // ===================================================
    // ---------------------------------------------------
    class CheckBoxActionListener implements ActionListener {
        // -----------------------------------------------
        /**
         * アクションイベントリスナー
         * @param e アクションイベント
         */
        // -----------------------------------------------
        public void actionPerformed(ActionEvent e) {
            // -------------------------------------------
            // 
            StringBuilder sb = new StringBuilder();
            // 
            for (int i = 0; i < aCheckBoxArray.length; i++) {
                sb.append(aCheckBoxArray[i].getText());
                if (aCheckBoxArray[i].isSelected()) {
                    sb.append("[選択]");
                } else {
                    sb.append("[非選択]");
                }
                sb.append(" ");
            }
            // -------------------------------------------
            targetLabel.setText("対象: チェックボックス");
            contentLabel.setText("内容: " + sb.toString());
        }
        // -----------------------------------------------
    }

    // ===================================================
    /**
     * パネルへのラジオボタンの追加
     *
     * @param number ラジオボタンの個数
     * @param controlPanel 制御パネル
     */
    private void addRadioButtons(int number, JPanel controlPanel) {
        aRadioButtonArray = new JRadioButton[number];
        ActionListener aRadioButtonActionListener = new RadioButtonActionListener();
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < number; i++) {
            aRadioButtonArray[i] = createRadioButton("ラジオ" + i, aRadioButtonActionListener);
            controlPanel.add(aRadioButtonArray[i]);
            group.add(aRadioButtonArray[i]);
        }
    }
    // ===================================================
    // ---------------------------------------------------
    /**
     * パネルへのラジオボタンの追加
     *
     * @param text ラジオボタンのテキスト
     * @param aRadioButtonActionListener ラジオボタンのアクションイベントリスナー
     * @return ラジオボタン
     */
    private JRadioButton createRadioButton(String text, ActionListener aRadioButtonActionListener) {
        JRadioButton aRadioButton = new JRadioButton(text);
        aRadioButton.setFont(aFont);
        aRadioButton.addActionListener(aRadioButtonActionListener);
        aRadioButton.setActionCommand(text);
        return (aRadioButton);
    }
    // ===================================================
    // ---------------------------------------------------

    class RadioButtonActionListener implements ActionListener {
        // -----------------------------------------------
        /**
         * アクションイベントリスナー
         * @param e アクションイベント
         */
        // -----------------------------------------------
        public void actionPerformed(ActionEvent e) {
            // -------------------------------------------
            // 
            String content = null;
            for (int i = 0; i < aRadioButtonArray.length; i++) {
                if (aRadioButtonArray[i].isSelected()) {
                    content = aRadioButtonArray[i].getText();
                }
            }
            // -------------------------------------------
            targetLabel.setText("対象: ラジオボタン");
            contentLabel.setText("内容: " + content);
        }
        // -----------------------------------------------
    }

    // ===================================================
    /**
     * パネルへのテキストフィールドの追加
     *
     * @param controlPanel 制御パネル
     */
    private void addTextField(JPanel controlPanel) {
        aTextField = new JTextField("テキストフィールド");
        aTextField.setFont(aFont);
        aTextField.addActionListener(new TextFieldActionListener());
        controlPanel.add(aTextField);
    }
    // ===================================================
    // ---------------------------------------------------
    class TextFieldActionListener implements ActionListener {
        // -----------------------------------------------
        /**
         * アクションイベントリスナー
         * @param e アクションイベント
         */
        // -----------------------------------------------
        public void actionPerformed(ActionEvent e) {
            targetLabel.setText("対象: テキストフィールド");
            contentLabel.setText("内容: [" + aTextField.getText() + "]と入力された");
        }
        // -----------------------------------------------
    }
    // ===================================================
}
// =======================================================
