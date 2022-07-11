package ps2133;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2133 {
  
  static Integer [] dp;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    dp = new Integer [N+1];
    
    dp[0] = 0;
    dp[2] = 3;
    if(N%2==0) {
      
    for(int i=4; i<=N; i+=2) {
      dp[i] = dp[i-2]*3 + dp[i-4]*2 +2; 
    }
    }
    
    System.out.println(dp[N]);
//    
//    dp = new Integer [N+1];
//    dp[0] = 1;
//    dp[2] = 3;
//    
//    for(int i=4; i<=N; i+=2) {
//      dp[i] = dp[i-2] * 3 ;
//      for(int j = 0 ; j<i-2; j +=2) {
//        dp[i] = dp[i] + dp[j]*2 ;
//      }
//    }
//    
//    System.out.println(dp[N]);
    
//    int n = Integer.parseInt(br.readLine());
//    dp =new Integer[n+1];
//    dp[0]=1;
//    
//    for(int i=2;i<n+1;i=i+2) {
//        dp[i]=dp[i-2]*3;
//        for(int j=0;j<i-2;j=j+2) {
//            dp[i]=dp[i]+dp[j]*2;
//        }
//    }
//    System.out.println(dp[n]);
  }
  
 

}
