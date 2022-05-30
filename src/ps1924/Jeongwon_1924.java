package ps1924;

import java.util.Scanner;

public class Jeongwon_1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1, t2;

		Scanner scanner = new Scanner(System.in);

		t1 = scanner.nextInt();
		t2 = scanner.nextInt();

		String[] days = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int n = 0;

		if (1 <= t1 && t1 <= 12 && 1 <= t2 && t2 <= 31) {
			for (int i = 0; i < t1; i++) {
				// 입력 월 총 합계
				n += months[i];
			}

			// 월 합계 + 입력 일
			n += t2 - 1;
			System.out.println(days[n % 7]);
		}

	}

}
