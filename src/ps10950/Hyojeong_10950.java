package ps10950;

import java.util.Scanner;

public class Hyojeong_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, t;

		t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (0 < a && b < 10) {
				System.out.println(a + b);
			}
		}
	}
}
