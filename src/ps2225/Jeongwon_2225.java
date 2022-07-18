package ps2225;

import java.util.Scanner;

public class Jeongwon_2225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		long[][] dp = new long[n + 1][k + 1];

		for (int i = 1; i <= k; i++) {
			dp[0][i] = 1;
			if (n > 0) {
				dp[1][i] = i;
			}
		}

		for (int i = 1; i <= n; i++) {
			dp[i][1] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= k; j++) {
				for (int x = 0; x <= i; x++) {
					dp[i][j] += dp[i - x][j - 1] % 1000000000;
				}
				dp[i][j] %= 1000000000;
			}
		}
		System.out.println(dp[n][k] % 1000000000);
	}

}
