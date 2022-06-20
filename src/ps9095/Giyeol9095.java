package week6.ps9095;

import java.util.Scanner;

public class Giyeol9095 {
	
	static Integer[] dp;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		dp = new Integer[a+1];

		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		
		System.out.print(dap(a));
	}
	
	static int dap(int a) {
		
		
		if(dp[a] == null) {
			for(int i = 4; i<=a; i++) {
				
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
				dp[a] = dp[i];
			}
			

		}
	
		return dp[a];
	}
	

}
