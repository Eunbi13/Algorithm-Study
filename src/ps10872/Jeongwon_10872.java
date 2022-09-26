package ps10872;

import java.util.Scanner;

public class Jeongwon_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;

		if (n == 0) {
			System.out.println(1);
		} else {

			for (int i = 1; i <= n; i++) {
				a *= i;
			}

			System.out.println(a);
		}

	}

}
