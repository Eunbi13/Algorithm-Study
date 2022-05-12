package ps1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Eunbi {

  public static void main(String[] args) {	  
    
  }
  
  // Scanner, runtime 200ms
  public void one() {
    Scanner sc = new Scanner(System.in);
    String nums = sc.nextLine();
    String [] numArray = nums.split(" ");
    int a = Integer.parseInt(numArray[0]);
    int b = Integer.parseInt(numArray[1]);
    if(a>0 && b<10) {
      System.out.println(a+b);
    }
  }
  
  // InputStreamReader, runtime 124ms
  // 바이트스트림을 문자스트림으로 변환
  public void two() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    try {
      String str = br.readLine();
      String [] numArray = str.split(" ");
      int a = Integer.parseInt(numArray[0]);
      int b = Integer.parseInt(numArray[1]);
      if(a>0 && b<10) {
        System.out.println(a+b);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  // StringTokenizer, runtime 124ms
  // 문자열을 지정한 구분자로 쪼개주는 클래스, 쪼개진 문자열 = Token
  public void three() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      String str = br.readLine();
      StringTokenizer st = new StringTokenizer(str); 
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      if(a>0 && b<10) {
        System.out.println(a+b);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
