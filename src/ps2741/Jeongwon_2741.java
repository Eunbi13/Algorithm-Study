package ps2741;

import java.util.Scanner;

public class Jeongwon_2741 {

	// 1000ms buffer 사용시 시간 단축
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t;

		Scanner scanner = new Scanner(System.in);

		t = scanner.nextInt();

		if (t <= 100000) {

			for (int i = 1; i <= t; i++) {
				System.out.println(i);
			}
		}

	}

}
