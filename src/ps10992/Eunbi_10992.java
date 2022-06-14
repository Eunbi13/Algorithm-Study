package ps10992;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_10992 {

  public static void main(String[] args)throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    int k = n;
    for(int i =n; i>0;i--) {
      for(int j = 1; j<2*n; j++) {

        if(i==1) {
          sb.append("*");
        } else if(j==k || 2*n-k ==j) {
          sb.append("*");
        } else if(j<=2*n-i){
          sb.append(" ");
        }
      }
      k--;
      sb.append("\n");
    }
    System.out.println(sb);

  }

}
