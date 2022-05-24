package ps10953;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Jeongwon_10953 {

	// 백준에서만 runtime error
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, t;

		Scanner scanner = new Scanner(System.in);

		t = scanner.nextInt();

		for (int i = 0; i < t; i++) {

			scanner = new Scanner(System.in).useDelimiter("[,\r\n]");

			a = scanner.nextInt();
			b = scanner.nextInt();

			if (0 < a && b < 10) {
				System.out.println(a + b);
			}

		}

	}

	// 216ms
	public static void main2(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		String str;

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			str = sc.next();
			st = new StringTokenizer(str, ",");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			System.out.println(a + b);
		}

	}

}
