// =======================================================
// ソフトウェア工学実習 iijima@ae.keio.ac.jp
// =======================================================
package p0401x;
// =======================================================
/**
 * ソフトウェア工学実習
 * @author iijima@ae.keio.ac.jp
 */
// =======================================================
public class OtherClass {
    // ===================================================
    public String name = "";
    // ===================================================
    /**
     * コンストラクタ(インスタンス生成時の初期設定をします)
     */
    // ===================================================
    public OtherClass( String name ) {
        this.name = name;
    }
    // ===================================================
    
    // ===================================================
    // ===================================================
    public    String data_public    = "data_public";
    private   String data_private   = "data_private";
    protected String data_protected = "data_protected";
              String data_default   = "data_default ";
    // ===================================================
    public    String method_public()    { return( "method_public"    ); }
    private   String method_private()   { return( "method_private"   ); }
    protected String method_protected() { return( "method_protected" ); }
              String method_default()   { return( "method_default"   ); }
    // ===================================================
}
// =======================================================