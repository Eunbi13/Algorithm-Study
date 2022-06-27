package ps11055;

import java.util.Scanner;

public class Jeongwon_11055 {

	// 312ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 수열 크기 입력
		int t = sc.nextInt();
		// 수열을 이루고있는 원소 값 배열
		int[] arr = new int[t + 2];
		// 부분 수열의 합 배열
		int[] dp = new int[t + 2];

		// 수열을 이루고있는 값 입력
		for (int i = 1; i <= t; i++) {
			arr[i] = sc.nextInt();
		}

		dp[1] = arr[1];

		for (int i = 2; i <= t; i++) {
			dp[i] = arr[i];
			int maxDp = 0;

			// 이전 원소 탐색
			for (int j = 1; j < i; j++) {

				// j번째 원소가 i번째 원소보다 작은경우
				if (arr[j] < arr[i]) {
					maxDp = Math.max(maxDp, dp[j]);
					dp[i] = maxDp + arr[i];
				}
			}
		}

		// 최대 길이 값 탐색
		int max = dp[1];
		for (int i = 1; i <= t; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		System.out.println(max);
	}

}
