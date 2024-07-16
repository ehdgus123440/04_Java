package ex;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		/* Scanner 클래스
		 * 	- 값 입력받기 위해 제공하는 클래스
		 * 	- java.util 에 속해 있음
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int a = scan.nextInt();
		System.out.println("숫자 출력 : " +  a);
		
		System.out.println("문자열 입력");
		String str1 = scan.next();
		String str2 = scan.next();
		String str3 = scan.next();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
