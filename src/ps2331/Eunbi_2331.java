package ps2331;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_2331 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  static Integer [] D = new Integer [236197]; //9999 5 인 경우 가장 큰 숫자 236196 넉넉하게 +1,, ㅎ
  static int cnt = 0;
  static int P ;
  
  public static void main(String[] args) throws Exception{
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    P = Integer.parseInt(st.nextToken());
    
    int result = getCircle(A);
    
    System.out.println(result);
  }
  
  static int getCircle(int n) {
    if(D[n] != null ) return D[n];
      
    D[n] = cnt++;
    
//    System.out.println("D["+n+"]: "+D[n]);
    int nextNum =0;
    while(n>0) {
      nextNum += Math.pow(n%10, P);
      n/=10;
    }
//    System.out.println("nextNum: "+nextNum+"\n");
    return getCircle(nextNum);
  }
}
