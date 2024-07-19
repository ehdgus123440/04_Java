package dto;

// DTO(data transfer object) : 데이터 전달용 객체
// - 전달될 데이터를 묶어서 관리하는 객체

public class MemberDTO {
	
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	// 상단 source 메뉴 or alt + shift + s -> 컨텍스트 메뉴
	// Generate Constructor Using Fields...(단축키 o) - 생성자
	// Generate Getters and Setters... 선택 (단축키 R) - getter/setter

	public MemberDTO() {

	}

	public MemberDTO(String memberId, String memberPw, String memberName, int memberAge) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	public String getMemberId() {return memberId;}

	public void setMemberId(String memberId) {this.memberId = memberId;}

	public String getMemberPw() {return memberPw;}

	public void setMemberPw(String memberPw) {this.memberPw = memberPw;}

	public String getMemberName() {return memberName;}

	public void setMemberName(String memberName) {this.memberName = memberName;}

	public int getMemberAge() {return memberAge;}

	public void setMemberAge(int memberAge) {this.memberAge = memberAge;}
	
	
	/** 
	 * 현재 객체가 가지고 있는 필드값 모두 출력하는 메서드
	 */
	public void inform() {
		System.out.println("\n--------------------------");
		System.out.println("memberId   : " + memberId);
		System.out.println("memberPw   : " + memberPw);
		System.out.println("memberName : " + memberName);
		System.out.println("memberAge  : " + memberAge);
		System.out.println("--------------------------\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
