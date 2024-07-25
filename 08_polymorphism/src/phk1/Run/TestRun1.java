package phk1.Run;

import phk1.dto.Child;
import phk1.dto.Parent;

public class TestRun1 {
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		
		System.out.println(p1.getLastName());
		System.out.println(p1.hashCode());
		System.out.println("-----------------");

		Child c1 = new Child();
		
		System.out.println(c1.hashCode());
		System.out.println(c1.getLastName());
		System.out.println(c1.getCar());
		System.out.println("-----------------");
		
		Parent p2 = new Child(); // 업 캐스팅 (Up Casting)
		
		System.out.println(p2.hashCode());
		System.out.println(p2.getLastName());
		System.out.println("-----------------");
		
		Parent p3 = new Child(); // 업 캐스팅 (Up Casting)
		
		Child c3 = (Child)p3; // 다운 캐스팅 (Down Casting)
		
		System.out.println(c3.hashCode());
		System.out.println(c3.getLastName());
		System.out.println(c3.getCar());
		
		Object[] arr = new Object[3];
		arr[0] = new Parent();
		arr[1] = new Child();
		arr[2] = new Object();
		
		// -> 매개 변수의 다형성이 적용되지 않았다면
				// 각 자료형 별로 매개 변수를 전달 받는 메서드를
				// 계속 오버로딩을 해야하는 문제 발생!!
				
				// ex)
				// public void printObject(Object o)
				// public void printObject(Parent p)
				// public void printObject(Child  c)
		
		
		
		
		
		
	}
}
