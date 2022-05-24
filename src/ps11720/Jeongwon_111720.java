package ps11720;

import java.util.Scanner;

public class Jeongwon_111720 {

	// 212ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a;
		int t;
		int sum = 0;

		Scanner scanner = new Scanner(System.in);

		t = scanner.nextInt();
		a = scanner.next();

		// charAt() = String으로 저장된 문자열 중 한 글자만 선택하여 char 타입 변환
		for (int i = 0; i < t; i++) {
			sum += a.charAt(i) - '0';
		}

		System.out.println(sum);

	}

}
