package ps2522;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2522 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    int k = 1;
    
    for(int i =0; i<n*2; i++) {
      for(int j=0; j<n; j++) {
        if(k>=n-j) {
          sb.append("*");
        }else {
          sb.append(" ");
        }
      }
      if(i<n-1) {
        k++;
      }else {
        k--;
      }
      sb.append("\n");
    }
    
    System.out.println(sb);
    br.close();
    
  }

}
