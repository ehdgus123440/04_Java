package field.pkg2;

import field.pkg1.FieldTest1;

public class FieldRun2 extends FieldTest1{

	public static void main(String[] args) {
		
		FieldTest1 t1 = new FieldTest1();
		
		System.out.println(t1.publicValue);
		
//		System.out.println(t1.protectedValue);
		
		// 같은 패키지x 
//		System.out.println(t1.defaultValue);		
		
//		System.out.println(t1.privateValue);	
		
		
	}
	
	public void method() {
		System.out.println(protectedValue);
	}
	
}
