package ps2579;

import java.util.Scanner;

public class Jeongwon_2579_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        int arr[] = new int[n+2];
        int dp[] = new int[n+2];

        for(int i = 1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }

        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];

        for(int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-3] + arr[i-1], dp[i-2]) + arr[i];
        }

        System.out.println(dp[n]);
    }
}
