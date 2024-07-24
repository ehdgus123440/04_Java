package dto;

public class Child1 extends Parent{

	private String notebook;
	
	/*	super() 생성자
	 * 	- 현재 클래스의 상위 클래스(부모) 생성자를 호출하는 구문
	 */
	public Child1() {
		super();
		
		System.out.println("자식1 - 기본 생성자로 객체 생성");
	}
	
	public Child1(String notebook) {
		super("부산 해운대구", 123456789, "모하비");
		
		this.notebook = notebook;
		System.out.println("자식1 - 매개 변수 생성자로 객체 생성");
	}
	
	public void setNotebook(String notebook){
		this.notebook = notebook;
	}
	public String getNotebook(){
		return notebook;
	}
	
	public void print() {
		System.out.println("lastName : " + super.lastName);
		System.out.println("address : " + super.getAddress());
		System.out.println("money : " + super.getMoney());
		System.out.println("car : " + super.getCar());
		System.out.println("notebook : " + notebook);	
	}
	
	public String childInform() {
		
		return super.inform() + " / " + notebook;
	}
	
	
	// @Override 어노테이션(Annotation)
	// 1. 해당 메서드는 오버라이딩 되었음을 명시
	// 2. 오버라이딩된 코드가 알맞게 검사되었는지 컴파일러에게 검사하라고 지시
	@Override
	public void introduce() {
		System.out.println("저는 Parent의 자식 Child1 입니다");
	}
	
	@Override
	public String toString() {
		return  super.toString() + " / " + notebook;
	}
	
}
