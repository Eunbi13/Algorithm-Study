package ps10808;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_10808 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();
  static int [] arr = new int [26];

  public static void main(String[] args) throws Exception{

    String str = br.readLine();

    for(int i = 0; i<str.length(); i++) {
      arr[str.charAt(i)-97] += 1;
    }
    for(int i =0; i<26; i++) {
      sb.append(arr[i]).append("\n");
    }

    System.out.println(sb);


  }

}
