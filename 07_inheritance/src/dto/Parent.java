package dto;

public class Parent extends Object{
	
	// protected -> 같은 패키지 : 객체 생성후 사용,
	//				상속 관계 클래스 : 자식 클래스에서 직접 사용
	protected String lastName = "홍";
	
	private String address = "서울시 중구 남대문로 120";
	
	private int money = 100_000_000;
	
	private String car = "그랜져";

	public Parent() {
		System.out.println("부모 - 기본 생성자로 객체 생성");
	}

	public Parent(String address, int money, String car) {
		this.address = address;
		this.money = money;
		this.car = car;
	
		System.out.println("부모 - 매개 변수 생성자로 객체 생성");
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
	public String inform() {
		return String.format("%s / %s / %d / %s", lastName, address, money, car);
	}
	
	public void introduce() {
		System.out.println("저는 parent 입니다");
	}
	@Override
	public String toString() {
		return String.format("[Parent]%s / %s / %d / %s", 
				      lastName, address, money, car);
	}
	public final void onlyParent() {
		System.out.println("final 메서드 입니다");
	}
	
	
	
	
}
