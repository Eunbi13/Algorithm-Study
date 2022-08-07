package ps10845;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_10845 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  static int queue[] ;
  static int size = 0;

  public static void main(String[] args) throws Exception{
    int n = Integer.parseInt(br.readLine());

    queue = new int[n];

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

        case "front":
          sb.append(front()).append("\n");
          break;
          
        case "back":
          sb.append(back()).append("\n");
          break;
      }
    }

    System.out.println(sb);
  }

  static void push(int n) {
    queue[size] = n;
    size++;
  }

  static int pop() {
    int r = -1;
    if(size>0) {
      r = queue[0];
      for(int i = 1; i<size; i++) {
        queue[i-1] = queue[i];
      }
      size--;
    }
    return r;
  }

  static int size() {
    return size;
  }

  static int empty() {
    if(size>0) {
      return 0;
    }else {
      return 1;
    }
  }

  static int front() {
    if(size>0) {
      return queue[0];
    }else {
      return -1;
    }
  }

  static int back() {
    if(size>0) {
      return queue[size-1];
    }else {
      return -1;
    }
  }
}
