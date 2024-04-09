package Day07.Ex08_UserException;

// 사용자 정의 예외 클래스
// : public class ???Exception extends Exception { }
public class BalanceException extends Exception {
	
	public BalanceException() { }
	public BalanceException(String message) {
		super(message);
	}
	
	

}
