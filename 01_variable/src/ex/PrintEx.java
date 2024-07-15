package ex;

public class PrintEx {

	public static void main(String[] args) {
		
		/*	System.out == 지정된 출력용 화면 (이클립스 == console창)
		 * 	
		 * 	System.out.print(출력내용); -> 줄바꿈 X
		 * 
		 * 	System.out.println(출력내용); -> 줄바꿈 O
		 * 
		 * 	System.out.printf("템플릿,사용될 변수|| 값...);
		 * 	- 정해진 형식(템플릿)에 맞는 문자열을 출력하는 구문
		 * 	- 템플릿 문자열 중간에 작성된 '%' 패턴 구문에
		 *    "사용될 변수 ||값" 을 순서대로 대입
		 *    
		 *	 (JS의 ``(백틱) 구문과 같은 템플릿 문자열)
		 *
		 * 	 ex)
		 * 	 [JS]
		 * 	 const name = "홍길동";
		 * 	 console.log(`나는 ${name} 입니다);
		 * 
		 * 	 [Java]
		 * 	 String name = "홍길동";
		 * 	 System.out.printf("나는 %s 입니다", name);
		 * 
		 *  %d : 정수 (byte, short, int)
		 *  %c : 문자 (char)
		 *  %s : 문자열 (String)
		 *  %b : 논리형 (boolean)
		 *  %f : 실수형 (float/double)
		 *  
		 *  
		 *  양수    : 오른쪽 정렬 
		 *  음수(-) : 왼쪽 정렬
		 *  
		 *  %숫자d : 정수가 출력된 칸을 숫자 만큼 확보
		 *  ex) %-6d :  ㅁㅁㅁㅁㅁㅁ
		 *  
		 *  %.숫자f : 소수점 아래 몇째 자리 까지 표시할지 지정
		 *  					(지정된 자리 아래에서 반올림 처리) 
		 */

		
		System.out.print("이름 : ");
		System.out.println("김동현");
		System.out.println("와 자바 재밌다");
		
		System.out.println("[printf() 확인하기]");
		System.out.println();
		
		String 			name 			= "홍길동";
		int 				age 				= 25;
		double 		height 		= 212.5;
		char 			gender 		= '남';
		boolean		javaStudy 	= true;
		
		System.out.println(name +"은 " 
				  + age +"세 "
				  + gender + "성으로 키는 "
				  + height + "cm 이고, 자바 공부 여부 : "
				  + javaStudy);
		
		System.out.printf("%s은 %d세 %c으로, %.1fcm이고 자바 공부 여부 : %b", name, age, gender, height, javaStudy);
		System.out.println();

		
		double num = 1.25;
		System.out.printf("%6s / %.1f", name, num);
		
		
	}

}
