package ps11722;

import java.util.Scanner;

public class Jeongwon_11722 {

	// 300ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 수열 크기 입력
		int t = sc.nextInt();
		// 수열을 이루고있는 원소 값 배열
		int arr[] = new int[t];
		// 부분 수열의 길이 값 배열
		int dp[] = new int[t];

		// 수열을 이루고있는 값 입력
		for (int i = 0; i < t; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < t; i++) {
			dp[i] = 1;

			// 이전 원소 탐색
			for (int j = 0; j <= i; j++) {

				if (arr[i] < arr[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}

		// 최대 길이 값 탐색
		int max = -1;
		for (int i = 0; i < t; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		System.out.println(max);

	}

}
