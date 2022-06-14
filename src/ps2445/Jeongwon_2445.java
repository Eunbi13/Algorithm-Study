package ps2445;

import java.util.Scanner;

public class Jeongwon_2445 {

	// 628ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n;

		n = scanner.nextInt();

		for (int i = 0; i < 2 * n - 1; i++) {

			if (i < n) {
				for (int x = 0; x < i + 1; x++) {

					System.out.print("*");

				}
				for (int y = 2 * i; y < 2 * (n - 1); y++) {

					System.out.print(" ");

				}
				for (int z = 0; z < i + 1; z++) {

					System.out.print("*");

				}
			} else {
				for (int x = n - 1; x > i - n; x--) {

					System.out.print("*");

				}
				for (int y = 2 * i; y > 2 * (n - 1); y--) {

					System.out.print(" ");
				}
				for (int z = n - 1; z > i - n; z--) {

					System.out.print("*");

				}
			}

			System.out.println("");
		}

	}

}
