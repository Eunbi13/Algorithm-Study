package week9.ps9461;

import java.util.Scanner;

public class Giyeol9461 {
	
	   public static void main(String[] args)   {
	      Scanner scan = new Scanner(System.in);
	      
	     int a=scan.nextInt();
	     int n = 0;
	      
	      long[] dp = new long[101];
	      
	      dp[1]=1; 
	      dp[2]=1;
	      dp[3]=1;
	      
	      for(int i=0;i<a;i++) {
	         n = scan.nextInt();
	         
	         for(int j=4;j<=n;j++) { 
	            dp[j] = dp[j-2] + dp[j-3];
	         }
	            
	         System.out.println(dp[n]); 
	         
	      }
	      
	      
	      
	   }

		
		
}
