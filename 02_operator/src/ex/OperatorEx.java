package ex;

import java.util.Scanner;

public class OperatorEx {
	
		public void method1() {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("정수 입력 1 : ");
			int num1 = scan.nextInt();
			
			System.out.print("정수 입력 2 :");
			int num2 = scan.nextInt();

			System.out.println();
			
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
			
			System.out.printf("%d + %d = %d \n", num1, num2, (num1+num2));
		}
		
		public void method2() {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자 입력 :");
			int input = scan.nextInt();
			
			boolean isTrue = input % 3 == 0;
			System.out.printf("%d는 3의 배수인가 %b", input, isTrue);
		}
		
		public void method3() {
			// 첫번째 수 가 두번째 수의 배수?
			
			Scanner scan = new Scanner(System.in);
			System.out.print("첫 번쨰 수 입력 : ");
			int num1 = scan.nextInt();
			System.out.print("두 번쨰 수 입력 : ");
			int num2 = scan.nextInt();
			boolean isTrue = num1 % num2 == 0;
			
			System.out.println(num1 + "은 " + num2 +"의 배수가 맞는가? ->" + isTrue);
		}

		public void method4() {
			/**
			 * 		생성된 난수가 1이상 10이하 짝수가 맞는지(난수 범위 1~20)
			 */
			boolean isTrue;
			int ranNum = (int) (Math.random() * 20 + 1);
			System.out.println(ranNum);
			if(ranNum <=10)	 isTrue = true;
			else						 	 isTrue = false;
			
			System.out.println(ranNum + "은 1 이상 10 이하? ->" + isTrue);
			
			
		}
		
		public void method5() {
			// 입력 받은 수가 짝수 or 10보다 초과
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			
			boolean  b1 = num % 2 == 0;
			boolean b2 = num > 10;
			boolean b3 = b1 || b2;
			
			System.out.println(num + "은 짝수 ? -> " + b1 + "\n" + num + "은 10 초과 ? ->" + b2);
			System.out.println(num + "은 짝수이면서 10 초과? ->" + b3);
			
		}

		public void method6() {
			// 1~10 난수 발생시켜 짝수인지 홀수인지 검사
			
			int ran = (int) (Math.random()*10+1);
			String str = (ran % 2 == 0) ? "짝수" : "홀수";
			System.out.println(ran + "은 " + str);
		}

		public void method7() {
			// 나이를 입력받아 13세 이하 어린이 14~19 청소년 20이상 성인
			
			Scanner scan = new Scanner(System.in);
			System.out.print("나이 입력 : ");
			int age = scan.nextInt();
			
			String str = age < 14 ? "어린이" : (age < 20 ? "청소년" : "성인");
			System.out.println(age + "세 -> " + str);
		}
}
