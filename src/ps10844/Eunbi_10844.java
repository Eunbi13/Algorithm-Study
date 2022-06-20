package ps10844;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_10844 {
  public static void main(String[] args) throws Exception{

        one(); 

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int result = 0;
    long mod = 1000000000;
    long [][] m = new long [n+1][10];

    for(int i = 1; i < 10; i++) {
      m[1][i] = 1; 
    }

    for(int i = 2; i<= n; i++) {
      for(int j = 0; j<10; j++) {
        System.out.println("j = "+j);
        if(j==0) {
          m[i][j] = m[i-1][j+1]%mod;
        }else if(j==9) {
          m[i][j] = m[i-1][j-1]%mod;
        } else {
          m[i][j] = (m[i-1][j-1]+m[i-1][j+1])%mod;
        }
        System.out.println("==> i= "+i+" j= "+j+" m["+i+"]["+j+"] = "+m[i][j]);
        System.out.println("\n======================================\n");

      }
    }    
    for(int i = 0; i<10; i++) {
      result += (m[n][i] );
    }

    System.out.println( result%mod );
    br.close();
  }


  public static void one() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int result = 0;
    long a = 1000000000;
    long [][] m = new long [n+1][10];

    for(int i = 1; i< 10; i++) {
      m[1][i] = 1;
    }

    for(int i = 2; i<= n; i++) {
      for(int j = 0; j<10; j++) {

        System.out.println("j = "+j);
        long x = 0, y = 0;
        if(j-1 >=0) {
          x = m[i-1][j-1]% a;
        }
        if(j+1<10) {
          y = m[i-1][j+1]% a;
        }
        m[i][j] = (x+y)% a;
        System.out.println("==> i= "+i+" j= "+j+" m["+i+"]["+j+"] = "+m[i][j]);
        System.out.println("\n======================================\n");
      }
    }

    for(int i = 0; i<10; i++) {
      result += (m[n][i] );
    }

    System.out.println(result% a);
    br.close();
  }


}
