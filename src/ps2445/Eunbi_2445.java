package ps2445;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Eunbi_2445 {

  public static void main(String[] args)throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());

    for(int i = 1; i<=n; i++) {
      for(int j = 0; j<2*n;j++) {
        if(j<i || (2*n-i) <=j) {
          sb.append("*");
        }else {
          sb.append(" ");
        }
      }
      sb.append("\n");
    }

    for(int i = n-1; i>0; i--) {
      for(int j = 0; j<2*n;j++) {
        if(j<i || (2*n-i) <=j) {
          sb.append("*");
        }else {
          sb.append(" ");
        }
      }
      sb.append("\n");
    }


    System.out.println(sb);
  }


}

