package ps11656;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Eunbi_11656 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();
//  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

public static void main(String[] args) throws Exception{
  
  String input = br.readLine();
  String [] arr = new String [input.length()];
  for(int i = 0; i<input.length();i++) {
    arr[i] = input.substring(i, input.length());
  }
  
  Arrays.sort(arr);
  
  for(int i = 0; i<input.length();i++) {
    sb.append(arr[i]).append("\n");
  }
  System.out.println(sb);
  
  }

}
