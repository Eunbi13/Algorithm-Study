package ps2442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2442 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
//    4 1
//    3 3
//    2 5
//    1 7
//    0 9
    for(int i = 1; i<=n; i++) {
      sb.append(" ".repeat(n-i));
      sb.append("*".repeat(2*i-1));
      sb.append("\n");
    }
    System.out.println(sb);
    br.close();
  }

}
