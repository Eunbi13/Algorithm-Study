package ps10952;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_10952 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    StringTokenizer st = null;
    String str = "";
    while(true) {
      str = br.readLine();
      st = new StringTokenizer(str);
      if(st.countTokens()<2) {
        continue;
      }
      String a = st.nextToken();
      String b = st.nextToken();
      if(a.equals("0") && b.equals(a)) {
        break;
      }
      sb.append(str+",");
    }
    

    st = new StringTokenizer(sb.toString(),",");
    while(st.hasMoreTokens()) {
      str = st.nextToken();
      StringTokenizer s = new StringTokenizer(str);
      int a = Integer.parseInt(s.nextToken());
      int b = Integer.parseInt(s.nextToken());
      System.out.println(a+b);
    }



  }
}
