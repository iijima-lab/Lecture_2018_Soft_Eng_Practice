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
public class SubClass extends p0401.MyClass {
    // ===================================================
    public String name = "";
    // ===================================================
    private p0401.MyClass obj_superClass_otherPkg    = null;
    // ===================================================
    /**
     * コンストラクタ(インスタンス生成時の初期設定をします)
     */
    // ===================================================
    public SubClass( String name ) {
        super( name );
        this.name = name;
    }
    // ===================================================
    
    // ===================================================
    public void setup( 
            p0401.MyClass obj_superClass_otherPkg  ) {
        this.obj_superClass_otherPkg = obj_superClass_otherPkg;
    }
    // ===================================================
    
    // ===================================================
    public void test() {
		System.out.println( "===== 異なるパッケージのサブクラス =====" );
        System.out.println( "----- test (異なるパッケージのサブクラスから,自分自身の継承したスーパークラスのメンバへのアクセス) -----" );
    	System.out.println( this.data_public    ); 
    	//System.out.println( this.data_private   );
    	System.out.println( this.data_protected );
    	//System.out.println( this.data_default   );
    	
    	System.out.println( this.method_public()    );
    	//System.out.println( this.method_private()   );
    	System.out.println( this.method_protected() );
    	//System.out.println( this.method_default()   );
    	
        System.out.println( "----- test (異なるパッケージのサブクラスから,他のオブジェクトのスーパークラスのメンバへのアクセス) -----" );
    	System.out.println( obj_superClass_otherPkg.data_public    ); 
    	//System.out.println( obj_superClass_otherPkg.data_private   );
    	//System.out.println( obj_superClass_otherPkg.data_protected );
    	//System.out.println( obj_superClass_otherPkg.data_default   );
    	
    	System.out.println( obj_superClass_otherPkg.method_public()    );
    	//System.out.println( obj_superClass_otherPkg.method_private()   );
    	//System.out.println( obj_superClass_otherPkg.method_protected() );
    	//System.out.println( obj_superClass_otherPkg.method_default()   );
    }
    // ===================================================
}
// =======================================================