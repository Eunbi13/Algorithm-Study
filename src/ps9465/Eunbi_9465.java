package ps9465;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_9465 {

  static int [][] m ;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer result = new StringBuffer();
    int t = Integer.parseInt(br.readLine()); //몇 번 반복?

    for(int k = 0; k<t; k++) {

      int n = Integer.parseInt(br.readLine()); //몇 개 받을건지
      m = new int [2][n+1];
      for(int i = 0; i< 2; i++) {
        StringBuffer sb = new StringBuffer(br.readLine());
        StringTokenizer st = new StringTokenizer(sb.toString());
        for(int j = 1; j< n+1; j++) {
          m[i][j] = Integer.parseInt(st.nextToken());
//          System.out.println("["+i+"]["+j+"]"+m[i][j]);;
        }
      }

      for(int j = 2; j< n+1; j++) {
        m[0][j] += Math.max(m[1][j-1], m[1][j-2]);
        m[1][j] += Math.max(m[0][j-1], m[0][j-2]);

//        System.out.println("["+0+"]["+j+"]"+m[0][j]);;
//        System.out.println("["+1+"]["+j+"]"+m[1][j]);;
      }
      result.append(Math.max(m[0][n], m[1][n])).append("\n");
    }

    System.out.println(result);
  }

  static void one(int n) {

  }

}
