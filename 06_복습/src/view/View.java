package view;

import java.util.Scanner;

import service.Service;

public class View {
	
	Service service = new Service();
	
	Scanner scan = new Scanner(System.in);
	
	public void mainMenu() {
		int input = 0;
		
		do {
			System.out.println("\n----- 학생 관리 프로그램 -----");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 이름으로 조회"); // 동명이인 X
			System.out.println("5. 학생 정보 수정(인덱스)");
			System.out.println("6. 학생 1명 점수 조회(점수, 합계, 평균)");
			System.out.println("7. 평균 최고점, 최저점 학생");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			
			input = scan.nextInt();
			scan.nextLine();
			
			System.out.println();
			
			switch (input) {
			case 1:	
				service.add();
				break;
			case 2:	
				service.All();
				break;
			case 3:	
				service.select();
				break;
			case 4:	
				service.selectName();
				break;
			case 5:	
				break;
			case 6:	
				break;
			case 7:	
				break;
			case 0:	
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("메뉴 번호 잘못 입력");
				break;
			
			}
			
			
			
			
			
		}while(input != 0);
	
		
		
		
	}

}
