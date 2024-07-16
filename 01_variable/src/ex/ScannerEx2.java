package ex;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 홍길동은 20세, 키 212.5cm의 남성 입니다.
		// 자기소개 : 농구 잘할 수 있습니다
		
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("나이 : ");
		int age = scan.nextInt();
		System.out.println("키 : ");
		double height = scan.nextDouble();
		
		// Scanner 는 char 를 입력받지 못함
		// 	String.charAt(index 번호) -> String의 index번호의 순서에 있는 문자 반환 
		System.out.println("성별 : ");
		char gender = scan.next().charAt(0);
		System.out.println("자기소개 : ");
		
		 /*		nextLIne() 을 제외한 next 관련 구문들은 입력버퍼에
		  *  	존재하는 해당 타입을 읽어옴
		  *  	앞에 엔터 존재시 제거하고 읽어옴
		  *  
		  *  	nextLine() 은 입력 버퍼에서 다음 엔터를 만날때까지 읽어옴
		  */
		scan.nextLine();
		String introduce = scan.nextLine();
		System.out.println("이름 : " + name + "은 " + age + "세, 키는" + height + "의 " + gender + "성 입니다");
		System.out.println("자기소개 : "+introduce);
		
	}
}
