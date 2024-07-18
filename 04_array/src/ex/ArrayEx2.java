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
	
	public void method3() {
		/*	  [forEach문] 
		 * 	0번 인덱스 부터 마지막까지 1씩 증가하며
		 * 	iterable 성격을 띄는 객체의 요소를
		 * 	하나씩 순서대로 반환하는 for문
		 * 	-> 배열, List, Set, Map등 */
		
		// for( 배열 자료형의 변수 : 배열명 ){}
		
		int[] arr = {10,20,30,40};
		
		for( int num : arr ) {
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
	}
	
	public void method4() {
		
		char[] arr = {'김', '동', '현'};
		
		for(char ch : arr ) {
			System.out.printf("%c 의 유니코드 : %d\n",ch,(int)ch);
		}
		
	}
	
	public void method5() {
		/*	  [2차원 배열]
		 * 	자료형[][] 배열명 = new 자료형[x][y];
		 */
		
		int[][] arr = new int[2][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
	
		for( int[] i : arr ) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	
	}
	
	public void method6() {
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
