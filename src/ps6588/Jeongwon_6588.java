package ps6588;

import java.util.Arrays;
import java.util.Scanner;

public class Jeongwon_6588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean[] flag = new boolean[1000001];
		Arrays.fill(flag, true);
		for (int i = 3; i < 1000001; i++) {
			if (flag[i]) {
				for (int j = i + i; j < 1000001; j = j + i) {
					flag[j] = false;
				}
			}
		}

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int count = 0;
			for (int i = 3; i < 1000001; i++) {
				if (flag[i] && flag[n - i]) {
					System.out.println(n + " = " + i + " + " + (n - i));
					count = 1;
					break;
				}
			}

			if (count == 0) {
				System.out.println("Goldbach's conjecture is wrong.");
			}
		}
	}

}
