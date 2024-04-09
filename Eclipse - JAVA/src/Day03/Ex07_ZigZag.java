package Day03;

import java.util.Scanner;

public class Ex07_ZigZag {

	public static void main(String[] args) {

		// 배열의 크기 N을 입력 받아,
		// NxN 구조의 배열에 1부터 시작하여 1씩 증가하는 값을 대입하는데,
		// 아래와 같은 규칙으로 값을 대입하고 출력하시오.
		// (입력예시)
		// 4
		// (출력예시)
		// 1 2 3 4
		// 8 7 6 5
		// 9 10 11 12
		// 16 15 14 13

		// 1. N을 입력받는다.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// 2. NxN 구조로 배열을 생성한다.
		int arr[][] = new int[N][N];

		int k = 1; // 증가하는 수
		int sw = 1; // 방향 전환 수

		// 바깥쪽 반복문 : i - 행
		for (int i = 0; i < arr.length; i++) {
			// 정방향
			if (sw == 1) {
				// 안쪽 반복문 : j - 열
				for (int j = 0; j < N; j++) {
					// j : 0 1 2 3 4 (↑)
					arr[i][j] = k++;
				}
			}
			// 역방향
			if (sw == -1) {

				for (int j = N - 1; j >= 0; j--) {
					// i : 1
					// j : 4 3 2 1 0 (↓)
					arr[i][j] = k++;
				}
			}
			// 방향 전환
			sw *= -1; // sw = sw * -1;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
