	package Day01;

import java.util.Scanner;
//import 외부에서 정의된 클래스파일을 포함하는 키워드
//다중 import : shift + space + 0
/**
 * 반지름을 입력받아, 원의 넓이를 구하는 프로그램
 * @param args
 */
public class Ex07_Circle {
	public static void main(String[] args) {
		//상수 - 프로그램 실행 동안 값을 변경하지 않고 사용할 값
		//상수 선언시 반드시 넣어줘야 함. 중간에 바꾸라고 하면 에러 뜸.
		// 키워드 - final
		//shift enter
		final double PI = 3.141592;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 넓이");
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		
		double area = PI * radius * radius ;
		System.out.println("넓이 : " + area);
		
		sc.close();
	}
}