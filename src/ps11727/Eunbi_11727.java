package ps11727;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_11727 {

  static int[]m;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    m = new int [n+1];
    m[0] = 1;
    m[1] = 1;
//    loop(n);
    dp(n);
    System.out.println(m[n]);
    br.close();
  }
  
  //상향식
  static void loop(int n) { 
    for(int i = 2; i<=n; i++) {
      m[i] = (m[i-1] + m[i-2]*2)%10007;
    }
  }
  
  //하향식
  static int dp(int n) {
    
    if(m[n]!=0) {
      return m[n];
    }
    return m[n]=(dp(n-1)+ dp(n-2)*2)%10007;
  }


}
