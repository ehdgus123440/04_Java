package student.dto;

// DTO(Date Transfer Object): 값 전달용 객체
// -> 객체를 이용해서 여러 값을 묶어 한 번에 전달하는 용도
public class StudentDTO {
	
	private String studentNumber;
	private String name;
	private char gender;
	private int html;
	private int css;
	private int js;
	private int java;
	
	public StudentDTO(String studentNumber, String name, char gender) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
	}
	

	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getCss() {
		return css;
	}
	public void setCss(int css) {
		this.css = css;
	}
	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}

	 public String toString() {
	      
	      // 학번 / 성별 / 이름
	      // HTML : 100 / CSS : 50 / JS : 70 / Java : 100
	      return String.format( "%s / %c / %s\n"
	         + "HTML : %d / CSS : %d / JS : %d / Java %d", 
	         studentNumber, gender, name,
	         html, css, js, java);
	   }
	
	
	
}
