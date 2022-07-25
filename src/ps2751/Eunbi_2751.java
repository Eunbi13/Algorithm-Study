package ps2751;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Eunbi_2751 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static  StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{
    
    
    //카운팅정렬 https://st-lab.tistory.com/106
    boolean [] arr = new boolean[2000001];
    int n = Integer.parseInt(br.readLine());
    for(int i =0; i<n; i++) {
      arr[Integer.parseInt(br.readLine())+1000000]=true;
    }
    
    for(int i = 0; i<arr.length; i++) {
      //arr[i]가 존재 하면 기록한다. 
      if(arr[i]) {
        sb.append(i-1000000).append("\n");
      }
    }
    
    
//    one();
    System.out.println(sb);

  }

  
  static void one() throws Exception{
    int n = Integer.parseInt(br.readLine());
    ArrayList<Integer> list = new ArrayList<Integer>();

    for(int i = 0; i<n; i++) {
      list.add(Integer.parseInt(br.readLine()));
    }

//    Collections.sort() 은 Timsort
//    합병 및 삽입정렬 알고리즘을 사용
//    hybrid sorting algorithm 이라고 함
    
    Collections.sort(list);

    for(int value : list) {
      sb.append(value).append("\n");
    }
  }


}