package ps11718;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Eunbi_11718 {

  public static void main(String[] args) throws Exception{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    //int i =0;
    String str="";
    while(/*i<100 &&*/ !(str = br.readLine()).isEmpty()){ 
      sb.append(str).append("\n");
     // i++;
    }
    System.out.println(sb);
    br.close();

 

  }
  // str.length()+"||"+(str==null)+"||"+str.isEmpty();
  // 0||false||true
  
  


  public static void two () throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int i =0;
    String str="";
    while(i<100 && !(str = br.readLine()).isEmpty()){ 
      bw.write(str+"\n");
      i++;
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
