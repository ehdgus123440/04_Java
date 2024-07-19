package field.pkg3;

public class Korean {
	
	/* 		[static]
	 * 	static이 붙은 필드/메서드는
	 * 	프로그램 실행시 모두 static영역에 할당되고
	 * 	종료시 사라짐
	 * 
	 * 	static이 붙은 필드/메서드는 프로그램 실행시
	 * 	클래스명.필드명 / 클래스명.메서드명() 으로 
	 * 	static 영역에 할당, 어디서든 호출가능
	 *
	 */
	
	// static변수, 어디서든 접근 가능하게 public 사용
	public static int nationalCode = 82;
	
	// instance변수, 만들어진 인스턴스만 사용가능한 변수
	private String name;
	private String id;
	
	// private 필드 간접 접근 방법
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
