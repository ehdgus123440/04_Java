package service;

import dto.MemberDTO;

// service (제공하다)
// - 필요한 기능(비즈니스 로직)

public class MemberService {
	/*	객체 배열
	 * 	- 객체를 참조하는 변수를 묶음으로 다루는 것
	 * 
	 * 	[작성법]
	 * 	
	 * 	클래스명[] 변수명 = new 클래스명[크기];
	 * 
	 * 	ex)
	 * 	Academy[] arr = new Academy[3];
	 * 
	 * 	- new Academy[3] : heap 영역에 Academy 참조형 변수 3칸짜리 묶음배열
	 * 
	 * 	-> 각 칸이 Academy "참조형 변수"
	 * 		-> 각 칸이 Academy 객체 주소를 저장해서 참조
	 */
	
	public void method1() {
		
		// memberArr가 참조하는 배열의 각 인덱스에는
		// memberDTO "참조형 변수" 할당
		
		MemberDTO[] memberArr = new MemberDTO[3];
		memberArr[0] = new MemberDTO("member1", "pass01", "일번회원", 30);
		memberArr[1] = new MemberDTO("member2", "pass02", "회원투", 22);
		memberArr[2] = new MemberDTO("member3", "pass03", "삼순이", 33);
		
		// memberArr 의 요소가 참조하는 모든 MemberDTO 객체의 
		// 저장된 필드 정볼르 출력
		
//		memberArr[0].inform();
//		memberArr[1].inform();
//		memberArr[2].inform();
		
		for(int i = 0; i < memberArr.length; i++) memberArr[i].inform();
		System.out.println("-----------------------------------------");
		for( MemberDTO mem : memberArr ) mem.inform();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
