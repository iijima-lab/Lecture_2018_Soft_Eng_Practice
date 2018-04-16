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
public class MyClass {
    // ===================================================
    public String name = "";
    // ===================================================
    private p0401.MyClass     obj_sameClass           = null;
    private p0401.OtherClass  obj_otherClass_samePkg  = null;
    private p0401.SubClass    obj_subClass_samePkg    = null;
    private p0401x.OtherClass obj_otherClass_otherPkg = null;
    private p0401x.SubClass   obj_subClass_otherPkg   = null;    
    // ===================================================
    /**
     * コンストラクタ(インスタンス生成時の初期設定をします)
     */
    // ===================================================
    public MyClass( String name ) {
		this.name = name;
    }
    // ===================================================
    
    // ===================================================
    public void setup( 
			p0401.MyClass obj_sameClass,
			p0401.OtherClass obj_otherClass_samePkg,
			p0401.SubClass    obj_subClass_samePkg,
			p0401x.OtherClass obj_otherClass_otherPkg,
			p0401x.SubClass    obj_subClass_otherPkg ) {
		this.obj_sameClass = obj_sameClass;
		this.obj_otherClass_samePkg = obj_otherClass_samePkg;
    	this.obj_subClass_samePkg  = obj_subClass_samePkg;
    	this.obj_otherClass_otherPkg = obj_otherClass_otherPkg;
    	this.obj_subClass_otherPkg  = obj_subClass_otherPkg;
    }
    // ===================================================
    public    String data_public    = "data_public";
    private   String data_private   = "data_private";
    protected String data_protected = "data_protected";
              String data_default   = "data_default";
    // ===================================================
    public    String method_public()    { return( "method_public"    ); }
    private   String method_private()   { return( "method_private"   ); }
    protected String method_protected() { return( "method_protected" ); }
              String method_default()   { return( "method_default"   ); }
    // ===================================================
    public void test() {
		System.out.println( "===== アクセス修飾子による違い =====" ); 
		System.out.println( "----- test (自分自身のメンバへのアクセス:当然，同じクラス，同じパッケージ) -----" );
    	System.out.println( this.data_public    );
    	System.out.println( this.data_private   );
    	System.out.println( this.data_protected );
    	System.out.println( this.data_default   );
    	
    	System.out.println( this.method_public()    );
    	System.out.println( this.method_private()   );
    	System.out.println( this.method_protected() );
    	System.out.println( this.method_default()   );
    	    	
		System.out.println( "----- test (同じクラスのメンバへのアクセス:当然，同じパッケージ) -----" );
    	System.out.println( obj_sameClass.data_public    );
    	System.out.println( obj_sameClass.data_private   );
    	System.out.println( obj_sameClass.data_protected );
    	System.out.println( obj_sameClass.data_default   );
    	
    	System.out.println( obj_sameClass.method_public()    );
    	System.out.println( obj_sameClass.method_private()   );
    	System.out.println( obj_sameClass.method_protected() );
    	System.out.println( obj_sameClass.method_default()   );

		System.out.println( "----- test (同一パッケージの他のクラスのメンバへのアクセス) -----" );
    	System.out.println( obj_otherClass_samePkg.data_public    );
    	//System.out.println( obj_otherClass_samePkg.data_private   );
    	System.out.println( obj_otherClass_samePkg.data_protected );
    	System.out.println( obj_otherClass_samePkg.data_default   );
    	
    	System.out.println( obj_otherClass_samePkg.method_public()    );
    	//System.out.println( obj_otherClass_samePkg.method_private()   );
    	System.out.println( obj_otherClass_samePkg.method_protected() );
    	System.out.println( obj_otherClass_samePkg.method_default()   );

		System.out.println( "----- test (他のパッケージの他のクラスのメンバへのアクセス) -----" );
    	System.out.println( obj_otherClass_otherPkg.data_public    );
    	//System.out.println( obj_otherClass_otherPkg.data_private   );
    	//System.out.println( obj_otherClass_otherPkg.data_protected );
    	//System.out.println( obj_otherClass_otherPkg.data_default   );
    	
    	System.out.println( obj_otherClass_otherPkg.method_public()    );
    	//System.out.println( obj_otherClass_otherPkg.method_private()   );
    	//System.out.println( obj_otherClass_otherPkg.method_protected() );
    	//System.out.println( obj_otherClass_otherPkg.method_default()   );
    }
    // ===================================================
}
// =======================================================
