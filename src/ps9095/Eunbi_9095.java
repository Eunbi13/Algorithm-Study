package ps9095;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_9095 {
  
  static Integer [] m;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int t = Integer.parseInt(br.readLine());
    m = new Integer [11];
    m[0] = 1;
    m[1] = 1;
    m[2] = 2;
    for(int i = 0; i<t; i++) {
      int n = Integer.parseInt(br.readLine());
      sb.append(dp(n)).append("\n");
    }
    
    
    
    System.out.println(sb);
    br.close();
  }
  
  static Integer dp(int n) {
    if(m[n] != null) {
      return m[n];
    }else {
      return m[n] = dp(n-1)+dp(n-2)+dp(n-3);
    }
    
    
    
//    for(int i = 3; i<=n; i++) {
//      m[i] = m[i-1]+m[i-2]+m[i-3];
//    }
  }

}
