package ps10809;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Eunbi_10809 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();
  static int [] arr = new int [26];

  public static void main(String[] args) throws Exception{
    
    String str = br.readLine();
    Arrays.fill(arr, -1);

    for(int i = 0; i<str.length(); i++) {
      if(arr[str.charAt(i)-97] == -1) {
        arr[str.charAt(i)-97] = i ;
        
      }
    }
    for(int i =0; i<26; i++) {
      sb.append(arr[i]).append("\n");
    }

    System.out.println(sb);
  }

}
