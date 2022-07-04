package week7.ps11055;

import java.util.Scanner;

public class Giyeol11055 {

	public static void main(String[] args) {
		      
		Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scan.nextInt();
        }

        dp[1] = arr[1];

        for (int i = 2; i <= n; i++) {
            int max = 0;
            for (int j = 1; j < i ; j++) {
                if (arr[i] > arr[j]) {
                    max = Math.max(max, dp[j]);
                }
            }

            dp[i] = arr[i] + max;
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (dp[i] > answer) {
                answer = dp[i];
            }
        }

        System.out.println(answer);
        scan.close();
    }
}