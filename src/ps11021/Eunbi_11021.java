package ps11021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_11021 {

  public static void main(String[] args) throws Exception{
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st ;
    StringBuffer sb = new StringBuffer();
    int t = Integer.parseInt( br.readLine());
    
    for(int i=0; i<t; ) {
      st = new StringTokenizer(br.readLine());
      sb.append("Case #").append(++i).append(": ").append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
    }
    System.out.println(sb);
    
    br.close();
  }

}
