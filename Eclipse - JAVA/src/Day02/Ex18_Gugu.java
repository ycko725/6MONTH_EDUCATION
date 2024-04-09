package Day02;

import java.util.Scanner;

public class Ex18_Gugu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			int result = input * i;
			System.out.println(input + "*" + i + "=" + result);
		}
		sc.close();
	}
}
