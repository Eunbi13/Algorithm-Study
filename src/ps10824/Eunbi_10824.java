package ps10824;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_10824 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //  static StringBuffer sb = new StringBuffer();
  //  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception{
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    Long num = Long.parseLong(st.nextToken()+st.nextToken())+Long.parseLong(st.nextToken()+st.nextToken());

    System.out.println(num);
  }

}
