package ps2558;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eunbi_2558 {

  //bufferedReader.read() 는 저장된 1을 txt형식으로 읽어서 ASCII 형식의 1을 읽어옴으로 값이 49로 다른 값을 가져온다. 
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int a = Integer.parseInt(br.readLine());
      int b = Integer.parseInt(br.readLine());
      System.out.println(a+b);
    } catch (IOException e) {
      // TODO Auto-generated catch block
//      e.printStackTrace();
    }


  }

}
