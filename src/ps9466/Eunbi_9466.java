package ps9466;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_9466 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();
  static StringTokenizer st ;
  
  static Integer [] arr ; 
  static boolean[] visited;
  static boolean[] finished;
  static int cnt;
  
  public static void main(String[] args) throws Exception{
    int T = Integer.parseInt(br.readLine());
    for(int i = 0; i<T; i++) {
      
      int N = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      
      arr = new Integer [N+1];
      visited = new boolean [N+1];
      finished = new boolean [N+1];
      
      for(int j = 1; j<=N; j++) {
        arr[j]=Integer.parseInt(st.nextToken()); 
      }
      cnt = 0;
      for(int j = 1; j<=N; j++) {
        dfs(j);
      }
      System.out.println(N-cnt);
      
    }
  }
  
  static void dfs(int n) {
    if(visited[n]) return;
    
    visited[n] = true;
    int next = arr[n];
    
    System.out.println("\nn: "+n+", next: "+next+", visited[next]: "+visited[next]+" ,finished[next]: "+finished[next]+"\n");
    
    if(!visited[next]) { //next 수를 방문한 적 없다면 계속 탐색 
      dfs(next);
//      return 이 따로 없어서 n=1일 때 dfs[3]을 방문하고 난 뒤 n=1인 상태로 메서드 끝까지 감 
//      finished[1]= true되는 이유
    }
    else {
      if(!finished[next]) { //next 수를 방문한적은 있는데 끝까지 간 적은 없다 
        cnt++;
        while(next != n) { //3=3 같이 재자리 걸음 아니면 진행 
          cnt++;
          next = arr[next];
        }
        
//        cnt에는 탐색이 완료된 개수를 담음 ==  해당 노드의 꼬리를 쫓아가서 싸이클에 해당되는 모든 노드를 카운트하면 된다.
      }
    }
    
    finished[n] = true;
    System.out.println("finished[n]: "+n);
  }

}//https://loosie.tistory.com/235

//1
//7
//3 1 3 7 3 4 6
//
//n: 1, next: 3, visited[next]: false ,finished[next]: false
//
//
//n: 3, next: 3, visited[next]: true ,finished[next]: false
//
//finished[n]: 3
//finished[n]: 1
//
//n: 2, next: 1, visited[next]: true ,finished[next]: true
//
//finished[n]: 2
//
//n: 4, next: 7, visited[next]: false ,finished[next]: false
//
//
//n: 7, next: 6, visited[next]: false ,finished[next]: false
//
//
//n: 6, next: 4, visited[next]: true ,finished[next]: false
//
//finished[n]: 6
//finished[n]: 7
//finished[n]: 4
//
//n: 5, next: 3, visited[next]: true ,finished[next]: true
//
//finished[n]: 5
