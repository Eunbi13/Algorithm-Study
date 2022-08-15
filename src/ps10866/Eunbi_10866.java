package ps10866;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_10866 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  static int [] deque = new int [10000];
  static int size = 0;
  static int front = 5000;
  static int back = 5000;
  
  public static void main(String[] args) throws Exception{

    int n = Integer.parseInt(br.readLine());
//    deque = new int [n];

    StringTokenizer st;
    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      switch (st.nextToken()) {
        case "push_front":
          push_front(Integer.parseInt(st.nextToken()));
          break;
          
        case "push_back":
          push_back(Integer.parseInt(st.nextToken()));
          break;

        case "pop_front":
          sb.append(pop_front()).append("\n");
          break;
          
        case "pop_back":
          sb.append(pop_back()).append("\n");
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

  static void push_front(int n) {
    deque[front]=n;
    size++;
    front--;
  }
  
  static void push_back(int n) {
    back++;
    deque[back]=n;
    size++;
  }
  
  static int pop_front() {
    if(size==0) {
      return -1;
    }
    else{
      int t = deque[front+1];
      front++;
      size--;
      return t;
    }
  }
  
  static int pop_back() {
    if(size==0) {
      return -1;
    }
    else{
      int t = deque[back];
      back--;
      size--;
      return t;
    }
  }
  
  static int size() {
    return size;
  }
  
  static int empty() {
    if(size==0) {
      return 1;
    }
    else {
      return 0;
    }
  }
  
  static int front() {
    if(size==0) {
      return -1;
    }
    else {
      return deque[front+1];
    }
  }
  
  static int back() {
    if(size==0) {
      return -1;
    }
    else {
      return deque[back];
    }
  }
}
