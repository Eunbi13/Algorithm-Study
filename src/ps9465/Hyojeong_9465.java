package ps9465;

import java.util.Scanner;

public class Hyojeong_9465 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //테스트케이스 수
		
		for(int t = 1; t<=num; t++) {
			int N = sc.nextInt();
			
			int [][] Map = new int[2][N+2];
			int [][] dp = new int[2][N+2];
			
			for(int i = 0;i<2;i++) {
				for(int j=1;j<=N;j++) {
					Map[i][j] = sc.nextInt();
				}
			}
			dp  [0][1] = Map[0][1];
			dp  [1][1] = Map[1][1];
			
			for(int i=2; i<=N; i++) {
				dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + Map[0][i];
				dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + Map[1][i];
			}
			System.out.println(Math.max(dp[0][N], dp[1][N]));
		}
		sc.close();
	}

}
