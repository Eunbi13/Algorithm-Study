package ps1912;

import java.util.Scanner;

public class Jeongwon_1912_2 {

//	시간초과
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		int[] plusArr = new int[n + 1];
		int plus = 0;
		int max = n * -1000;
		int result = 0;

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {

			dp[1] = arr[1];

			for (int j = 1; j <= i; j++) {
//				1, 2, 3, 4
//				plus += arr[j];
				for (int x = j; x < i + 1; x++) {
//					1 - 1, 2, 3, 4
//					2 - 2, 3, 4
//					3 - 3, 4
//					4 - 4
					plus += arr[x];

				}

//				System.out.println("plus : " + plus);

				plusArr[i] = plus;

				plus = 0;

				max = plusArr[i] > max ? plusArr[i] : max;

			}

			dp[i] = Math.max(dp[i - 1], max);

			result = dp[i];

		}

		System.out.println(result);

		long estimated = System.currentTimeMillis() - start;
		System.out.println("running time: " + estimated);

	}

}
