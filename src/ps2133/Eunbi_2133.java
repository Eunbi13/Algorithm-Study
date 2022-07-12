package ps2133;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2133 {
  
  static Integer [] dp;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //   int N = Integer.parseInt(br.readLine());

  n = sc.nextInt();
  if(n<5){
      n = 4;
  }
  int [] dp = new int[n+1];
  //  dp = new Integer [N+1];
  //  dp[0] = 1;
  //  dp[2] = 3;

  //  int tmp =0;
  //  for(int i=4; i<=N; i+=2) {
  //    dp[i] = dp[i-2] * 3 + 2;
  //    for(int j = 2 ; j<i-2; j +=2) {
  //     dp[i] += dp[j]*2 ;
  //     }
  //  }
   
  //  System.out.println(dp[N]);

   int n = Integer.parseInt(br.readLine());
   int [] dp = new int[n+4];
   dp[0] = 1;
   dp[2] = 3;
   dp[4] = 11;
   int tmp =0;
   for (int i=6; i<=n; i+=2) {
       dp[i] = dp[i-2] * 3 + 2 + (tmp+=dp[i-4]*2);
   }

   System.out.println(dp[n]);
  }
  
 

}
