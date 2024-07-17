package loop.ex;

import java.util.Scanner;

public class LoopEx {
	
	Scanner scan = new Scanner(System.in);

	public void method1() {
		//1 ~ 10 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public void method2() {
		System.out.print("첫 번째 수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = scan.nextInt();
		System.out.print("세 번째 수 입력 : ");
		int num3 = scan.nextInt();
		
		for( ; num1 <= num2; num1 += num3) {
			System.out.println(num1);
		}
		
	}

	public void method3() {
		System.out.print("두 수 입력 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int empty;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		System.out.println(min+" "+ max);
		if(a > b) {
			empty = b;
			b = a;
			a = empty;
		}
		for(; a <= b; a++) {
			System.out.println(a);
		}
		
	}

	public void method4() {
		// 1부터 100사이 정수중 5의 배수의 합, 갯수
		int sum=0, count=0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("합계 : " + sum + ", 갯수 : " + count);
		
	}

	public void method5() {
		// 구구단 3단 출력
		for(int i = 1; i <= 9; i++) {
			System.out.println("3" + " X " + i + " = " + (3 * i));
			System.out.printf("3 X %d = %d \n \n", i , i*3);
		}
	}

	public void method6() {
		// 입력 받은 단 출력
		int num;
		for(int i = 0; ; i++) {
			System.out.print("숫자를 입력하세요 : ");
			num = scan.nextInt();
			
			if(num < 2 || num > 9)	System.out.println("잘못 입력 하셨습니다\n");
			else 					break;
		}
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d \n \n",num, i , i*num);
		}
		
		
		
	}

	public void method7() {
		int num = 1;
		// while(조건식) 조건식이 True인 경우에 실행
		while(num <= 10) {
			System.out.print(num++ + " ");
		}
	}

}
