package week7.ps11053;

import java.util.Scanner;

public class Giyeol11053_1 {
	   
	   public static void main(String[] args) {
	      
		   Scanner scan = new Scanner(System.in);

		   int n = scan.nextInt();
		   int arr[] = new int[n + 1];
		   int dp[] = new int[n + 1];
		   
		   for (int i = 1; i <= n; i++)
		       arr[i] = scan.nextInt();
		   
		   dp[1] = 1;

		   for (int i = 2; i <= n; i++) {
		       dp[i] = 1;
		       for (int j = 1; j < i; j++) {
		           if (arr[i] > arr[j] && dp[i] >= dp[j]) {
		               dp[i] = dp[j] + 1;
		           } else if (arr[i] == arr[j]) {
		               dp[i] = dp[j];
		           }
		       }
		   }

		   int max = 0;

		   for (int i = 1; i <= n; i++)
		       max = Math.max(dp[i], max);

		   System.out.println(max);

		   scan.close();
		   }
		   }