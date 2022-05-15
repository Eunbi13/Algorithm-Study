package ps10952;

import java.util.Scanner;

public class Jeongwon_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;

		Scanner scanner = new Scanner(System.in);

		// 정수가 주어지는 동안 반복
		while (scanner.hasNextInt()) {

			a = scanner.nextInt();
			b = scanner.nextInt();

			if (0 < a && b < 10) {
				System.out.println(a + b);
			} else if (a == 0 && b == 0) {
				break;
			}

		}

	}

}
