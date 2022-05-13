package ps10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Eunbi_10951 {

  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    String str = "";
    while (true) {
      str = br.readLine();
      if(str.isEmpty() || str==null) {
        break;
      }
      sb.append(str+",");
    }

    StringTokenizer st = new StringTokenizer(sb.toString(),",");
    while(st.hasMoreTokens()) {
      str = st.nextToken();
      StringTokenizer st2 = new StringTokenizer(str);
      if(st2.countTokens()<2) {
        continue;
      }
      int a = Integer.parseInt(st2.nextToken());
      int b = Integer.parseInt(st2.nextToken());
      System.out.println(a+b);
    }
  }

}
