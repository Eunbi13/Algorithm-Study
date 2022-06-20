package week6.ps11726;

import java.util.Scanner;

public class Giyeol11726 {
	
	static Integer[] dp;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		dp = new Integer[a+1];
		dp[0] = 1;
		dp[1] = 1;
		
		System.out.print(dap(a));
	}
	
	static int dap(int a) {
		
		
		if(dp[a] == null) {
			for(int i = 2; i<=a; i++) {
				
				dp[i] = dp[i-1] + dp[i-2];
				dp[a] = dp[i];
			}
			

		}
	
		return dp[a] % 10007;
	}
	

}
