package week7.ps9465;

import java.util.Scanner;

public class Giyeol9465 {
	  public static void main(String[] args) {
	      
		   
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          
          for (int i = 0; i < n; i++) {
              int su = scan.nextInt();
              int[][] arr = new int[2][su + 1];
              int[][] dp = new int[2][su + 1];
              for (int j = 0; j < 2; j++) { 
                  for (int k = 1; k <= su; k++) {
                      arr[j][k] = scan.nextInt();
                  }
              }
              dp[0][1] = arr[0][1];
              dp[1][1] = arr[1][1];
              for (int a = 2; a <= su; a++) {
                  dp[0][a] = Math.max(dp[1][a - 1], dp[1][a - 2]) + arr[0][a];
                  dp[1][a] = Math.max(dp[0][a - 1], dp[0][a - 2]) + arr[1][a];
              }
              System.out.println(Math.max(dp[0][su], dp[1][su]));
          }
      }
}