package Day02;

public class Ex05_TernaryOperator {
	public static void main(String[] args) {
		int a = 3, b = 5;
		//조건 연산자 (삼항 연산자)
		//(조건) ? : 9참일 때 문장) ; (거짓일 때 문장)
		int result = (a>b) ? a-b : b-a;
		System.out.println("두 수의 차 : " + result);

	}
}
