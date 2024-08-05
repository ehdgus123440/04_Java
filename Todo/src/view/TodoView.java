package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import dao.TodoDAO;
import dao.TodoDAOImpl;
import dto.TodoDTO;
import service.TodoServiceImpl;

public class TodoView {
	
	DateTimeFormatter fommater = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
	
	BufferedReader br = null;
	
	TodoServiceImpl service = null;
	
	TodoDAOImpl dao = null;
	
	public TodoView() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			dao = new TodoDAOImpl();
			service = new TodoServiceImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void MainMenu() {
		try {
			while(true) {
				Menuview();
				int input = Integer.parseInt(br.readLine());
				
				switch (input) {
				case 1 : 
					FullView();
					break;
				case 2 : 
					DetailView();
					break;
				case 3 :
					TodoAdd();
					break;
				case 4 : 
					TodoComplete();
					break;
				case 5 : 
					TodoUpdate();
					break;
				case 6 : 
					TodoDelete();
					break;
				case 0 : break;
				default:
					
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}


	private void Menuview() {
		System.out.println("\n====== Todo List =====\n");
		System.out.println("1. Todo List Full View");
		System.out.println("2. Todo Detail View");
		System.out.println("3. Todo Add");
		System.out.println("4. Todo Complete");
		System.out.println("5. Todo Update");
		System.out.println("6. Todo Delete");
		System.out.println("0. EXIT");
		
		System.out.println("select menu number >>>");
	}
	
	
	
	private void TodoAdd() throws Exception{
		
		System.out.println("\n===============[3. Todo Add]===============\n");
		System.out.print("할 일 제목 입력 : ");
		String title = br.readLine();
		System.out.println("세부 내용 작성");
		String detail = br.readLine();
		
		boolean check = service.TodoAdd(title, detail);
		
		dao.saveFile();
	}
	
	private void FullView() throws IOException {
		
		List<TodoDTO> list = service.FullView();
		
		int check = 0;
		for( int i = 0; i < list.size(); i++) {
			if(list.get(i).isComplete() == true) {
				check++;
			}
			
		}
		
		
		
		System.out.println("\n===============[1. Todo List Full View]===============\n");
		System.out.printf("[ 완료된 Todo 개수 / 전체 Todo 수 : %d / %d \n]", check, list.size());
		System.out.println("---------------------------------------------------");
		System.out.println("인덱스        등록일               완료여부     할 일 제목");
		System.out.println("---------------------------------------------------");
		
//		todo.getRegDate().format(fommater);
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("[%d]  %s   (%b)       %s\n", 
					i, list.get(i).getRegDate().format(fommater),
					list.get(i).isComplete(), list.get(i).getTitle() );
		}
		
		dao.saveFile();
	}

	public void DetailView() throws Exception{
		List<TodoDTO> list = service.FullView();
		
		System.out.println("\n===============[2. Todo Detail View]===============\n");
		System.out.print("인덱스 번호 입력 : ");
		int input = Integer.parseInt(br.readLine());
		System.out.println("--------------------------------------------");
		System.out.println("제목 : " + list.get(input).getTitle());
		System.out.println("등록일 : " + list.get(input).getRegDate().format(fommater));
		System.out.println("완료 여부 : " + list.get(input).isComplete());
		System.out.println("[세부 내용]");
		System.out.println("--------------------------------------------");
		System.out.println(list.get(input).getDetail());
		
		dao.saveFile();
	}
	
	public void TodoComplete() throws Exception{
		List<TodoDTO> list = service.FullView();
		
		System.out.println("\n===============[4. Todo Complete]===============\n");
		System.out.print("O <-> X 변경할 인덱스 번호 입력 : ");
		int input = Integer.parseInt(br.readLine());
		
		if(list.get(input).isComplete() == true) {
			list.get(input).setComplete(false);
		}
		else list.get(input).setComplete(true);
		
		dao.saveFile();
	}
	
	public void TodoUpdate() throws Exception{
		List<TodoDTO> list = service.FullView();
		
		System.out.println("\n===============[5. Todo Update]===============\n");
		System.out.print("수정할 To do인덱스 번호 입력 : ");
		int input = Integer.parseInt(br.readLine());
		
		System.out.println("\n@@@@@@@@@@@ [수정 전] @@@@@@@@@@@@@@@\n");
		
		System.out.println("--------------------------------------------");
		System.out.println("제목 : " + list.get(input).getTitle());
		System.out.println("등록일 : " + list.get(input).getRegDate().format(fommater));
		System.out.println("완료 여부 : " + list.get(input).isComplete());
		System.out.println("[세부 내용]");
		System.out.println("--------------------------------------------");
		System.out.println(list.get(input).getDetail());
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.print("수정할 제목 : ");
		String title = br.readLine();
		System.out.print("수정할 세부 내용 작성 ");
		String detail = br.readLine();
		
		System.out.println("\n[수정 되었습니다]\n");
		
		list.get(input).setTitle(title);
		list.get(input).setDetail(detail);
		
		dao.saveFile();
	}
	
	public void TodoDelete() throws Exception{
		List<TodoDTO> list = service.FullView();
		
		System.out.println("\n===============[6. Todo Delete]===============\n");
		System.out.print("삭제할 index 번호 입력 : ");
		int input = Integer.parseInt(br.readLine());
		
		list.remove(input);
		
		System.out.println("\n[삭제 되었습니다]\n");
		
		dao.saveFile();
		
	}
	
	
	
}
