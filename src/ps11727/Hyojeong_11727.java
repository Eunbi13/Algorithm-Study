package ps11727;

import java.util.Scanner;

public class Hyojeong_11727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] dp = new int[num+1];
		dp[1] = 1;
		dp[2] = 3;
		for(int i =3; i<= num; i++) {
			dp[i] = (dp[i-1] + dp[i-2] + dp[i-2]) % 10007;
		}
		System.out.println(dp[num]);
		sc.close();
	}
}
