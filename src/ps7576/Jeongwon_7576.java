package ps7576;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jeongwon_7576 {
	static int W; // 너비
	static int H; // 높이
	static int[][] Box; // 토마토가 익는데 걸린 날 값
	static int cnt; // 걸린일수
	static Queue<Point> queue = new LinkedList<>();
	static int[] dx = { 1, 0, 0, -1 };
	static int[] dy = { 0, 1, -1, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 반대로 입력
		H = sc.nextInt();
		W = sc.nextInt();

		Box = new int[W][H];

		cnt = 0;

		for (int i = 0; i < W; i++) {
			for (int j = 0; j < H; j++) {
				Box[i][j] = sc.nextInt();
				if (Box[i][j] == 1) {
					// java.awt.Point 클래스 제공
					// offer 맨 뒤에 값 삽입 *add와 차이 예외를 발생하냐(add) 안하냐(offer, false 값 반환)
					queue.offer(new Point(i, j));
				}
			}
		}
		System.out.println(bfs());
	}

	public static int bfs() {
		while (!queue.isEmpty()) {
			Point now = queue.poll();
			int x = now.x;
			int y = now.y;
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < W && ny < H) {
					if (Box[nx][ny] == 0) {
						queue.add(new Point(nx, ny));
						// 날짜 계산을 위해 1씩 더해감
						Box[nx][ny] = Box[x][y] + 1;
					}
				}
			}
		}
		for (int i = 0; i < W; i++) {
			for (int j = 0; j < H; j++) {
				// 마지막에 안익은게 있다면
				if (Box[i][j] == 0) {
					return -1;
				} else {
					cnt = Math.max(cnt, Box[i][j]);
				}
			}
		}
		// 처음부터 모두 익었다면
		if (cnt == 1) {
			return 0;
			// 처음 시작이 1이므로 걸린 일수에서 제외
		} else {
			return cnt - 1;
		}
	}
}
