package ps9465;

import java.util.Scanner;

public class Jeongwon_9465 {

	// 1624ms
	// https://velog.io/@yanghl98/%EB%B0%B1%EC%A4%80-9465-%EC%8A%A4%ED%8B%B0%EC%BB%A4-JAVA
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 수 입력
		int t = sc.nextInt();

		// 테스트 케이스 수 반복
		for (int i = 0; i < t; i++) {
			// 스티커 n열 입력
			int n = sc.nextInt();
			// 스티커 해당 배열의 점수
			int[][] arr = new int[2][n + 1];
			// 스티커 점수 총합(최대)
			int[][] dp = new int[2][n + 1];
			// 스티커 0, 1행
			for (int j = 0; j < 2; j++) {
				// 스티커 n열
				for (int k = 1; k <= n; k++) {
					// 각 자리 스티커 점수 입력
					arr[j][k] = sc.nextInt();
				}
			}
			// 1열의 경우
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];

			// 2열 부터 스티커 최대 총합 점수
			for (int a = 2; a <= n; a++) {
				// 0행
				dp[0][a] = Math.max(dp[1][a - 1], dp[1][a - 2]) + arr[0][a];
				// 1행
				dp[1][a] = Math.max(dp[0][a - 1], dp[0][a - 2]) + arr[1][a];
			}
			System.out.println(Math.max(dp[0][n], dp[1][n]));
		}

	}

}
