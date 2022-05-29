package ps11721;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_11721 {

  public static void main(String[] args) throws Exception{
    
  }

//  runtime 132ms
//    sb.append(new String(str.getBytes(),0,10)).append("\n");//배열, 시작위치, 길이
  public static void one() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    String str = br.readLine();
    int t = str.length();
    int n = t/10;
    int o = t%10;
      
    int strN = 0, endN =10;
    for(int i = 1; i<=n; ++i) {
      sb.append(new String(str.getBytes(), strN, endN)).append("\n");
      strN = i*endN;
    }
    if(o>0) {
        sb.append(new String(str.getBytes(),endN*n,o));
      
    }
    System.out.println(sb);
  }
  
//  runtime 132ms
//  sb.insert(10, "\n"); 10번쨰 자리에 "\n"을 추가한다. sb.length()도 증가한다.
  public static void two() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer(br.readLine());
    int n = sb.length()/10;
    int j = 10, l = 0;
    for(int i = 1; i <= n; i++) {
      sb.insert(i*j +l++, "\n");
    }
    System.out.println(sb);
  }
}
