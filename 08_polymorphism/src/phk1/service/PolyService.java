package phk1.service;

import phk1.dto.*;

public class PolyService {

	/**
	 * 객체가 가지고 있는 빌드 정보 출력
	 * 
	 * @param obj : Object 객체를 참조하는 참조변수
	 * 
	 */
	public void printObject(Object obj) {

		// Object obj가 참조할 수 있는 객체
		// -> Object / Parent / Child - 업 캐스팅 때문에 가능

		System.out.println("---------------------------");

		// 전달 받은 주소의 객체가 Child 객체인 경우
		if (obj instanceof Child) {
			System.out.println("[Child]");

			Child ch = (Child) obj;

			System.out.printf("%s / %s / %s\n", ch.getLastName(), ch.getMoney(), ch.getCar());
		}

		else if (obj instanceof Parent) {
			System.out.println("[Parent]");

			Parent p = (Parent) obj; // Parent로 다운 캐스팅

			System.out.printf("%s / %s \n", p.getLastName(), p.getMoney());
		}

		else {
			System.out.println("[Object는 필드 없음]");
		}

		System.out.println("---------------------------");

	}

	public void test1() {
		Object o = new Object();
		Parent p = new Parent("홍", 100);
		Child c = new Child("박", 333, "모닝");

		printObject(o);
		printObject(p);
		printObject(c);
	}

	/**
	 * 전달 받은 값에 따라 알맞은 객체를 만들어서 반환하는 매서드
	 * 
	 * @param num : 1 - Object / 2 - Parent / 3 - Child
	 * @return 생성된 객체 반환
	 */
	public Object getInstance(int num) {
		if (num == 1)
			return new Object();
		// 생성된 객체 타입 : Object
		// 주소 : 0x100
		if (num == 2)
			return new Parent();
		// 생성된 객체 타입 : Parent
		// 주소 : 0x200

		if (num == 3)
			return new Child();
		// 생성된 객체 타입 : Child
		// 주소 : 0x300

		return null;
	}

	public void test2() {
		Object o1 = getInstance(1); // Object 객체, 0x100

		// 부모 참조변수 = 자식 객체 -> 업 캐스팅 적용
		Object o2 = getInstance(2); // Parent 객체, 0x200
		Object o3 = getInstance(3); // Child 객체, 0x300

		// 매개 변수의 다형성 적용 확인 메서드 호출
		printObject(o1);
		printObject(o2);
		printObject(o3);
	}

	public void test3() {

		Parent p1 = new Parent(); // 부모 = 부모
		Child c2 = new Child(); // 자식 = 자식
		Parent p3 = new Child(); // 부모 = 자식 (업캐스팅)

		System.out.println(p1.toString());

		System.out.println(c2.toString());

		System.out.println(p3.toString());
		// [정적 바인딩 - 프로그램 실행 "전"]
		// Parent.toString()과 연결됨
		// -> 왜 Parent와 연결 되었는가?
		// 참조 변수가 Parent 타입이라 업 캐스팅 적용

		// [동적 바인딩 - 프로그램 실행 "중"]

		// toString() 호출 구문이
		// Parent에서 Child로 변경되어짐!!

		// -> 왜?
		// Child가 Parent의 toString()을
		// 오버라이딩을 하였기 때문에
		// 우선권을 갖게됨

		// * 업캐스팅 상태에서는
		// 오버라이딩한 메서드가 우선권을 갖는다!!
	}

	public void test4() {

		Object[] arr = new Object[4];

		arr[0] = new Parent();
		arr[1] = new Parent("이", 30000);

		arr[2] = new Child();
		arr[3] = new Child("박", 60000, "캐스퍼");
		
		for(Object obj : arr) {
			System.out.println(obj.toString());
			
			// print() 관련 구문에
			// 참조 변수명을 작성하면
			// 자동으로 toString() 메서드를 호출
		}

	}

}
