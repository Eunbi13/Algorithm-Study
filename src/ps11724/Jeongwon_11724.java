package ps11724;

import java.util.Scanner;

public class Jeongwon_11724 {
	public static int[][] branch;
	public static boolean[] visit;
	public static int N;
	public static int M;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		branch = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			branch[a][b] = branch[b][a] = 1;
		}

		visit = new boolean[N + 1];

		int count = 0;

		for (int i = 1; i <= N; i++) {
			if (!visit[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}

	public static void dfs(int start) {
		visit[start] = true;

		for (int i = 1; i <= N; i++) {
			if (branch[start][i] == 1 && !visit[i]) {
				dfs(i);
			}
		}
	}

}
