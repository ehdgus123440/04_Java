package pkg2.service;
import pkg2.dto.*;

public class AbsService {
	
	public void test1() {
		Cat c = new Cat();
		Fish f = new Fish();
		
		c.move();
		c.eat();
		c.sleep();
		
		f.move();
		f.eat();
		f.sleep();
	}
	
	public void test2() {
		Animal a1 = new Cat(2, 10);
		
		Animal a2 = new Fish(2, 2);
		
		Animal[] animals = new Animal[4];
		
		animals[0] = new Cat();
		animals[1] = a1;
		
		animals[2] = new Fish();
		animals[3] = a2;
		
		for( Animal a :  animals) {
			System.out.println(a); // a.toString() 출력
			
			a.sleep();
			a.eat();
			a.move();
			System.out.println();
		}
		
		
	}
}
