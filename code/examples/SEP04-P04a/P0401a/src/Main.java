// =======================================================
// ソフトウェア工学実習 iijima@ae.keio.ac.jp
// =======================================================
/**
 * ソフトウェア工学実習
 * @author iijima@ae.keio.ac.jp
 */
// =======================================================
public class Main {
    // ===================================================
    /**
     * メイン・メソッド
     * @param args コマンド行引数
     */
    // ===================================================
    public static void main( String[] args ) {
        p0401.MyClass      obj                     = new p0401.MyClass( "obj" );
        p0401.MyClass      obj_sameClass           = new p0401.MyClass( "obj_sameClass" );
        
        p0401.OtherClass   obj_otherClass_samePkg  = new p0401.OtherClass( "obj_otherClass_samePkg" );
        p0401.SubClass     obj_subClass_samePkg    = new p0401.SubClass( "obj_subClass_samePkg " );
        p0401x.OtherClass  obj_otherClass_otherPkg = new p0401x.OtherClass( "obj_otherClass_samePkg" );
        p0401x.SubClass    obj_subClass_otherPkg   = new p0401x.SubClass( "obj_subClass_samePkg" );
        
        obj.setup(obj_sameClass, obj_otherClass_samePkg, obj_subClass_samePkg, 
					obj_otherClass_otherPkg, obj_subClass_otherPkg);
		obj_subClass_samePkg.setup(obj);
		obj_subClass_otherPkg.setup(obj);
        obj.test();
        obj_subClass_samePkg.test();
        obj_subClass_otherPkg.test();
    }
    // ===================================================
}
// =======================================================
