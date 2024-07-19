package field.pkg1;

/*	[필드 접근 제한자]
 * 	
 * 	1) public - 같은 프로젝트 내에서 접근 가능
 * 	2) protected - 같은 패키지 + 상속 관계에서만 접근가능
 * 	3) (default) - 같은 패키지 내에서 접근 가능
 * 	4) private - 같은 클래스(해당 객체)만 사용가능
 * 
 */



public class FieldTest1 {
	
	// [접근제한자] [예약어] 자료형 변수명 [=초기값];
	public int publicValue = 100;
	
	protected int protectedValue = 200;
	
	int defaultValue = 300;
	
	private int privateValue = 400;
	
	
	public void method() {
		System.out.println( publicValue);
		System.out.println( protectedValue);
		System.out.println( defaultValue);
		System.out.println( privateValue);
	}
}
