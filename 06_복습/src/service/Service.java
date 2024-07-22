package service;

import java.util.Scanner;

import dto.DTO;

public class Service {

	DTO dto[] = new DTO[5];
	Scanner scan = new Scanner(System.in);
	int count = 0;

	public void add() {

		if(count == 5) {
			System.out.println("학생 추가 불가능");
			return;
		}
		
		System.out.print("학생 이름 입력 : ");
		String name = scan.nextLine();

		System.out.print("학생 학번 입력 : ");
		String number = scan.nextLine();

		System.out.print("학생 성별 입력 : ");
		char gender = scan.next().charAt(0);

		dto[count] = new DTO(name, number, gender);

		System.out.println("\n학생 추가 완료 " + "(" + dto[count].getStudentName() + ")");
		count++;
		scan.nextLine();
	}

	public void All() {

		for(int i = 0; i < count; i++) {
			System.out.println(dto[i].toString());
		}
	}
	
	public void select() {

		System.out.print("검색할 인덱스 번호 : ");
		int num = scan.nextInt();
		
		if(num >= count) {
			System.out.println("찾을 수 없습니다");
			return;
		}
		System.out.println(dto[num].toString());
		
		scan.nextLine();
	}
	
	public void selectName() {

		System.out.print("이름 입력 : ");
		String name = scan.nextLine();
		
		for(int i = 0; i < count; i++) {
			if(name.equals(dto[i])) {
				System.out.println("----검색한 이름----");
				dto[i].toString();
			}
		}
	}
	
	
	
	
}
