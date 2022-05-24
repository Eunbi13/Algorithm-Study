package ps11719;

import java.util.Scanner;

public class Jeongwon_11719 {

	// 232ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		Scanner scanner = new Scanner(System.in);
		// 문자열 연결
		StringBuilder sb = new StringBuilder();

		// EOF 확인필요
		while (a < 100 && scanner.hasNext()) {
			String input = scanner.nextLine();
			sb.append(input + "\n");
			a++;
		}
		System.out.print(sb);
	}
}
