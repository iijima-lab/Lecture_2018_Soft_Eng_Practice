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
package ex08_group_layout;
// =======================================================

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
// =======================================================
/**
 * [Java例題] P0001-Layout: GroupLayout
 * 
 * 参考: http://itpro.nikkeibp.co.jp/article/COLUMN/20070309/264379/<br>
 *       基本的に上記ページの例をそのまま借用しています．
 * 
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 * @version <br>
 * 2015-06-22 iijima 再調整:   NetBeans Projectとして再配布 <br>
 * 2015-04-27 iijima 新規作成: プレインなJavaファイル+バッチファイルで配布 <br>
 */
// =======================================================
public class TestGroupLayoutFrame extends JFrame {
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
    private GroupLayout aLayoutManager = null;
    // ===================================================
    // レイアウトのテスト用のGUI部品

    // ---------------------------------------------------
    private JLabel lastNameLabel      = null; // 姓ラベル
    private JLabel firstNameLabel     = null; // 名ラベル
    private JLabel ageLabel           = null; // 年齢ラベル
    private JTextField lastNameField  = null; // 姓テキストフィールド
    private JTextField firstNameField = null; // 名テキストフィールド
    private JComboBox ageComboBox     = null; // 年齢コンボボックス
    private JLabel sexLabel           = null; // 性別ラベル
    private JLabel maleLabel          = null; // 男性ラベル
    private JLabel femaleLabel        = null; // 女性ラベル
    private JRadioButton maleButton   = null; // 男性ラジオボタン
    private JRadioButton femaleButton = null; // 女性ラジオボタン
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
    public TestGroupLayoutFrame() {
        // -----------------------------------------------
        // (1) テスト用フレームの準備
        initializeTestFrame( "レイアウト: GroupLayout" );
        // -----------------------------------------------
        // (2) パネルのレイアウトマネージャの準備
        aLayoutManager = new GroupLayout( aTestPanel );
        aLayoutManager.setAutoCreateGaps( true );
        aLayoutManager.setAutoCreateContainerGaps( true );
        aTestPanel.setLayout( aLayoutManager );
        // -----------------------------------------------
        // (3) GUI部品のパネルへの追加
        addComponents();
        // -----------------------------------------------
        // (4) レイアウトの設定
        hAlignment( aLayoutManager );
        vAlignment( aLayoutManager );
        // -----------------------------------------------
        // (5) GUI部品の調整
        pack();
        // -----------------------------------------------
    }
    
