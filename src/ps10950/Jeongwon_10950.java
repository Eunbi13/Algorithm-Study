package ps10950;

import java.util.Scanner;

public class Jeongwon_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, t;

		Scanner scanner = new Scanner(System.in);

		t = scanner.nextInt();

		for (int i = 0; i < t; i++) {

			a = scanner.nextInt();
			b = scanner.nextInt();

			if (0 < a && b < 10) {
				System.out.println(a + b);
			}

		}

	}

}
