package ps9012;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_9012 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();
  

  public static void main(String[] args) throws Exception{
    int n = Integer.parseInt(br.readLine());
    
    for(int i = 0; i< n; i++) {
      sb.append(vps(br.readLine())).append("\n");
    }
    
    
    System.out.println(sb);
    
  }

  static String vps(String str ) {
    int size =0;
    
    for(char c : str.toCharArray()) {
      if(c == '(') {
       size++;
      }
      else if(size == 0) {
        return "NO";
      }
      else if (c == ')') {
        size--;
      }
    }
    
    if(size == 0 ) {
      return "YES";
    }
    else{
      return "NO";
    }
  }
}
