package run;

import dto.Child1;
import dto.Parent;

public class TestRun2 {
	public static void main(String[] args) {

		Parent p1 = new Parent();
		
		p1.introduce();
		
		Child1 c1 = new Child1();
		
		c1.introduce();
		System.out.println();
		System.out.println(p1.toString());
		System.out.println(p1);
	}
}
