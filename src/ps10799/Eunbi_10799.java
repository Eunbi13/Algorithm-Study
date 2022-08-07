package ps10799;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Eunbi_10799 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{
    String str = br.readLine();
    Stack<Character> stack = new Stack<>();
    int result = 0;

    for(int i =0; i<str.length(); i++) {
      if(str.charAt(i)=='(') {
        stack.add('(');
      }
      else {
        stack.remove(stack.size()-1);
        if(str.charAt(i-1)=='(') {
          result+=stack.size();
        }
        else {
          result+=1;
        }
      }
    }
    System.out.println(result);
  }


  static void one() throws Exception{
    String str = br.readLine();

    int cnt = 0;
    int piece = 0;
    for(int i =0; i<str.length(); i++) {
      if(str.charAt(i)=='(') {
        cnt ++;
      }
      else {
        cnt--;
        if(str.charAt(i-1)==')') {
          piece++;
        }else {
          piece += cnt;
        }
      }
    }
    System.out.println(piece);
  }

}
