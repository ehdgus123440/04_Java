package run;

import dto.Child1;
import dto.Parent;

public class TestRun1 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Parent("서울시 강남구 역삼동", 300, "페라리");
		
		System.out.println();
		
		Child1 c1 = new Child1();
		
		c1.setCar("테슬라 모델 X");
		c1.setAddress("경기도 부천시");
		c1.setMoney(Integer.MAX_VALUE);
		
		System.out.println(c1.inform());
		System.out.println(c1.getCar());

		System.out.println();
		
		Child1 c2 = new Child1("맥북 m4 프로");
		
		System.out.println( c2.inform() + " / " + c2.getNotebook());
		
		System.out.println();
		c2.print();
		
		System.out.println();
		System.out.println(c2.childInform());
		
		
		
	}
}
