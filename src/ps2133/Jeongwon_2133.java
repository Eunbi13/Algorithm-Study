package ps2133;

import java.util.Scanner;

public class Jeongwon_2133 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        int tmp = 0;

        n = sc.nextInt();
        
        int [] dp = new int[n+4];
        dp[0] = 1;
        dp[2] = 3;
        dp[4] = 11;

        for (int i=6; i<=n; i+=2) {
            dp[i] = dp[i-2] * 3 + 2 + (tmp+=dp[i-4]*2);
        }

        System.out.println(dp[n]);

    }
}
