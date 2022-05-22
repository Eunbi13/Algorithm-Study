package ps11718;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Eunbi_11718 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int i =0;
    String str=null;
    while(i<100 && (str = br.readLine())!= null){ //그냥 엔터 누르면서 마무리 안되고 ctrl+z할 때 루프문 탈출함
      sb.append(str).append("\n");
      i++;
    }
    System.out.println(sb);
    br.close();
    
  }
  // str.length()+"||"+(str==null)+"||"+str.isEmpty();
  // 0||false||true
  //==null을 사용했을 때 객체가 null이 아닌 빈 상태("")에서는 null로 인식 못함
  //isEmpty()를 사용했을 때 null값에 대해 nullpointerException을 발생
  //BufferedReader는 기본적으로 String
  public static void one() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int i =0;
    String str=null;
    while(i<100 && (str = br.readLine())!= null ){ 
      sb.append(str).append("\n");
      i++;
    }
    System.out.println(sb);
    br.close();

  }


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

  //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //String str="";
  //System.out.println(str == null); //false
  //str = null;
  //System.out.println(str == null); //true
  //str = br.readLine();
  //System.out.println(str == null); //false
}
