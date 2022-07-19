package week9.ps11052;

import java.util.Scanner;

public class Giyeol11052 {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        int n = scan.nextInt();
	        int[] arr = new int[n + 1];

	        for (int i = 1; i <= n; i++) {
	            arr[i] = scan.nextInt();
	        }

	        int[] dp = new int[n + 1];

	        dp[1] = arr[1];

	        for (int i = 2; i <= n; i++) {
	            dp[i] = arr[i];

	            for (int j = 0; j <= i; j++) {
	                dp[i] = Math.max(dp[i], dp[i - j] + dp[j]);
	            }
	        }

	        System.out.println(dp[n]);
	    }

}
