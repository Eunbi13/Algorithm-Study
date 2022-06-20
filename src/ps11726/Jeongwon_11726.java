package ps11726;

import java.util.Scanner;

public class Jeongwon_11726 {

    static Integer[] dp;

    // 212ms
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        scanner.close();
        
        int n;

        n = scanner.nextInt();

        // 런타임 에러
        // dp = new Integer[n + 1];

        dp = new Integer[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        System.out.println(recur(n));

        // 실패했습니다
        // System.out.println(recur(n) % 10007);

    }

    static int recur(int n) {

        if (dp[n] == null) {
            dp[n] = (recur(n-1) + recur(n-2)) % 10007;
        }
        
        return dp[n];

    }

    // 208ms
    public static void main2(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        sc.close();

        int n = sc.nextInt();

        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++)
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;

        System.out.println(dp[n]);
    }

}