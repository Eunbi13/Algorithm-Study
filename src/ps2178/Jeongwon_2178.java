package ps2178;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jeongwon_2178 {
	static int N;
	static int M;
	static int[][] Map;
	static Queue<Point> queue = new LinkedList<>();
	static int[] dx = { 1, 0, 0, -1 };
	static int[] dy = { 0, 1, -1, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		Map = new int[100][100];

		for (int i = 0; i < N; i++) {
			// 붙여있으므로 String으로 받아서 처리
			String temp = sc.next();
			for (int j = 0; j < M; j++) {
				Map[i][j] = temp.charAt(j) - 48;
			}
		}
		// (1,1)부터 시작
		queue.offer(new Point(0, 0));
		bfs();
	}

	public static void bfs() {
		while (!queue.isEmpty()) {
			Point now = queue.poll();
			int x = now.x;
			int y = now.y;
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
					if (Map[nx][ny] == 1) {
						queue.add(new Point(nx, ny));
						// 계산을 위해 1씩 더해감
						Map[nx][ny] = Map[x][y] + 1;
					}
				}
			}
		}
		// 해당위치의 값이 이동한 칸 수
		System.out.println(Map[N - 1][M - 1]);
	}
}
