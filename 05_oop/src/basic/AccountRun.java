package basic;

public class AccountRun {

	public static void main(String[] args) {
		
		Account a1 = new Account();
//		a1.name = "홍길동";
//		a1.accountNumber = "1234567890";
//		a1.balance = 10000;
//		a1.password = "1q2w3e4r";
		
		a1.setName("홍길동");
		a1.setAN("1234567890");
		a1.setBalance(10000);
		a1.setPassword("1q2w3e4r");
		
		// a1 계좌에 잔액, 비밀번호 바꾸기
		System.out.println("a1 잔액 : " + a1.getBalance());
		
		a1.deposit(5000);
		
		a1.withdraw("12345", 5000);
		a1.withdraw("1q2w3e4r", 5000);
		a1.withdraw("1q2w3e4r", 5000000);
		
		
		
	}

}
