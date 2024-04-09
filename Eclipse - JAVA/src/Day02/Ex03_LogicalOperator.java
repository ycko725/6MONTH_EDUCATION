package Day02;

public class Ex03_LogicalOperator {
	public static void main(String[] args) {
		// 논리 연산자
		// AND (&&)
		// A AND B	:	A와 B 둘 다 true 일 때, 결과가 true 
		// A	B 결과
		//------------
		// F	F F
		// T	F F
		// F	T F
		// T	T T
		System.out.println(true && true);
		System.out.println(true && false);
		// OR (||)
		// A OR B	:	A 또는 B가 true 일 때, 결과가 true 
		// A	B 결과
		//------------
		// F	F F
		// T	F T
		// F	T T
		// T	T T
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || (100<50) );
		//System.out.println((5 < 20 ) || (5 > 2 ) );
		System.out.println();
		// XOR (^)
		// A XOR B	:	A와 B가 다를 때, 결과가 true 
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println((9 >= 2) ^ (7 > 4));
		System.out.println();
		// NOT (!)
		// !A	:	A가 true이면 false로, A가 false이면 true로 변환
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		int value1 = 3;
		//System.out.println(false && (++value1 > 10));
		// 쇼트 서킷
		// : 논리 연산의 결과를 미리 알아서, 남은 논릿기을 확인하지 않은 것
		//dead code: 안봐도 되기 때문에 실행 안됨
		System.out.println(value1);
		
		int value2 = 3;
		//System.out.println(true || ++value2 > 5);
		System.out.println(value2);
		
		//비트연산자의 겅우는 쇼트 서킷이 적용되지 않는다.
		//int value3 =3;
		//System.out.println(false & ++value3 > 6);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 2);
		System.out.println(value4);
	
	}
}
