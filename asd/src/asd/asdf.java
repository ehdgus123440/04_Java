package asd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class asdf {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
        stack.push("Hello");
        stack.push("World!");
        stack.push("Hello");
        stack.push("Hello");
  
        // Stack Iterator 선언
        Iterator<String> itr
            = stack.iterator();
  
        // 결과 출력
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
  		// Enter입력
        System.out.println();
  
  		// 후입선출
        stack.pop();
  
        // 재정의
        itr
            = stack.iterator();
  
        // 결과 출력
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

	}
}
