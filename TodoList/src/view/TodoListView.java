package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import service.*;

public class TodoListView {

	BufferedReader br = null;
	private TodoListService service = null;
	

	public TodoListView() {
		
		try {
			service = new TodoListServiceImpl();
		
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			System.out.println("\"*** 프로그램 실행 중 오류 발생 ***\"");
			e.printStackTrace();
		} 
	}

	public void mainMenu() {
		boolean check = true;
		try {
			while (check) {
				mainMenuView();
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 0:
					System.out.println("*** 프로그램 종료 ***");
					check = false;
					break;
				default:
					break;
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("\n### 숫자만 입력 해주세요 ###\n");
			
		} catch (IOException e) {
			System.out.println("\n### 입출력 관련 예외 발생 ###\n");
			e.printStackTrace(); 
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}

	private void mainMenuView() {
		System.out.println("\n====== Todo List =====\n");
		System.out.println("1. Todo List Full View");
		System.out.println("2. Todo Detail View");
		System.out.println("3. Todo Add");
		System.out.println("4. Todo Complete");
		System.out.println("5. Todo Update");
		System.out.println("6. Todo Delete");
		System.out.println("0. EXIT");

		System.out.print("select menu number >>>");
	}
}
