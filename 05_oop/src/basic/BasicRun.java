package basic;

public class BasicRun {

	public static void main(String[] args) {
		
		// 국민 객체 생성
		Nation na1 = new Nation();
		
		// 국민 객체에 값 대입
		na1.name = "홍길동";
		na1.age = 20;
		na1.gender = '남';
		
		// 국민 객체가 가진 기능 수행
		na1.introduce();
		
		Nation na2 = new Nation();
		
		na2.name = "짱구";
		na2.age = 5;
		na2.gender = '남';
		System.out.println();
		na1.납세의의무();
		na2.납세의의무();
		
		
		
		
		
	}
}
