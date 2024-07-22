package student.view;

import java.util.Scanner;

import student.dto.StudentDTO;
import student.service.StudentService;

public class StudentView {

	private Scanner scan = new Scanner(System.in);
	
	private StudentService service = new StudentService();
	
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
				addStudent();
				break;
			case 2:	
				studentAll();
				break;
			case 3:	
				selectIndex();
				break;
			case 4:	
				selectName();
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
			
			
			
		} while(input != 0);
		
	
	}
	
	private void addStudent() {
		
		System.out.println();
		System.out.print("학번 : ");
		String studentNunber = scan.nextLine();
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.println("성별(남/여) : ");
		char gender = scan.next().charAt(0);
	
		StudentDTO std = new StudentDTO(studentNunber, name, gender);
		
		boolean result = service.addStudent(std);
		
		if(result) {
			System.out.println(name + "학생이 추가 되었습니다");
		}
		else {
			System.out.println("더 이상 학생을 추가할 수 없습니다");
		}
	}
	
	private void studentAll() {
		System.out.println("\n-------학생 전체 조회-------\n");
		StudentDTO[] students = service.getStudents();
		
		for( StudentDTO std : students ) {
			
			if(std == null) return;
			System.out.println(std.toString());
			System.out.println();
		}
		
	}
	
	private void selectIndex() {
		System.out.println("\n----- 학생 1명 조회(index) ------\n");
		
		System.out.print("조회할 학생의 인덱스 입력 : ");
		int index = scan.nextInt();
		
		StudentDTO std = service.selectIndex(index);
		
		if(std == null) {
			System.out.println("*** 해당 인덱스에 학생 객체가 존재하지 않습니다 ***");
			return;
		}
		System.out.println(index + "번째 학생 정보");
		System.out.println(std.toString());
	}
	
	private void selectName() {
		System.out.println("\n------ 이름으로 조회-----\n");
		System.out.println("검색할 학생 이름 : ");
		String targetName = scan.nextLine();
		
		// 입력 받은 이름을 서비스로 전달하여 일치하는 객체 주소값 받기
		
		StudentDTO std = service.selectName(targetName);
		
		if(std == null) {
			System.out.println("**** 같은 이름의 학생이 존재하지 않습니다****");
			return;
		}
		System.out.println(std.toString());
		
	}
	
}
