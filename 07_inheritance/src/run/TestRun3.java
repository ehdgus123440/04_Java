package run;

import dto.Child1;
import dto.Child2;
import dto.Child3;

public class TestRun3 {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Child3 c3 = new Child3();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		/*	parent를 상속 받은 child1/2/3가
		 * 
		 * 	toString() 을 오버라이딩 할 때
		 * 	공통적으로 super.toString() 구문을 작성함
		 */
	}
}
