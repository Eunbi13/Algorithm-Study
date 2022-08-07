package ps10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_10828 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();
  
  static Integer stack[];
  static int size = 0;
  


  public static void main(String[] args) throws Exception{
    
    int n = Integer.parseInt(br.readLine());
    
    stack = new Integer[n];
    
    StringTokenizer st ;
    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      switch (st.nextToken()) {
        case "push":
          push(Integer.parseInt(st.nextToken()));
          break;

        case "pop":
          sb.append(pop()).append("\n");
          break;
          
        case "size":
          sb.append(size()).append("\n");
          break;
          
        case "empty":
          sb.append(empty()).append("\n");
          break;
          
        case "top":
          sb.append(top()).append("\n");
          break;
      }
    }
    
    System.out.println(sb);
  }

  static void push(int n) {
    stack[size] = n;
    size++;
  }

  static int pop() {
    if(size ==0) {
      return -1;
    }
    else {
      int res = stack[size-1];
      stack[size-1] = 0;
      size--;
      return res;
    }
  }

  static int size() {
    return size;
  }

  static int empty() {
    if(size == 0) {
      return 1;
    }
    else {
      return 0;
    }
  }

  static int top() {
    if(size == 0) {
      return -1;
    }
    else {
      return stack[size -1];
    }
  }

}
