package ps2609;

import java.util.Scanner;

public class Giyeol2609 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = GCD(a, b);

		System.out.println(c);
		System.out.println(a * b / c);

	}

	public static int GCD(int a, int b) {

			while (b != 0) {
				int d = a % b;

				a = b;
				b = d;
			}
		return a;
	}
}
