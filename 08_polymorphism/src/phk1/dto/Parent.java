package phk1.dto;

public class Parent {
	private String lastName = "김";
	private int money = 50000;
	
	
	public Parent() {
		super(); // 부모 (object) 생성자 호출
	}

	public Parent(String lastName, int money) {
		super();
		this.lastName = lastName;
		this.money = money;
	}
	
	

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String toString() {
		return ("Parent : " + lastName + " / " + money);
	}
}
