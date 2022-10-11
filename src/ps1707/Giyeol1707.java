package ps1707;

import java.io.*;
import java.util.*;

public class Giyeol1707 {

	public static int[] team;
	public static ArrayList<ArrayList<Integer>> graph;
	public static int V,E;
	public static String ans = "YES";
	public static int A,B;
	public static int RED = 1, GREEN = -1;
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int T = sc.nextInt();
		
		for (int tc = 0; tc < T; tc++) {
			ans = "YES";
			V = sc.nextInt();
			E = sc.nextInt();
			
			graph = new ArrayList<>();
			
			for (int i = 0; i < V; i++) {
				graph.add(new ArrayList<>());
			}
			for (int i = 0; i < E; i++) {
				A = sc.nextInt()-1;
				B = sc.nextInt()-1;
				
				graph.get(A).add(B);
				graph.get(B).add(A);
			}
			team = new int[V];
			for (int i = 0; i < V; i++) {
				if(team[i] == 0) {
					if(!bfs(i)) break;
				}
			}
			sb.append(ans).append("\n");
		}
		System.out.println(sb);
	}

	private static boolean bfs(int n) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(n);
		team[n] = RED;
		while(!q.isEmpty()) {
			int node = q.poll();
			
			for(Integer i : graph.get(node)) {
				if(team[node] == team[i]) {
					//인접한 곳이 나와 같은 팀인지 체크
					ans = "NO";
					return false;
				}
				if(team[i] == 0) {
					//방문하지 않았으면 자신과 반대되는 팀을 넣는다.
					team[i] = team[node]*-1;
					q.add(i);
				}
			}
		}
		
		return true;
	}
}