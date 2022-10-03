package ps1260;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Eunbi_1260 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();
  
  static int N;
  static int M;
  static int V;
  static int [][] arr ;
  static boolean [] check ;
  static Queue<Integer> q = new LinkedList<Integer>();
  
  public static void main(String[] args) throws Exception{
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    V = Integer.parseInt(st.nextToken());

    arr = new int [N+1][N+1];
    check = new boolean [N+1];
    
//    M의 개수만큼 입력
    for(int i = 1; i<=M; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      arr[a][b] = arr[b][a] =1;
    }

    dfs(V);
    sb.append("\n");
    check = new boolean [N+1];
    bfs(V);
    System.out.println(sb);
  }

  static void dfs(int start) { //재귀함수로 (깊이)
    check[start] = true;
    sb.append(start).append(" ");
    for(int i = 1; i<=N; i++) {
      if(arr[start][i] == 1 && !check[i]) {
        dfs(i);
      }
    }
  }
  
  static void bfs(int start) { //반복문으로 (너비)
    q.add(start);
    check[start] = true;
    while(!q.isEmpty()) {
      start = q.poll();
      sb.append(start).append(" ");
      
      for(int i =1; i<=N; i++) {
        if(arr[start][i] == 1 && !check[i]) {
          q.add(i);
          check[i] = true;
        }
      }
      
    }
  }
  
//  https://incomeplus.tistory.com/393
//  https://infodon.tistory.com/96
}
