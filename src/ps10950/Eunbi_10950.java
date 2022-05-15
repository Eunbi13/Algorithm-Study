package ps10950;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_10950 {

  public static void main(String[] args) throws Exception{
    
  }
  
  // 변수 선언, runtime 144ms
  public static void one() throws Exception{
    // 첫째 줄에 테스트 케이스의 개수 T가 주어진다. == 몇개의 row를 받을 것인가? 

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer list = new StringBuffer();
    int T = Integer.valueOf(br.readLine());


    for(int i = 0; i < T; i++) {
      String str = br.readLine();
      StringTokenizer st = new StringTokenizer(str, " ");
      int a =  Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
      list.append(a+"\n");
    }


    System.out.println(list);
    br.close();

  }

  //변수 미 선언, runtime 124ms
  public static void two() throws Exception {
    // 첫째 줄에 테스트 케이스의 개수 T가 주어진다. == 몇개의 row를 받을 것인가? 

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer list = new StringBuffer();
    StringTokenizer st;

    int T = Integer.valueOf(br.readLine());
    for(int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      list.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) );
      list.append("\n");
    }


    System.out.println(list);
    br.close();
  }

}
