package dto;


public class DTO {
	private String studentName;
	private String studentNumber;
	private char gender;
	private int html;
	private int css;
	private int js;
	private int java;
	
	
	public DTO(String name, String number, char gender) {
		studentName = name;
		studentNumber = number;
		this.gender = gender;
		
		this.html =	(int) (Math.random()*101);
		this.css = 	(int) (Math.random()*101);
		this.js = 	(int) (Math.random()*101);
		this.java = (int) (Math.random()*101);
		
		
		
	}
	
	public DTO(int html, int css, int js, int java) {
		this.html = html;
		this.css = css;
		this.js = js;
		this.java = java;	
	}
	

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
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
		return String.format( "%s / %s / %c\n"
		         + "HTML : %d / CSS : %d / JS : %d / Java %d", 
		         studentName, studentNumber, gender, html, css, js, java
		         );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
