package week7.ps11053;

import java.util.Scanner;

public class Giyeol11053 {
	  static int n;
	   static int dp[], cost[];
	   
	   public static void main(String[] args) {
	      
	      Scanner scan = new Scanner(System.in);
	   
	   n=scan.nextInt();
	   dp = new int[n+1];
	   cost = new int[n+1];
	   
	   dp[1] =1; 
	    
	   for(int i =1;i<=n;i++) { 
	      cost[i] = scan.nextInt();
	   }
	   
	   for(int i=2;i<=n;i++) { 
	      dp[i] =1;
	      for(int j=1;j<i;j++) { 
	         if(cost[i]>cost[j]) { 
	            dp[i] = Math.max(dp[j]+1,dp[i]); 
	         }
	      }
	   }
	   int max = Integer.MIN_VALUE;
	   
	   for(int j=1;j<=n;j++) { 
	      if(dp[j]>max) {
	         max = dp[j];
	      }
	   }
	   System.out.println(max);
	}
	}