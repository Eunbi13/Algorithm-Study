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
  static boolean[][] visited;
  
  public static void main(String[] args) throws Exception{
    N = Integer.parseInt(br.readLine());
    arr = new int [N+1][N+1];
    visited = new boolean[N+1][N+1];
    row = new boolean [N+1];
    for(int i = 1; i <=N; i++) {
      char [] c = br.readLine().toCharArray();
      for(int j = 1; j<=N; j++) {
        arr[i][j] = (int)c[j-1]-48;
      }
    }
    
    for(int i = 1; i<=N; i++) {
      for(int j = 1; j<=N; j++) {
        if(arr[i][j] == 1 && !visited[i][j]) {
          dfs(i, j);          
        }
      }
      System.out.println(cnt);
    }


  }

  static void dfs(int x, int y) {
    visited[x][y] = true;
    group++;

    

    for(int i =x; i<=N; i++) {
      for(int j = y; j<=N; j++) {
        if(arr[i][j]==1) {
          cnt++;
        }
        else {
          break;
        }
      }
    }
  }
}

//private static int dx[] = {0,0,1,-1};
//private static int dy[] = {1,-1,0,0};
//private static int[] aparts = new int[25*25];
//private static int n;
//private static int apartNum = 0; //아파트 단지 번호의 수
//private static boolean[][] visited = new boolean[25][25]; //방문여부
//private static int[][] map = new int[25][25]; //지도
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    n = sc.nextInt();
//
//    map = new int[n][n];
//    visited = new boolean[n][n];
//
//    //전체 사각형 입력 받기
//    for(int i=0; i<n; i++){
//        String input = sc.next();
//        for(int j=0; j<n; j++){
//            map[i][j] = input.charAt(j)-'0';
//        }
//    }
//
//    for(int i=0; i<n; i++){
//        for(int j=0; j<n; j++){
//            if(map[i][j] == 1 && !visited[i][j]){
//                apartNum++;
//                dfs(i,j);
//            }
//        }
//    }
//
//    Arrays.sort(aparts);
//    System.out.println(apartNum);
//
//    for(int i=0; i<aparts.length; i++){
//        if(aparts[i] == 0){
//        }else{               
//            System.out.println(aparts[i]);
//        }
//    }
//}
//
//private static void dfs(int x, int y) {
//    visited[x][y] = true;
//    aparts[apartNum]++;
//
//    for(int i=0; i<4; i++){
//        int nx = x + dx[i];
//        int ny = y + dy[i];
//
//        if(nx >=0 && ny >=0 && nx < n && ny < n){
//            if(map[nx][ny] == 1 && !visited[nx][ny]){
//                dfs(nx,ny);
//            }
//        }
//    }
//}