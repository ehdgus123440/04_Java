package service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import dao.TodoListDaoImpl;
import dto.Todo;

public class TodoListServiceImpl implements TodoListService{
	TodoListDaoImpl dao = null;
	
	Todo
	
	public TodoListServiceImpl() throws Exception{

		
		dao = new TodoListDaoImpl();
		
	}

	public List<Todo> FullView() {
		 List<Todo> list1 = dao.returnTodo();
		 
		 return list1;
		
	}

	@Override
	public void Todoadd(String title, String detail) {
		
	}


}
