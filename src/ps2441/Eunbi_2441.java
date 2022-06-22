package ps2441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2441 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    for(int i = n; i>0; i--) {
      sb.append(" ".repeat(n-i));
      sb.append("*".repeat(i));
      sb.append("\n");
    }
    System.out.println(sb);
    br.close();
  }

}
