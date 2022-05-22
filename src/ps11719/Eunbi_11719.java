package ps11719;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_11719 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    String str=null;
    while((str = br.readLine())!= null) {
      sb.append(str).append("\n");
    }
    System.out.println(sb);
    br.close();
  }

  public static void one() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int i =0;
    String str=null;
    while(i<100 ){ //그냥 엔터 누르면서 마무리 안되고 ctrl+z할 때 루프문 탈출함
      str = br.readLine();
      if(str !=null) {
        sb.append(str).append("\n");
      }
      i++;
    }
    System.out.println(sb);
    br.close();
  }
}
