package field.pkg1;

public class FieldRun {

	public static void main(String[] args) {
		
		FieldTest1 t1 = new FieldTest1();
		t1.method();

		System.out.println(t1.publicValue);
		
		System.out.println(t1.protectedValue);
		
		System.out.println(t1.defaultValue);
		
		// private 필드 접근 불가
//		System.out.println(t1.privateValue);
	}

}
