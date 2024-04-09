package Day01;

public class Ex09_Byte {
	public static void main(String[] args) {
		//byte = 8bits
		//bit = - 0 또는 1
		//0000 0000  = 1 byte
		//0 1								: 2		: 2^1
		//00 01 10 11 						: 4		: 2^2
		//000 001 010 100 011 101 110 111 	: 8		: 2^3
		//0000 0001 ... 					: 256	: 2^8
		
		//8bits : 2^8 : 256개의 데이터 표현할 수 있다.
		//양수와 음수로 나누면, -128 ~ 0 ~ 127
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//오버플로우 = 데이터 버위를 벗어난 예) 128
		//error msg : type mismatch
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	}
}
