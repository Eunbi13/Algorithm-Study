package ps1929;

import java.util.Scanner;

public class Jeongwon_1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		boolean[] b = new boolean[n + 1];
		b[0] = true;
		b[1] = true;

		for (int i = 2; i <= n; i++) {
			if (b[i] == false) {
				if (i >= m) {
					System.out.println(i);
				}
				for (int j = i + i; j <= n; j += i) {
					b[j] = true;
				}
			}
		}
	}
}
