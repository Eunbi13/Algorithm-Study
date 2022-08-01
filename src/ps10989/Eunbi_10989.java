package ps10989;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Eunbi_10989 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{
    int n = Integer.parseInt(br.readLine());
    
    int [] arr = new int [n];
    
    for(int i = 0; i< n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    Arrays.sort(arr);
    
    
    for(int i = 0; i< n; i++) {
      sb.append( arr[i]).append("\n");
    }
    System.out.println(sb);
    
    
  }

}
