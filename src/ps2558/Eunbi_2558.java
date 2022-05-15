package ps2558;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eunbi_2558 {

  public static void main(String[] args) throws Exception{
  }

  //124ms
  public void one() {
    //bufferedReader.read() 는 저장된 1을 txt형식으로 읽어서 ASCII 형식의 1을 읽어옴으로 값이 49로 다른 값을 가져온다. 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int a = Integer.parseInt(br.readLine());
      int b = Integer.parseInt(br.readLine());
      System.out.println(a+b);
      br.close();
    } catch (IOException e) {
      //      e.printStackTrace();
    }
  }
  
  //Integer.parseInt, runtime 124ms
  //int형 반환 == Primitive type, 기본자료형
  public void two() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    System.out.println(a+b);
    br.close();
  }
  
  //Integer.valueOf, runtime 120ms
  //Integer형 반환 == Reference type, 참조자료형, null값 처리 가능, Wrapper Object 
  public void three() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.valueOf(br.readLine());
    int b = Integer.valueOf(br.readLine());
    System.out.println(a+b);
    br.close();
  }
}
