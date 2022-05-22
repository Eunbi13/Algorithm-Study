package ps10951;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Eunbi_10951 {

  public static void main(String[] args) throws Exception {
  }
  
  
  //런타임 에러
  public static void one() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer list = new StringBuffer();
    StringTokenizer st;
    String str = "";
    while(!(str = br.readLine()).equals("")) {
      st = new StringTokenizer(str, " ");
      list.append( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) );
      list.append("\n");
    }
    
    System.out.println(list);
    br.close();
  }

  //runtime 128ms 
  public static void two() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer list = new StringBuffer();
    StringTokenizer st;
    String str = "";
    while((str = br.readLine()) != null) {
      st = new StringTokenizer(str);
      list.append( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) );
      list.append("\n");
    }
    
    System.out.println(list);
    br.close();
  }
  
  // 주소값 비교(==), 값 비교(equals)
  // String 은 레퍼런스 타입, 주소값을 가지기 때문에 비교 연산자 사용 가능
}
