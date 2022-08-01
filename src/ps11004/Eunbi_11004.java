package ps11004;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Eunbi_11004 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    boolean [] arr = new boolean[10000002];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++) {
      arr[Integer.parseInt(st.nextToken())+5000000]=true;
    }
    
    int a = 1;
    for(int i = 0; i<arr.length; i++) {
      if(arr[i]) {         
        if(a==k) {
          System.out.println(i-5000000);
        }
        a++;
      }
    }

//    int[] arr = new int[n];
//
//    st = new StringTokenizer(br.readLine());
//    for(int i = 0; i < n; i++) {
//        arr[i] = Integer.parseInt(st.nextToken());
//    }
//    Arrays.sort(arr);
//    System.out.println(arr[k-1]);
    
    
  }

}
