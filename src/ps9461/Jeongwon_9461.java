package ps9461;

import java.util.Scanner;

public class Jeongwon_9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
    
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
         
            m = sc.nextInt();

            // int -2,147,483,638 ~ +2,147,483,647
            // long -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
            // ex) 100 입력 시 888,855,064,897
            long dp[] = new long[m+5];

            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;

            for(int j = 6; j <= m; j++) {
                dp[j] = dp[j-5] + dp[j-1];
            }

            System.out.println(dp[m]);

        }
        
    }
}
