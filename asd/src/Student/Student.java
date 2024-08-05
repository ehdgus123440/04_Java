package student;

public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void serScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return getName() +" 학생의 점수 : " + getScore() + "점"; 
	}
}
