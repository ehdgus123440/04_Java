package pkg1.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchService {
	private Scanner scan = new Scanner(System.in);

	/*
	 * Exception(예외) : 코드로 해결 가능한 에러 (if, try-catch, throws 등)
	 * 
	 * Exception Handling(예외 처리) 예외 발생 시 이를 처리하는 구문(try-catch, throws)
	 * 
	 * 
	 */
	public void test1() {
		// NullPointerException
		// -> 참조하고 있는 객체가 없는데
		// 객체의 필드/메서드를 호출할 때 던져지는 예외

//		String str = null;
//		str.split("/");

//		int[] arr = new int[3];
//		arr[5] = 10;

		System.out.print("정수 입력 : ");
		int input = scan.nextInt();

	}

	public void test2() {

		try {
			System.out.print("정수 입력 1 : ");
			int num1 = scan.nextInt();

			System.out.print("정수 입력 2 : ");
			int num2 = scan.nextInt();

			System.out.println("합계 : " + (num1 + num2));
		} catch (InputMismatchException e) {
			System.err.println("정수만 입력");
			/*
			 * e.printStackTrace() - 예외 발생 원인, 발생된 메서드 추적결과를 콘솔에 출력하는 메서드 --> 원래 예외 발생하면
			 * 나타나는 구문
			 */
			e.printStackTrace();

			/*
			 * String e.getMessage(); - 예외 원인이 작성된 message를 문자열로 반환
			 */
			System.out.println(e.getMessage());
		}

		/*
		 * e.printStackTrace() - 예외 발생 원인, 발생된 메서드 추적결과를 콘솔에 출력하는 메서드 --> 원래 예외 발생하면
		 * 나타나는 구문
		 */
	}

	public void test3() {
		try {
			System.out.print("정수 입력 1 : ");
			int num1 = scan.nextInt();

			System.out.print("정수 입력 2 : ");
			int num2 = scan.nextInt();

			System.out.println("몫 : " + (num1 / num2));
		} catch (InputMismatchException e) {
			System.out.println("int 범위 정수만 입력");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println(">>> 프로그램 종료 <<<");
	}

	public void test4() {
		try {
			System.out.print("정수 입력 1 : ");
			int num1 = scan.nextInt();

			System.out.print("정수 입력 2 : ");
			int num2 = scan.nextInt();

			System.out.println("몫 : " + (num1 / num2));

		} catch (RuntimeException e) {
			System.out.println("예외 발생");
		}
	}

	public void test5() {

		// Exception 클래스 : 모든 예외의 최상위 부모

		System.out.println("--- 던질 예외 선택 ---");
		System.out.println("1. Exception");
		System.out.println("2. RuntimeException");
		System.out.println("3. ArithmeticException");

		try {
			int input = scan.nextInt();

			switch (input) {
			case 1:
				throw new Exception();
			case 2:
				throw new RuntimeException();
			case 3:
				throw new ArithmeticException();
			}

		} catch (InputMismatchException e) {
			System.out.println("int 정수만 입력해 주세요.");

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외 처리 완료");

		} catch (RuntimeException e) {
			System.out.println("RuntimeException 예외 처리 완료");

		} catch (Exception e) {
			System.out.println("Exception 예외 처리 완료");
		}
	}

	/**
	 * Checked / Unchecked Exception 확인
	 * 
	 * 1) Checked Exception - 반드시 예외 처리 구문을 작성해야되는 예외 - 예외 처리 구문 미작성 시 컴파일 에러
	 * 발생(빨간줄)
	 * 
	 * 2) Unchecked Exception - 예외 처리 구문 작성 여부를 필수가 아닌 선택하는 예외 - 예외 처리 구문을 작성하지 않아도
	 * 컴파일 에러 발생 X - 대부분의 Unchecked Exception은 if문으로 해결 가능 (사용자, 이용자의 실수 방지)
	 */
	public void test6() {

		// Unchecked Exception 확인
		// -> 컴파일 에러 없음!!
		// throw new RuntimeException();

		// Checked Exception 확인
		// -> 컴파일 에러(빨간줄) 발생!!

		// Unhandled exception type Exception
		// -> 예외처리 안했어~
		// throw new Exception();
		// -> 예외 처리 코드 작성 필요

	}

}
