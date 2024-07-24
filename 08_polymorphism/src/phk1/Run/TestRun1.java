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
		

		
		
		
		
		
		
	}
}
