package week8.ps1912;

import java.util.Arrays;
import java.util.Scanner;

public class Giyeol1912 {

	  static int arr[] , dp[], n, max;

	   public static void main(String[] args) {
	      
	      Scanner scan = new Scanner(System.in);
	      n = scan.nextInt();
	      
	      dp = new int[n+1];
	      arr = new int[n+1];
	      
	      dp[0] = arr[0];
	      max = dp[0];
	      for(int i = 1; i<=n; i++) {
	         arr[i] = scan.nextInt();
	      }
	      System.out.println(Arrays.toString(arr));
	      
	      for(int i = 1; i<=n; i++) {
	         dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
	      }
	      
	      for(int i = 1; i<=n; i++) {         
	         max = Math.max(max, dp[i]);
	      }
	      
	      System.out.println(max);
	      
	   }

	}
