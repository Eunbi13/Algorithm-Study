package ps10824;

import java.util.Scanner;

public class Jeongwon_10824 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long a = 0;
		for (int i = 0; i < 2; i++) {
			String s1 = sc.next();
			String s2 = sc.next();

			a += Long.parseLong(s1 + s2);
		}
		System.out.println(a);
	}
}
