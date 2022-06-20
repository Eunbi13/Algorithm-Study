package ps11057;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_11057 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    long [][] m = new long [n+1][10];
    long result = 0;
    long mod = 10007;
    for(int i = 0; i<10;i++) {
      m[1][i]=1;
    }
    for(int i = 2; i<=n;i++) {
      for(int j = 0; j<10; j++) {
//======== 1번       
        for(int k = 0; k<10; k++) {
          if(k>=j) {
            m[i][j] += m[i-1][k] ;            
          }
        }
        m[i][j] %=mod;
//======== 2번        
//        long num = 0;
//        for(int k = 0; k<10; k++) {
//          if(k>=j) {
//            num += m[i-1][k] ;            
//          }
//        }
//        m[i][j] = num %mod;
      }
    }
    for(int i = 0; i<10; i++) {
      result += m[n][i];
    }
    System.out.println(result % mod);
    br.close();
  }

}
