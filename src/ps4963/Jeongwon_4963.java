package ps4963;

import java.util.Scanner;

public class Jeongwon_4963 {
	static int W; // 너비
	static int H; // 높이
	static int[][] Land; // 지도 섬 유무 1 = 섬, 0 = 바다
	static boolean[][] Visit; // 섬 방문 여부 true = 방문, false = 미방문
	// 대각선 까지 포함
	static int[] dx = { 1, -1, 0, 0, 1, -1, -1, 1 };
	static int[] dy = { 0, 0, 1, -1, 1, -1, 1, -1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 특별한 일이 없으면 무한 반복하겠다는 무한 반복문
		while (true) {
			W = sc.nextInt();
			H = sc.nextInt();

			if (W == 0 && H == 0) {
				break;
			}

			// 이차배열 앞부분이 행 즉, 지도 높이 _ 뒷부분이 열 즉, 지도 너비가 된다. <- 이거때문에 오답
			Land = new int[H][W];
			Visit = new boolean[H][W];

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					Land[i][j] = sc.nextInt();
				}
			}

			// 섬 개수
			int cnt = 0;

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (Land[i][j] == 1 && !Visit[i][j]) {
						dfs(i, j);
						cnt++;
					}
				}
			}

			System.out.println(cnt);

		}
	}

	public static void dfs(int x, int y) {
		Visit[x][y] = true;
		// 인접한 섬 확인
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			// 지도 범위
			if (nx >= 0 && ny >= 00 && nx < H && ny < W) {
				// 섬이고 방문한적이 없으면 인접한 섬이므로 dfs함수 호출
				if (Land[nx][ny] == 1 && !Visit[nx][ny]) {
					dfs(nx, ny);
				}
			}
		}
	}

}
