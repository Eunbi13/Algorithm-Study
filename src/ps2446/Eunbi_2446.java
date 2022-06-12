package ps2446;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2446 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine())*2;
    

    
    int k = 0;
    
    for(int i =0;i<n-1;i++) { //높이 
      for(int j =n; j>1; j--) { //넓이
        if(n-j<k ) {
          sb.append(" ");
        }
        if(n-j>=k&& j-1>k) {
          sb.append("*");
        }
      }
      if(i<n/2-1) {
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
