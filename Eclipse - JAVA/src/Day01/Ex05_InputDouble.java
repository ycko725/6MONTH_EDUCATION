package Day01;

import java.util.Scanner;

public class Ex05_InputDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("x : ");
			int x = sc.nextInt();
			System.out.print("y : ");
			int y = sc.nextInt();
			System.out.print("z : ");
			int z = sc.nextInt();
			
			int sum = x + y + z;
			double avg = (double) sum / 3;
			
			// int + int = int
			// 정수 + 실수 = 정수
			// int + double = double
			// int: 4byte double: 8byte
			//작은 타입과 큰타입 연산하면 결과는 큰타입이다
			
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			
			sc.close();
	}
} 
