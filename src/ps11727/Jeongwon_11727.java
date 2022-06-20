package ps11727;

import java.util.Scanner;

public class Jeongwon_11727 {

    static Integer[] dp;

    // 212ms
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n;

        n = scanner.nextInt();

        scanner.close();

        dp = new Integer[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;

        System.out.println(recur(n));

    }

    static int recur(int n) {

        if (dp[n] == null) {
            dp[n] = (recur(n-1) + recur(n-2) * 2) % 10007;
        }
        
        return dp[n];

    }

}
