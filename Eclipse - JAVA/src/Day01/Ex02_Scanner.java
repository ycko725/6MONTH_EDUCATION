package Day01;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		//객체 생성 - new
		//클래스타입 클래스명 = new 클래스명();
		//기본 입력 객체 - Scanner
		Scanner sc = new Scanner(System.in);
		//(경고) -노란색 밑줄로 표시
	
		//변수 선언
		//자료형 변수명;
		//-자료형 변수명 = 값;
		//nextInt() : 정수 하나를 입력받는 메소드
		System.out.print("a : ");
		
		int a = sc.nextInt();
		//"문자열" : 문자열은 큰따움표로 표현한다
		//문자열과 숫자 연결하기
		//: "문자열" + 숫자
		//문자열과 숫자를 + (문자열 연결연산자)로 연결할수 있다.
		//이 때, 숫자(Int) 자료형이 문자열 자료형으로 변환되어 연결된다.
		System.out.println("a : " + a);
				
		sc.close();
		//close() : Scanner 객체를 닫는 메소드 (메모리 해체)
		//Scanner 객체가 닫힌 후에는 입력을 할 수 없다
	}
}
