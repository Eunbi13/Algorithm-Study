package ps2579;

import java.util.Scanner;

public class Jeongwon_2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        int arr[] = new int[n+1];
        int dp[] = new int[n+1];

        for(int i = 1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }

        dp[1] = arr[1];

        for(int i = 2; i<=n; i++) {
            // 조건을 넣어서 3연속을 피할 수 있는 방법이 있을까??
            // dp[i] = Math.max(dp[i-2] + arr[i], dp[i-1] + arr[i]);
            dp[i] = Math.max(dp[i-2], dp[i-1])+ arr[i];
        }

        System.out.println(dp[n]);
    }
}
