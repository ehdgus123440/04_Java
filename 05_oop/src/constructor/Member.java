package constructor;

public class Member {

	// 필드
	// - 인스턴스 변수 : 객체 생성시 할당되는 변수
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	// 값 대입 X -> 기본값 대입 String = Null, int = 0
	
	/* 	생성자
	 * 	1. 반환형 없음
	 * 	2.생성자 이름은 클래스와 동일
	 */
	// 기본생성자, 클래스에 생성자가 하나도 없을때 자동으로 생성
	public Member() {
		// this() - 같은 이름의 생성자 호출
		// -> 반드시 생성자 첫 번째 줄에 작성
		this("Id", "Pw", "Name", 100);
		
		System.out.println("member객체 생성됨");
	}
	
	// 매개변수를 전달받아 생성되는 생성자
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}
	
	/* 오버로딩 (Overloading) */
//	
//	public void   method(int a) {} // 매개 변수 개수 다름
//	public void   method(int a, String b) {} // 매개 변수 개수 다름
//	public void   method(String b, int a) {} // 자료형 순서 다름
//	public void   method(String b, long a) {} // 자료형 다름
	
	/*	오버로딩 성립 조건
	 * 	1. 메서드의 이름이 같아야한다
	 * 	2. 매개 변수의 개수,자료형, 자료형의 순서,중 하나라도 달라야한다
	 */
	
	// 메서드
	public String getMemberId()		 {return this.memberId;}
	public String getMemberPw()		 {return this.memberPw;}
	public String getMemberName() 	 {return this.memberName;}
	public int getMemberAge() 		 {return this.memberAge;}
	
	public void setMemberId(String id) 		{this.memberId = id;}
	public void setMemberPw(String pw) 		{this.memberPw = pw;}
	public void setMemberName(String name) 	{this.memberName = name;}
	public void setMemberAge(int age) 		{this.memberAge = age;}
	
	public void inform() {
		System.out.println("\n--------------------------");
		System.out.println("memberId   : " + memberId);
		System.out.println("memberPw   : " + memberPw);
		System.out.println("memberName : " + memberName);
		System.out.println("memberAge  : " + memberAge);
		System.out.println("--------------------------\n");
	}

}
