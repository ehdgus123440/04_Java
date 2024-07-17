package ex;

import java.util.Arrays;

public class ArrayEx2 {

	public void method1() {
		// 얕은 복사 
		// 참조 변수 주소만 복사
		// 서로 다른 변수가 같은 주소 사용 -> 값을 공유함
		
		int[] arr1 = {10,20,30,40,50};
		
		int[] arr2 = arr1;
		System.out.println("arr1 : ");
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1+"\n");
		
		
		System.out.println("arr2 : ");
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2);
		
		arr2[3] = 4444;
		arr2[4] = 5555;
		
		System.out.println("\n[변경 후]");
		System.out.println("arr1 : ");
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1+"\n");
		
		
		System.out.println("arr2 : ");
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2);
		
		
		
		
		
		
	}
	
	public void method2() {
		// 깊은 복사는 원본 배열/객체의 값을
		// 똑같이 복사(복제)
		// 새로운 객체/배열이 만들어지는 것으로 원본과 독립
		
		int[] arr1 = {10,20,30,40,50};
		
		int[] arr2 = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// System.arraycopy(원본 배열명, 원본 복사 시작 인덱스,
		// 					복사 배열명, 복사 배열의 삽입 시작 인덱스, 
		//					복사 길이)
		
		int[] arr3 = new int[arr1.length];
		
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("arr2 : "+Arrays.toString(arr2));
		System.out.println("arr3 : "+Arrays.toString(arr3));
		
		System.out.println();
		arr1[0] = 100;
		arr2[0] = 200;
		arr3[0] = 300;
		
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("arr2 : "+Arrays.toString(arr2));
		System.out.println("arr3 : "+Arrays.toString(arr3));
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
