package ex;

public class VariableEx2 {

	public static void main(String[] args) {
		
		/* -- 컴퓨터 값 처리 원칙 --
		 * 	같은 자료형 끼리만 연산이 가능하고
		 * 결과도 같은 자료형만 반환된다
		 * 
		 *	---- 형변환(Casting) -----
		 *	
		 *	-	값의 범위가 서로 다른 값들의 연산시
		 *		컴파일러가 자동으로
		 *		범위가 작은 값을 큰 값의 자료형으로 변환
		 */
		
		System.out.println("[자동 형변환 예시]");
		
		int a = 12;
		double b = 1.3;
		System.out.println(a + b);
		
		int c = 3;
		int d = 2;
		System.out.println(c/d);
		
		int  num3a = 999;
		long num3b = 10000000000L;
		
		double result = num3a + num3b;
		System.out.println(result);
		
		/*  [자동 형 변환이 되지 않는 경우]	 */
		int aa = 100;
		double bb = 23.4;
		int result2 = (int)(aa + bb); // (int)(double 값) 
		
		System.out.println(aa + bb);
		System.out.println(result2);

	}

}
