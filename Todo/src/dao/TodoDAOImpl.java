package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

import dto.TodoDTO;
import service.TodoService;
import service.TodoServiceImpl;

public class TodoDAOImpl implements TodoDAO {

	private final String FILE_PATH = "/io_test/Todo/Todo.dat";

	private List<TodoDTO> dtoList = null;
	TodoServiceImpl service = new TodoServiceImpl();

	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;

	public TodoDAOImpl() throws Exception {

		File file = new File(FILE_PATH);

		if (file.exists()) {
			try {
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));

				dtoList = (ArrayList<TodoDTO>) ois.readObject();
			} finally {
				if (ois != null)
					ois.close();
			}
		} else {
			dtoList = new ArrayList<TodoDTO>();
		}
	}
	
	public List<TodoDTO> returnDto() {
		
		saveFile();
		
		return dtoList;
		
	}
	
	
	
	
	public void saveFile() throws IOException {
		
		dtoList = service.FullView();
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(dtoList);
		} finally {
			if (oos != null)
				oos.close();
		}
	}
	
	
}
