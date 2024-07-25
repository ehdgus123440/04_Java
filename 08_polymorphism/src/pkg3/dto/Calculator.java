package pkg3.dto;

public interface Calculator {
	
	/*	[인터페이스]
	 * 	
	 * 	뜻  : 접점
	 * 
	 * 	효과
	 * 	1. 클래스 간의 접점을 만들 수 있다
	 *	2. 극한의 추상화를 통해서 유연한 대처 가능 
	 *	
	 *	[기본 작성법]
	 *	필드 : 무조건 public static final (공유 가능한 상수)
	 *	
	 *	메서드는 무조건 public abstract
	 *	- 누구든지 상속 받아서 오버라이딩 가능
	 */
	
	public static final double pi = 3.14;
	
	// 인터페이스 필드에 작성되면 public static final 생략 가능
	int MAX_NUM = 100_000_000;
	int MIN_NUM = -100_000_000;
	
	/**
	 * 두 수의 합 반환
	 * 단, 결과는 최대, 최소값을 넘을 수 없음
	 * @param a
	 * @param b
	 * @return
	 */
	public abstract int plus(int a, int b);
	
	/**
	 * 두 수의 차 반환
	 * 단, 결과는 최대, 최소값을 넘을 수 없음
	 * @param a
	 * @param b
	 * @return
	 */
	public abstract int mynus(int a, int b);
	
	/**
	 * 두 수의 곱 반환
	 * 단, 결과는 최대, 최소값을 넘을 수 없음
	 * @param a
	 * @param b
	 * @return
	 */
	public abstract int multi(int a, int b);
	
	/**
	 * 두 수의 몫 반환
	 * 단, 결과는 최대, 최소값을 넘을 수 없음
	 * @param a
	 * @param b
	 * @return
	 */
	public abstract int div(int a, int b);
	
	/**
	 * 두 수의 나머지 반환
	 * 단, 결과는 최대, 최소값을 넘을 수 없음
	 * @param a
	 * @param b
	 * @return
	 */
	public abstract int mod(int a, int b);
	
	
	/**
	 * a를 x만큼 거듭 제곱한 결과
	 * 단, 결과는 최대, 최소값을 넘을 수 없음
	 * @param a
	 * @param x
	 * @return
	 */
	int pow(int a, int x);
	
	/**
	 * 원의 넓이를 반환
	 * @param r
	 * @return 원의 넓이
	 */
	double areaOfCircle(double r);
	
	/**
	 * 전달 받은 정수를 2진수 String으로 변환하여 반환
	 * @param num
	 * @return 2진수
	 */
	String toBinary(int num);
	
	/**
	 * 전달 받은 정수를 16진수 String으로 변환하여 반환
	 * @param num
	 * @return 16진수
	 */
	String toHexadecimal(int num);
	

}