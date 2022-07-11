package ps_1699;

import java.util.Scanner;

public class Jeongwon_1699 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		int[] dp = new int[n + 1];

		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = 10001;

			// dp[9] = dp[1] + dp[8] or dp[2] + dp[7]
//			        or dp[3] + dp[6] or dp[4] + dp[5] 1~4까지 최소 개수를 구하기 위해 반복
			for (int j = 1; j <= i / 2; j++) {

				// 제곱근이 되는 수 4, 9, 16은 최소 개수 1개
				if (j * j == i) {
					dp[i] = 1;

				} else {

					dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
				}

			}

		}

		System.out.println(dp[n]);
	}

}
