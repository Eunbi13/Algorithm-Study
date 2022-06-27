package ps2156;

import java.util.Scanner;

public class Jeongwon_2156 {

	// 400ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 포도잔 개수
		int t = sc.nextInt();

		// 포도주 양
		int[] arr = new int[t + 1];
		// 포도주 최대 양
		int[] dp = new int[t + 1];

		// 포도주 양 입력
		for (int i = 1; i <= t; i++) {
			arr[i] = sc.nextInt();
		}

		// 포두주 1잔 일 때 최대 양
		dp[1] = arr[1];

		if (t > 1) {
			// 포도주 2잔 일 때 최대 양
			dp[2] = arr[1] + arr[2];
		}

		// 포도주 3잔 이 후 최대 양
		for (int i = 3; i <= t; i++) {
			// dp[3] = Math.max(dp[2], Math.max(dp[1] + arr[3], dp[0] + arr[2] + arr[3]))
			// dp[4] = Math.max(dp[3], Math.max(dp[2] + arr[4], dp[1] + arr[3] + arr[4]))
			// dp[4] 1-1 Math.max(4번째 잔을 포함하지 않음, 4번째 잔을 포함)
			// dp[4] 1-2 Math.max(3잔 연속 선택할 수 없으므로 i-2, 2번째 잔을 포함, 2번째 잔을 포함하지 않음)
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
		}

		System.out.println(dp[t]);

	}

}
