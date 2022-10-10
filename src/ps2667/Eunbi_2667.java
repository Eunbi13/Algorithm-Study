package ps2667;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Eunbi_2667 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  static int N ; 
  static int [][] arr;
  static Queue<Integer> queue = new LinkedList<Integer>();
  static int group;
  static int cnt; 
  static boolean [] row;
  static boolean [] col;

  public static void main(String[] args) throws Exception{
    N = Integer.parseInt(br.readLine());
    arr = new int [N+1][N+1];
    row = new boolean [N+1];
    for(int i = 1; i <=N; i++) {
      char [] c = br.readLine().toCharArray();
      for(int j = 1; j<=N; i++) {
        arr[i][j] = (int)c[j]-48;
      }
    }
    for(int i = 1; i<=N; i++) {
      cnt = 0;
      col = new boolean [N+1];
      dfs(i);
      System.out.println(cnt);
    }


  }

  static void dfs(int start) {

    queue.add(start);
    col[start] = true;

    for(int i =1; i<=N; i++) {
      if(arr[start][i] == 1 && !col[i]) {
        cnt++;
      }
    }
  }
}
