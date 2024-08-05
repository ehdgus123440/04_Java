package service;

import java.util.List;

import dto.Todo;

public interface TodoListService {

	public abstract List<Todo> FullView();

	void Todoadd(String title, String detail);
	
}
