package constructor;

public class MemberRun {
	
	public static void main(String[] args) {
		
		Member mem1 = new Member();
		mem1.inform();
		
		mem1.setMemberId("member01");
		mem1.setMemberPw("pass01");
		mem1.setMemberName("김회원");
		mem1.setMemberAge(27);
		
		mem1.inform();
		
		Member mem2 = new Member("member02", "pass02", "홍길동", 30);
		
		mem2.inform();
		
	}

}
