package field.pkg3;

public class StaticTestRun {

	public static void main(String[] args) {
		
		Korean k1 = new Korean();
		
		k1.setName("김철수");
		k1.setId("111111-1111111");
		System.out.printf("k1 : %d / %s / %s \n",
				k1.nationalCode, k1.getName(), k1.getId());
		
		Korean k2 = new Korean();
		k2.setName("박영희");
		k2.setId("222222-2222222");
		System.out.printf("k2 : %d / %s / %s \n",
				k2.nationalCode, k2.getName(), k2.getId());
		
		Korean.nationalCode = 10;
		System.out.println();
		System.out.printf("k1 : %d / %s / %s \n",
				k1.nationalCode, k1.getName(), k1.getId());
		System.out.printf("k2 : %d / %s / %s \n",
				k2.nationalCode, k2.getName(), k2.getId());
		
		System.out.println();
		
		System.out.println("[static에 선언된 이름 사용하기]");
		System.out.println("Korean.nationalCode : " + Korean.nationalCode);
		
		System.out.println();
		System.out.println("--값 변경--");
		
		Korean.nationalCode = 1;
		System.out.println("Korean.nationalCode : " + Korean.nationalCode);
		System.out.println(k1.nationalCode);
		System.out.println(k2.nationalCode);
		
		/*	final
		 * 	값 고정(상수)
		 * 	
		 * 	Math.PI
		 * 	Interger.MAX_VALUE;
		 * 	Interger.NIN_VALUE;
		 */
		
		
	}
}
