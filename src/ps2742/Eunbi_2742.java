package ps2742;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2742 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int t = Integer.parseInt(br.readLine());
    for(int i =t; i>0; i--) {
      sb.append(i).append("\n");
    }
    br.close();
    System.out.println(sb);
  }

}
