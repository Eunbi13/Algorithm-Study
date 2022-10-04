package ps1707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Eunbi_1707 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  static List<Integer>[] arrList ;
  static int [] check ;
  static int V;
  static int E;
  
  public static void main(String[] args) throws Exception{
    int K = Integer.parseInt(br.readLine());
    
    for(int i = 0; i<K; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      V = Integer.parseInt(st.nextToken());
      E = Integer.parseInt(st.nextToken());
      //정점의 개수 V
      arrList = new ArrayList[V+1];
      check = new int[V+1];

      for(int j =1; j<=V; j++){
        arrList[j] = new ArrayList<Integer>();
      }

      for(int j =0; j<E; j++){
        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        arrList[u].add(v);
        arrList[v].add(u);
      }

      grouping();
    }

    System.out.println(sb);
  }
    
  static void grouping(){
    Queue<Integer> q = new LinkedList<Integer>();

    for(int i =1; i<=V; i++){
      if(check[i]==0){
        q.add(i);
        check[i] = 1;
      }

      while(!q.isEmpty()){
        int start = q.poll();

        for(int j =0; j<arrList[start].size(); j++){
          if(check[arrList[start].get(j)]==0){
            q.add(arrList[start].get(j));
          }

          if(check[start] == check[arrList[start].get(j)]){
            sb.append("NO\n");
            return;
          }

          if(check[start] == 1 && check[arrList[start].get(j)]==0){
            check[arrList[start].get(j)] = 2;
          }
          else if(check[start] == 2 && check[arrList[start].get(j)]==0){
            check[arrList[start].get(j)] = 1;
          }
        }

      }
      sb.append("YES\n");
    }
  }

}
// https://jellyinghead.tistory.com/14
// https://onejunu.tistory.com/112
// https://1-7171771.tistory.com/56