package ps9095;

import java.util.Scanner;

public class Hyojeong_9095 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int num2;

		int[] dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;

		for (int i = 0; i < num; i++) {
			num2 = scanner.nextInt();

			for (int j = 4; j <= num2; j++) {
				dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
			}
			System.out.println(dp[num2]);
		}

	}
}
