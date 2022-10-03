package ps6588;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_6588 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{

    while(true) {
//      숫자 입력, 정지
      int n = Integer.parseInt(br.readLine());
      if(n == 0) {
        break;
      }

      for(int i = 2; i<=n; i++) {
        if(checkPrime(i)&&checkPrime(n-i)) {
          sb.append(n).append(" = ").append(i).append(" + ").append(n-i).append("\n");
          break;
        }
      }
      if(sb.length()==0) {
        sb.append("Goldbach's conjecture is wrong.").append("\n");
      }

    }
    System.out.println(sb);


  }

  static boolean checkPrime(int n) {

    if(n < 2 ) {
      return false;
    }

    for(int i = 2; i<=Math.sqrt(n); i++) {
      if(n%i == 0 ) {
        return false;
      }
    }

    
    return true;
  }



}
