package method;

import java.util.Scanner;

public class StudentService {

	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		int input = 0;

		Student std = null;

		do {
			System.out.println();
			System.out.println("====== 학생 1명 관리");

			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 정보 확인");
			System.out.println("3. 학생 이름 수정");
			System.out.println("4. Java 공부하기");
			System.out.println("5. html 공부하기");
			System.out.println("0. 프로그램 종료");

			System.out.println("메뉴 번호 입력");
			input = sc.nextInt();

			sc.nextLine();

			System.out.println();

			switch (input) {
			case 1:
				std = registerStudent();
				System.out.println("학생 등록됨");
				break;
			case 2:
				System.out.println("[학생 정보 확인]");
				System.out.println("학교 : " + Student.schoolName);
				System.out.println(std.toString());
				break;
			case 3:
				updateName(std);
				break;
			case 4:
				studyJava(std);
				break;
			case 5:
				studyhtml(std);
				break;

			case 0:
				System.out.println("=== 프로그램 종료합니다 ===");
				break;

			default:
				System.out.println("=== 알맞은 메뉴 번호를 입력해 주세요===");

			}

		} while (input != 0);

		/**
		 * 학생 등록 메서드
		 * 
		 * @return 생성된 Student 객체의 주소 반환
		 */

	}

	private Student registerStudent() {
		
		System.out.println("[학생 등록]");

		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("학번 : ");
		String studentNumber = sc.nextLine();

		System.out.println("성별 (남/여) : ");
		char gender = sc.next().charAt(0);

		Student student = new Student(name, studentNumber, gender);

		return student;
	}
	
	/**
	 * 학생 이름 수정 메서드
	 * @param std : 전달 받은 Student 객체 참조 주소
	 */
	private void updateName(Student std) {
		System.out.println();
		
		System.out.println("[학생 이름 수정]");
		
		System.out.println("기존 이름 : " + std.getName());
		
		System.out.print("변경할 이름 입력 : ");
		
		String newName = sc.nextLine();
		
		System.out.printf("이름을 %s -> %s 로 변경하시겠습니까(y/n) ", std.getName(), newName);
		char check = sc.next().toLowerCase().charAt(0);
		if(check == 'n') {
			System.out.println("=== 이름 변경 취소됨");
			return;
		}
		else if(check == 'y'){
			std.setName( newName );
		}
	}
	
	/**
	 * 자바 공부 수행 -> std의 자바 역량 상승
	 * 단, 수정된 자바 역량은 최대값(100) 최소값(0) 범위 초과 불과
	 * @param std
	 */
	public void studyJava(Student std) {
		System.out.println("[Java 공부하기]");
		int before = std.getJava();
		System.out.println("현재 Java 역량 점수 : " + std.getJava());
		System.out.print("증가 또는 감소한 Java 역량 점수 입력 : " );
		int score = sc.nextInt();
		int temp = std.getJava() + score;
		
		if(temp > Student.MAX_VALUE) temp = Student.MAX_VALUE;
		if(temp < Student.MIN_VALUE) temp = Student.MIN_VALUE;
		
		std.setJava(temp);
		
		System.out.println("=== Java 역량 점수 수정 완료 ===");
		
		String str = (score <= 0)?(score + "" ) : ("+" + score);
		System.out.printf("%d -> %d (%s) ", before, std.getJava(), str );
		System.out.println();
		
	}
	
	private void studyhtml(Student std) {
		System.out.println("[html 공부하기]");
		System.out.println("현재 html 역량 점수 : " + std.getHtml());
		System.out.print("증가 또는 감소한 Java 역량 점수 입력 : " );
		int before = std.getHtml();
		int score = sc.nextInt();
		int temp = std.getHtml() + score;
		
		if(temp > Student.MAX_VALUE) temp = Student.MAX_VALUE;
		if(temp < Student.MIN_VALUE) temp = Student.MIN_VALUE;
		
		std.setHtml(temp);
		
		System.out.println("=== html 역량 점수 수정 완료 ===");
		
		String str = (score <= 0) ? (score + "") : ("+" + score);
		System.out.printf("%d -> %d (%s) ", before, std.getHtml(), str );
		System.out.println();
	}

}
