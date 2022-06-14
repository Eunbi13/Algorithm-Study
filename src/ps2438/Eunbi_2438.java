package ps2438;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2438 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    for(int i = 0; i< n; i++) {
      for(int j = 0; j<=i; j++) {
        sb.append("*");
      }
      sb.append("\n");    
    }
    System.out.println(sb);
    br.close();
  }

}
