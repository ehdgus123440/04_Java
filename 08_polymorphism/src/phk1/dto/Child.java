package phk1.dto;

public class Child extends Parent{
	private String car;
	
	public Child() {
		super();
	}

	public Child(String lastName, int money, String car) {
		super(lastName, money);
		this.car = car;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
	
}
