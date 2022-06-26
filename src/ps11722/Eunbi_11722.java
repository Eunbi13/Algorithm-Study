package ps11722;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_11722 {
  static int [] arr ;
  static int [] dp ;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int [n];
    arr[0] = 0;
    for(int i = 0; i<n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    dp = new int [n+1];
    dp[0]=1;
    for(int i = 1; i<n; i++) {
      System.out.println("\n@ i "+i);
      for(int j = i; j<n; j++) {
        System.out.println("@ j "+j);
        System.out.println("@"+arr[i]+" "+arr[j]);
        if(arr[i]>arr[j]) {
          dp[i] = Math.max(dp[i], dp[j]+1);
          System.out.println(dp[i]+" "+dp[j]);
        }
      }
    }
    System.out.println(dp[n]);

  }

}
