package ps1850;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_1850 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());
    
//    long s =1;
//    long num1 = 0;
//    long num2 = 0;
//    for(int i =0; i<a;i++) {
//      num1 +=s;
//      s *=10;
//    }
//    s =1;
//    for(int i =0; i<b;i++) {
//      num2 +=s;
//      s *=10;
//    }
//    
//    long d = gcd(num1, num2);
//    System.out.println(d);
    
//    long d = gcd(Math.max(a, b), Math.min(a, b));
    long d = gcd(a,b);
    for(int i =0; i<d;i++) {
      sb.append("1");
    }
    System.out.println(sb);
    
  }
  static long gcd(long a, long b) {
    if(b==0) {
      return a;
    }
    return gcd(b, a%b);
  }

}
