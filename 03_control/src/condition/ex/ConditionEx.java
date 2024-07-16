package condition.ex;

import java.util.Scanner;

/**
 * 조건문 예시 기능용 클래스
 */
public class ConditionEx {

	Scanner scan = new Scanner(System.in);

	public void method1() {
		int ran = (int) (Math.random() * 10 + 1);
		String str;
		if ((ran % 2) != 1)
			str = "짝수 입니다";
		else
			str = "홀수 입니다";

		System.out.println(str);
	}

	public void method2() {
		// 13 어린이 19 청소년 20 성인
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		String result;
		if (age > 13) {
			if (age > 19)
				result = "성인";
			else
				result = "청소년";
		} else
			result = "어린이";
		System.out.println(age + "세 -> " + result);
	}

	public void method3() {
		System.out.print("나이 입력 : ");
		int num = scan.nextInt();
		String result;
		if (num > 0 && num <= 13)
			result = "어린이";
		else if (num > 13 && num <= 16)
			result = "청소년(중학생)";
		else if (num > 16 && num <= 19)
			result = "청소년(고등학생)";
		else if (num > 19 && num < 100)
			result = "성인";
		else
			result = "잘못 입력하셧습니다";

		System.out.println(result);

	}

	public void displayMenu() {
		System.out.println("1. method1()");
		System.out.println("2. method2()");
		System.out.println("3. method3()");
		System.out.println("4. method4()");
		System.out.println("5. method5()");
		System.out.println("6. method6()");

		System.out.print("번호 선택 >> ");
		int num = scan.nextInt();
		System.out.println("------------------");
		switch (num) {
		case 1: {
			method1();
			break;
		}
		case 2: {
			method2();
			break;
		}
		case 3: {
			method3();
			break;
		}
		case 4: {
			method4();
			break;
		}
		case 5: {
			method5();
			break;
		}
		case 6: {
			practice();
			break;
		}
		default:
			System.out.println("잘못 입력 하셨습니다");
		}
	}

	public void method4() {
		System.out.print("월 입력 : ");
		int num = scan.nextInt();
		String result;
		switch (num) {
		case 3:
		case 4:
		case 5: {
			result = "봄";
			break;
		}
		case 6:
		case 7:
		case 8: {
			result = "여름";
			break;
		}
		case 9:
		case 10:
		case 11: {
			result = "가을";
			break;
		}
		case 12:
		case 1:
		case 2: {
			result = "겨울";
			break;
		}
		default:
			result = "잘못 입력";
		}
		System.out.println(result);
	}

	public void method5() {
		// 중간(40%), 기말(50%), 과제(10%)점수 입력 -> 성적 부여
		// 90 (A) 80(B) 70(C) 60(D) 나머지(F)
		// 95 -> A+ 85 -> B+ ...
		scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("중간고사 점수 (40%) : ");
		int num1;
		for (int i = 0;; i++) {
			int num1check = scan.nextInt();
			if (num1check < 0 || num1check > 100) {
				System.out.println("다시 입력해 주세요");
				System.out.print("중간고사 점수 (40%) : ");
			} else {
				num1 = num1check;
				break;
			}
		}
		System.out.print("기말고사 점수 (50%): ");
		int num2;
		for (int i = 0;; i++) {
			int num2check = scan.nextInt();
			if (num2check < 0 || num2check > 100) {
				System.out.println("다시 입력해 주세요");
				System.out.print("기말고사 점수 (50%) : ");
			} else {
				num2 = num2check;
				break;
			}
		}

		System.out.print("과제 점수 (10%) : ");
		int num3;
		for (int i = 0;; i++) {
			int num3check = scan.nextInt();
			if (num3check < 0 || num3check > 100) {
				System.out.println("다시 입력해 주세요");
				System.out.print("과제 점수 (50%) : ");
			} else {
				num3 = num3check;
				break;
			}
		}

		System.out.println();

		String str;
		double num11 = num1 * 0.4;
		double num22 = num2 * 0.5;
		double num33 = num3 * 0.1;
		double result = num11 + num22 + num33;

		if 		(result >= 95)			str = "A+";
		else if (result >= 90)			str = "A";
		else if (result >= 85)			str = "B+";
		else if (result >= 80)			str = "B";
		else if (result >= 75)			str = "C+";
		else if (result >= 70)			str = "C";
		else if (result >= 65)			str = "D+";
		else if (result >= 60)			str = "D";
		else							str = "F";

		System.out.println("이름 : " + name);
		System.out.printf("중간고사 점수 (40%%) :  %.2f \n", num11);
		System.out.printf("기말고사 점수 (50%%) : %.2f \n", num22);
		System.out.printf("과제 점수 (10%%) : %.2f \n", num33);
		System.out.println();
		System.out.printf("%s 의 최종점수 : %.2f \n", name, result);
		System.out.println("성적 : " + str);

	}

	public void practice() {
		 /*
		  * 국어,영어,수학,사탐,과탐 점수 입력
		  * 40점 미만 과목 있으면 fale
		  * 평균 60점 미만 fale
		  * 모든과목 40점 이상 평균 60점이상 pass
		  */
		System.out.print("점수 입력 (국 영 수 사 과 ) : ");
		int[] num = {
				scan.nextInt(),
				scan.nextInt(),
				scan.nextInt(),
				scan.nextInt(),
				scan.nextInt()
				};
		System.out.println();
		double sum = 0;
		int check = 0;
		String[] arr = {"국어", "영어", "수학", "사탐", "과탐"};
		String arrResult = "";
		
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
			if(num[i] < 40) {
				arrResult += arr[i] + " " ;
				check = 1;
			}
		}
		if(check == 0 && (sum/5) < 60) check = 2;
		
		if(check == 1) {
			System.out.println("FAIL 한 과목 40점 미달 입니다");
			System.out.println(" 미달 과목 : " + arrResult);
		}
		else if (check == 2) {
			System.out.println("FAIL 평균 미달 입니다");
			System.out.printf(" 내 평균 점수 : %.2f", (sum/num.length) );
		}
		else {System.out.println("PASS");
		 System.out.printf("평균 점수 : %.2f", (sum/num.length));
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
