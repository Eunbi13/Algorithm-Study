package ps11655;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Eunbi_11655 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//  static StringBuffer sb = new StringBuffer();
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  public static void main(String[] args) throws Exception{
    
    String input = br.readLine();
//    char array 로 할 수도 있다.
//    https://velog.io/@kimmjieun/%EB%B0%B1%EC%A4%80-11655%EB%B2%88-ROT13-Java-%EC%9E%90%EB%B0%94
//    char[] rot13 = br.readLine().toCharArray();
    
    for(int i = 0; i<input.length(); i++) {
      int num = input.charAt(i);
      if(num>=65 && num<=90) {
        num -=13;
        if(num<65) {
          num+=26;
        }
      }
      else if(num>=97 && num <=122) {
        num -=13;
        if(num<97) {
          num+=26;
        }
      }
      bw.write((char)num);
    }
    bw.flush();
    br.close();
    bw.close();
  }

}
