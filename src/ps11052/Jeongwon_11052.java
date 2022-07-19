package ps11052;

import java.util.Scanner;

public class Jeongwon_11052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n+1];

        for (int i = 1; i <= n; i++) {
            //i개가 들은 팩을 살때
            dp[i] = sc.nextInt();
            //반복문을 돌며 모든 dp[i-j] + dp[j] 의 값중 가장 큰 값을 dp에 저장한다
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], dp[i-j] + dp[j]);
            }
        }
        System.out.println(dp[n]);
    }

    // i가 5일때

    // dp[5] : 5장 카드 살때
    // dp[5-1] + dp[1] : 4장 카드 구매하는 최대값 + 1장 카드 구매하는 최대값
    // dp[5-2] + dp[2] : 3장 카드 구매하는 최대값 + 2장 카드 구매하는 최대값
    // dp[5-3] + dp[3] : 2장 카드 구매하는 최대값 + 3장 카드 구매하는 최대값
    // dp[5-4] + dp[4] : 1장 카드 구매하는 최대값 + 4장 카드 구매하는 최대값

}
