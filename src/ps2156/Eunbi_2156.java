package ps2156;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2156 {
  
  static long [] m ;
  static long [] input;
  
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    input = new long[n+1];
    m = new long [n+1];
    for(int i=1; i<=n; i++) {
      input[i] = Integer.parseInt(br.readLine());
      m[i] = input[i-1]+input[i];
    }
    long a = 0,b= 0,c = 0;
    for(int i = 1; i<n; i++) {
      if(i%3==1) {
        a += m[i];
      }else if(i%3==2) {
        b +=m[i];
      }else {
        c +=m[i];
      }
    }
    System.out.println(max(a,b, c));
    
  }
  
  static long max(long a, long b, long c) {
    long result = 0;
    result = a>b?a:b ;
    if(a>b) {
      if(a>c) {
        result = a;
      }else {
        result = c;
      }
    }else if(b>c){
      result = b;
    }else {
      result = c;
    }
    
    return result;
  }
 
  
}
