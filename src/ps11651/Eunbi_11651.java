package ps11651;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Eunbi_11651 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static  StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{

    int n = Integer.parseInt(br.readLine());

    int [][] arr = new int [n][2];
    StringTokenizer st ;
    for(int i = 0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr, (e1, e2)->{
      if(e1[1]==e2[1]) {
        return e1[0]-e2[0];
      }else {
        return e1[1]-e2[1];
      }
    });
    for(int i = 0; i<n; i++) {
      sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
    }
    System.out.println(sb);



  }

}
