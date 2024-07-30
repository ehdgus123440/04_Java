package pkg3.run;

import java.io.IOException;

import pkg3.service.ThrowsService;

public class ThrowsRun {
	public static void main(String[] args) throws IOException{
		
		
		ThrowsService service = new ThrowsService();
//		service.test1();
//		service.test3();
		service.test5();
		
		
	}
	
}
