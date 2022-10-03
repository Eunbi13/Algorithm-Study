package ps1707;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jeongwon_1707 {
	// https://jellyinghead.tistory.com/14
	// https://herong.tistory.com/entry/BOJ-1707-%EC%9D%B4%EB%B6%84%EA%B7%B8%EB%9E%98%ED%94%84-Java
	// https://arinnh.tistory.com/23

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();

		for (int tc = 0; tc < K; tc++) {
			int V = sc.nextInt();
			int E = sc.nextInt();

			LinkedList<Integer>[] graph = new LinkedList[V];
			for (int i = 0; i < V; i++) {
				graph[i] = new LinkedList<>();
			}

			for (int i = 0; i < E; i++) {
				int s = sc.nextInt() - 1;
				int e = sc.nextInt() - 1;
				graph[s].add(e);
				graph[e].add(s);
			}

			boolean flag = true;
			int[] visit = new int[V];
			Queue<Integer> q = new LinkedList<>();

			for (int i = 0; i < V; i++) {
				if (visit[i] == 0) {
					q.offer(i);
					visit[i] = 1;

					while (!q.isEmpty() && flag) {
						int cur = q.poll();
						for (Integer next : graph[cur]) {
							if (visit[next] == 0) {
								q.offer(next);
								visit[next] = visit[cur] * -1;
							} else if (visit[next] == visit[cur]) {
								flag = false;
								break;
							}
						}
					}
				}
			}
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
