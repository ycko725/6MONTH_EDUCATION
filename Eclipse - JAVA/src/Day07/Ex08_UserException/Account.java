package Day07.Ex08_UserException;

public class Account {
	
	private long balance;	// 예금잔액

	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public void withdraw(int money) throws BalanceException {
		if( balance < money ) {
			// 예외 강제 발생
			throw new BalanceException("잔고가 부족합니다."+ (money-balance) + "원이 부족합니다.");
		}
		balance -= money;
	}
	
	

}
