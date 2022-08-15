package ps10820;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_10820 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{

    String input = "";
    
    while((input = br.readLine())!= null) {
      int [] arr = new int [4];

      for(int i = 0; i<input.length(); i++) {

        int num = input.charAt(i);

        if(num>=97 && num <=122 ) {//소문자
          arr[0] +=1 ;
        }
        else if(num>=65 && num<=90) { //대문자
          arr[1] +=1 ;
        }
        else if(num >=48 && num <=57) {//숫자
          arr[2] +=1 ;
        }
        else if(num ==32) {//공백
          arr[3] +=1 ;
        }
      }
      for(int j =0; j<4; j++) {
        sb.append(arr[j]).append(" ");
      }
      sb.append("\n");



    }

    System.out.println(sb);
  }


}
