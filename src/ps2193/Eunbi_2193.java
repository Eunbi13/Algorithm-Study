package ps2193;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2193 {
  
  //피보나치 46항부터 int 범위 초과 
  static Long []m;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    m = new Long [n+1];
    m[0] = 0L;
    m[1] = 1L;
    
    System.out.println(dp(n));
    
  }
  
  static Long dp(int n) {
    if(m[n] ==null ) {
      m[n] = dp(n-1)+dp(n-2);
    }
    
    return m[n];
  }

}
