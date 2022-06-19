package ps10844;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_10844 {
  
//  static Integer [] m;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer [][] m = new Integer [n+1][10];
    for(int i = 0; i<10; i++) {
      m[1][i] = 1;
    }
    
    System.out.println(m[n]);
    br.close();
  }

}
