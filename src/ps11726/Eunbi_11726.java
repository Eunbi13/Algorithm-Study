package ps11726;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_11726 {

//  static Integer [] memo;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int [] m = new int [n+2];
    m[0] = 0;
    m[1] = 1;
    m[2] = 2;
    for(int i = 3; i<=n; i++) {
      m[i] = (m[i-1]+m[i-2])%10007;
    }
    
    System.out.println(m[n]);
    br.close();
  }


}
