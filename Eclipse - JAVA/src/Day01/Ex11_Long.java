package Day01;

public class Ex11_Long {
	public static void main(String[] args) {
		//int (4byte) : 32bits : 2^32 : 42억정도
		//int : -21억xxx ~ 21억xxx
		//long : 2^64
		
		long ln1 = 1000;			//int 상태
		long ln2 = 2100000000;
		long ln3 = 2200000000L;		//L을 끝에 넣어줘야 long이 됨

		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		System.out.println("int의 최대값 : " + max);
		System.out.println("int의 최소값 : " + min);
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
	}
}
