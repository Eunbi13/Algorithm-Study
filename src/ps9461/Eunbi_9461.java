 package ps9461;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_9461 {
  
  static Long [] P;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int T = Integer.parseInt(br.readLine());
    P = new Long [101];
    
    for(int i =0; i<T; i++) {
      sb.append(re(Integer.parseInt(br.readLine()))).append("\n");
    }
    
    System.out.println(sb);
    br.close();
  }

  static Long re(int N) {
    if(N<4) {
      return 1L;
    }
    else if(P[N]==null) {
      P[N] = re(N-3)+re(N-2);
    }
    
    return P[N];
  }
  
  
}
