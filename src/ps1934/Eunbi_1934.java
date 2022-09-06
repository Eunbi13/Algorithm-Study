package ps1934;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_1934 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{
    int t = Integer.parseInt(br.readLine());
    for(int i =0; i<t;i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int d = gcd(a,b);
      sb.append(a*b/d).append("\n");
    }
    System.out.println(sb);

  }
  
  static int gcd(int a, int b ) {
    if(b==0) {
      return a;
    }
    return gcd(b, a%b);
  }

}
