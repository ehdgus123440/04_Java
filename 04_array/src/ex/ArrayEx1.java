package ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {
	
	Scanner scan = new Scanner(System.in);
	
	public void method1() {
		// 배열 선언, 할당, 초기화
		
		int[] arr; 			// stack 메모리 영역에 int[] 참조 변수 arr 선언
		
		arr = new int[4]; 	// 배열 할당 (heap 메모리 영역)
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		arr[0] = 1000;
		arr[1] = 20;
		arr[2] = 3;
		arr[3] = 500;
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
		
		
		
		
		
		
		
	}

	public void method2() {
		// 정수 4개입력 -> 배열에 대입
		int[] arr = new int[4];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d 번째 인덱스에 들어갈 숫자 입력 : ", i);
			arr[i] = scan.nextInt();
		}
		
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		System.out.println("<< 종료 >>");
		
		// debug : 프로그램 수행이 정상적으로 이루어 지지 않은 경우
		// 		   원인을 파악하기 위해 추적하는 것
		
		
		
		
	}

	public void method3() {
	
		// 과목이 작성되어 있는 배열 생성
		
		String[] sub = {"HTML","CSS","JS","Java"}; 
		
		// 배열 index 범위의 난수 생성
		int ran = (int)(Math.random()*sub.length);
		
		
		System.out.printf("당신이 시험볼 과목은 %s 입니다 \n", sub[ran]);
		
		
		
		
	}

	public void method4() {
		// 5칸 짜리 char 배열 입력된 값 대입
		// 입력 완료 후 역순으로 출력
		
		char[] ch = new char[5];
		
		for(int i = 0; i < ch.length; i++) {
			System.out.print(i + " 번째 요소 입력 : ");
			ch[i] = scan.next().charAt(0); // 0번째 문자열 반환
		}
		for(int i = ch.length -1 ; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		
		
	}
	
	
	
	
}
