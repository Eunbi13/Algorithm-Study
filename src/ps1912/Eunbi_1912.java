package ps1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_1912 {
  
  static Integer [] arr;
  static Integer [] dp;
  static int maxN;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new Integer[N];
    for(int i = 0; i<N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    dp = new Integer[N];
    
    dp[0]=arr[0];
    maxN = arr[0];
    
//    Bottom-Up
    for(int i =1; i<N; i++) {
      dp[i] = max(dp[i-1]+arr[i], arr[i]);
      maxN = max(dp[i], maxN);
    }
    
//    re(N-1);
    
    System.out.println(maxN);
  }

  private static int max(int a, int b) { return a > b ? a : b; }
  
  
//  Top-Down
  static int re(int i) {
    
    if(dp[i]==null) {
      dp[i] = max( re(i-1) + arr[i], arr[i]);
      maxN = max(dp[i], maxN);
    }
    
    return dp[i];
  }
  
  
  
}
