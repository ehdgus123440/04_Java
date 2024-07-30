package api.service;

import java.util.Arrays;
import java.util.Scanner;

import api.dto.TestDto;

public class JavaApiService {
	
	/* String
	 * - java.lang 패키지에서 제공
	 * - 문자열을 저장하고 다루는 용도의 클래스
	 * 
	 * [String 객체를 생성하는 방법]
	 * 
	 * 1) String s1 = "Hello"; 리터럴 표기법
	 * 	-> Heap 영역 내부에 Constant Pool에 String 객체 생성
	 * 
	 * 2) String s2 = new String("World"); new 연산자
	 * 	-> Heap 영역에 String 객체를 생성
	 * 
	 * [ String의 불변성(immutable) ]
	 * - String은 기본적으로 값이 변하는 것이 불가능
	 * ex) String str = "abc";  // "abc"	/ 참조 주소 : 0x100
	 *     str += "def";		// "abcdef"	/ 참조 주소 : 0x300
	 */
	
	/**
	 * String 불변성 확인
	 * 
	 * - System.identityHashCode(참조변수)
	 * 	-> 객체의 주소 값을 이용해서 생성된 해시코드
	 * 	-> 모든 객체가 다른 결과를 반환
	 * 
	 * - 같은 객체에 저장된 값이 변했다면
	 * 	 주소값은 일정해야만 한다!!!
	 */
	public void test1() {
		
		TestDto t = new TestDto();
		
		System.out.println("TestDto : " + System.identityHashCode(t));
		
		t.setNum(200);
		t.setStr("Apple");
		
		System.out.println("변경 후 TestDto : " + System.identityHashCode(t));
		
		System.out.println("-----------------------------------------------");
		
		String s = "Hello";
		System.out.println("String : " + System.identityHashCode(s));
		
		s += "World";
		System.out.println("변경 후 String : " + System.identityHashCode(s));

		
	}
	
	/**
	 * [Constant Pool 확인]
	 * 
	 * - "" String 리터럴 표기법을 이용해 생성된 String 객체가
	 * 저장되는 Heap 내부 영역
	 * 
	 * - 동일한 문자열을 생성하게 되는 경우
	 *   객체가 새롭게 생성되자 않고 
	 *   기존 주소가 반환된다(재활용)
	 */
	public void test2() {
		String s1 = "Hello";
		System.out.println("s1 : " + System.identityHashCode(s1));
		
		String s2 = "Hello";
		System.out.println("s2 : " + System.identityHashCode(s2));
		
		String s3 = new String("Hello");
		System.out.println("s3 : " + System.identityHashCode(s3));
		
		System.out.println("---------------------------------------");
		
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
	}
	
	/**
	* StringBuilder / StringBuffer 클래스
	* - String의 불변성 문제를 해결한 클래스
	*  -> 가변성(mutable)
	* 
	* - 기본 16글자 저장할 크기로 생성
	*   저장되는 문자열의 길이에 따라 크기가 증가/감소
	*   -> 마음대로 문자열 수정, 삭제 가능!
	*   -> 수정, 삭제를 해도 추가적인 객체 생성이 없어 효율 좋음!
	*   
	*  
	* - StringBuilder : Thread Safe 미제공 (비동기, 추천)
	* - StringBuffer  : Thread Safe   제공 (동기)
	*/
	public void test3() {
		StringBuffer sb = new StringBuffer();
		// StringBuilder는 내부 필드에 문자열을 추가하여 누적하는 방식
		System.out.println("문자열 추가 전 주소 : " + System.identityHashCode(sb));
		System.out.println("sb : " + sb);
		
		// 1. append("문자열") : 문자열을 뒤쪽에 추가
		sb.append("Hello");
		sb.append("World");
		sb.append("\n");
		System.out.println("문자열 추가 후 주소 : " + System.identityHashCode(sb));
		System.out.println("sb : " + sb);

		
	
	}
	
	/**
	 * String 관련 메서드
	 */
	public void test4() {
		
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[아무 단어/문장 5번 입력하기]");
		
		for(int i = 0; i < 5; i++) {
			System.out.print(i + " : ");
			sb.append( scan.nextLine() );
		}
		
		System.out.println("------------------------------");
		System.out.println(sb.toString());
		
		String input = sb.toString();
		
		String[] arr = input.split("/");
		System.out.println(Arrays.toString(arr));
		
		String result = String.join("***", arr);
		System.out.println(result);
		
		String str = "Hello World";
		String str2 = str.replace("Hello", "Hi");
		
		System.out.println(str2);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		JavaApiService service = new JavaApiService();
//		service.test1();
//		service.test2();
//		service.test3();
		service.test4();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
