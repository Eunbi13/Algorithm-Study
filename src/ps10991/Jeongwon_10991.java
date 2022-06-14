package ps10991;

import java.util.Scanner;

public class Jeongwon_10991 {

	// 416ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		for (int i = 1; i < n + 1; i++) {

			for (int y = n; y > i; y--) {
				System.out.print(" ");
			}

			for (int x = 0; x < 2 * i - 1; x++) {
				if (x % 2 != 0 && x != 0) {

					System.out.print(" ");

				} else {

					System.out.print("*");

				}

			}

			System.out.println("");

		}

	}

}
