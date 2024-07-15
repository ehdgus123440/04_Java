package ex;

public class VariableEx1 {

	/** [mian method]
	 * <p> 
	 * 자바 프로그램을 실행시키기 위한 구문(기능)
	 * </p>
	 * */
	public static void main(String[] args) {
		// 변수 : 메모리에 값을 저장하는 공간
		//          변수에 저장된 값은 바꿀 수 있음
		
		/* 자료형 (data type)
		 *  - 변수에 저장되는 값의 종류/크기 
		 * 
		 *	[Java 기본 자료형 8가지]
		 *	-논리형-
		 *	bolean  (1byte)  - true / false
		 *
		 *	-정수형-
		 *	byte		 (1byte)
		 *	short  	 (2byte)
		 *	int 		 (4byte)
		 *	long 	 (8byte) -> 숫자 뒤에 L or l 붙임 (123l, 123L)
		 *
		 *	-실수형-
		 *	float 	 (4byte) -> 숫자 뒤에 F or f 붙임 (1.23f, 1.23F)
		 *	double  (8byte) 
		 *
		 *	-문자형-
		 *	char 		 (2byte)
		 *
		 *
		 * */
		
		
		int num1; // 메모리에 int형 메모리를 저장하기 위한 공간 (4byte)할당 
		// 자바는 초기화 되지 않은 변수는 출력x
		// System.out.println(num1);
		num1 = 2000;
		System.out.println(num1);
		
		System.out.println("-------------------------");
		System.out.println("[자료형별 리터럴 작성법]");
		
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("isTrue : " + true + "\nisFalse : " + false);
		
		int intNum = 2147483647;
		
		long longNum = 2147483647L;
		System.out.println("intNum : " + intNum + "\nlongNum : " + longNum);
		
		float floatNum = 1.23F;
		double doubleNum = 1.23;
		System.out.println("floatNum : "+floatNum +"\ndoubleNum : "+doubleNum);
		
		char ch1 = 'A';
		char ch2 = '가';
		char ch3 = '♥';
		char ch4 = '鮗';

		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		System.out.println("ch4 : " + ch4);
		
		
		System.out.println("[float 와 double의 차이점]");
		float test1 = 1.1234567890123456789F;
		double test2 = 1.1234567890123456789;
		System.out.println(test1 +"\n" + test2);

		// 기본 자료형 -> 변수에 직접 값을 저장
		// 참조형 -> 변수에 값의 위치(주소)를 저장

		String str1 = "문자열 리터럴 표기법은 쌍따옴표";
		String str2 = "String은 주소를 저장하고 찾아가는 참조형";

		System.out.println(str1 + "\n" + str2);


	
	}
}
