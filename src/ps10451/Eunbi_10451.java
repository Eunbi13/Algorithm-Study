package ps10451;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_10451 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();
  static StringTokenizer st;
  static int cnt;
  static int circle ; 
  static int [] arr;
  static boolean [] check;
  
  public static void main(String[] args) throws Exception{
   int T = Integer.parseInt(br.readLine());
   for(int i = 0; i<T; i++) {
     int N = Integer.parseInt(br.readLine());
     st = new StringTokenizer(br.readLine());
     
     circle = 0;
     arr = new int [N+1];
     check = new boolean [N+1];
     for(int j = 1; j<=N; j++) {
       arr[j] = Integer.parseInt(st.nextToken());
     }
     for(int j = 1; j<=N; j++) { //심플 버전 찾아서 씀
       if(!check[j]) {
         circle++;
         dfs(j);
       }
       
     }
     System.out.println(circle);
   }

  }

  static void dfs(int n) {
    if(check[n]) return;
    check[n] = true;
    dfs(arr[n]);
  }
  
  
//  ============================= 첨에 했던 버전 ==========================
//  public static void main(String[] args) throws Exception{
//    int T = Integer.parseInt(br.readLine());
//    for(int i = 0; i<T; i++) {
//      int N = Integer.parseInt(br.readLine());
//      st = new StringTokenizer(br.readLine());
//      
//      circle = 0;
//      arr = new int [N+1];
//      check = new boolean [N+1];
//      for(int j = 1; j<=N; j++) {
//        arr[j] = Integer.parseInt(st.nextToken());
//      }
//      for(int j = 1; j<=N; j++) {
//        cnt = 0 ;
//        getCircle(arr[j]);
//        if(cnt>1) {
//          circle++;
//        }
//      }
//      System.out.println(circle);
//      
//    }
//
//   }
//
//
//   static void getCircle(int n) {
//     int start = n;
//     check[start] = true;
//     if(!check[arr[start]]) {
//       getCircle(arr[start]);
//     }
//     if(n==arr[start]) {
//       cnt++;
//     }
//       cnt++;
//     
//     
//   }
}
