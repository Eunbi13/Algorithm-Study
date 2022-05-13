package ps10950;

import java.util.Iterator;
import java.util.StringTokenizer;

public class Eunbi_10950 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String [] t = {"5", "1 1", "2 3", "3 4", "9 8", "5 2"};
    for(int i = 0; i<t.length; i++) {
      StringTokenizer st = new StringTokenizer(t[i]);
      if(st.countTokens()<2) {
        continue;
      }
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      System.out.println(a+b);
    }
 
  }

}
