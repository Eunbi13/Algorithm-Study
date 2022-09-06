package ps1850;

import java.util.Scanner;

public class Jeongwon_1850_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long a, b, c;

		a = sc.nextLong();
		b = sc.nextLong();

		c = gcd(Math.max(a, b), Math.min(a, b));

//		for (int i = 0; i < c; i++) {
//			System.out.print("1");
//		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= c; i++) {
			sb.append("1");
		}

		System.out.println(sb);
	}

	public static long gcd(long l, long m) {
		if (m == 0)
			return l;
		return gcd(m, l % m);
	}

}
