package ex;

public class VariableEx3 {

	public static void main(String[] args) {
		/* ---- 강제 형변환 ----
		 * 	1. 값의 범위가 큰 자료형 -> 작은 자료형	
		 * 		(데이터 손실 고려)
		 * 	2. 의도적으로 자료형을 변환할 때
		 * 
		 * 	[작성법]
		 * 	(자료형) 변수명;
		 * 	(자료형) 값;
		 */
		System.out.println("강제 형변환 데이터 손실 확인 1");
		int a = 290;
		byte result1 = (byte)a;
		System.out.println(result1);
		System.out.println();
		
		System.out.println("강제 형변환 데이터 손실 확인 2");
		double b = 123.456789;
		int result2 = (int)b;
		System.out.println(result2);
		System.out.println(b - result2);
		System.out.println();
		
		// 난수 : Math.random()
		// 범위 : 0.0 <= x < 1.0
		// 자로형 : double
		
		int randomNumber = (int)(Math.random() * 10 + 1);
		System.out.println("randomNumber : "+randomNumber);
		System.out.println(Math.random());
		System.out.println();
		
		System.out.println("[의도적으로 강제 형변환]");
		System.out.println( 123 );
		System.out.println( (double)123 );
		System.out.println();
		
		System.out.println("[문자(char] <-> 유니코드(int) ]");
		System.out.println("A의 번호 : " + (int)'A');
		System.out.println("a의 번호 : " + (int)'a');
		System.out.println("김의 번호 : " + (int)'김');
		System.out.println("동의 번호 : " + (int)'동');
		System.out.println("현의 번호 : " + (int)'현');
	
		System.out.println("ㄱ의 번호 : " + (int)'ㄱ');
		System.out.println("ㄱ 다음의 번호 : " + (char)('ㄱ' + 1) );
		System.out.println("ㄱ +2 의 번호 : " + (char)('ㄱ' + 2) );
		System.out.println();
		
		System.out.println("[오버 플로우]");
		// 오버 플로우 (overflow)
		
		int max = Integer.MAX_VALUE;
		System.out.println("max값 : " + max);
		System.out.println("max값 + 1 : " +(max + 1));
		
		/*   [상수]
		 *    - 한 번 값을 대입하면 바꿀 수 없는 변수
		 *    
		 *    [작성법]
		 *    final 자료형 변수명 = 값;
		 *    
		 *    -> 변수명은 대문자 + _ 형식으로 작성
		 */
		
		final double PI = 3.141592;
		final int NATIONAL_CODE = 82;
		System.out.println(PI + "\n" + NATIONAL_CODE);
		
	}

}
