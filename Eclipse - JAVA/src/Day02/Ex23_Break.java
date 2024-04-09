package Day02;

import java.util.Scanner;

public class Ex23_Break {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("STOP 을 입력하면 종료합니다.");
		while(true) {
			System.out.println("입력 : ");
			String str = sc.nextLine();
			if(str.equals("STOP"))
				break;
			System.out.println(">>" + str);
			
			}
			System.out.println("프로그램을 종료합니다...");
			sc.close();
		}
		
		
}
