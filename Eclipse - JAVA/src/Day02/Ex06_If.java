package Day02;

import java.util.Scanner;

public class Ex06_If {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int input = sc.nextInt();

		if (input % 2 == 1) {
			System.out.println("홀수입니다");
		}
		if (input % 2 == 0) {
			System.out.println("짝수입니다");
		}
		sc.close();
	}
}
