package ps2446;

import java.util.Scanner;

public class Jeongwon_2446 {

	// 540ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		for (int i = 0; i < 2 * n - 1; i++) {

			if (i < n) {

				for (int x = 0; x < i; x++) {
					System.out.print(" ");
				}

				for (int y = 2 * n - 1; y > 2 * i; y--) {
					System.out.print("*");
				}

			} else {

				for (int x = i - n; x < n - 2; x++) {
					System.out.print(" ");
				}

				for (int y = 2 * n; y < 2 * i + 3; y++) {
					System.out.print("*");
				}

			}

			System.out.println("");

		}

	}

}
