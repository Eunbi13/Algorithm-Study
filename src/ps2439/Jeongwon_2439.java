package ps2439;

import java.util.Scanner;

public class Jeongwon_2439 {

	// 376ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		for (int i = 1; i < n + 1; i++) {

			// 공백
			for (int y = n - 1; y >= i; y--) {

				System.out.print(" ");

			}

			// 별
			for (int x = 0; x < i; x++) {

				System.out.print("*");

			}

			// 개행
			System.out.println("");

		}

	}

}
