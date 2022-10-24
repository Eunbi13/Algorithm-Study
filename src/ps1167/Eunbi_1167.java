package ps1167;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Eunbi_1167 {//https://velog.io/@jini_eun/%EB%B0%B1%EC%A4%80-1167%EB%B2%88-%ED%8A%B8%EB%A6%AC%EC%9D%98-%EC%A7%80%EB%A6%84-Java-Python

  static class Node {
    int node, dist;

    public Node(int node, int dist) {
      this.node = node;//노드
      this.dist = dist;//길이
    }
  }

  static ArrayList<Node> [] list;
  static boolean [] visit;
  static int max = 0;
  static int node, V;

  public static void main(String[] args) throws Exception{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();

    V = Integer.parseInt(br.readLine());
    StringTokenizer st;

    list = new ArrayList[V+1];

    for(int i =1; i<= V ;i++) {
      list[i] = new ArrayList<>();
    }


    for(int i = 0 ; i< V; i++) {
      st = new StringTokenizer(br.readLine());
      
      int nodenum = Integer.parseInt(st.nextToken());
      String str;
      while(!(str = st.nextToken()).equals("-1")) {
        int node = Integer.parseInt(str);
        int dist = Integer.parseInt(st.nextToken());
        list[nodenum].add(new Node(node, dist));
      }

      System.out.println("\n"+node);
      
      
    }
    visit = new boolean[V +1];
    dfs(1,0); //1. dfs를 통해 임의의 정점 하나에서 가장 먼 정점을 구한다.
    visit = new boolean[V +1];
    dfs(node, 0);//2. 1번의 dfs를 통해 구한 정점(static node)으로 부터 가장 먼 정점까지의 거리를 구한다.

//    시간 초과 
//    for(int i = 1; i<= V; i++) {
//      visit = new boolean[V +1];
//      dfs(i,0);
//    }
    System.out.println(max);
  }
  
  static void dfs(int v, int len) {
    if(len > max) {
      max = len;
      node = v;
    }
    
    visit[v] = true;//51번 라인에서 들어와서 visit[1] -> visit[3] -> visit[4] -> visit[2] -> visit[5]
    
    for(Node n : list[v]) {
      if(!visit[n.node]) {
        dfs(n.node, n.dist + len); //51번 라인에서 들어와서 dfs(3,2) -> dfs(4,3) -> dfs(2,4) -> list[2].n.node = 4 
        visit[n.node] = true;       //                                                          벗어나서 다시 dfs(4,3)으로 옴
      }                             //-> dfs(5,6) 
    }
  }

}
