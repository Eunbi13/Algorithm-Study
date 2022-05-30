package ps8393;

import java.util.Scanner;

public class Jeongwon_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t, sum = 0;

		Scanner scanner = new Scanner(System.in);

		t = scanner.nextInt();

		if (1 <= t && t <= 10000) {

			for (int i = 1; i <= t; i++) {
				sum += i;
			}

			System.out.println(sum);
		}
	}

}
