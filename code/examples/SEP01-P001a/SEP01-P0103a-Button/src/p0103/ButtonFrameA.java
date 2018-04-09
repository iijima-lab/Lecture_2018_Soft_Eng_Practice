// =======================================================
// ソフトウェア工学実習 iijima@ae.keio.ac.jp
// =======================================================
package p0103;
// =======================================================
import javax.swing.*;
import java.awt.*;
// =======================================================
/**
 * ソフトウェア工学実習
 * @author iijima@ae.keio.ac.jp
 */
// =======================================================
public class ButtonFrameA extends JFrame {
    // ===================================================
    /** ラベル */
    // ===================================================
	private JLabel  aLabel;
	// ===================================================
	/** ボタン */
	// ===================================================
	private JButton aButton;
	// ===================================================
	/**
     * コンストラクタ(インスタンス生成時の初期設定をします)
     */
	// ===================================================
    public ButtonFrameA() {
        // ラベルを作ります
        aLabel = new JLabel( "0" );
        // ボタンを作ります
        aButton = new JButton( "いいね" );
        // パネルをつくって，ボタンとラベルを配置します
        JPanel aPanel = new JPanel();
        aPanel.add( aButton );
        aPanel.add( aLabel );
        // パネルをウィンドウに配置します
        add( aPanel );
        // 
        // 終了方法の設定
        // (ウィンドウのクローズにアプリケーションを終了させる)
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        // GUI部品に適したウィンドウサイズに調整
        pack(); 
        // 位置と大きさの設定
        setBounds( 100, 200, 400, 300 );
    }
    // ===================================================
    /**
     * メイン・メソッド
     * @param args コマンド行引数
     */
    // ===================================================
    public static void main( String[] args ) {
        // GUI部品の取り扱いはmainスレッドではなく
        // awtスレッドで行わねばなりません．そのため，
        // 本当は下記のプログラムは正しくありません．
        // ですが，スレッドや無名クラスについて
        // 勉強する前に簡単に理解できるように，これを
        // 示しています．通常，問題なく動きます．
        //
        // (1) ボタン付きのウィンドウを一つ作って表示します
        ButtonFrameA frame1 = new ButtonFrameA();
        frame1.setTitle( "ソフトウェア工学実習: ButtonFrameA" );
        frame1.setVisible( true );
    }
    // ===================================================
}
// =======================================================