    // ============================================
    /**
     * GUI部品のパネルへの追加
     */
    private void addComponents() {
        // ----------------------------------------
        addLastNameInputField(); // 姓
        addFirstNameInputField(); // 名
        addAgeComboBox(); // 年齢
        addSexRadioButtons(); // 性別
        // ----------------------------------------
    }
    // --------------------------------------------
    /**
     * 
     */
    private void addLastNameInputField() {
        // ----------------------------------------
        // 姓ラベル
        lastNameLabel = new JLabel( "姓" );
        lastNameLabel.setFont( aFont );
        aTestPanel.add( lastNameLabel );
        // ----------------------------------------
        // 姓テキストフィールド
        lastNameField = new JTextField(10);
        lastNameField.setFont( aFont );
        aTestPanel.add( lastNameField );
        // ----------------------------------------
    }
    // --------------------------------------------
    /**
     * 
     */
    private void addFirstNameInputField() {
        // ----------------------------------------
        // 名ラベル
        firstNameLabel = new JLabel( "名" );
        firstNameLabel.setFont( aFont );
        aTestPanel.add( firstNameLabel );
        // ----------------------------------------
        // 名テキストフィールド
        firstNameField = new JTextField(10);
        firstNameField.setFont( aFont );
        aTestPanel.add( firstNameField );
        // ----------------------------------------
    }
    // --------------------------------------------
    /**
     * 
     */
    private void addAgeComboBox() {
        // ----------------------------------------
        // 年齢ラベル
        ageLabel = new JLabel( "年齢" );
        ageLabel.setFont( aFont );
        aTestPanel.add( ageLabel );
        // ----------------------------------------
        // 年齢コンボボックス
        ageComboBox
            = new JComboBox<String>(
                new String[] { "10 - 19", "20 - 29", "30 - 39", 
                               "40 - 49", "50 - 59"});
        ageComboBox.setFont( aFont );
        aTestPanel.add( ageComboBox );
        // ----------------------------------------
    }
    // --------------------------------------------
    /**
     * 
     */
    private void addSexRadioButtons() {
        // ----------------------------------------
        // 性別ラベル
        sexLabel = new JLabel("性別");
        sexLabel.setFont( aFont );
        aTestPanel.add( sexLabel );
        // ----------------------------------------
        // 男性ラベル
        maleLabel = new JLabel("男性");
        maleLabel.setFont( aFont );
        aTestPanel.add( maleLabel );
        // ----------------------------------------
        // 女性ラベル
        femaleLabel = new JLabel("女性");
        femaleLabel.setFont( aFont );
        aTestPanel.add( femaleLabel );
        // ----------------------------------------
        // 男性ラジオボタン
        maleButton = new JRadioButton();
        maleButton.setFont( aFont );
        aTestPanel.add( maleButton );
        // ----------------------------------------
        // 女性ラジオボタン
        femaleButton = new JRadioButton();
        femaleButton.setFont( aFont );
        aTestPanel.add( femaleButton );
        // ----------------------------------------
        // ボタングループ
        ButtonGroup group = new ButtonGroup();
        group.add( maleButton );
        group.add( femaleButton );
        // ----------------------------------------
    }
    // ============================================
    /**
     * 水平方向の配置
     * @param aLayoutManager レイアウトマネージャ(グループレイアウト)
     */
    private void hAlignment( GroupLayout aLayoutManager ) {
        // ----------------------------------------
        GroupLayout.SequentialGroup hGroup
                        = aLayoutManager.createSequentialGroup();
        // ----------------------------------------
        // 属性名のラベルを縦に揃える
        hGroup.addGroup(
            aLayoutManager.createParallelGroup()
                .addComponent( lastNameLabel )
                .addComponent( firstNameLabel )
                .addComponent( ageLabel )
                .addComponent( sexLabel ) );
        // ----------------------------------------
        // 属性値の入力用部品を縦に揃える
        hGroup.addGroup(
            aLayoutManager.createParallelGroup(
                                        GroupLayout.Alignment.LEADING)
                .addComponent( lastNameField  )
                .addComponent( firstNameField )
                .addGroup( aLayoutManager.createSequentialGroup()
                                  .addComponent( ageComboBox )
                                  .addGap( 10, 20, 40 ) )
                .addGroup( aLayoutManager.createSequentialGroup()
                                  .addGap( 5, 10, 20 )
                                  .addGroup( aLayoutManager.createParallelGroup(
                                                GroupLayout.Alignment.CENTER )
                                            .addComponent( maleLabel )
                                            .addComponent( maleButton ) )
                                  .addGap( 5, 10, 20 )
                                  .addGroup( aLayoutManager.createParallelGroup(
                                                GroupLayout.Alignment.CENTER )
                                            .addComponent( femaleLabel )
                                            .addComponent( femaleButton ) )
                                  .addGap( 5, 10, 20 ) ) );
        // ----------------------------------------
        aLayoutManager.setHorizontalGroup( hGroup );
        // ----------------------------------------
    }
    // ============================================
    /**
     * 垂直方向の配置
     * @param aLayoutManager レイアウトマネージャ(グループレイアウト)
     */
    private void vAlignment( GroupLayout aLayoutManager ) {
        // ----------------------------------------
        GroupLayout.SequentialGroup vGroup
            = aLayoutManager.createSequentialGroup();
        // ----------------------------------------
        // 以下を垂直グループに追加する
        // ----------------------------------------
        // 姓ラベルと姓テキストフィールドの並列グループ
        vGroup.addGroup( aLayoutManager
                        .createParallelGroup( GroupLayout.Alignment.BASELINE )
                        .addComponent( lastNameLabel )
                        .addComponent( lastNameField ) );
        // ----------------------------------------
        // 名ラベルと名テキストフィールドの並列グループ
        vGroup.addGroup( aLayoutManager
                        .createParallelGroup( GroupLayout.Alignment.BASELINE )
                        .addComponent( firstNameLabel )
                        .addComponent( firstNameField ) );
        // ----------------------------------------
        // 年齢ラベルと年齢コンボボックスの並列グループ
        vGroup.addGroup( aLayoutManager
                        .createParallelGroup( GroupLayout.Alignment.BASELINE )
                        .addComponent(ageLabel)
                        .addComponent(ageComboBox));
        // ----------------------------------------
        // 性別ラベル，男性ラベル，女性ラベルの並列グループ
        vGroup.addGroup( aLayoutManager
                        .createParallelGroup( GroupLayout.Alignment.BASELINE )
                        .addComponent( sexLabel )
                        .addComponent( maleLabel )
                        .addComponent( femaleLabel ) );
        // ----------------------------------------
        // 男性ラジオボタンと女性ラジオボタンの並列グループ
        vGroup.addGroup( aLayoutManager
                        .createParallelGroup()
                        .addComponent( maleButton )
                        .addComponent( femaleButton ) );
        // ----------------------------------------
        aLayoutManager.setVerticalGroup( vGroup );
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

