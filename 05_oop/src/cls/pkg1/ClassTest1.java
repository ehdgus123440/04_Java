package cls.pkg1;

/*	class
 * 
 * 	[접근제어자] class 클래스명{
 * 	
 * 	필드 (속성 == 변수)
 * 
 * 	기능1(생성자)
 * 	
 * 	기능2(메서드)
 * 	}
 * 
 * 	- class명은 대문자로 시작
 * 	- 접근제어자
 * 	  1) public - 같은 프로젝트내에서 import하여 사용가능
 * 	  2) (default) - 같은 패키지에서 접근 가능, 생략가능
 */


public class ClassTest1 {
	public void method() {
		System.out.println("public은 어디서든 접근 가능");
	}
}
