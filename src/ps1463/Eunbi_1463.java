package ps1463;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_1463 {
  
  static Integer [] memo;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    
//    memo = new Integer[n];
    
    
    int i =0;
   // System.out.println("@@@@@@@@@@@@");
    //while(n!=1) {
      n=dp(n);
      System.out.println(n);

      i++;
   // }
    System.out.println("@@@@@@@@@@@@");
    System.out.println(i);

  }
  
  public static int dp(int n) {
   if(memo[n] ==null) {
    if(n%6 == 0) {
     n/=3; 
    }
    else if(n % 3==0) {
      n/=3;
    }else if(n % 2==0) {
      n/=2;
    }else {
      memo[n] = dp(n-1)+1;
    }
   }
   return memo[n];
  }

}
