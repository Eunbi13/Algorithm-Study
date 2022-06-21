package ps10844;

import java.util.Scanner;

// 220ms
public class Jeongwon_10844 {

    static Long[][] dp;
    final static long MOD = 1000000000;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int n;
        n = scanner.nextInt();
        
        dp = new Long[n + 1][10];

        for(int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0;

        for(int i = 1; i <= 9; i++) {
            result += recur(n, i);
        }

        System.out.println(result % MOD);

    }

    static long recur(int digit, int val) {

        if(digit == 1) {
            return dp[digit][val];
        }

        if(dp[digit][val] == null) {

            if(val == 0) {
                dp[digit][val] = recur(digit - 1, 1);
            }

            else if(val == 9) {
                dp[digit][val] = recur(digit - 1, 8);
            }

            else {
                dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
            }

        }

        return dp[digit][val] % MOD;

    }
    
}
