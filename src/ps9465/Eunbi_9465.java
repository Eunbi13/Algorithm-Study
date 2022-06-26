package ps9465; 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_9465 {

  static int [][] m ;
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer result = new StringBuffer();

  public static void main(String[] args) throws Exception{
//   one();
    for(int i = 0; i< 2; i++) {
//      read();
      System.out.println("============");
    }
//    two();
  }

  static void one() throws Exception{
    int t = Integer.parseInt(br.readLine());
    for(int k = 0; k<t; k++) {

      int n = Integer.parseInt(br.readLine());
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
//  
//  static void two() throws Exception{
//    
//    int t, n;
//    
//    System.out.println("start");
//    t = read();
//    m = new int [2][1000000];
//    while(t > 0 ) {
//      System.out.println("while in");
//      n = read();
//
//      
//      for( int i = 0; i< n; i++) {
//        System.out.println("for1 in");
//        int a = read();
//        m[0][i] = a;
//        System.out.println(a+"::"+m[0][i]);
////        m[0][i] = read();
////        System.out.println("["+0+"]["+i+"]"+m[0][i]);;
//      }
//      for( int i = 0; i< n; i++) {
//        m[1][i] = read();
//        System.out.println("["+1+"]["+i+"]"+m[1][i]);;
//      }
//
//      for (int i = 2; i < n+1; i++) {
//        m[0][i] += Math.max(m[1][i-1], m[1][i-2]);
//        m[1][i] += Math.max(m[0][i-1], m[0][i-2]);
//      }
//      result.append(Math.max(m[0][n], m[1][n])).append("\n");
//      t--;
//    }
//    System.out.println(result);
//  }
//  
//  
//  private static Integer read() throws Exception {
//    System.out.println("read() start");
//    int c= 0, n = System.in.read() & 15;
//    if(n == 13) {
//      return null;
//    }
//    System.out.println("input : "+n);
//    while ((c = System.in.read()) > 32) {
//      System.out.println("if,,,"+c);
//      System.out.println("im here: "+n);
//      n = (n << 3) + (n << 1) + (c & 15);
//    }
//    System.out.println("read() fin: "+n);
//    return n;
//
//}
//  //비트 연산자 사용해서 수를 받는 read메서드 생성  
//  static int read2() throws Exception{
//    System.out.println("read() start");
//    int c= 0, n = System.in.read() & 15;
//    System.out.println("input : "+n);
//    while ((c = System.in.read()) > 32) {
//      System.out.println("if,,,"+c);
//      System.out.println("im here: "+n);
//      n = (n << 3) + (n << 1) + (c & 15);
//    }
//    System.out.println("read() fin: "+n);
//    return n;
//  }
  

}
