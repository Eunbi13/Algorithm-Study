package ps2156;

import java.util.Scanner;

public class Hyojeong_2156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int p[] = new int[num + 1];
		int dp[] = new int[num + 1];

		for (int i = 1; i <= num; i++) {
			p[i] = sc.nextInt();
		}
		dp[1] = p[1];
		if (num > 1)
			dp[2] = p[1] + p[2];
		for (int i = 3; i <= num; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + p[i], dp[i - 3] + p[i - 1] + p[i])); // 0번 , 1번, 2번

		}

		System.out.println(dp[num]);
		sc.close();
	}
}
