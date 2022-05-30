package ps2741;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Eunbi_2741 {

  public static void main(String[] args) throws Exception{

  }
//runtime, 288ms
  public static void one() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(br.readLine());
    for(int i =1; i<=t; i++) {
      bw.write(i+"\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
//runtime, 224ms
  public static void two() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int t = Integer.parseInt(br.readLine());
    for(int i =1; i<=t; i++) {
      sb.append(i).append("\n");
    }
    br.close();
    System.out.println(sb);
  }




}
