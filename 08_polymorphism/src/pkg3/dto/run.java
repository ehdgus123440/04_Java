package pkg3.dto;

public class run {
	public static void main(String[] args) {
		KDHcalculator dh = new KDHcalculator();
		System.out.println(dh.plus(100, 3));
		System.out.println(dh.mynus(100, 3));
		System.out.println(dh.multi(100, 100));
		System.out.println(dh.div(100, 3));
		System.out.println(dh.mod(100, 3));
		System.out.println(dh.pow(2, 5));	
		System.out.println(dh.areaOfCircle(10));
		System.out.println(dh.toBinary(100));
	}
}
