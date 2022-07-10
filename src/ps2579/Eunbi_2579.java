package ps2579;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2579 {
  
  static Integer [] arr;
  static Integer [] dp;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    arr = new Integer [N+1];
    dp =  new Integer [N+1];
    for(int i =0; i<=N; i++) {
      if(i==0) {
        arr[i]=0;
      }
      else {
        arr[i]=Integer.parseInt(br.readLine());
      }
    }
//    Bottom-Up
    for(int i =0; i<=N; i++){
      if(i<=1) {
        dp[i]=arr[i];
      }
      else if(i==2) {
        dp[i]=arr[i-1]+ arr[i];
      }
      else if(i==3) {
        dp[i]= max(arr[i-2],arr[i-1])+arr[i];
      }
      else {
        dp[i]= max(dp[i-3] + arr[i-1], dp[i-2] )+ arr[i];
      }
      
    }
   
    System.out.println(dp[N]);
    
    
//  Top-Down   
    dp[0]=arr[0];
    for(int i =1; i<3; i++) {
      dp[i]=arr[i-1]+arr[i];
    }
    System.out.println(re(N));
    
  }
  
  private static int max(int a, int b) { return a > b ? a : b; }

  
//  Top-Down
//  N=3 일때 dp[0]을 사용안하던것을 변경해서 if(i==3)을 제거
  static int re(int i ) {

    if(dp[i]==null) {
        dp[i]= max(re(i-3) + arr[i-1], re(i-2) )+ arr[i];
    }
    
    return dp[i];
  }
  
}
