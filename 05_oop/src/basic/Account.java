package basic;

/**
 * 계좌 클래스
 */
public class Account {

	/*	접근을 제한할 속성에 private 키워드 추가
	 * 	-> 현제 객체만 접근 가능
	 * 
	 *	기본적으로 모든 클래스의 속성은
	 *	private 적용 하는 것이 원칙
	 */
	
	// 속성(값)
	private String name;  			// 이름
	private String accountNumber; 	// 계좌번호
	private long balance; 			// 잔액
	private String password;		// 비밀번호
	
	// pirvate이 붙은 변수는 
	// 만들어진 객체에서만 사용/접근 가능
	
	// 기능(메서드)
	
	public void deposit(long amount) {
		balance += amount;
		System.out.printf("%s님의 %s 계좌의 현재 잔액은 %d\n",name,accountNumber,balance);
	}
	
	public void withdraw(String pw, long amount) {
		// 기본 자료형 비교 a==b
		// 참조형 값 비교 a.equals(b)
		
		if(!password.equals(pw)) {
			System.out.println("비밀번호가 일치하지 않습니다\n");
			return; // 메서드 종료
		}
		if(amount>balance) {
			System.out.println("잔액이 부족합니다\n");
			return;
		}
		balance -= amount;
		System.out.println(amount + "원이 출금 되었습니다");
		System.out.printf("%s님의 %s 계좌의 현재 잔액은 %d\n\n",name,accountNumber,balance);
	}
	
	// public void set필드명(){} -> 값을 대입
	public void setName(String name) {
		this.name = name;
	}
	public void setAN(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	// public 반환할 값 타입 get필드명 (){} 값 반환
	public String getName() {
		return name;
	}
	public String getAN() {
		return accountNumber;
	}
	public long getBalance() {
		return balance;
	}
	public String getPassword() {
		return password;
	}
	
	
	
	
	
	
}
