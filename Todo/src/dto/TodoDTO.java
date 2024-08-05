package dto;

import java.time.LocalDateTime;

public class TodoDTO {
	private String title;
	private String detail;
	boolean complete;
	private LocalDateTime regDate;
	
//	new TodoDTO().setRegDate(LocalDateTime.now())
//	
//	DateTimeFormatter fommater = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
//	todo.getRegDate().format(fommater);
	
	public TodoDTO() {}
	
	public TodoDTO(String title, String detail) {
		this.title = title;
		this.detail = detail;
		this.complete = false;
		this.regDate = LocalDateTime.now();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}
	
	
	
	
}
