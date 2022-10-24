package ps1967;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Eunbi_1967 {

  static class Node{
    int node, dist;
    public Node(int node, int dist){
      this.node = node;
      this.dist = dist;
    }
  }
  
  static ArrayList<Node> [] list;
  static boolean [] visit;
  static int max = 0;
  static int max_node = 0; //가장 긴 길이를 가진 노드
  
  
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    
    list = new ArrayList[n+1];
    
    for(int i =1; i<= n ;i++) {
      list[i] = new ArrayList<>();
    }
    StringTokenizer st;
    for(int i = 1; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      int parent = Integer.parseInt(st.nextToken());
      int child = Integer.parseInt(st.nextToken());
      int length = Integer.parseInt(st.nextToken());
      list[parent].add(new Node(child,length));
      list[child].add(new Node(parent,length));
    }
    
    visit = new boolean [n+1];
    dfs(1,0);
    visit = new boolean [n+1];
    dfs(max_node, 0);
    System.out.println(max);
  }
  
  public static void dfs(int node, int len) {
    if(max < len) {
      max_node = node;
      max = len;
    }
    
    visit[node] = true;
    
    for(Node n : list[node]) {
      if(!visit[n.node]) {
        dfs(n.node, n.dist + len);  
        visit[n.node] = true;      
      }                             
    }
  }

}
