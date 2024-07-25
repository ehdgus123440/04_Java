package pkg3.dto;

public class KDHcalculator implements Calculator {

	@Override
	public int plus(int a, int b) {
		int result = a + b;
		if(result > Calculator.MAX_NUM) return Calculator.MAX_NUM;
		if(result < Calculator.MIN_NUM) return Calculator.MIN_NUM;
		return result;
	}

	@Override
	public int mynus(int a, int b) {
		int result = a - b;
		if(result > Calculator.MAX_NUM) return Calculator.MAX_NUM;
		if(result < Calculator.MIN_NUM) return Calculator.MIN_NUM;
		return result;
	}

	@Override
	public int multi(int a, int b) {
		int result = a * b;
		if(result > Calculator.MAX_NUM) return Calculator.MAX_NUM;
		if(result < Calculator.MIN_NUM) return Calculator.MIN_NUM;
		return result;
		
	}

	@Override
	public int div(int a, int b) {
		int result = a / b;
		if(result > Calculator.MAX_NUM) return Calculator.MAX_NUM;
		if(result < Calculator.MIN_NUM) return Calculator.MIN_NUM;
		return result;
	}

	@Override
	public int mod(int a, int b) {
		int result = a % b;
		if(result > Calculator.MAX_NUM) return Calculator.MAX_NUM;
		if(result < Calculator.MIN_NUM) return Calculator.MIN_NUM;
		return result;
	}

	@Override
	public int pow(int a, int x) {
		int result = 1;
		for(int i = 1; i <= x; i++) {
			result = result * a;
		}
		if(result > Calculator.MAX_NUM) return Calculator.MAX_NUM;
		if(result < Calculator.MIN_NUM) return Calculator.MIN_NUM;
		return result;
	}

	@Override
	public double areaOfCircle(double r) {
		double result = r * r * Calculator.pi;
		if(result > Calculator.MAX_NUM) return Calculator.MAX_NUM;
		if(result < Calculator.MIN_NUM) return Calculator.MIN_NUM;
		return result;
	}

	@Override
	public String toBinary(int num) {
		String result = "";
		while(true) {
			int div = num / 2;
			int mod = num % 2;
			if	   (mod == 1) {result = "1" + result;}
			else if(mod == 0) {result = "0" + result;}
			num = div;
			if	   (num < 2 && mod == 1) {result = "1" + result; break;}
			else if(num < 2 && mod == 0) {result = "0" + result; break;}
		} 
		
		return result;
	}

	@Override
	public String toHexadecimal(int num) {

		return null;
	}

}
