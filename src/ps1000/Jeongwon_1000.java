package ps1000;

import java.util.Scanner;

public class Jeongwon_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;

		Scanner scanner = new Scanner(System.in);

		a = scanner.nextInt();
		b = scanner.nextInt();

		if (0 < a && b < 10) {
			System.out.println(a + b);
		}

	}

}
