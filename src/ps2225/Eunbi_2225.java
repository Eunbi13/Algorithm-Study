package ps2225;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Eunbi_2225 {
  
  static int [][] dp;
  static int m = 1000000000;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    
    dp = new int [N+1][K+1];

//Arrays.fill
//자바 11부터 사용이 가능
//Arrays.fill()은 배열의 모든 값을 같은 값으로 초기화
    Arrays.fill(dp[0], 1);
    for(int i = 0; i<=N;i++){
      dp[i][1]=1;
    }
    
    for(int i = 1; i<=N; i++) {
      for(int j = 2; j<=K; j++){
          dp[i][j]= dp[i][j-1]%m + dp[i-1][j]%m;
          dp[i][j]%=m;
      }
    }
    
    System.out.println(dp[N][K]);
    
    
  }
  
  
  

}
