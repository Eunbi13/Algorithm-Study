package ps2446;

import java.util.Scanner;

public class Giyeol2446 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();

		for (int i = 0; i < a; i++) {
			for (int k = i; k > 0; k--) {
				System.out.print(" ");
			}

			for (int j = 2 * (a - i) - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = a - 1; i > 0; i--) {
			for (int k = i - 1; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = i; j < 2 * a - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
