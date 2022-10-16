package ps4963;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_4963 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  static Integer [][] map;
  static boolean [][] visited;
  
//  o o o
//  o x o
//  o o o
  static int[] dx = {0, 0, 1, -1, -1, 1, -1, 1};
  static int[] dy = {1, -1, 0, 0, -1, 1, 1, -1};
  
  static int w =0;
  static int h = 0;

  static int island = 0;
  
  public static void main(String[] args) throws Exception{
    StringTokenizer st ;
    String input ="";
    while (!(input = br.readLine()).equals("0 0")) { //test case input line
      st = new StringTokenizer(input);
       w = Integer.parseInt(st.nextToken());
       h = Integer.parseInt(st.nextToken());

      map = new Integer[w][h];
      visited = new boolean[w][h];
      
      for(int row = 0 ; row<h; row++) { // map input start
        st = new StringTokenizer(br.readLine());
        for(int col = 0 ; col<w; col++) {
          map[col][row] = Integer.parseInt(st.nextToken());
        }
      } // map input fin
      
      island = 0;
      for(int row = 0; row<h; row++) {//분류 작업 start
        for(int col= 0; col<w; col++) {
          if(!visited[col][row] && map[col][row] == 1) {
            island++;
            dfs(col,row);
          
          }
        }
      }//분류 작업 fin
      
      sb.append(island).append("\n");
      
    }//test case input fin

    System.out.println(sb);
  }

  static void dfs(int col, int row) {
    visited[col][row] = true;
    
//    방위 확인
    for(int i = 0; i<8; i++) {
      int nCol = col + dx[i];
      int nRow = row + dy[i];
      
      if(nCol>=0 && nRow >=0 && nCol<w && nRow <h) { //nCol, nRow 범위는 0보다 크고 w, h보다 작아야 함
        if(map[nCol][nRow] == 1 && !visited[nCol][nRow] ) {//그 중에 이 조건식을 만족하면 dfs들어감
          dfs(nCol, nRow);
        }
      }
      
    }
  }

}
