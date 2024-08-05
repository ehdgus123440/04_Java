package service;

import java.util.ArrayList;
import java.util.List;

import dao.TodoDAO;
import dao.TodoDAOImpl;
import dto.TodoDTO;

public class TodoServiceImpl implements TodoService{
	
	TodoDAOImpl dao = null;
	
	List<TodoDTO> list = null;  
	
	public TodoServiceImpl() throws Exception{
		try {
			list = new ArrayList<TodoDTO>();
		
			dao = new TodoDAOImpl();
		} finally {
			
		}
	}

	public boolean TodoAdd(String title, String detail) {
		
		TodoDTO dto = new TodoDTO(title, detail);
		
		boolean check = list.add(dto);
		
		if(check) {
			System.out.println("[" + (list.size()-1) + "] 인덱스에 추가 되었습니다");
			return true;
		}
		
		return false;
	}

	public List<TodoDTO> FullView(){
		return dao.returnDto();
	}
	
	
}
