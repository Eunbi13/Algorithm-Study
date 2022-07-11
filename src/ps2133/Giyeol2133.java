package week8.ps2133;

import java.util.Scanner;

public class Giyeol2133 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int dp[]=new int[31];
		
		dp[0]=1;
		dp[2]=3;
		int mul=0;
		for (int i=4;i<=30;i+=2) {
			dp[i]+=dp[i-2]*dp[2];
			mul+=dp[i-4]*2;
			dp[i]+=mul;
		}
		int n=scan.nextInt();
		System.out.println(dp[n]);
		
		
	}
}
