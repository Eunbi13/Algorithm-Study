package ps9095;

import java.util.Scanner;

public class Jeongwon_9095 {

    static Integer[] dp;

    // 208ms
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int t, n;

        t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            n = scanner.nextInt();

            dp = new Integer[n + 3];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            if ( n > 0 && n < 11) {
                System.out.println(recur(n));
            }               

        }

        scanner.close();
        
    }

    static int recur(int n) {

        if( dp[n] == null) {

            dp[n] = (recur(n-1) + recur(n-2) + recur(n-3)) % 10007;

        }

        return dp[n];

    }
    
}
