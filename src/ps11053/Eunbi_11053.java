package ps11053;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_11053 {

  static int [] arr ;
  static int [] dp ;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int [n];
    dp = new int [n+1];
    for(int i = 0; i<n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int len = 0;
    int idx = 0;
    for(int i =0; i<n; i++) {
      if(arr[i]>dp[i]) {
        len++;
        dp[len] = arr[i];
      }else {
        
        dp[idx] = arr[i];
      }
    }
    
    ;
    System.out.println();
    
  }// https://loosie.tistory.com/376
  

  
  static void one() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int [n];
    dp = new int [n];
    for(int i = 0; i<n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    dp[0]=1;
    for(int i = 1; i<n; i++) {
      for(int j = 0; j<i; j++) {
        if(arr[i]>arr[j]) {
          dp[i] = Math.max(dp[i], dp[j]+1);
        }
      }
    }
    System.out.println(dp[n]);
  }


}
