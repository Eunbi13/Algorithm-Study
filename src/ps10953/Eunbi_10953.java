package ps10953;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Eunbi_10953 {

  public static void main(String[] args) throws Exception {

  }
//  runtime 136ms
  public static void one()throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    for(int i=0; i<t; i++) {

      st = new StringTokenizer(br.readLine(),",");
      bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }

// runtime 124ms  
// import 개수가 one()은 5개 two()는 3개여서 런타임 차이가 나는 거 같음 
  public static void two() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    StringBuffer sb = new StringBuffer();

    StringTokenizer st;
    for(int i=0; i<t; i++) {

      st = new StringTokenizer(br.readLine(),",");
      sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
    }
    System.out.println(sb); 
    br.close();
  }


}
