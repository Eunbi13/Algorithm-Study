package ps11719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hyojeong_11719 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 실행은 되는 코드

		while (sc.hasNext()) { // while로 반복문을 돌려주고 입력이 있으면 true 없으면 false
			String A = sc.nextLine();
			if (A.length() > 100) { // 길이 체크
				break;
			} else {
				System.out.println(A);
			}
		}
		sc.close();
	}

	// 다른 문제 풀이
	public static void test2() throws IOException {
		// BufferedReader 사용해보기.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String A;
		while ((A = bf.readLine()) != null) {
			System.out.println(A);
		}
	}
}
