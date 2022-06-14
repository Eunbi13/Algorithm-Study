package ps1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eunbi_1463 {
  
  static Integer [] memo;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    long a = System.nanoTime();
    
    
    memo = new Integer[n+1];
    memo[0]=memo[1]=0;
    System.out.println(dp(n));

    long b =  System.nanoTime();
    System.out.println((b-a)+"||");
  }
  
  static int dp(int n) {
   if(memo[n] ==null) {
    if(n%6 == 0) {
     memo[n] =Math.min(dp(n-1) , Math.min( dp(n/3), dp(n/2))) +1;
    }
    else if(n % 3==0) {
      memo[n] =  Math.min(dp(n-1), dp(n/3)) +1;
    }else if(n % 2==0) {
      memo[n] =Math.min(dp(n-1)  ,dp(n/2))+1;
    }else {
      memo[n] = dp(n-1)+1;
    }
   }
   return memo[n];
  }

}
