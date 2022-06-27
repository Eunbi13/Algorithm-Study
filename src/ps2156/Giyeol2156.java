package week7.ps2156;

import java.util.Scanner;

public class Giyeol2156 {
	    public static void main(String[] args) {
	   
	           Scanner scan = new Scanner(System.in);
	           int a = scan.nextInt();

	           int[] dap = new int[a];
	           for (int i = 0; i < a; i++) {
	               dap[i] = scan.nextInt();
	           }

	           int[] dp = new int[a];
	           dp[0] = dap[0];

	           for (int i = 1; i < a; i++) {
	               if(i==1){
	                   dp[1] = dap[0] + dap[1];
	                   continue;
	               }
	               if(i==2){
	                   dp[2] = Math.max(dp[1], Math.max(dap[0]+dap[2], dap[1]+dap[2]));
	                   continue;
	               }
	               dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + dap[i], dp[i - 3] + dap[i-1] + dap[i]));
	           }

	           System.out.println(dp[a-1]);
	       }

	}

