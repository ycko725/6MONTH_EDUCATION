package Day02;

public class Ex04_BitOper {
	public static void main(String[] args) {
		// AND
		// 20 (십진수) --> 0001 0100 (이진수)
		// 16 (십진수) --> 0001 0000 (이진수)
		// 이진수 : 0 또는 1호만 표현한 수

		// 0001 0100
		// 0001 0000
		// ---------
		// 0001 0000 --> 16
		int result = 20 & 16;
		System.out.println(20 & 16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-----------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		// OR
		// 0001 0100
		// 0001 0000
		// --------------
		// 0001 0000
		int result2 = 20 | 16;
		System.out.println(20 | 16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		// XOR
		// 0001 0100
		// 0001 0000
		// ---------
		// 0000 0100
		int result3 = 20 ^ 16;
		System.out.println(20 ^ 16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("------------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();
		// NOT
		// ~0001 0100
		// ---------
		// 1110 1011
		int result4 = ~20;
		System.out.println(~20);
		System.out.println(Integer.toBinaryString(20));
		System.out.println("------------------");
		System.out.println(Integer.toBinaryString(result4));
		System.out.println();

		// int (4byte) (32bit)
		// 0000 0000 0000 0000 0000 0000 0001 0100
		// 1111 1111 1111 1111 1111 1111 1110 1011

		// 최상위비트
		// 부호 (+/-)가 있는 수의 경우는 최상위비트를 부호비트를 사용한다

		// 시프트 연산
		// -산술 시프트 (<<, >>)
		// : 부호 비트 유지하면서, 왼쪽 또는 오른쪽으로 이동시키는 연산자

		// 논리 시프트 (<<<, >>>)
		// : 부호 비트 포함하여, 전체를 왼쪽 또는 오른쪽으로 이동시키는 연산자

		// 0000 0010 -> 2 :2^1
		// 0000 0100 -> 4 :2^2
		// 0000 1000 -> 8 :2^3
		System.out.println("<< 연산하면 2배씩 증가");
		System.out.println(2 << 1);		//왼쪽으로 비트를 1칸 이동
		System.out.println(2 << 2);		//왼쪽으로 비트를 2칸 이동
		System.out.println(2 << 3);		//왼쪽으로 비트를 3칸 이동
		System.out.println();
		System.out.println(">> 연산하면 1/2배씩 감소");
		System.out.println(16 >> 1);	//오른쪽으로 비트를 1칸 이동
		System.out.println(16 >> 2);	//오른쪽으로 비트를 1칸 이동
		System.out.println(16 >> 3);	//오른쪽으로 비트를 1칸 이동
		System.out.println();
		System.out.println("부호가 있는 경우");
		System.out.println(-2 << 1);
		System.out.println(-2 << 2);
		System.out.println(-2 << 3);
		System.out.println();
		System.out.println(2 >> 1);
		System.out.println(-2 >>> 31);
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(-2));
		System.out.println();
		
		// 	 0000 1010 --> 10
		// 1.1111 0101	//비트를 반전
		// 2.0000 0001	//1을 더한다
		//-------------
		//	 1111 0110
		//   1111 0110 --> -10
	}

}
