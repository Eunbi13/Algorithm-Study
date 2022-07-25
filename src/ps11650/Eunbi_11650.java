package ps11650;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Eunbi_11650 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static  StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{

    int n = Integer.parseInt(br.readLine());
    
    int [][] arr = new int [n][2];
    
//    https://st-lab.tistory.com/110
    
    
    StringTokenizer st ;
    for(int i = 0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }
    
    //compare() 메소드가 바로 우리가 객체를 비교할 기준을 정의해주는 부분
    //매개변수 2개를 비교함 
    Arrays.sort(arr, (e1, e2)->{
      
      System.out.println("++++++++++++++++++++");
      int [] a = new int [2];
      a = e1;
      System.out.println(a[0]+" "+a[1]); //1 1 //1 -1
      a=e2;
      System.out.println(a[0]+" "+a[1]); //3 4 //1 1
      if(e1[0] == e2[0]) {
        return e1[1]-e2[1];
      }else {
        return e1[0]-e2[0];
      }
    });
    
    for(int i = 0; i<n; i++) {
      sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");

    }
    
    
    System.out.println(sb);

  }


  static void one(int n) throws Exception{
    StringTokenizer st ;
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    for(int i = 0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      list.add(Integer.parseInt(st.nextToken()));
      list2.add(Integer.parseInt(st.nextToken()));
    }

    Collections.sort(list);
    Collections.sort(list2);

    for(int i = 0; i<n; i++) {
      sb.append(list.get(i)).append(" ").append(list2.get(i)).append("\n");

    }
  }

}
