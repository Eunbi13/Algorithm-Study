package ps2440;

import java.util.Scanner;

public class Jeongwon_2440 {

	// 360ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		// 입력한 숫자부터 시작해서 내려가도록 반복
		for (int i = n; i > 0; i--) {

			// 위 반복문 시작 숫자부터 별찍기
			for (int x = i; x > 0; x--) {

				System.out.print("*");

			}

			// 개행
			System.out.println("");

		}

	}

}
