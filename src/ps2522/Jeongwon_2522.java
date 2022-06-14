package ps2522;

import java.util.Scanner;

public class Jeongwon_2522 {

	// 416ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		for (int x = 0; x < 2 * n - 1; x++) {
			if (x < n) {

				for (int y = x + 1; y < n; y++) {
					System.out.print(" ");
				}

				for (int z = 0; z < x + 1; z++) {
					System.out.print("*");
				}

			} else {

				for (int y = 0; y < x - n + 1; y++) {
					System.out.print(" ");
				}

				for (int z = x - n + 1; z < n; z++) {
					System.out.print("*");
				}
			}

			System.out.println("");

		}

	}

}
