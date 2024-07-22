package student.service;

import java.util.Random;

import student.dto.StudentDTO;


public class StudentService {

	private StudentDTO[] students = new StudentDTO[5];

	public StudentService() {

		// 학생 개체 배열 (student)에 샘플 학생 3명 추가

		students[0] = new StudentDTO("24001", "짱구", '남');
		students[1] = new StudentDTO("24002", "유리", '여');
		students[2] = new StudentDTO("24003", "맹구", '남');
		// students[3,4] = null

//		int ranNum = (int)(Math.random()*101);
//		Random random = new Random();
//		random.nextInt(101);

		Random random = new Random();
		for (StudentDTO std : students) {
			if (std == null)
				break;
			std.setHtml(random.nextInt(101));
			std.setCss(random.nextInt(101));
			std.setJs(random.nextInt(101));
			std.setJava(random.nextInt(101));
		}

	}

	/**
	 * 학생 객체 배열 students 중 비어있는 인덱스에 전달 받은 학생 객체(std) 추가
	 * 
	 * @param std : 입력 받은 값을 저장한 학생객체
	 * @return ture : 추가 성공, false : 추가 실패
	 */
	public boolean addStudent(StudentDTO std) {

		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = std;
				return true;
			}
		}

		return false;
	}

	public StudentDTO[] getStudents() {
		return students;
	}

	
	public StudentDTO selectIndex(int index) {
		// 학생 한 명 정보 조회
		
		if(index < 0 || index >= students.length) {
			return null;
		}
		return students[index];
	}

	public StudentDTO selectName(String targetName) {
		
		for(StudentDTO std : students) {
			if(std == null) return null;
			if(std.getName().equals(targetName)) {
				return std;
			}
		}
		return null;
		
	}
	
	
	
}
