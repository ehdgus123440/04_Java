package loop.ex;

import java.util.Scanner;

public class loopEx2 {
	
	Scanner scan = new Scanner(System.in);
	
	public void method1() {
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public void method2() {
		for(int i = 0; i < 4; i++) {
			for(int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void method3() {
		// 행, 열 입력받아 정/역방향으로 숫자 출력
		int start, end, cont;
		
		System.out.print("행 입력 : ");
		int a = scan.nextInt();
		System.out.print("열 입력 : ");
		int b = scan.nextInt();	
		String str;
		scan.nextLine();
		
		while(true) {
			System.out.print("방향을 선택해주세요 : ");
			str = scan.nextLine();
			if(str.equals("-1")||str.equals("역")== true) {
				start = b;
				end = 1;
				cont = -1;
				break;
			}
			else if(str.equals("1") || str.equals("정") == true) {
				start = 1;
				end = b;
				cont = 1;
				break;
			}
			else continue;
		}
		
		int count = start;
		System.out.println(count + "" + end + "" + cont);
		for(int i = 1; i <= a; i++) {
			for(int j = start; ; j += cont ) {
				System.out.print(j);
				count = count + cont;
				if(count == end) {
					break;
				}
			}
			System.out.println();
		}
		
	}

	public void method4() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("(%d,%d) ", i, j);
			}
			System.out.println();
		}
	}
	
	public void method5() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.printf("(%d,%d) ",i,j );
			}
			System.out.println();
		}
	}
	
	public void method6() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3-i; j++) {
				System.out.printf("(%d,%d) ",i,j);
			}
			System.out.println();
		}
	}
	
	public void method7() {
		int num = 10;
		 do{
			System.out.println("반복 출력");
		}while(num < 10);
		System.out.println("종료");
	}

	public void method8() {
		int input = 0;
		int sum = 0;
		do{
			System.out.print("숫자 입력 : ");
			input = scan.nextInt();
			sum += input;
		}while(input != 0); 
		
		System.out.println(sum);
		
	}
	
	
	
	
}
