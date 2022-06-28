package ps2156;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2156 {

  static Integer [] dp ;
  static Integer [] arr;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer n = Integer.parseInt(br.readLine());
    arr = new Integer[n+1];
    dp = new Integer [n+1];
    arr[0]=dp[0]=0;
    for(int i=1; i<=n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    one(n);
    two(n);

    System.out.println(dp[n]);

  }

  //runtime error
  static void one(int n) {
    dp[1]=arr[1];
    dp[2]=arr[2]+arr[1];
    for(int i =3; i<=n; i++) {
      dp[i]=Math.max(Math.max(arr[i]+arr[i-1]+dp[i-3], arr[i]+dp[i-2]), dp[i-1]);
    }
  }

  static void two(int n) {
    for(int i =1; i<=n; i++) {
      if(i==1) {
        dp[i]=arr[i];
      }else if(i==2) {
        dp[i]= arr[i]+arr[i-1];
      }else {
        dp[i]=Math.max(Math.max(arr[i]+arr[i-1]+dp[i-3], arr[i]+dp[i-2]), dp[i-1]);
      }
    }
  }


}
