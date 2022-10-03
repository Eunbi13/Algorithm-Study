package ps11724;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_11724 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  static int N;
  static int M;
  static int [][] arr ;
  static boolean [] check ;
  static int group = 0;
  static int cnt =0;
  
  public static void main(String[] args) throws Exception{
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    arr = new int [N+1][N+1];
    check = new boolean [N+1];
    //  M의 개수만큼 입력
    for(int i = 1; i<=M; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      arr[a][b] = arr[b][a] =1;
    }
    
    int result = 0;
    
    for(int i =1; i<=N; i++) {
        dfs(i);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(group);
        System.out.println(cnt);
        
      if(group != 0 ) {
        result++;
      }
      if(cnt == N) {
        result++;
      }
      group = 0;
      cnt = 0;
    }
    System.out.println(result);

  }

  static void dfs(int start) {
    check[start]=true;
    for(int i =1; i<=N; i++) {
      if(arr[start][i] == 1&& !check[i]) {
        dfs(i);       
        //연결된 간선이 있으면 계속 도는데 [1,2] [2,5] [5,1] 처럼 되어버리면 끝나버림 그래서 group 올려주는 거 
        group++;
        cnt = 0;
      }
      if(arr[start][i] == 0)  { //start 라인에 아무것도 없으면 연결이 끊어진거여서 cnt 플러스 해줌
        cnt++;
      }
    }

  }
}
//https://comain.tistory.com/302