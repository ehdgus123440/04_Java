package basic;


/**
 * 국민 객체를 정의한 클래스
 */
public class Nation {
	
	// 국민의 추성적인 개념 작성
	
	String name; 	 // 이름
	int    age;		 // 나이
	char   gender; 	 // 성별
	String Jnumber;	 // 주민번호
	String tel; 	 // 전화번호
	String adress;   // 주소
	
	// 기능
	public void speakKorean() {
		System.out.println("한국어 가능\n");
	}
	
	public void 납세의의무() {
		if(age >= 19) {
			System.out.printf("%s 님은 세금 납부 대상자 입니다\n",name);
		}
		else {
			System.out.printf("%s 님은 세금 납부 대상자가 아닙니다\n",name);
		}
	}
	
	public void introduce() {
		System.out.printf("이름은 %s이고, %d세 %c성 입니다\n", name,age,gender);
	}
	
}
