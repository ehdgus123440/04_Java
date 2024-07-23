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
		String name = scan.next();
		
		for(int i = 0; dto[i] != null; i++) {
			if(name.equals(dto[i].getStudentName())) {
				System.out.println("----검색한 이름----");
				System.out.println(dto[i].toString());
			}
		}
	}
	
	public void updateIndex() {
		int index;
		while(true){
			System.out.print("인덱스 입력 : ");
			index = scan.nextInt();
			if(index >= dto.length || index < 0) {
				System.out.println("해당 인덱스에 학생 정보가 존재하지 않습니다");
			}
			break;
		}
		while(true) {
			System.out.println("\n"+dto[index].toString()+"\n");
			System.out.println("수정할 정보 선택\n1.이름\n2.학번\n3.성별\n4.점수\n0.종료");
			int num = scan.nextInt();
			if(num == 1) {
				System.out.print("변경할 이름 : ");
				String nameChange = scan.next();
				dto[index].setStudentName(nameChange);
			}
			else if(num == 2) {
				System.out.print("변경할 학번 : ");
				String numberChange = scan.next();
				dto[index].setStudentNumber(numberChange);
			}
			else if(num == 3) {
				System.out.print("변경할 성별 : ");
				char genderChange = scan.next().charAt(0);
				dto[index].setGender(genderChange);
			}
			else if(num == 4) {
				System.out.print("html 점수 입력 : ");
				int html = scan.nextInt();
				dto[index].setHtml(html);
				System.out.print("css 점수 입력 : ");
				int css = scan.nextInt();
				dto[index].setCss(css);
				System.out.print("js 점수 입력 : ");
				int js = scan.nextInt();
				dto[index].setJs(js);
				System.out.print("java 점수 입력 : ");
				int java = scan.nextInt();
				dto[index].setJava(java);
				
			}
			
			else if (num == 0) {
				System.out.println("수정 완료");
				break;
			}
		}
		
	}
	
	public void score() {
		
		System.out.print("점수 조회할 학생 인덱스 입력 : ");
		int index = scan.nextInt();
		int sum = dto[index].getHtml() + dto[index].getCss() + 
				dto[index].getJs() + dto[index].getJava();
		
		System.out.println(dto[index].toString());
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)(sum / 4));
		
		
		
		
		
		
	}
	
	public void rank() {
		
		double[] avg = new double[count];
		int[] sum = new int[count];
		for(int i = 0; i < count; i++) {
			sum[i] = dto[i].getHtml() + dto[i].getCss() +
					dto[i].getJs() + dto[i].getJava();
			avg[i] = sum[i] / 4;
		}
		int maxIndex=0, minIndex=0;
		for(int i = 0; i < count; i++) {
			if(avg[i] >= avg[maxIndex]) {
				maxIndex = i;
			}
			if(avg[i] <= avg[minIndex]) {
				minIndex = i;
			}
		}
		
		System.out.println("평균 최고점 : " + dto[maxIndex].getStudentName()
				+ " 평균 : " + avg[maxIndex] +"\n평균 최저점 : " + 
				dto[minIndex].getStudentName() + " 평균 : " + avg[minIndex]);
		
	}
	
	
	
}
