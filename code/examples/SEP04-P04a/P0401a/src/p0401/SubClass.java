// =======================================================
// ソフトウェア工学実習 iijima@ae.keio.ac.jp
// =======================================================
package p0401;
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
	private p0401.MyClass obj_superClass_samePkg    = null;
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
            p0401.MyClass obj_superClass_samePkg  ) {
        this.obj_superClass_samePkg = obj_superClass_samePkg;
    }
    // ===================================================
    
    // ===================================================
    public void test() {
		System.out.println( "===== 同一パッケージのサブクラス =====" );
        System.out.println( "----- test (同一パッケージのサブクラスから,自分自身の継承したスーパークラスのメンバへのアクセス) -----" );
    	System.out.println( this.data_public    ); 
    	//System.out.println( this.data_private   );
    	System.out.println( this.data_protected );
    	System.out.println( this.data_default   );
    	
    	System.out.println( this.method_public()    );
    	//System.out.println( this.method_private()   );
    	System.out.println( this.method_protected() );
    	System.out.println( this.method_default()   );
    	
        System.out.println( "----- test (同一パッケージのサブクラスからスーパークラスのメンバへのアクセス) -----" );
    	System.out.println( obj_superClass_samePkg.data_public    ); 
    	//System.out.println( obj_superClass_samePkg.data_private   );
    	System.out.println( obj_superClass_samePkg.data_protected );
    	System.out.println( obj_superClass_samePkg.data_default   );
    	
    	System.out.println( obj_superClass_samePkg.method_public()    );
    	//System.out.println( obj_superClass_samePkg.method_private()   );
    	System.out.println( obj_superClass_samePkg.method_protected() );
    	System.out.println( obj_superClass_samePkg.method_default()   );
    }
    // ===================================================
}
// =======================================================