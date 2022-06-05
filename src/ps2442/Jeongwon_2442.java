package ps2442;

import java.util.Scanner;

public class Jeongwon_2442 {

	// 428ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		for (int i = 1; i < n + 1; i++) {

			// 공백1, 428ms
			for (int z = i; z < n; z++) {

				System.out.print(" ");

			}

			// 공백2, 488ms
//			for (int z = n - 1; z >= i; z--) {
//
//				System.out.print(" ");
//
//			}

			// 별
			for (int x = 0; x < i; x++) {

				System.out.print("*");

			}

			// 다음 열에 별을 하나 더 찍는 반복문을 넣음으로 홀수
			for (int y = 1; y < i; y++) {

				System.out.print("*");

			}

			// 개행
			System.out.println("");

		}

	}

}
