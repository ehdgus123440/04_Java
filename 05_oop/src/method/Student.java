package method;

public class Student {

	// 필드 ( 멤버 변수 )
	public static String schoolName = "KH대학교";

	public static final int MIN_VALUE = 0;

	public static final int MAX_VALUE = 100;

	private String name;
	private String studentNumber;
	private char gender;
	private int java;
	private int html;

	// 생성자
	public Student() {

	}

	public Student(String name, String studentNumber, char gender) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentName(String studentName) {
		this.studentNumber = studentName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}
	
	public String toString() {
		
		// 학번 / 이름 / 성별 / 성적
		// String String.format("패턴", 값)
		// -> 패턴 형태의 문자열을 반환하는 메서드
		// (printf와 비슷한데 printf는 출력
		// String.format은 문자열을 만들어 반환)
		
		
		return String.format("%s / %s / %c / java : %d / html : %d",
				studentNumber,name,gender,java,html);
	}
	

}
