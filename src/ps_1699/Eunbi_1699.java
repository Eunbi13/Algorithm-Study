package ps_1699;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_1699 {

  static Integer [] dp;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    dp = new Integer[N+1];
    for(int i =0; i<=N; i++) {
      dp[i]=i;
      for(int j = 1; j * j <=i; j++) {
        if(dp[i] > dp[i - j * j] + 1) {
          dp[i] = dp[i - j * j] + 1;
        }
      }
    }

    System.out.println(dp[N]);


  }



}
