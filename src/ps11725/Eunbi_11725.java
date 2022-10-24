package ps11725;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Eunbi_11725 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  static boolean[] check ;
  static int [] parents ;
  static ArrayList<Integer>[] list;

  public static void main(String[] args) throws Exception{
    // https://log-laboratory.tistory.com/65 문제부터 이해가 안되서,,ㅎ
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;
    list = new ArrayList[n+1];
    parents = new int[n+1];
    check = new boolean[n+1];

    for (int i = 1; i <= n; i++) {
      list[i] = new ArrayList<Integer>();
    }

    for (int i = 1; i < n; i++) { //6줄만 입력 받으니까 < 사용
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      list[a].add(b);
      list[b].add(a);
    }

    for (int i = 1; i <= n; i++) {
      if(!check[i]) dfs(i);
    }
    for(int i =2; i<=n; i++) {
      System.out.println(parents[i]);
    }
    
  }

  static void dfs(int num) {
    if(check[num]) {
      return;
    }
    
    check[num] = true;
    for(int n : list[num]) {
      if(!check[n]) {
        parents[n] = num;
        dfs(n);
      }
    }
  }
}
