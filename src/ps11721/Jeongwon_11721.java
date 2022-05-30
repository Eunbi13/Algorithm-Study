package ps11721;

import java.util.Scanner;

public class Jeongwon_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;

		Scanner scanner = new Scanner(System.in);

		s = scanner.next();

		if (s.length() <= 10 && s.length() > 0) {

			System.out.println(s);

		} else {

			// 10자리 문자열 수
			int a = s.length() / 10;
			// 마지막 문자열의 문자 수
			int b = s.length() % (a * 10);

			for (int i = 0; i < a; i++) {
				System.out.println(s.substring(i * 10, i * 10 + 10));
			}

			if (b != 0) {
				System.out.println(s.substring(a * 10, s.length()));
			}

		}

	}

}
