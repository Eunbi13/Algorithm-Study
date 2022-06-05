package ps2438;

import java.util.Scanner;

public class Jeongwon_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		for (int i = 1; i < n + 1; i++) {

			for (int x = 0; x < i; x++) {

				System.out.print("*");

			}

			System.out.println("");

		}

	}

}
