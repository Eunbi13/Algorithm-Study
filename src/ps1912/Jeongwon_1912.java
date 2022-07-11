package ps1912;

import java.util.Arrays;
import java.util.Scanner;

public class Jeongwon_1912 {

//	메모리 초과
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Garbage Collection으로 메모리 초기화
		System.gc();

		// 실행전 메모리 사용량 조회
		long before = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		int max = n * -1000;

		int[] arr = new int[n + 1];
		int[][] dp = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

//		arr[0] = 0;

		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {

//				dp[i][j] = Math.max(dp[i][j - 1], dp[i][j - 1] + arr[j]);
				dp[i][j] = dp[i][j - 1] + arr[j];

//				System.out.println(dp[i][j]);				

				max = dp[i][j] > max ? dp[i][j] : max;

			}

		}

		System.out.println(max);

		// Garbage Collection으로 메모리 정리
		System.gc();

		// 실행 후 메모리 사용량 조회
		long after = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println("before : " + before);
		System.out.println("after : " + after);
		// 메모리 사용량 측정
		long usedMemory = (before - after) / 1024 / 1024;

		System.out.println("Used Memory : " + usedMemory);

	}

}
