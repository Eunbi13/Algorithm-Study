package ps2441;

import java.util.Scanner;

public class Jeongwon_2441 {

	// 360ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		for (int i = n; i > 0; i--) {

			// 공백, 입력받은 값으로부터 0부터 1증가
			for (int y = n; y > i; y--) {

				System.out.print(" ");

			}

			// 별
			for (int x = i; x > 0; x--) {

				System.out.print("*");

			}

			// 개행
			System.out.println("");

		}

	}

}
