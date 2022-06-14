package ps10992;

import java.util.Scanner;

public class Jeongwon_10992 {

	// 424ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {

			for (int y = i + 1; y < n; y++) {

				System.out.print(" ");

			}

			if (i == 0 || i == n - 1) {

				for (int x = 0; x < 2 * i + 1; x++) {

					System.out.print("*");

				}

			} else {

				for (int x = 0; x < 2 * i + 1; x++) {

					if (x == 0 || x == 2 * i) {

						System.out.print("*");

					} else {

						System.out.print(" ");
					}

				}

			}

			System.out.println("");

		}

	}

}
