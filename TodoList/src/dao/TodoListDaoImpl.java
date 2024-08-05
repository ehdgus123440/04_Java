package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dto.Todo;

public class TodoListDaoImpl implements TodoListDao{
	
	private final String FILE_PATH = "/io_test/Todo/Todo.dat";
	
	
	ObjectInputStream ois = null;
	ObjectOutputStream oos = null;
	
	private List<Todo> list = null;
	
	File file = new File(FILE_PATH);
	
	public TodoListDaoImpl() throws Exception{
		if( file.exists() ) {
			try {
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				
				list = (ArrayList<Todo>)ois.readObject();
			} finally {
				if(ois != null) ois.close();
			}
		}
		else {
			list = new ArrayList<Todo>();
		}
	}

	public List<Todo> returnTodo(){
		return list;
		
	}





}
