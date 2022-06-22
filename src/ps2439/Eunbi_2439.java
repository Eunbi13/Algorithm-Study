package ps2439;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2439 {

  public static void main(String[] args) throws Exception{
    two();
  }
  
  //
  public static void one() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    for(int i = 0; i<n; i++) {
      for(int j = 1; j<=n; j++) {
        if(n-j>i) { 
          sb.append(" ");
        }else {
          sb.append("*");
          
        }
      }
      sb.append("\n");
    }
    System.out.println(sb);
    br.close();
  }
  
//  java11 부터 사용가능한 String.repeat(n) 
//  메서드 n만큼 String반복 
  private static void two() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    for(int i = 1; i<=n; i++) {
      sb.append(" ".repeat(n-i));
      sb.append("*".repeat(i));
      sb.append("\n");
    }
    System.out.println(sb);
    br.close();
  }

}
